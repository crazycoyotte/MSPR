package fr.epsi.mspr.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import lombok.Data;

@Entity
@Data
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idEmployee;

    @Column(nullable = false, length = 255)
    private String login;
    
    @Column(nullable = false, length = 255)
    private String password;
}