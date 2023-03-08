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
		Book.nameProduct = "Le communauté de l'agneau";
		Book.descriptionProduct = "Le premier tome de la trilogie \"Le saigneur des agneaux\"";
		Book.priceProduct = 9.90;
		Book.brandProduct = "Hachette";
		Book.categoryProduct = "Fantaisie";
		Product Book2 = new Product();
		Book2.idProduct = 2;
		Book2.nameProduct = "Les deux fours";
		Book2.descriptionProduct = "Le deuxième tome de la trilogie \"Le saigneur des agneaux\"";
		Book2.priceProduct = 9.90;
		Book2.brandProduct = "Hachette";
		Book2.categoryProduct = "Fantaisie";
		Product Book3 = new Product();
		Book3.idProduct = 3;
		Book3.nameProduct = "Le retour du foie";
		Book3.descriptionProduct = "Le troisième tome de la trilogie \"Le saigneur des agneaux\"";
		Book3.priceProduct = 9.90;
		Book3.brandProduct = "Hachette";
		Book3.categoryProduct = "Fantaisie";
		
		manager.addProduct(Book);
		manager.addProduct(Book2);
		manager.addProduct(Book3);
	}

}
