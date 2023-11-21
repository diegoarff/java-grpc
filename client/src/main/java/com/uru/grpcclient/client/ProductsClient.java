package com.uru.grpcclient.client;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

import com.uru.grpc.Empty;
import com.uru.grpc.ProductsGrpc.ProductsBlockingStub;
import com.uru.grpcclient.client.models.ProductModel;
import com.uru.grpc.Product;
import com.uru.grpc.AddRequest;
import com.uru.grpc.IdRequest;

import net.devh.boot.grpc.client.inject.GrpcClient;

@Service
public class ProductsClient {

  @GrpcClient("local-grpc-server")
  private ProductsBlockingStub stub;

  public ArrayList<ProductModel> getAllProducts() {

    ArrayList<ProductModel> productList = new ArrayList<ProductModel>();

    Empty request = Empty.newBuilder().build();

    this.stub.getAllProducts(request).forEachRemaining(product -> {
      ProductModel prod = new ProductModel();
      prod.setId(product.getId());
      prod.setDescripcion(product.getDescripcion());

      productList.add(prod);
    });

    return productList;
  }

  public ProductModel getProduct(Integer id) {

    ProductModel prod = new ProductModel();

    IdRequest request = IdRequest.newBuilder().setId(id).build();

    Product product = this.stub.getProduct(request);

    prod.setId(product.getId());
    prod.setDescripcion(product.getDescripcion());

    return prod;
  }

  public String addProduct(String prodDescripcion) {

    try {
      AddRequest request = AddRequest.newBuilder()
          .setDescripcion(prodDescripcion)
          .build();

      this.stub.addProduct(request);

      return "Se agregó el producto con descripción " + prodDescripcion;
    } catch (Exception e) {
      return "No se pudo agregar el producto con descripción " + prodDescripcion;
    }
  }

  public String updateProduct(Integer id, String prodDescripcion) {

    try {
      Product request = Product.newBuilder()
          .setId(id)
          .setDescripcion(prodDescripcion)
          .build();

      this.stub.updateProduct(request);

      return "Se actualizó el producto con id " + id;
    } catch (Exception e) {
      return "No se pudo actualizar el producto con id " + id;
    }
  }

  public String deleteProduct(Integer id) {

    try {
      IdRequest request = IdRequest.newBuilder()
          .setId(id)
          .build();

      this.stub.deleteProduct(request);

      return "Se eliminó el producto con id " + id;
    } catch (Exception e) {
      return "No se pudo eliminar el producto con id " + id;
    }
  }
}
