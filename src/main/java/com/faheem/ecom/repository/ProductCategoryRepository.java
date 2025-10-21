package com.faheem.ecom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.faheem.ecom.entity.ProductCategory;


@RepositoryRestResource(path="product-category")
public interface ProductCategoryRepository extends JpaRepository<ProductCategory,Long> {

}
