package com.anjali.spring.boot.springdatajpa;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import com.anjali.spring.boot.springdatajpa.entities.Product;
import com.anjali.spring.boot.springdatajpa.repository.ProductRepository;

@SpringBootTest
class SpringdatajpaApplicationTests {
	@Autowired
	ApplicationContext context;

//	@Test
//	public void saveProduct() {
//		ProductRepository repo = context.getBean(ProductRepository.class);
//		Product product = new Product(8L, "text book", "good", 32.2d);
//		repo.save(product);
//		System.out.println("Before update");
//		System.out.println(repo.findById(8L));
//		product.setPrice(10.21d);
//		repo.save(product);
//		System.out.println("After update");
//		System.out.println(repo.findById(8L));
//	}
	
	@Test
	public void readAllProducts() {
		ProductRepository repo = context.getBean(ProductRepository.class);
		List<Product> list = (List<Product>) repo.findAll();
		for(Product p: list) {
			System.out.println(p);
		}
	}
	@Test
	public void findByNameTest() {
		ProductRepository repo = context.getBean(ProductRepository.class);
		List<Product> list = (List<Product>) repo.findByName("text book");
		for(Product p: list) {
			System.out.println(p);
		}
	}
	@Test
	public void findByNameAndPriceTest() {
		System.out.println("Fetching both Name and price --------------->");
		ProductRepository repo = context.getBean(ProductRepository.class);
		List<Product> list = repo.findByNameAndPrice("iphone", 90.99);
		for(Product p: list) {
			System.out.println(p);
		}
	}

}
