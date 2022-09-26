package com.javatechie.srpingbootcrudexample1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.javatechie.srpingbootcrudexample1.entity.Product;
import com.javatechie.srpingbootcrudexample1.service.ProductService;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@RequestMapping(value="/getProducts",method=RequestMethod.GET)
	public List<Product> getProduct(){
		return productService.getProducts();
	}
	
	@RequestMapping(value="/getProductById/{id}",method=RequestMethod.GET)
	public Product getProductById(@PathVariable int id) {
		return productService.getProductById(id);
	}
	
	@PostMapping(value="/addProduct",consumes="application/json")
	public Product addproduct(@RequestBody Product product) {
		return productService.saveProduct(product);
	}
	
	@PostMapping(value="/addproducts", consumes="application/json")
	public List<Product> addProducts(@RequestBody List<Product> products){
	return productService.saveProducts(products);
	}
	
	@PutMapping("/update")
	public Product updateProduct(@RequestBody Product product) {
	return productService.updateProduct(product);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteProduct(@PathVariable int id ) {
		return productService.deleteProduct(id);
	}
}

