package fr.epsi.mspr.baseList;

import java.util.ArrayList;

import fr.epsi.mspr.entities.Customer;
import fr.epsi.mspr.entities.Employee;
import fr.epsi.mspr.entities.Product;


public class BaseList {
	
	public void init () {
		Employee empl = new Employee();
		empl.idEmployee = 1;
		empl.login = "JB.Test";
		empl.fistName = "Jean Bobby";
		empl.lastName = "Test";
		empl.password = "1234";
		Customer Trololo = new Customer();
		Trololo.idCustomer = 1;
		Trololo.nameCustomer = "Trololo";
		Customer Bliblablo = new Customer();
		Bliblablo.idCustomer = 2;
		Bliblablo.nameCustomer = "Bliblablo";
		Product Book = new Product();
		Book.idProduct = 1;
		Book.nameProduct = "Le saigneur des agneaux";
		Product Book2 = new Product();
		Book2.idProduct = 2;
		Book2.nameProduct = "Les deux fours";
		Product Book3 = new Product();
		Book3.idProduct = 3;
		Book3.nameProduct = "Le retour du foie";
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		customerList.add(Bliblablo);
		customerList.add(Trololo);
		ArrayList<Product> productList = new ArrayList<Product>();
		productList.add(Book);
		productList.add(Book2);
		productList.add(Book3);
	}
}
