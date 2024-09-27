package nimap.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import nimap.project.entity.Category;

public interface CategoryRepository extends JpaRepository<Category,Integer> {
	
	public Category getCategoryById(int id);

}
