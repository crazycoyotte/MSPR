package fr.epsi.mspr.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;

public class Customer {

    @GeneratedValue(strategy = GenerationType.AUTO)
    public long idCustomer;

    @Column(unique = true, nullable = false, length = 50)
    public String nameCustomer;
    
}