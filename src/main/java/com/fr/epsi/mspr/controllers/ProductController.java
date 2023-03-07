package com.fr.epsi.mspr.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fr.epsi.mspr.manager.ProductManager;

@Controller
@RequestMapping("/products")
public class ProductController {

	public static final String PRODUCTS_MODEL = "listProducts";
	private ProductManager manag = ProductManager.getInstance();

	@GetMapping(CommonConstant.ROUTE_ALL)
	public String showAll(Model model) {
		model.addAttribute(PRODUCTS_MODEL, manag.selectAll());
		return "products";
	}
	
}
