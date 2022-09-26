package com.javatechie.srpingbootcrudexample1.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;



@Data
@Entity
@Table(name="Product_TBL") 
public class Product {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
	private String name;
	private int quantity;
	private double price;
}
