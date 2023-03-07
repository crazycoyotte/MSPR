package com.fr.epsi.mspr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fr.epsi.mspr.entities.Product;
import com.fr.epsi.mspr.manager.ProductManager;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		
		ProductManager manager = ProductManager.getInstance();
		
		Product Book = new Product();
		Book.idProduct = 1;
		Book.nameProduct = "Le saigneur des agneaux";
		Product Book2 = new Product();
		Book2.idProduct = 2;
		Book2.nameProduct = "Les deux fours";
		Product Book3 = new Product();
		Book3.idProduct = 3;
		Book3.nameProduct = "Le retour du foie";
		
		manager.addProduct(Book);
		manager.addProduct(Book2);
		manager.addProduct(Book3);
	}

}
