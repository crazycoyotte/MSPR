package com.fr.epsi.mspr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fr.epsi.mspr.entities.Customer;
import com.fr.epsi.mspr.entities.Product;
import com.fr.epsi.mspr.manager.CustomerManager;
import com.fr.epsi.mspr.manager.ProductManager;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

		ProductManager manager = ProductManager.getInstance();
		CustomerManager customerManager = CustomerManager.getInstance();

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

		Customer customer1 = new Customer();
		customer1.idCustomer = 1;
		customer1.lastName = "PtitLu";
		customer1.firstName = "quaranteDeux";
		customer1.companyName = "EPSI";
		customer1.address = "15 rue fernand robert";
		customer1.iban = "FR 424 242 424";

		Customer customer2 = new Customer();
		customer2.idCustomer = 2;
		customer2.lastName = "John";
		customer2.firstName = "Fitzgerald";
		customer2.companyName = "Kane Edit";
		customer2.address = "12 rue de mes genoux";
		customer2.iban = "FR 123 123 123";

		Customer customer3 = new Customer();
		customer3.idCustomer = 3;
		customer3.lastName = "Joe";
		customer3.firstName = "Bobby";
		customer3.companyName = "Libre et riz";
		customer3.address = "24 av de mes iedp";
		customer3.iban = "FR 456 456 456";

		Customer customer4 = new Customer();
		customer4.idCustomer = 4;
		customer4.lastName = "Lefebvre";
		customer4.firstName = "Emilie";
		customer4.companyName = "Cabinet d'avocats Lefebvre";
		customer4.address = "42 rue de la Liberté";
		customer4.iban = "FR 765 432 109";

		Customer customer5 = new Customer();
		customer5.idCustomer = 5;
		customer5.lastName = "Nguyen";
		customer5.firstName = "Thierry";
		customer5.companyName = "Agence de voyages Nguyen";
		customer5.address = "18 avenue des Tilleuls";
		customer5.iban = "FR 234 567 890";

		Customer customer6 = new Customer();
		customer6.idCustomer = 6;
		customer6.lastName = "Girard";
		customer6.firstName = "Sophie";
		customer6.companyName = "Restaurant La Belle Époque";
		customer6.address = "7 rue du Faubourg Saint-Honoré";
		customer6.iban = "FR 098 765 432";

		Customer customer7 = new Customer();
		customer7.idCustomer = 7;
		customer7.lastName = "Dubois";
		customer7.firstName = "Luc";
		customer7.companyName = "Agence immobilière Dubois";
		customer7.address = "21 avenue de la République";
		customer7.iban = "FR 321 654 987";

		Customer customer8 = new Customer();
		customer8.idCustomer = 8;
		customer8.lastName = "Berger";
		customer8.firstName = "Alexandre";
		customer8.companyName = "Cabinet d'expertise comptable Berger";
		customer8.address = "5 rue du Commerce";
		customer8.iban = "FR 765 432 109";

		// Customer customer9 = new Customer();
		// customer9.idCustomer = 9;
		// customer9.lastName = "Leclerc";
		// customer9.firstName = "Isabelle";
		// customer9.companyName = "Boutique de mode Leclerc";
		// customer9.address = "12 rue Saint-Antoine";
		// customer9.iban = "FR 234 567 890";

		// Customer customer10 = new Customer();
		// customer10.idCustomer = 10;
		// customer10.lastName = "Roux";
		// customer10.firstName = "Jean";
		// customer10.companyName = "Garage automobile Roux";
		// customer10.address = "3 avenue de la Gare";
		// customer10.iban = "FR 098 765 432";

		// Customer customer11 = new Customer();
		// customer11.idCustomer = 11;
		// customer11.lastName = "Picard";
		// customer11.firstName = "Marine";
		// customer11.companyName = "Agence de publicité Picard";
		// customer11.address = "8 rue des Écoles";
		// customer11.iban = "FR 321 654 987";

		// Customer customer12 = new Customer();
		// customer12.idCustomer = 12;
		// customer12.lastName = "Legrand";
		// customer12.firstName = "Pierre";
		// customer12.companyName = "Boulangerie Legrand";
		// customer12.address = "15 avenue des Roses";
		// customer12.iban = "FR 765 432 109";

		// Customer customer13 = new Customer();
		// customer13.idCustomer = 13;
		// customer13.lastName = "Renard";
		// customer13.firstName = "Nathalie";
		// customer13.companyName = "Cabinet de conseil Renard";
		// customer13.address = "6 rue du Louvre";
		// customer13.iban = "FR 234 567 890";

		// Customer customer14 = new Customer();
		// customer14.idCustomer = 14;
		// customer14.lastName = "Muller";
		// customer14.firstName = "Maxime";
		// customer14.companyName = "Cabinet d'assurances Muller";
		// customer14.address = "22 avenue du Parc";
		// customer14.iban = "FR 098 765 432";

		// Customer customer15 = new Customer();
		// customer15.idCustomer = 15;
		// customer15.lastName = "Rolland";
		// customer15.firstName = "Céline";
		// customer15.companyName = "Salon de coiffure Rolland";
		// customer15.address = "4 rue de la Paix";
		// customer15.iban = "FR 321 654 987";

		// Customer customer16 = new Customer();
		// customer16.idCustomer = 16;
		// customer16.lastName = "Lecomte";
		// customer16.firstName = "Sylvain";
		// customer16.companyName = "Cabinet de recrutement Lecomte";
		// customer16.address = "9 avenue des Champs-Élysées";
		// customer16.iban = "FR 765 432 109";

		// Customer customer17 = new Customer();
		// customer17.idCustomer = 17;
		// customer17.lastName = "Giraud";
		// customer17.firstName = "Charlotte";
		// customer17.companyName = "Agence de communication Giraud";
		// customer17.address = "14 rue des Arts";
		// customer17.iban = "FR 234 567 890";

		// Customer customer18 = new Customer();
		// customer18.idCustomer = 18;
		// customer18.lastName = "Schneider";
		// customer18.firstName = "Lucas";
		// customer18.companyName = "Cabinet de conseil Schneider";
		// customer18.address = "25 avenue des Acacias";
		// customer18.iban = "FR 098 765 432";

		// Customer customer19 = new Customer();
		// customer19.idCustomer = 19;
		// customer19.lastName = "Fournier";
		// customer19.firstName = "Chloé";
		// customer19.companyName = "Cabinet d'expertise comptable Fournier";
		// customer19.address = "11 rue de la Poste";
		// customer19.iban = "FR 321 654 987";

		// Customer customer20 = new Customer();
		// customer20.idCustomer = 20;
		// customer20.lastName = "Dupuis";
		// customer20.firstName = "Antoine";
		// customer20.companyName = "Agence de voyages Dupuis";
		// customer20.address = "20 avenue des Princes";
		// customer20.iban = "FR 765 432 109";

		customerManager.addCustomer(customer1);
		customerManager.addCustomer(customer2);
		customerManager.addCustomer(customer3);
		customerManager.addCustomer(customer4);
		customerManager.addCustomer(customer5);
		customerManager.addCustomer(customer6);
		customerManager.addCustomer(customer7);
		customerManager.addCustomer(customer8);
		// customerManager.addCustomer(customer9);
		// customerManager.addCustomer(customer10);
		// customerManager.addCustomer(customer11);
		// customerManager.addCustomer(customer12);
		// customerManager.addCustomer(customer13);
		// customerManager.addCustomer(customer14);
		// customerManager.addCustomer(customer15);
		// customerManager.addCustomer(customer16);
		// customerManager.addCustomer(customer17);
		// customerManager.addCustomer(customer18);
		// customerManager.addCustomer(customer19);
		// customerManager.addCustomer(customer20);
	}

}
