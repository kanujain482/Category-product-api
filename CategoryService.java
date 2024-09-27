package nimap.project.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nimap.project.entity.Category;
import nimap.project.repository.CategoryRepository;


@Service
public class CategoryService  {
	
	 @Autowired
	 public CategoryRepository categoryrepository;
	 
	 //create
	 public Category  createCategory(Category category) {
		  return categoryrepository.save(category);
		 
	 }
	 
	 //read
	 public List<Category> getAllCategories(){
		 return categoryrepository.findAll();
	 }
	 
	 public Optional<Category> getCategoryById(int id){
		 
		 Optional<Category> c=categoryrepository.findById(id);
		 return c;
		 
	 }
	 
	 //update
	 public Category updateCategory(int id,Category updatedcategory) {
		 
		 Category c=categoryrepository.getCategoryById(id);
		 c.setName(updatedcategory.getName());
		 return categoryrepository.save(updatedcategory);
		 
	 }
	 
	 //delete
	 public void deleteCategory(int id) {
		Category c=categoryrepository.getCategoryById(id);
		categoryrepository.delete(c);
		 
	 }
	 
	 

}
