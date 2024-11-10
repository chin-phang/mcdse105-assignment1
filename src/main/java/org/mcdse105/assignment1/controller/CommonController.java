package org.mcdse105.assignment1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CommonController {

    @GetMapping("/")
    public String getHomepage() {
        return "index";
    }

    @GetMapping("/about")
    public String getAboutpage() {
        return "about";
    }

    @GetMapping("/contact")
    public String getContactpage() {
        return "contact";
    }
}
