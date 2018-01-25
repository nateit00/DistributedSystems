package com.example;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ProductApplication {

	@Bean
	public ApplicationRunner fillTestData(ProductsRepository repository) {
		return applicationArguments -> {



			for(int i=0; i< 5; i++) {
				Product p = new Product();
				p.setName("product " +i);
				p.setDescription("description " + i);
				p.setPrice(12.45 + i*2);

				repository.save(p);
			}


		};
	}

	public static void main(String[] args) {
		SpringApplication.run(ProductApplication.class, args);
	}
}
