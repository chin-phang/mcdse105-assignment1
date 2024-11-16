package org.mcdse105.assignment1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication(scanBasePackages = "org.mcdse105.assignment1")
public class Assignment1Application extends SpringBootServletInitializer {

	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(Assignment1Application.class);
    }

	public static void main(String[] args) {
		SpringApplication.run(Assignment1Application.class, args);
	}

}
