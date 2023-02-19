package com.example.EcommerseApi.productModel;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="Product_tbl")
public class Product {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Integer id;
	    
	    @Column(name="name")
	    private String name;
	    
	    @Column(name="price")
	    private Integer price;
	    
	    @Column(name="description")
	    private String description;
	    
	    @Column(name="category")
	    private String category;
	    
	    @Column(name="brand")
	    private String brand;
}
