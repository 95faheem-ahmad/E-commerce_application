package com.faheem.ecom.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.faheem.ecom.entity.Product;

@RepositoryRestResource(path="products")
public interface ProductRepository extends JpaRepository<Product, Long> {

	
	Page<Product> findByCategory_CategoryId(@Param("categoryId") Long categoryId, Pageable pageable);


}



