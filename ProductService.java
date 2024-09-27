package nimap.project.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nimap.project.entity.Product;
import nimap.project.repository.ProductRepository;

@Service
public class ProductService {
	
	
	@Autowired
	ProductRepository productrepository;
	
	//create
	public Product createProduct(Product product) {
		return productrepository.save(product);
	}
	
	//read
	 public List<Product> getAllPoducts(){
		 return productrepository.findAll();
	 }
	 
	 public Optional<Product> getProductById(int id){
		 Optional<Product> p=productrepository.findById(id);
		 return p;
	 }
	 
	 //update
	 public Product updateProduct(int id,Product updatedproduct) {
		 Product p=productrepository.getProductById(id);
		 p.setName(updatedproduct.getName());
		 p.setPrice(updatedproduct.getPrice());
		 p.setCategory(updatedproduct.getCategory());
		  return productrepository.save(p);
	 }
	 
	 //delete
	 public void deleteProduct(int id) {
		 Product p=productrepository.getProductById(id);
		 productrepository.delete(p);
	 }
}
