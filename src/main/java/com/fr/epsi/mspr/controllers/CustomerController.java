package com.fr.epsi.mspr.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fr.epsi.mspr.entities.Customer;
import com.fr.epsi.mspr.manager.CustomerManager;

@Controller
@RequestMapping("/customer")
public class CustomerController {

    public static final String CUSTOMERS_MODEL = "listCustomer";
    public static final String CUSTOMER_MODEL = "customer";
    private CustomerManager manag = CustomerManager.getInstance();

    @GetMapping(CommonConstant.ROUTE_ALL)
    public String showAll(Model model) {
        model.addAttribute(CUSTOMERS_MODEL, manag.selectAll());
        return "customers";
    }

    @GetMapping(CommonConstant.ROUTE_CREATE)
    public String createCustomer(Model model) {
        model.addAttribute(CUSTOMER_MODEL, new Customer());
        model.addAttribute("route", "save");
        return "customerForm";
    }

    @PostMapping(CommonConstant.ROUTE_SAVE)
    public String saveCustomer(Model model, @ModelAttribute Customer prodSubmit) {
        manag.addCustomer(prodSubmit);
        return "redirect:/customer/";
    }

    @GetMapping(CommonConstant.ROUTE_SHOW)
    public String viewCustomer(Model model, @PathVariable("id") int id) {
        Customer proot = manag.findCustomerById(id);
        model.addAttribute(CUSTOMER_MODEL, proot);
        return "customerView";
    }

    @GetMapping(CommonConstant.ROUTE_EDIT)
    public String editCustomer(Model model, @PathVariable("id") int id) {
        Customer proot = manag.findCustomerById(id);
        model.addAttribute(CUSTOMER_MODEL, proot);
        model.addAttribute("route", "/customer/update");
        return "customerUpdate";
    }

    @PostMapping(CommonConstant.ROUTE_UPDATE)
    public String updateCustomer(Model model, @ModelAttribute Customer prodSubmit) {
        manag.updateCustomer(prodSubmit);
        return "redirect:/customer/";
    }

    @GetMapping(CommonConstant.ROUTE_DELETE)
    public String deleteCustomer(Model model, @PathVariable("id") int id) {
        manag.deleteCustomer(id);
        return "redirect:/customer/";
    }
}
