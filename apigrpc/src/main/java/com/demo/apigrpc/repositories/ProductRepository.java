package com.demo.apigrpc.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.demo.apigrpc.models.ProductModel;

@Repository
public interface ProductRepository extends CrudRepository<ProductModel, Integer>{
  
}
