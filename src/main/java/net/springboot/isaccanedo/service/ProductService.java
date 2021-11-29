package net.springboot.isaccanedo.service;

import java.util.List;

import net.springboot.isaccanedo.model.Product;

public interface ProductService {
	Product createProduct(Product product);

	Product updateProduct(Product product);

	List<Product> getAllProduct();

	Product getProductById(long productId);

	void deleteProduct(long id);
}
