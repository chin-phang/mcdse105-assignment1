package org.mcdse105.assignment1.controller;

import org.mcdse105.assignment1.entity.Product;
import org.mcdse105.assignment1.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public String getProductsPage(Model model) {
        List<Product> products = productService.getAllProducts();
        model.addAttribute("products", products);
        return "products";
    }

    @GetMapping("/products/new")
    public String getNewProductPage() {
        return "product-new";
    }

    @PostMapping("/products/new")
    public String AddNewProduct(Model model, @ModelAttribute("product") Product product) {
        System.err.println(productService.productExists(product.getName()));

        // if product already exists
        if(productService.productExists(product.getName())) {
            model.addAttribute("errmsg", "Product " + product.getName() + " is already exists! Please add a new product.");
            return "product-new";

        } else { // product is new
            productService.addNewProduct(product);
            return "redirect:/products";
        }
    }

    @GetMapping("/products/{id}")
    public String getProductPage(Model model, @PathVariable("id") Long id) {
        Product product = productService.getProductById(id);
        model.addAttribute("product", product);
        return "product";
    }

    @PostMapping("/products/{id}/update")
    public String updateProduct(Model model, @ModelAttribute("product") Product product,
                                @PathVariable("id") Long id) {
        productService.updateProductDetails(id, product);
        model.addAttribute("msg", "Product updated successfully.");
        return "product";
    }

    @GetMapping("/products/{id}/delete")
    public String deleteProduct(@PathVariable("id") Long id) {
        productService.removeProductById(id);
        return "redirect:/products";
    }
}
