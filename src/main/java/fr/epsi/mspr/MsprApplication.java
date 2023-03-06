package fr.epsi.mspr;

import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import fr.epsi.mspr.entities.Customer;
import fr.epsi.mspr.entities.Employee;
import fr.epsi.mspr.entities.Product;

@SpringBootApplication
public class MsprApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsprApplication.class, args);
		System.out.println("LE PUSH ??");

	}

}
