package com.fr.epsi.mspr.entities;

import lombok.Data;

@Data
public class Customer {

    public int idCustomer;

    public String firstName;

    public String lastName;

    public String companyName;

    public String address;

    public String iban;

}