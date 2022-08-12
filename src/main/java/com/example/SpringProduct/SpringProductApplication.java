package com.example.SpringProduct;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringProductApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringProductApplication.class, args);
	}
	
	   @Bean
	   CommandLineRunner addProducts(ProductService productService) {
	      return args -> {
	         productService.create(new Product("table", 15,47));
	         productService.create(new Product("chair", 12,42));
	         productService.create(new Product("sofa", 120,470));
	         productService.create(new Product("kettle", 5,15));
	         productService.create(new Product("toaster", 7,22));
	      };
	   }


}
