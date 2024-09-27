package nimap.project.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import nimap.project.entity.Product;
import nimap.project.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	ProductService productservice;
	
	@GetMapping("/api/products")
	public List<Product> getAllproduct(){
		return productservice.getAllPoducts();
	}
	
	@GetMapping("/api/products/{id}")
	public Optional<Product> getProductById(@PathVariable int id){
		return productservice.getProductById(id);
	}
	
	@PostMapping("/api/products")
	public Product addproduct(@RequestBody Product newproduct)
	{
		return productservice.createProduct(newproduct);
	}
	
	@PutMapping("/api/products/update/{id}")
	public Product update(@PathVariable int id,@RequestBody Product updatedproduct) {
		return productservice.updateProduct(id, updatedproduct);
	}
	
	@DeleteMapping("/api/products/delete/{id}")
	public void delete(@PathVariable int id) {
		productservice.deleteProduct(id);
		
	}

}
