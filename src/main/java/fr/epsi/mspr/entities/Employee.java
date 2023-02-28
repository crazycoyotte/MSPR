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
    public String lastName;
    
    @Column(nullable = false, length = 255)
    public String fistName;
    
	@Column(nullable = false, length = 255)
	public String login;
    
    @Column(nullable = false, length = 255)
    public String password;
}