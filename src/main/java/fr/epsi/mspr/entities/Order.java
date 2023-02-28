package fr.epsi.mspr.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class Order {

    @Column(nullable = false, length = 255)
    private String id_order;

    @Column(nullable = false, length = 255)
    private String name_order;
    
}