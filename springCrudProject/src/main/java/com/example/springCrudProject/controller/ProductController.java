package com.example.springCrudProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springCrudProject.entity.Product;
import com.example.springCrudProject.services.productService;

@RestController
public class ProductController {
	
	@Autowired
	private productService service;
	
	@PostMapping("/addProduct")
	public Product addProduct(@RequestBody Product product) {
		return service.saveProduct(product);
	}
	@PostMapping("/addProducts")
	public List<Product> addProducts(@RequestBody List<Product> product){
		return service.saveProducts(product);
	}
	
	@GetMapping("/product")
	public List<Product> findProducts() {
		return service.getProducts();
	}
	
	@GetMapping("/product/{id}")
	public Product findProductById(@PathVariable int id) {
		return service.getProductById(id);
	}
	
	@GetMapping("/product/{name}")
	public Product findProductByName(@PathVariable String name) {
		return service.getProductByName(name);
	}
	
	@PutMapping("/update")
	public Product updateProduct(Product product) {
		return service.updateProduct(product);
	}
	
	@DeleteMapping("/delete")
	public String deleteProduct(int id) {
		return service.deleteProduct(id);
	}
}
