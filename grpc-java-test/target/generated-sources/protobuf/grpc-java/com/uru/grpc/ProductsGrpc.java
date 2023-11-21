package com.uru.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.59.0)",
    comments = "Source: prods.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ProductsGrpc {

  private ProductsGrpc() {}

  public static final java.lang.String SERVICE_NAME = "com.uru.grpc.Products";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.uru.grpc.Empty,
      com.uru.grpc.Product> getGetAllProductsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAllProducts",
      requestType = com.uru.grpc.Empty.class,
      responseType = com.uru.grpc.Product.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.uru.grpc.Empty,
      com.uru.grpc.Product> getGetAllProductsMethod() {
    io.grpc.MethodDescriptor<com.uru.grpc.Empty, com.uru.grpc.Product> getGetAllProductsMethod;
    if ((getGetAllProductsMethod = ProductsGrpc.getGetAllProductsMethod) == null) {
      synchronized (ProductsGrpc.class) {
        if ((getGetAllProductsMethod = ProductsGrpc.getGetAllProductsMethod) == null) {
          ProductsGrpc.getGetAllProductsMethod = getGetAllProductsMethod =
              io.grpc.MethodDescriptor.<com.uru.grpc.Empty, com.uru.grpc.Product>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getAllProducts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uru.grpc.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uru.grpc.Product.getDefaultInstance()))
              .setSchemaDescriptor(new ProductsMethodDescriptorSupplier("getAllProducts"))
              .build();
        }
      }
    }
    return getGetAllProductsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.uru.grpc.IdRequest,
      com.uru.grpc.Product> getGetProductMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getProduct",
      requestType = com.uru.grpc.IdRequest.class,
      responseType = com.uru.grpc.Product.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.uru.grpc.IdRequest,
      com.uru.grpc.Product> getGetProductMethod() {
    io.grpc.MethodDescriptor<com.uru.grpc.IdRequest, com.uru.grpc.Product> getGetProductMethod;
    if ((getGetProductMethod = ProductsGrpc.getGetProductMethod) == null) {
      synchronized (ProductsGrpc.class) {
        if ((getGetProductMethod = ProductsGrpc.getGetProductMethod) == null) {
          ProductsGrpc.getGetProductMethod = getGetProductMethod =
              io.grpc.MethodDescriptor.<com.uru.grpc.IdRequest, com.uru.grpc.Product>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getProduct"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uru.grpc.IdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uru.grpc.Product.getDefaultInstance()))
              .setSchemaDescriptor(new ProductsMethodDescriptorSupplier("getProduct"))
              .build();
        }
      }
    }
    return getGetProductMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.uru.grpc.AddRequest,
      com.uru.grpc.Empty> getAddProductMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addProduct",
      requestType = com.uru.grpc.AddRequest.class,
      responseType = com.uru.grpc.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.uru.grpc.AddRequest,
      com.uru.grpc.Empty> getAddProductMethod() {
    io.grpc.MethodDescriptor<com.uru.grpc.AddRequest, com.uru.grpc.Empty> getAddProductMethod;
    if ((getAddProductMethod = ProductsGrpc.getAddProductMethod) == null) {
      synchronized (ProductsGrpc.class) {
        if ((getAddProductMethod = ProductsGrpc.getAddProductMethod) == null) {
          ProductsGrpc.getAddProductMethod = getAddProductMethod =
              io.grpc.MethodDescriptor.<com.uru.grpc.AddRequest, com.uru.grpc.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "addProduct"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uru.grpc.AddRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uru.grpc.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new ProductsMethodDescriptorSupplier("addProduct"))
              .build();
        }
      }
    }
    return getAddProductMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.uru.grpc.Product,
      com.uru.grpc.Empty> getUpdateProductMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateProduct",
      requestType = com.uru.grpc.Product.class,
      responseType = com.uru.grpc.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.uru.grpc.Product,
      com.uru.grpc.Empty> getUpdateProductMethod() {
    io.grpc.MethodDescriptor<com.uru.grpc.Product, com.uru.grpc.Empty> getUpdateProductMethod;
    if ((getUpdateProductMethod = ProductsGrpc.getUpdateProductMethod) == null) {
      synchronized (ProductsGrpc.class) {
        if ((getUpdateProductMethod = ProductsGrpc.getUpdateProductMethod) == null) {
          ProductsGrpc.getUpdateProductMethod = getUpdateProductMethod =
              io.grpc.MethodDescriptor.<com.uru.grpc.Product, com.uru.grpc.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "updateProduct"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uru.grpc.Product.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uru.grpc.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new ProductsMethodDescriptorSupplier("updateProduct"))
              .build();
        }
      }
    }
    return getUpdateProductMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.uru.grpc.IdRequest,
      com.uru.grpc.Empty> getDeleteProductMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteProduct",
      requestType = com.uru.grpc.IdRequest.class,
      responseType = com.uru.grpc.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.uru.grpc.IdRequest,
      com.uru.grpc.Empty> getDeleteProductMethod() {
    io.grpc.MethodDescriptor<com.uru.grpc.IdRequest, com.uru.grpc.Empty> getDeleteProductMethod;
    if ((getDeleteProductMethod = ProductsGrpc.getDeleteProductMethod) == null) {
      synchronized (ProductsGrpc.class) {
        if ((getDeleteProductMethod = ProductsGrpc.getDeleteProductMethod) == null) {
          ProductsGrpc.getDeleteProductMethod = getDeleteProductMethod =
              io.grpc.MethodDescriptor.<com.uru.grpc.IdRequest, com.uru.grpc.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "deleteProduct"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uru.grpc.IdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uru.grpc.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new ProductsMethodDescriptorSupplier("deleteProduct"))
              .build();
        }
      }
    }
    return getDeleteProductMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ProductsStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProductsStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProductsStub>() {
        @java.lang.Override
        public ProductsStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProductsStub(channel, callOptions);
        }
      };
    return ProductsStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ProductsBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProductsBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProductsBlockingStub>() {
        @java.lang.Override
        public ProductsBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProductsBlockingStub(channel, callOptions);
        }
      };
    return ProductsBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ProductsFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProductsFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProductsFutureStub>() {
        @java.lang.Override
        public ProductsFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProductsFutureStub(channel, callOptions);
        }
      };
    return ProductsFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void getAllProducts(com.uru.grpc.Empty request,
        io.grpc.stub.StreamObserver<com.uru.grpc.Product> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAllProductsMethod(), responseObserver);
    }

    /**
     */
    default void getProduct(com.uru.grpc.IdRequest request,
        io.grpc.stub.StreamObserver<com.uru.grpc.Product> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetProductMethod(), responseObserver);
    }

    /**
     */
    default void addProduct(com.uru.grpc.AddRequest request,
        io.grpc.stub.StreamObserver<com.uru.grpc.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddProductMethod(), responseObserver);
    }

    /**
     */
    default void updateProduct(com.uru.grpc.Product request,
        io.grpc.stub.StreamObserver<com.uru.grpc.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateProductMethod(), responseObserver);
    }

    /**
     */
    default void deleteProduct(com.uru.grpc.IdRequest request,
        io.grpc.stub.StreamObserver<com.uru.grpc.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteProductMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Products.
   */
  public static abstract class ProductsImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ProductsGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Products.
   */
  public static final class ProductsStub
      extends io.grpc.stub.AbstractAsyncStub<ProductsStub> {
    private ProductsStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductsStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProductsStub(channel, callOptions);
    }

    /**
     */
    public void getAllProducts(com.uru.grpc.Empty request,
        io.grpc.stub.StreamObserver<com.uru.grpc.Product> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGetAllProductsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getProduct(com.uru.grpc.IdRequest request,
        io.grpc.stub.StreamObserver<com.uru.grpc.Product> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetProductMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addProduct(com.uru.grpc.AddRequest request,
        io.grpc.stub.StreamObserver<com.uru.grpc.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddProductMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateProduct(com.uru.grpc.Product request,
        io.grpc.stub.StreamObserver<com.uru.grpc.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateProductMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteProduct(com.uru.grpc.IdRequest request,
        io.grpc.stub.StreamObserver<com.uru.grpc.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteProductMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Products.
   */
  public static final class ProductsBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ProductsBlockingStub> {
    private ProductsBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductsBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProductsBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<com.uru.grpc.Product> getAllProducts(
        com.uru.grpc.Empty request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGetAllProductsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.uru.grpc.Product getProduct(com.uru.grpc.IdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetProductMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.uru.grpc.Empty addProduct(com.uru.grpc.AddRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddProductMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.uru.grpc.Empty updateProduct(com.uru.grpc.Product request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateProductMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.uru.grpc.Empty deleteProduct(com.uru.grpc.IdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteProductMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Products.
   */
  public static final class ProductsFutureStub
      extends io.grpc.stub.AbstractFutureStub<ProductsFutureStub> {
    private ProductsFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductsFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProductsFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.uru.grpc.Product> getProduct(
        com.uru.grpc.IdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetProductMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.uru.grpc.Empty> addProduct(
        com.uru.grpc.AddRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddProductMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.uru.grpc.Empty> updateProduct(
        com.uru.grpc.Product request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateProductMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.uru.grpc.Empty> deleteProduct(
        com.uru.grpc.IdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteProductMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ALL_PRODUCTS = 0;
  private static final int METHODID_GET_PRODUCT = 1;
  private static final int METHODID_ADD_PRODUCT = 2;
  private static final int METHODID_UPDATE_PRODUCT = 3;
  private static final int METHODID_DELETE_PRODUCT = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_ALL_PRODUCTS:
          serviceImpl.getAllProducts((com.uru.grpc.Empty) request,
              (io.grpc.stub.StreamObserver<com.uru.grpc.Product>) responseObserver);
          break;
        case METHODID_GET_PRODUCT:
          serviceImpl.getProduct((com.uru.grpc.IdRequest) request,
              (io.grpc.stub.StreamObserver<com.uru.grpc.Product>) responseObserver);
          break;
        case METHODID_ADD_PRODUCT:
          serviceImpl.addProduct((com.uru.grpc.AddRequest) request,
              (io.grpc.stub.StreamObserver<com.uru.grpc.Empty>) responseObserver);
          break;
        case METHODID_UPDATE_PRODUCT:
          serviceImpl.updateProduct((com.uru.grpc.Product) request,
              (io.grpc.stub.StreamObserver<com.uru.grpc.Empty>) responseObserver);
          break;
        case METHODID_DELETE_PRODUCT:
          serviceImpl.deleteProduct((com.uru.grpc.IdRequest) request,
              (io.grpc.stub.StreamObserver<com.uru.grpc.Empty>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getGetAllProductsMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.uru.grpc.Empty,
              com.uru.grpc.Product>(
                service, METHODID_GET_ALL_PRODUCTS)))
        .addMethod(
          getGetProductMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.uru.grpc.IdRequest,
              com.uru.grpc.Product>(
                service, METHODID_GET_PRODUCT)))
        .addMethod(
          getAddProductMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.uru.grpc.AddRequest,
              com.uru.grpc.Empty>(
                service, METHODID_ADD_PRODUCT)))
        .addMethod(
          getUpdateProductMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.uru.grpc.Product,
              com.uru.grpc.Empty>(
                service, METHODID_UPDATE_PRODUCT)))
        .addMethod(
          getDeleteProductMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.uru.grpc.IdRequest,
              com.uru.grpc.Empty>(
                service, METHODID_DELETE_PRODUCT)))
        .build();
  }

  private static abstract class ProductsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ProductsBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.uru.grpc.ProductsProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Products");
    }
  }

  private static final class ProductsFileDescriptorSupplier
      extends ProductsBaseDescriptorSupplier {
    ProductsFileDescriptorSupplier() {}
  }

  private static final class ProductsMethodDescriptorSupplier
      extends ProductsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    ProductsMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ProductsGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ProductsFileDescriptorSupplier())
              .addMethod(getGetAllProductsMethod())
              .addMethod(getGetProductMethod())
              .addMethod(getAddProductMethod())
              .addMethod(getUpdateProductMethod())
              .addMethod(getDeleteProductMethod())
              .build();
        }
      }
    }
    return result;
  }
}
