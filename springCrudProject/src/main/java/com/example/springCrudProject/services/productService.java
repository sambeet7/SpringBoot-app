package com.example.springCrudProject.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springCrudProject.entity.Product;
import com.example.springCrudProject.repository.ProductRepository;

@Service
public class productService {
	
	@Autowired
	private ProductRepository repository;
	
	//post methods
	
	public Product saveProduct(Product product) {
		return repository.save(product);
	}
	public List<Product> saveProducts(List<Product> products){
		return repository.saveAll(products);
	}
	
	//get methods
	
	public List<Product> getProducts() {
		return repository.findAll();
	}
	
	public Product getProductById(int id) {
		return repository.findById(id).orElse(null);
	}
	
	public Product getProductByName(String name) {
		return repository.findByName(name);
	}
	
	//delete method
	
	public String deleteProduct(int id) {
		repository.deleteById(id);
		return "Product deleted !!"+ id;
	}
	
	public Product updateProduct(Product product) {
		Product existingRepo = repository.findById(product.getId()).orElse(null);
		existingRepo.setName(product.getName());
		existingRepo.setCapacity(product.getCapacity());
		existingRepo.setPrice(product.getPrice());
		return repository.save(product);
		
	}
}
