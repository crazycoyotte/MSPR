package fr.epsi.mspr.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;

public class OrderProduct {

    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idOrderProduct;

    @Column(unique = true, nullable = false, length = 50)
    private String nameOrderProduct;
    
}