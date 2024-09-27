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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import nimap.project.entity.Category;
import nimap.project.service.CategoryService;

@RestController

public class CategoryContoller {
	
	@Autowired
	public CategoryService categoryservice;
	
	@GetMapping("/api/categories")
	public List<Category> getAllCategories(){
		
		return categoryservice.getAllCategories();
	}
	
	@GetMapping("/api/categories/{id}")
	public Optional<Category> getCategoryById(@PathVariable int id) {
		
		return categoryservice.getCategoryById(id);
	}
	
	@PostMapping("/api/categories")
	public Category addCategory(@RequestBody Category newcategory) {
		 
		return categoryservice.createCategory(newcategory);
		
	}
	
	@PutMapping("/api/categories/update/{id}")
	public Category updatecategory(@PathVariable int id,@RequestBody Category updatedcategory) {
		return categoryservice.updateCategory(id, updatedcategory);
	}
	
	@DeleteMapping("api/categories/delete/{id}")
	public void deletecategory(@PathVariable int id)
	{
		categoryservice.deleteCategory(id);
	}
	
	

}
