package com.fr.epsi.mspr.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fr.epsi.mspr.entities.Product;
import com.fr.epsi.mspr.manager.ProductManager;

@Controller
@RequestMapping("/products")
public class ProductController {

	public static final String PRODUCTS_MODEL = "listProducts";
	public static final String PRODUCT_MODEL = "product";
	private ProductManager manag = ProductManager.getInstance();

	@GetMapping(CommonConstant.ROUTE_ALL)
	public String showAll(Model model) {
		model.addAttribute(PRODUCTS_MODEL, manag.selectAll());
		return "products";
		// commen
	}
	
	@GetMapping(CommonConstant.ROUTE_CREATE)
	public String createProduct(Model model) {
		model.addAttribute(PRODUCT_MODEL, new Product());
        model.addAttribute("route", "save");
		return "productForm";
	}
	
	@PostMapping(CommonConstant.ROUTE_SAVE)
	public String saveProduct(Model model, @ModelAttribute Product prodSubmit) {
		manag.addProduct(prodSubmit);
		return "redirect:/products/";
	}
	
	@GetMapping(CommonConstant.ROUTE_SHOW)
	public String viewProduct(Model model, @PathVariable("id") int id) {
		Product proot = manag.findProductById(id);
		model.addAttribute(PRODUCT_MODEL, proot);
		return "productView";
	}
	
	@GetMapping(CommonConstant.ROUTE_EDIT)
	public String editProduct(Model model, @PathVariable("id") int id) {
		Product proot = manag.findProductById(id);
		model.addAttribute(PRODUCT_MODEL, proot);
        model.addAttribute("route", "/products/save");
		return "productForm";
	}
	
}
