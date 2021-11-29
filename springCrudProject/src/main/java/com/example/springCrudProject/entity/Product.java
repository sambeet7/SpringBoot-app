package com.example.springCrudProject.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="product_tbl")
@Getter
@Setter
public class Product {
	@GeneratedValue
	@Id
	private int id;
	private String name;
	private int capacity;
	private double price;
	

	

}
