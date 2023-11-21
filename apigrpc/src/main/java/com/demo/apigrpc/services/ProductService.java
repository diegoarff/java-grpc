package com.demo.apigrpc.services;

import java.util.ArrayList;
import java.util.concurrent.CompletableFuture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import com.demo.apigrpc.models.ProductModel;
import com.demo.apigrpc.repositories.ProductRepository;

@Service
public class ProductService {
  @Autowired
  ProductRepository productRepository;

  @Async
  public CompletableFuture<ArrayList<ProductModel>> getProducts() {
    return CompletableFuture.completedFuture((ArrayList<ProductModel>) productRepository.findAll());
  }

  @Async
  public CompletableFuture<ProductModel> getProduct(Integer id) {
    return CompletableFuture.completedFuture(productRepository.findById(id).orElse(null));
  }

  @Async
  public CompletableFuture<ProductModel> saveProduct(ProductModel product) {
    return CompletableFuture.completedFuture(productRepository.save(product));
  }

  @Async
  public CompletableFuture<ProductModel> updateProduct(ProductModel product) {
    return CompletableFuture.completedFuture(productRepository.save(product));
  }

  @Async
  public CompletableFuture<Boolean> deleteProduct(Integer id) {
    try {
      productRepository.deleteById(id);
      return CompletableFuture.completedFuture(true);
    } catch (Exception e) {
      return CompletableFuture.completedFuture(false);
    }
  }
}
