package fr.epsi.mspr.entities;

import javax.persistence.Column;
import javax.persistence.Entity;

import lombok.Data;

@Entity
@Data
public class Employee extends Human{
    
    @Column(nullable = false, length = 255)
    private String login;
    
    @Column(nullable = false, length = 255)
    private String password;
}