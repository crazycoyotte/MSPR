package com.fr.epsi.mspr.entities;

import lombok.Data;

@Data
public class Product {

    public long idProduct;
    
    public String nameProduct;

    public String descriptionProduct;
    
    public double priceProduct;
    
    public String brandProduct;
    
    public String categoryProduct;
}