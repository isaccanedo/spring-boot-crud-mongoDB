package net.springboot.isaccanedo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import net.springboot.isaccanedo.model.Product;

public interface ProductRepository extends MongoRepository<Product, Long>{

}
