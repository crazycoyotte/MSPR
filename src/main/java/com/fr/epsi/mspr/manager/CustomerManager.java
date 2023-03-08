package com.fr.epsi.mspr.manager;

import java.util.ArrayList;

import com.fr.epsi.mspr.entities.Customer;

public class CustomerManager {

    private static CustomerManager instance;
    private ArrayList<Customer> customerList = new ArrayList<>();

    private CustomerManager() {
    }

    public static CustomerManager getInstance() {
        if (instance == null) {
            instance = new CustomerManager();
        }
        return instance;
    }

    public void addCustomer(Customer p) {
        customerList.add(p);
    }

    public Customer findCustomerById(int id) {
        Customer Customer = new Customer();
        for (Customer p : customerList) {
            if (p.getIdCustomer() == id) {
                Customer = p;
                break;
            }
        }
        return Customer;
    }

    public ArrayList<Customer> selectAll() {
        return customerList;
    }

    public void updateCustomer(Customer p) {
        for (Customer pr : customerList) {
            if (pr.getIdCustomer() == p.getIdCustomer()) {
                customerList.set(customerList.indexOf(pr), p);
                break;
            }
        }
    }

    public void deleteCustomer(int id) {
        for (Customer p : customerList) {
            if (p.getIdCustomer() == id) {
                customerList.remove(customerList.indexOf(p));
                break;
            }
        }
    }
}
