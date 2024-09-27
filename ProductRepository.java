package nimap.project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import nimap.project.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

	public Product getProductById(int id);

//	public List<Product> findAll();

	
}
