package com.demo.apigrpc.server;

import com.uru.grpc.ProductsGrpc.ProductsImplBase;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;

import com.demo.apigrpc.models.ProductModel;
import com.demo.apigrpc.services.ProductService;
import com.uru.grpc.IdRequest;
import com.uru.grpc.AddRequest;
import com.uru.grpc.Empty;
import com.uru.grpc.Product;

@GrpcService
public class ProductsServiceImpl extends ProductsImplBase{

  @Autowired
  ProductService productService;

  @Override
  public void getAllProducts(Empty request, StreamObserver<Product> responseObserver) {
    System.out.println("Get all request received from client:\n" + request);

    ArrayList<ProductModel> productList = productService.getProducts().join();

    productList.forEach(product -> {
      Product productResponse = Product.newBuilder()
        .setId(product.getId())
        .setDescripcion(product.getDescripcion())
        .build();

      responseObserver.onNext(productResponse);
    });

    responseObserver.onCompleted();
  }

  @Override
  public void getProduct(IdRequest request, StreamObserver<Product> responseObserver) {
    System.out.println("Get request received from client:\n" + request);

    ProductModel product = productService.getProduct(request.getId()).join();

    Product productResponse = Product.newBuilder()
      .setId(product.getId())
      .setDescripcion(product.getDescripcion())
      .build();

    responseObserver.onNext(productResponse);
    responseObserver.onCompleted();
  }

  @Override
  public void addProduct(AddRequest request, StreamObserver<Empty> responseObserver) {
    System.out.println("Add request received from client:\n" + request);

    System.out.println(request.getDescripcion());

    ProductModel product = new ProductModel();
    product.setDescripcion(request.getDescripcion());

    productService.saveProduct(product).join();

    responseObserver.onNext(Empty.newBuilder().build());
    responseObserver.onCompleted();
  }

  @Override
  public void updateProduct(Product request, StreamObserver<Empty> responseObserver) {
    System.out.println("Update request received from client:\n" + request);

    ProductModel product = new ProductModel();
    product.setId(request.getId());
    product.setDescripcion(request.getDescripcion());

    productService.updateProduct(product).join();

    responseObserver.onNext(Empty.newBuilder().build());
    responseObserver.onCompleted();
  }

  @Override
  public void deleteProduct(IdRequest request, StreamObserver<Empty> responseObserver) {
    System.out.println("Delete request received from client:\n" + request);

    productService.deleteProduct(request.getId()).join();

    responseObserver.onNext(Empty.newBuilder().build());
    responseObserver.onCompleted();
  }
}