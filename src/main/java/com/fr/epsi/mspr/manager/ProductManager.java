package com.fr.epsi.mspr.manager;

import java.util.ArrayList;

import com.fr.epsi.mspr.entities.Product;

public class ProductManager {

	private static ProductManager instance;
	private ArrayList<Product> productList = new ArrayList<>();

	private ProductManager() {
	}

	public static ProductManager getInstance() {
		if (instance == null) {
			instance = new ProductManager();
		}
		return instance;
	}

	public void addProduct(Product p) {
		productList.add(p);
	}

	public Product findProductById(int id) {
		Product product = new Product();
		for (Product p : productList) {
			if (p.getIdProduct() == id) {
				product = p;
				break;
			}
		}
		return product;
	}

	public ArrayList<Product> selectAll() {
		return productList;
	}

	public void updateProduct(Product p) {
		for (Product pr : productList) {
			if (pr.getIdProduct() == p.getIdProduct()) {
				productList.set(productList.indexOf(pr), p);
				break;
			}
		}
	}

	public void deleteProduct(int id) {
		for (Product p : productList) {
			if (p.getIdProduct() == id) {
				productList.remove(productList.indexOf(p));
				break;
			}
		}
	}
}
