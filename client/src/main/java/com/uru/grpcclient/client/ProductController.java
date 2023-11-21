package com.uru.grpcclient.client;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
// import org.springframework.web.bind.annotation.DeleteMapping;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.PutMapping;
// import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uru.grpcclient.client.models.ProductModel;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/products")
public class ProductController {

  @Autowired
  private ProductsClient productsClient;

  @GetMapping()
  public ArrayList<ProductModel> getProducts() {

    return productsClient.getAllProducts();
  }

  @GetMapping(path = "/{id}")
  public ProductModel getProduct(@PathVariable("id") Integer id) {

    return productsClient.getProduct(id);
  }

  @PostMapping()
  public String saveProduct(@RequestBody ProductModel product) {
    return productsClient.addProduct(product.getDescripcion());
  }

  @PutMapping(path = "/{id}")
  public String updateProduct(@PathVariable("id") Integer id, @RequestBody ProductModel product) {
    return productsClient.updateProduct(id, product.getDescripcion());
  }

  @DeleteMapping(path = "/{id}")
  public String deleteProduct(@PathVariable("id") Integer id) {
    return productsClient.deleteProduct(id);
  }

}
