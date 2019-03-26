package com.blinderjay.BBS.grpc.Con;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.19.0)",
    comments = "Source: ContactService.proto")
public final class BBS_ConGrpc {

  private BBS_ConGrpc() {}

  public static final String SERVICE_NAME = "Con.BBS_Con";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.blinderjay.BBS.grpc.Con.userRegisReq,
      com.blinderjay.BBS.grpc.Con.userInRes> getUserRegisterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "userRegister",
      requestType = com.blinderjay.BBS.grpc.Con.userRegisReq.class,
      responseType = com.blinderjay.BBS.grpc.Con.userInRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.blinderjay.BBS.grpc.Con.userRegisReq,
      com.blinderjay.BBS.grpc.Con.userInRes> getUserRegisterMethod() {
    io.grpc.MethodDescriptor<com.blinderjay.BBS.grpc.Con.userRegisReq, com.blinderjay.BBS.grpc.Con.userInRes> getUserRegisterMethod;
    if ((getUserRegisterMethod = BBS_ConGrpc.getUserRegisterMethod) == null) {
      synchronized (BBS_ConGrpc.class) {
        if ((getUserRegisterMethod = BBS_ConGrpc.getUserRegisterMethod) == null) {
          BBS_ConGrpc.getUserRegisterMethod = getUserRegisterMethod = 
              io.grpc.MethodDescriptor.<com.blinderjay.BBS.grpc.Con.userRegisReq, com.blinderjay.BBS.grpc.Con.userInRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Con.BBS_Con", "userRegister"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.blinderjay.BBS.grpc.Con.userRegisReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.blinderjay.BBS.grpc.Con.userInRes.getDefaultInstance()))
                  .setSchemaDescriptor(new BBS_ConMethodDescriptorSupplier("userRegister"))
                  .build();
          }
        }
     }
     return getUserRegisterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.blinderjay.BBS.grpc.Con.userLoginReq,
      com.blinderjay.BBS.grpc.Con.userInRes> getUserLoginMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "userLogin",
      requestType = com.blinderjay.BBS.grpc.Con.userLoginReq.class,
      responseType = com.blinderjay.BBS.grpc.Con.userInRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.blinderjay.BBS.grpc.Con.userLoginReq,
      com.blinderjay.BBS.grpc.Con.userInRes> getUserLoginMethod() {
    io.grpc.MethodDescriptor<com.blinderjay.BBS.grpc.Con.userLoginReq, com.blinderjay.BBS.grpc.Con.userInRes> getUserLoginMethod;
    if ((getUserLoginMethod = BBS_ConGrpc.getUserLoginMethod) == null) {
      synchronized (BBS_ConGrpc.class) {
        if ((getUserLoginMethod = BBS_ConGrpc.getUserLoginMethod) == null) {
          BBS_ConGrpc.getUserLoginMethod = getUserLoginMethod = 
              io.grpc.MethodDescriptor.<com.blinderjay.BBS.grpc.Con.userLoginReq, com.blinderjay.BBS.grpc.Con.userInRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Con.BBS_Con", "userLogin"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.blinderjay.BBS.grpc.Con.userLoginReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.blinderjay.BBS.grpc.Con.userInRes.getDefaultInstance()))
                  .setSchemaDescriptor(new BBS_ConMethodDescriptorSupplier("userLogin"))
                  .build();
          }
        }
     }
     return getUserLoginMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.blinderjay.BBS.grpc.Con.bbsClientReq,
      com.blinderjay.BBS.grpc.Con.bbsThread> getGetAllThreadsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAllThreads",
      requestType = com.blinderjay.BBS.grpc.Con.bbsClientReq.class,
      responseType = com.blinderjay.BBS.grpc.Con.bbsThread.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.blinderjay.BBS.grpc.Con.bbsClientReq,
      com.blinderjay.BBS.grpc.Con.bbsThread> getGetAllThreadsMethod() {
    io.grpc.MethodDescriptor<com.blinderjay.BBS.grpc.Con.bbsClientReq, com.blinderjay.BBS.grpc.Con.bbsThread> getGetAllThreadsMethod;
    if ((getGetAllThreadsMethod = BBS_ConGrpc.getGetAllThreadsMethod) == null) {
      synchronized (BBS_ConGrpc.class) {
        if ((getGetAllThreadsMethod = BBS_ConGrpc.getGetAllThreadsMethod) == null) {
          BBS_ConGrpc.getGetAllThreadsMethod = getGetAllThreadsMethod = 
              io.grpc.MethodDescriptor.<com.blinderjay.BBS.grpc.Con.bbsClientReq, com.blinderjay.BBS.grpc.Con.bbsThread>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "Con.BBS_Con", "getAllThreads"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.blinderjay.BBS.grpc.Con.bbsClientReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.blinderjay.BBS.grpc.Con.bbsThread.getDefaultInstance()))
                  .setSchemaDescriptor(new BBS_ConMethodDescriptorSupplier("getAllThreads"))
                  .build();
          }
        }
     }
     return getGetAllThreadsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.blinderjay.BBS.grpc.Con.bbsClientReq,
      com.blinderjay.BBS.grpc.Con.bbsUserInfo> getGetUserInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getUserInfo",
      requestType = com.blinderjay.BBS.grpc.Con.bbsClientReq.class,
      responseType = com.blinderjay.BBS.grpc.Con.bbsUserInfo.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.blinderjay.BBS.grpc.Con.bbsClientReq,
      com.blinderjay.BBS.grpc.Con.bbsUserInfo> getGetUserInfoMethod() {
    io.grpc.MethodDescriptor<com.blinderjay.BBS.grpc.Con.bbsClientReq, com.blinderjay.BBS.grpc.Con.bbsUserInfo> getGetUserInfoMethod;
    if ((getGetUserInfoMethod = BBS_ConGrpc.getGetUserInfoMethod) == null) {
      synchronized (BBS_ConGrpc.class) {
        if ((getGetUserInfoMethod = BBS_ConGrpc.getGetUserInfoMethod) == null) {
          BBS_ConGrpc.getGetUserInfoMethod = getGetUserInfoMethod = 
              io.grpc.MethodDescriptor.<com.blinderjay.BBS.grpc.Con.bbsClientReq, com.blinderjay.BBS.grpc.Con.bbsUserInfo>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Con.BBS_Con", "getUserInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.blinderjay.BBS.grpc.Con.bbsClientReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.blinderjay.BBS.grpc.Con.bbsUserInfo.getDefaultInstance()))
                  .setSchemaDescriptor(new BBS_ConMethodDescriptorSupplier("getUserInfo"))
                  .build();
          }
        }
     }
     return getGetUserInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.blinderjay.BBS.grpc.Con.bbsClientReq,
      com.blinderjay.BBS.grpc.Con.bbsThread> getGetThreadsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getThreads",
      requestType = com.blinderjay.BBS.grpc.Con.bbsClientReq.class,
      responseType = com.blinderjay.BBS.grpc.Con.bbsThread.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.blinderjay.BBS.grpc.Con.bbsClientReq,
      com.blinderjay.BBS.grpc.Con.bbsThread> getGetThreadsMethod() {
    io.grpc.MethodDescriptor<com.blinderjay.BBS.grpc.Con.bbsClientReq, com.blinderjay.BBS.grpc.Con.bbsThread> getGetThreadsMethod;
    if ((getGetThreadsMethod = BBS_ConGrpc.getGetThreadsMethod) == null) {
      synchronized (BBS_ConGrpc.class) {
        if ((getGetThreadsMethod = BBS_ConGrpc.getGetThreadsMethod) == null) {
          BBS_ConGrpc.getGetThreadsMethod = getGetThreadsMethod = 
              io.grpc.MethodDescriptor.<com.blinderjay.BBS.grpc.Con.bbsClientReq, com.blinderjay.BBS.grpc.Con.bbsThread>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "Con.BBS_Con", "getThreads"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.blinderjay.BBS.grpc.Con.bbsClientReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.blinderjay.BBS.grpc.Con.bbsThread.getDefaultInstance()))
                  .setSchemaDescriptor(new BBS_ConMethodDescriptorSupplier("getThreads"))
                  .build();
          }
        }
     }
     return getGetThreadsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.blinderjay.BBS.grpc.Con.bbsClientReq,
      com.blinderjay.BBS.grpc.Con.bbsPost> getGenPostsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "genPosts",
      requestType = com.blinderjay.BBS.grpc.Con.bbsClientReq.class,
      responseType = com.blinderjay.BBS.grpc.Con.bbsPost.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.blinderjay.BBS.grpc.Con.bbsClientReq,
      com.blinderjay.BBS.grpc.Con.bbsPost> getGenPostsMethod() {
    io.grpc.MethodDescriptor<com.blinderjay.BBS.grpc.Con.bbsClientReq, com.blinderjay.BBS.grpc.Con.bbsPost> getGenPostsMethod;
    if ((getGenPostsMethod = BBS_ConGrpc.getGenPostsMethod) == null) {
      synchronized (BBS_ConGrpc.class) {
        if ((getGenPostsMethod = BBS_ConGrpc.getGenPostsMethod) == null) {
          BBS_ConGrpc.getGenPostsMethod = getGenPostsMethod = 
              io.grpc.MethodDescriptor.<com.blinderjay.BBS.grpc.Con.bbsClientReq, com.blinderjay.BBS.grpc.Con.bbsPost>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "Con.BBS_Con", "genPosts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.blinderjay.BBS.grpc.Con.bbsClientReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.blinderjay.BBS.grpc.Con.bbsPost.getDefaultInstance()))
                  .setSchemaDescriptor(new BBS_ConMethodDescriptorSupplier("genPosts"))
                  .build();
          }
        }
     }
     return getGenPostsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.blinderjay.BBS.grpc.Con.bbsClientReq,
      com.blinderjay.BBS.grpc.Con.bbsServerRes> getChPasswordMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "chPassword",
      requestType = com.blinderjay.BBS.grpc.Con.bbsClientReq.class,
      responseType = com.blinderjay.BBS.grpc.Con.bbsServerRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.blinderjay.BBS.grpc.Con.bbsClientReq,
      com.blinderjay.BBS.grpc.Con.bbsServerRes> getChPasswordMethod() {
    io.grpc.MethodDescriptor<com.blinderjay.BBS.grpc.Con.bbsClientReq, com.blinderjay.BBS.grpc.Con.bbsServerRes> getChPasswordMethod;
    if ((getChPasswordMethod = BBS_ConGrpc.getChPasswordMethod) == null) {
      synchronized (BBS_ConGrpc.class) {
        if ((getChPasswordMethod = BBS_ConGrpc.getChPasswordMethod) == null) {
          BBS_ConGrpc.getChPasswordMethod = getChPasswordMethod = 
              io.grpc.MethodDescriptor.<com.blinderjay.BBS.grpc.Con.bbsClientReq, com.blinderjay.BBS.grpc.Con.bbsServerRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Con.BBS_Con", "chPassword"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.blinderjay.BBS.grpc.Con.bbsClientReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.blinderjay.BBS.grpc.Con.bbsServerRes.getDefaultInstance()))
                  .setSchemaDescriptor(new BBS_ConMethodDescriptorSupplier("chPassword"))
                  .build();
          }
        }
     }
     return getChPasswordMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.blinderjay.BBS.grpc.Con.bbsUserInfo,
      com.blinderjay.BBS.grpc.Con.bbsServerRes> getRefreshUserInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "refreshUserInfo",
      requestType = com.blinderjay.BBS.grpc.Con.bbsUserInfo.class,
      responseType = com.blinderjay.BBS.grpc.Con.bbsServerRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.blinderjay.BBS.grpc.Con.bbsUserInfo,
      com.blinderjay.BBS.grpc.Con.bbsServerRes> getRefreshUserInfoMethod() {
    io.grpc.MethodDescriptor<com.blinderjay.BBS.grpc.Con.bbsUserInfo, com.blinderjay.BBS.grpc.Con.bbsServerRes> getRefreshUserInfoMethod;
    if ((getRefreshUserInfoMethod = BBS_ConGrpc.getRefreshUserInfoMethod) == null) {
      synchronized (BBS_ConGrpc.class) {
        if ((getRefreshUserInfoMethod = BBS_ConGrpc.getRefreshUserInfoMethod) == null) {
          BBS_ConGrpc.getRefreshUserInfoMethod = getRefreshUserInfoMethod = 
              io.grpc.MethodDescriptor.<com.blinderjay.BBS.grpc.Con.bbsUserInfo, com.blinderjay.BBS.grpc.Con.bbsServerRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Con.BBS_Con", "refreshUserInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.blinderjay.BBS.grpc.Con.bbsUserInfo.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.blinderjay.BBS.grpc.Con.bbsServerRes.getDefaultInstance()))
                  .setSchemaDescriptor(new BBS_ConMethodDescriptorSupplier("refreshUserInfo"))
                  .build();
          }
        }
     }
     return getRefreshUserInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.blinderjay.BBS.grpc.Con.bbsThread,
      com.blinderjay.BBS.grpc.Con.bbsServerRes> getPushThreadMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "pushThread",
      requestType = com.blinderjay.BBS.grpc.Con.bbsThread.class,
      responseType = com.blinderjay.BBS.grpc.Con.bbsServerRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.blinderjay.BBS.grpc.Con.bbsThread,
      com.blinderjay.BBS.grpc.Con.bbsServerRes> getPushThreadMethod() {
    io.grpc.MethodDescriptor<com.blinderjay.BBS.grpc.Con.bbsThread, com.blinderjay.BBS.grpc.Con.bbsServerRes> getPushThreadMethod;
    if ((getPushThreadMethod = BBS_ConGrpc.getPushThreadMethod) == null) {
      synchronized (BBS_ConGrpc.class) {
        if ((getPushThreadMethod = BBS_ConGrpc.getPushThreadMethod) == null) {
          BBS_ConGrpc.getPushThreadMethod = getPushThreadMethod = 
              io.grpc.MethodDescriptor.<com.blinderjay.BBS.grpc.Con.bbsThread, com.blinderjay.BBS.grpc.Con.bbsServerRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Con.BBS_Con", "pushThread"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.blinderjay.BBS.grpc.Con.bbsThread.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.blinderjay.BBS.grpc.Con.bbsServerRes.getDefaultInstance()))
                  .setSchemaDescriptor(new BBS_ConMethodDescriptorSupplier("pushThread"))
                  .build();
          }
        }
     }
     return getPushThreadMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.blinderjay.BBS.grpc.Con.bbsPost,
      com.blinderjay.BBS.grpc.Con.bbsServerRes> getPushPostsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "pushPosts",
      requestType = com.blinderjay.BBS.grpc.Con.bbsPost.class,
      responseType = com.blinderjay.BBS.grpc.Con.bbsServerRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.blinderjay.BBS.grpc.Con.bbsPost,
      com.blinderjay.BBS.grpc.Con.bbsServerRes> getPushPostsMethod() {
    io.grpc.MethodDescriptor<com.blinderjay.BBS.grpc.Con.bbsPost, com.blinderjay.BBS.grpc.Con.bbsServerRes> getPushPostsMethod;
    if ((getPushPostsMethod = BBS_ConGrpc.getPushPostsMethod) == null) {
      synchronized (BBS_ConGrpc.class) {
        if ((getPushPostsMethod = BBS_ConGrpc.getPushPostsMethod) == null) {
          BBS_ConGrpc.getPushPostsMethod = getPushPostsMethod = 
              io.grpc.MethodDescriptor.<com.blinderjay.BBS.grpc.Con.bbsPost, com.blinderjay.BBS.grpc.Con.bbsServerRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Con.BBS_Con", "pushPosts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.blinderjay.BBS.grpc.Con.bbsPost.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.blinderjay.BBS.grpc.Con.bbsServerRes.getDefaultInstance()))
                  .setSchemaDescriptor(new BBS_ConMethodDescriptorSupplier("pushPosts"))
                  .build();
          }
        }
     }
     return getPushPostsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.blinderjay.BBS.grpc.Con.bbsClientReq,
      com.blinderjay.BBS.grpc.Con.bbsServerRes> getUserLogoutMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "userLogout",
      requestType = com.blinderjay.BBS.grpc.Con.bbsClientReq.class,
      responseType = com.blinderjay.BBS.grpc.Con.bbsServerRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.blinderjay.BBS.grpc.Con.bbsClientReq,
      com.blinderjay.BBS.grpc.Con.bbsServerRes> getUserLogoutMethod() {
    io.grpc.MethodDescriptor<com.blinderjay.BBS.grpc.Con.bbsClientReq, com.blinderjay.BBS.grpc.Con.bbsServerRes> getUserLogoutMethod;
    if ((getUserLogoutMethod = BBS_ConGrpc.getUserLogoutMethod) == null) {
      synchronized (BBS_ConGrpc.class) {
        if ((getUserLogoutMethod = BBS_ConGrpc.getUserLogoutMethod) == null) {
          BBS_ConGrpc.getUserLogoutMethod = getUserLogoutMethod = 
              io.grpc.MethodDescriptor.<com.blinderjay.BBS.grpc.Con.bbsClientReq, com.blinderjay.BBS.grpc.Con.bbsServerRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Con.BBS_Con", "userLogout"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.blinderjay.BBS.grpc.Con.bbsClientReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.blinderjay.BBS.grpc.Con.bbsServerRes.getDefaultInstance()))
                  .setSchemaDescriptor(new BBS_ConMethodDescriptorSupplier("userLogout"))
                  .build();
          }
        }
     }
     return getUserLogoutMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.blinderjay.BBS.grpc.Con.bbsClientReq,
      com.blinderjay.BBS.grpc.Con.bbsServerRes> getDelThreadMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "delThread",
      requestType = com.blinderjay.BBS.grpc.Con.bbsClientReq.class,
      responseType = com.blinderjay.BBS.grpc.Con.bbsServerRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.blinderjay.BBS.grpc.Con.bbsClientReq,
      com.blinderjay.BBS.grpc.Con.bbsServerRes> getDelThreadMethod() {
    io.grpc.MethodDescriptor<com.blinderjay.BBS.grpc.Con.bbsClientReq, com.blinderjay.BBS.grpc.Con.bbsServerRes> getDelThreadMethod;
    if ((getDelThreadMethod = BBS_ConGrpc.getDelThreadMethod) == null) {
      synchronized (BBS_ConGrpc.class) {
        if ((getDelThreadMethod = BBS_ConGrpc.getDelThreadMethod) == null) {
          BBS_ConGrpc.getDelThreadMethod = getDelThreadMethod = 
              io.grpc.MethodDescriptor.<com.blinderjay.BBS.grpc.Con.bbsClientReq, com.blinderjay.BBS.grpc.Con.bbsServerRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Con.BBS_Con", "delThread"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.blinderjay.BBS.grpc.Con.bbsClientReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.blinderjay.BBS.grpc.Con.bbsServerRes.getDefaultInstance()))
                  .setSchemaDescriptor(new BBS_ConMethodDescriptorSupplier("delThread"))
                  .build();
          }
        }
     }
     return getDelThreadMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.blinderjay.BBS.grpc.Con.bbsClientReq,
      com.blinderjay.BBS.grpc.Con.bbsServerRes> getDelPostMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "delPost",
      requestType = com.blinderjay.BBS.grpc.Con.bbsClientReq.class,
      responseType = com.blinderjay.BBS.grpc.Con.bbsServerRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.blinderjay.BBS.grpc.Con.bbsClientReq,
      com.blinderjay.BBS.grpc.Con.bbsServerRes> getDelPostMethod() {
    io.grpc.MethodDescriptor<com.blinderjay.BBS.grpc.Con.bbsClientReq, com.blinderjay.BBS.grpc.Con.bbsServerRes> getDelPostMethod;
    if ((getDelPostMethod = BBS_ConGrpc.getDelPostMethod) == null) {
      synchronized (BBS_ConGrpc.class) {
        if ((getDelPostMethod = BBS_ConGrpc.getDelPostMethod) == null) {
          BBS_ConGrpc.getDelPostMethod = getDelPostMethod = 
              io.grpc.MethodDescriptor.<com.blinderjay.BBS.grpc.Con.bbsClientReq, com.blinderjay.BBS.grpc.Con.bbsServerRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Con.BBS_Con", "delPost"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.blinderjay.BBS.grpc.Con.bbsClientReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.blinderjay.BBS.grpc.Con.bbsServerRes.getDefaultInstance()))
                  .setSchemaDescriptor(new BBS_ConMethodDescriptorSupplier("delPost"))
                  .build();
          }
        }
     }
     return getDelPostMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.blinderjay.BBS.grpc.Con.userinfoReq,
      com.blinderjay.BBS.grpc.Con.userinfoReply> getGetinfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getinfo",
      requestType = com.blinderjay.BBS.grpc.Con.userinfoReq.class,
      responseType = com.blinderjay.BBS.grpc.Con.userinfoReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.blinderjay.BBS.grpc.Con.userinfoReq,
      com.blinderjay.BBS.grpc.Con.userinfoReply> getGetinfoMethod() {
    io.grpc.MethodDescriptor<com.blinderjay.BBS.grpc.Con.userinfoReq, com.blinderjay.BBS.grpc.Con.userinfoReply> getGetinfoMethod;
    if ((getGetinfoMethod = BBS_ConGrpc.getGetinfoMethod) == null) {
      synchronized (BBS_ConGrpc.class) {
        if ((getGetinfoMethod = BBS_ConGrpc.getGetinfoMethod) == null) {
          BBS_ConGrpc.getGetinfoMethod = getGetinfoMethod = 
              io.grpc.MethodDescriptor.<com.blinderjay.BBS.grpc.Con.userinfoReq, com.blinderjay.BBS.grpc.Con.userinfoReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Con.BBS_Con", "getinfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.blinderjay.BBS.grpc.Con.userinfoReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.blinderjay.BBS.grpc.Con.userinfoReply.getDefaultInstance()))
                  .setSchemaDescriptor(new BBS_ConMethodDescriptorSupplier("getinfo"))
                  .build();
          }
        }
     }
     return getGetinfoMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BBS_ConStub newStub(io.grpc.Channel channel) {
    return new BBS_ConStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BBS_ConBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new BBS_ConBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BBS_ConFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new BBS_ConFutureStub(channel);
  }

  /**
   */
  public static abstract class BBS_ConImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * following 2 request do not need cookie
     * </pre>
     */
    public void userRegister(com.blinderjay.BBS.grpc.Con.userRegisReq request,
        io.grpc.stub.StreamObserver<com.blinderjay.BBS.grpc.Con.userInRes> responseObserver) {
      asyncUnimplementedUnaryCall(getUserRegisterMethod(), responseObserver);
    }

    /**
     */
    public void userLogin(com.blinderjay.BBS.grpc.Con.userLoginReq request,
        io.grpc.stub.StreamObserver<com.blinderjay.BBS.grpc.Con.userInRes> responseObserver) {
      asyncUnimplementedUnaryCall(getUserLoginMethod(), responseObserver);
    }

    /**
     */
    public void getAllThreads(com.blinderjay.BBS.grpc.Con.bbsClientReq request,
        io.grpc.stub.StreamObserver<com.blinderjay.BBS.grpc.Con.bbsThread> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAllThreadsMethod(), responseObserver);
    }

    /**
     * <pre>
     *get info:
     * </pre>
     */
    public void getUserInfo(com.blinderjay.BBS.grpc.Con.bbsClientReq request,
        io.grpc.stub.StreamObserver<com.blinderjay.BBS.grpc.Con.bbsUserInfo> responseObserver) {
      asyncUnimplementedUnaryCall(getGetUserInfoMethod(), responseObserver);
    }

    /**
     */
    public void getThreads(com.blinderjay.BBS.grpc.Con.bbsClientReq request,
        io.grpc.stub.StreamObserver<com.blinderjay.BBS.grpc.Con.bbsThread> responseObserver) {
      asyncUnimplementedUnaryCall(getGetThreadsMethod(), responseObserver);
    }

    /**
     */
    public void genPosts(com.blinderjay.BBS.grpc.Con.bbsClientReq request,
        io.grpc.stub.StreamObserver<com.blinderjay.BBS.grpc.Con.bbsPost> responseObserver) {
      asyncUnimplementedUnaryCall(getGenPostsMethod(), responseObserver);
    }

    /**
     * <pre>
     *refresh info in database
     * </pre>
     */
    public void chPassword(com.blinderjay.BBS.grpc.Con.bbsClientReq request,
        io.grpc.stub.StreamObserver<com.blinderjay.BBS.grpc.Con.bbsServerRes> responseObserver) {
      asyncUnimplementedUnaryCall(getChPasswordMethod(), responseObserver);
    }

    /**
     */
    public void refreshUserInfo(com.blinderjay.BBS.grpc.Con.bbsUserInfo request,
        io.grpc.stub.StreamObserver<com.blinderjay.BBS.grpc.Con.bbsServerRes> responseObserver) {
      asyncUnimplementedUnaryCall(getRefreshUserInfoMethod(), responseObserver);
    }

    /**
     */
    public void pushThread(com.blinderjay.BBS.grpc.Con.bbsThread request,
        io.grpc.stub.StreamObserver<com.blinderjay.BBS.grpc.Con.bbsServerRes> responseObserver) {
      asyncUnimplementedUnaryCall(getPushThreadMethod(), responseObserver);
    }

    /**
     */
    public void pushPosts(com.blinderjay.BBS.grpc.Con.bbsPost request,
        io.grpc.stub.StreamObserver<com.blinderjay.BBS.grpc.Con.bbsServerRes> responseObserver) {
      asyncUnimplementedUnaryCall(getPushPostsMethod(), responseObserver);
    }

    /**
     * <pre>
     *delete info in database or server
     * </pre>
     */
    public void userLogout(com.blinderjay.BBS.grpc.Con.bbsClientReq request,
        io.grpc.stub.StreamObserver<com.blinderjay.BBS.grpc.Con.bbsServerRes> responseObserver) {
      asyncUnimplementedUnaryCall(getUserLogoutMethod(), responseObserver);
    }

    /**
     */
    public void delThread(com.blinderjay.BBS.grpc.Con.bbsClientReq request,
        io.grpc.stub.StreamObserver<com.blinderjay.BBS.grpc.Con.bbsServerRes> responseObserver) {
      asyncUnimplementedUnaryCall(getDelThreadMethod(), responseObserver);
    }

    /**
     */
    public void delPost(com.blinderjay.BBS.grpc.Con.bbsClientReq request,
        io.grpc.stub.StreamObserver<com.blinderjay.BBS.grpc.Con.bbsServerRes> responseObserver) {
      asyncUnimplementedUnaryCall(getDelPostMethod(), responseObserver);
    }

    /**
     * <pre>
     *for test
     * </pre>
     */
    public void getinfo(com.blinderjay.BBS.grpc.Con.userinfoReq request,
        io.grpc.stub.StreamObserver<com.blinderjay.BBS.grpc.Con.userinfoReply> responseObserver) {
      asyncUnimplementedUnaryCall(getGetinfoMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getUserRegisterMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.blinderjay.BBS.grpc.Con.userRegisReq,
                com.blinderjay.BBS.grpc.Con.userInRes>(
                  this, METHODID_USER_REGISTER)))
          .addMethod(
            getUserLoginMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.blinderjay.BBS.grpc.Con.userLoginReq,
                com.blinderjay.BBS.grpc.Con.userInRes>(
                  this, METHODID_USER_LOGIN)))
          .addMethod(
            getGetAllThreadsMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.blinderjay.BBS.grpc.Con.bbsClientReq,
                com.blinderjay.BBS.grpc.Con.bbsThread>(
                  this, METHODID_GET_ALL_THREADS)))
          .addMethod(
            getGetUserInfoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.blinderjay.BBS.grpc.Con.bbsClientReq,
                com.blinderjay.BBS.grpc.Con.bbsUserInfo>(
                  this, METHODID_GET_USER_INFO)))
          .addMethod(
            getGetThreadsMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.blinderjay.BBS.grpc.Con.bbsClientReq,
                com.blinderjay.BBS.grpc.Con.bbsThread>(
                  this, METHODID_GET_THREADS)))
          .addMethod(
            getGenPostsMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.blinderjay.BBS.grpc.Con.bbsClientReq,
                com.blinderjay.BBS.grpc.Con.bbsPost>(
                  this, METHODID_GEN_POSTS)))
          .addMethod(
            getChPasswordMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.blinderjay.BBS.grpc.Con.bbsClientReq,
                com.blinderjay.BBS.grpc.Con.bbsServerRes>(
                  this, METHODID_CH_PASSWORD)))
          .addMethod(
            getRefreshUserInfoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.blinderjay.BBS.grpc.Con.bbsUserInfo,
                com.blinderjay.BBS.grpc.Con.bbsServerRes>(
                  this, METHODID_REFRESH_USER_INFO)))
          .addMethod(
            getPushThreadMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.blinderjay.BBS.grpc.Con.bbsThread,
                com.blinderjay.BBS.grpc.Con.bbsServerRes>(
                  this, METHODID_PUSH_THREAD)))
          .addMethod(
            getPushPostsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.blinderjay.BBS.grpc.Con.bbsPost,
                com.blinderjay.BBS.grpc.Con.bbsServerRes>(
                  this, METHODID_PUSH_POSTS)))
          .addMethod(
            getUserLogoutMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.blinderjay.BBS.grpc.Con.bbsClientReq,
                com.blinderjay.BBS.grpc.Con.bbsServerRes>(
                  this, METHODID_USER_LOGOUT)))
          .addMethod(
            getDelThreadMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.blinderjay.BBS.grpc.Con.bbsClientReq,
                com.blinderjay.BBS.grpc.Con.bbsServerRes>(
                  this, METHODID_DEL_THREAD)))
          .addMethod(
            getDelPostMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.blinderjay.BBS.grpc.Con.bbsClientReq,
                com.blinderjay.BBS.grpc.Con.bbsServerRes>(
                  this, METHODID_DEL_POST)))
          .addMethod(
            getGetinfoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.blinderjay.BBS.grpc.Con.userinfoReq,
                com.blinderjay.BBS.grpc.Con.userinfoReply>(
                  this, METHODID_GETINFO)))
          .build();
    }
  }

  /**
   */
  public static final class BBS_ConStub extends io.grpc.stub.AbstractStub<BBS_ConStub> {
    private BBS_ConStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BBS_ConStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BBS_ConStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BBS_ConStub(channel, callOptions);
    }

    /**
     * <pre>
     * following 2 request do not need cookie
     * </pre>
     */
    public void userRegister(com.blinderjay.BBS.grpc.Con.userRegisReq request,
        io.grpc.stub.StreamObserver<com.blinderjay.BBS.grpc.Con.userInRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUserRegisterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void userLogin(com.blinderjay.BBS.grpc.Con.userLoginReq request,
        io.grpc.stub.StreamObserver<com.blinderjay.BBS.grpc.Con.userInRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUserLoginMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllThreads(com.blinderjay.BBS.grpc.Con.bbsClientReq request,
        io.grpc.stub.StreamObserver<com.blinderjay.BBS.grpc.Con.bbsThread> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetAllThreadsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *get info:
     * </pre>
     */
    public void getUserInfo(com.blinderjay.BBS.grpc.Con.bbsClientReq request,
        io.grpc.stub.StreamObserver<com.blinderjay.BBS.grpc.Con.bbsUserInfo> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetUserInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getThreads(com.blinderjay.BBS.grpc.Con.bbsClientReq request,
        io.grpc.stub.StreamObserver<com.blinderjay.BBS.grpc.Con.bbsThread> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetThreadsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void genPosts(com.blinderjay.BBS.grpc.Con.bbsClientReq request,
        io.grpc.stub.StreamObserver<com.blinderjay.BBS.grpc.Con.bbsPost> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGenPostsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *refresh info in database
     * </pre>
     */
    public void chPassword(com.blinderjay.BBS.grpc.Con.bbsClientReq request,
        io.grpc.stub.StreamObserver<com.blinderjay.BBS.grpc.Con.bbsServerRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getChPasswordMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void refreshUserInfo(com.blinderjay.BBS.grpc.Con.bbsUserInfo request,
        io.grpc.stub.StreamObserver<com.blinderjay.BBS.grpc.Con.bbsServerRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRefreshUserInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void pushThread(com.blinderjay.BBS.grpc.Con.bbsThread request,
        io.grpc.stub.StreamObserver<com.blinderjay.BBS.grpc.Con.bbsServerRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPushThreadMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void pushPosts(com.blinderjay.BBS.grpc.Con.bbsPost request,
        io.grpc.stub.StreamObserver<com.blinderjay.BBS.grpc.Con.bbsServerRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPushPostsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *delete info in database or server
     * </pre>
     */
    public void userLogout(com.blinderjay.BBS.grpc.Con.bbsClientReq request,
        io.grpc.stub.StreamObserver<com.blinderjay.BBS.grpc.Con.bbsServerRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUserLogoutMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void delThread(com.blinderjay.BBS.grpc.Con.bbsClientReq request,
        io.grpc.stub.StreamObserver<com.blinderjay.BBS.grpc.Con.bbsServerRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDelThreadMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void delPost(com.blinderjay.BBS.grpc.Con.bbsClientReq request,
        io.grpc.stub.StreamObserver<com.blinderjay.BBS.grpc.Con.bbsServerRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDelPostMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *for test
     * </pre>
     */
    public void getinfo(com.blinderjay.BBS.grpc.Con.userinfoReq request,
        io.grpc.stub.StreamObserver<com.blinderjay.BBS.grpc.Con.userinfoReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetinfoMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class BBS_ConBlockingStub extends io.grpc.stub.AbstractStub<BBS_ConBlockingStub> {
    private BBS_ConBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BBS_ConBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BBS_ConBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BBS_ConBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * following 2 request do not need cookie
     * </pre>
     */
    public com.blinderjay.BBS.grpc.Con.userInRes userRegister(com.blinderjay.BBS.grpc.Con.userRegisReq request) {
      return blockingUnaryCall(
          getChannel(), getUserRegisterMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.blinderjay.BBS.grpc.Con.userInRes userLogin(com.blinderjay.BBS.grpc.Con.userLoginReq request) {
      return blockingUnaryCall(
          getChannel(), getUserLoginMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.blinderjay.BBS.grpc.Con.bbsThread> getAllThreads(
        com.blinderjay.BBS.grpc.Con.bbsClientReq request) {
      return blockingServerStreamingCall(
          getChannel(), getGetAllThreadsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *get info:
     * </pre>
     */
    public com.blinderjay.BBS.grpc.Con.bbsUserInfo getUserInfo(com.blinderjay.BBS.grpc.Con.bbsClientReq request) {
      return blockingUnaryCall(
          getChannel(), getGetUserInfoMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.blinderjay.BBS.grpc.Con.bbsThread> getThreads(
        com.blinderjay.BBS.grpc.Con.bbsClientReq request) {
      return blockingServerStreamingCall(
          getChannel(), getGetThreadsMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.blinderjay.BBS.grpc.Con.bbsPost> genPosts(
        com.blinderjay.BBS.grpc.Con.bbsClientReq request) {
      return blockingServerStreamingCall(
          getChannel(), getGenPostsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *refresh info in database
     * </pre>
     */
    public com.blinderjay.BBS.grpc.Con.bbsServerRes chPassword(com.blinderjay.BBS.grpc.Con.bbsClientReq request) {
      return blockingUnaryCall(
          getChannel(), getChPasswordMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.blinderjay.BBS.grpc.Con.bbsServerRes refreshUserInfo(com.blinderjay.BBS.grpc.Con.bbsUserInfo request) {
      return blockingUnaryCall(
          getChannel(), getRefreshUserInfoMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.blinderjay.BBS.grpc.Con.bbsServerRes pushThread(com.blinderjay.BBS.grpc.Con.bbsThread request) {
      return blockingUnaryCall(
          getChannel(), getPushThreadMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.blinderjay.BBS.grpc.Con.bbsServerRes pushPosts(com.blinderjay.BBS.grpc.Con.bbsPost request) {
      return blockingUnaryCall(
          getChannel(), getPushPostsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *delete info in database or server
     * </pre>
     */
    public com.blinderjay.BBS.grpc.Con.bbsServerRes userLogout(com.blinderjay.BBS.grpc.Con.bbsClientReq request) {
      return blockingUnaryCall(
          getChannel(), getUserLogoutMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.blinderjay.BBS.grpc.Con.bbsServerRes delThread(com.blinderjay.BBS.grpc.Con.bbsClientReq request) {
      return blockingUnaryCall(
          getChannel(), getDelThreadMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.blinderjay.BBS.grpc.Con.bbsServerRes delPost(com.blinderjay.BBS.grpc.Con.bbsClientReq request) {
      return blockingUnaryCall(
          getChannel(), getDelPostMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *for test
     * </pre>
     */
    public com.blinderjay.BBS.grpc.Con.userinfoReply getinfo(com.blinderjay.BBS.grpc.Con.userinfoReq request) {
      return blockingUnaryCall(
          getChannel(), getGetinfoMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class BBS_ConFutureStub extends io.grpc.stub.AbstractStub<BBS_ConFutureStub> {
    private BBS_ConFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BBS_ConFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BBS_ConFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BBS_ConFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * following 2 request do not need cookie
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.blinderjay.BBS.grpc.Con.userInRes> userRegister(
        com.blinderjay.BBS.grpc.Con.userRegisReq request) {
      return futureUnaryCall(
          getChannel().newCall(getUserRegisterMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.blinderjay.BBS.grpc.Con.userInRes> userLogin(
        com.blinderjay.BBS.grpc.Con.userLoginReq request) {
      return futureUnaryCall(
          getChannel().newCall(getUserLoginMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *get info:
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.blinderjay.BBS.grpc.Con.bbsUserInfo> getUserInfo(
        com.blinderjay.BBS.grpc.Con.bbsClientReq request) {
      return futureUnaryCall(
          getChannel().newCall(getGetUserInfoMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *refresh info in database
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.blinderjay.BBS.grpc.Con.bbsServerRes> chPassword(
        com.blinderjay.BBS.grpc.Con.bbsClientReq request) {
      return futureUnaryCall(
          getChannel().newCall(getChPasswordMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.blinderjay.BBS.grpc.Con.bbsServerRes> refreshUserInfo(
        com.blinderjay.BBS.grpc.Con.bbsUserInfo request) {
      return futureUnaryCall(
          getChannel().newCall(getRefreshUserInfoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.blinderjay.BBS.grpc.Con.bbsServerRes> pushThread(
        com.blinderjay.BBS.grpc.Con.bbsThread request) {
      return futureUnaryCall(
          getChannel().newCall(getPushThreadMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.blinderjay.BBS.grpc.Con.bbsServerRes> pushPosts(
        com.blinderjay.BBS.grpc.Con.bbsPost request) {
      return futureUnaryCall(
          getChannel().newCall(getPushPostsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *delete info in database or server
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.blinderjay.BBS.grpc.Con.bbsServerRes> userLogout(
        com.blinderjay.BBS.grpc.Con.bbsClientReq request) {
      return futureUnaryCall(
          getChannel().newCall(getUserLogoutMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.blinderjay.BBS.grpc.Con.bbsServerRes> delThread(
        com.blinderjay.BBS.grpc.Con.bbsClientReq request) {
      return futureUnaryCall(
          getChannel().newCall(getDelThreadMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.blinderjay.BBS.grpc.Con.bbsServerRes> delPost(
        com.blinderjay.BBS.grpc.Con.bbsClientReq request) {
      return futureUnaryCall(
          getChannel().newCall(getDelPostMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *for test
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.blinderjay.BBS.grpc.Con.userinfoReply> getinfo(
        com.blinderjay.BBS.grpc.Con.userinfoReq request) {
      return futureUnaryCall(
          getChannel().newCall(getGetinfoMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_USER_REGISTER = 0;
  private static final int METHODID_USER_LOGIN = 1;
  private static final int METHODID_GET_ALL_THREADS = 2;
  private static final int METHODID_GET_USER_INFO = 3;
  private static final int METHODID_GET_THREADS = 4;
  private static final int METHODID_GEN_POSTS = 5;
  private static final int METHODID_CH_PASSWORD = 6;
  private static final int METHODID_REFRESH_USER_INFO = 7;
  private static final int METHODID_PUSH_THREAD = 8;
  private static final int METHODID_PUSH_POSTS = 9;
  private static final int METHODID_USER_LOGOUT = 10;
  private static final int METHODID_DEL_THREAD = 11;
  private static final int METHODID_DEL_POST = 12;
  private static final int METHODID_GETINFO = 13;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final BBS_ConImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(BBS_ConImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_USER_REGISTER:
          serviceImpl.userRegister((com.blinderjay.BBS.grpc.Con.userRegisReq) request,
              (io.grpc.stub.StreamObserver<com.blinderjay.BBS.grpc.Con.userInRes>) responseObserver);
          break;
        case METHODID_USER_LOGIN:
          serviceImpl.userLogin((com.blinderjay.BBS.grpc.Con.userLoginReq) request,
              (io.grpc.stub.StreamObserver<com.blinderjay.BBS.grpc.Con.userInRes>) responseObserver);
          break;
        case METHODID_GET_ALL_THREADS:
          serviceImpl.getAllThreads((com.blinderjay.BBS.grpc.Con.bbsClientReq) request,
              (io.grpc.stub.StreamObserver<com.blinderjay.BBS.grpc.Con.bbsThread>) responseObserver);
          break;
        case METHODID_GET_USER_INFO:
          serviceImpl.getUserInfo((com.blinderjay.BBS.grpc.Con.bbsClientReq) request,
              (io.grpc.stub.StreamObserver<com.blinderjay.BBS.grpc.Con.bbsUserInfo>) responseObserver);
          break;
        case METHODID_GET_THREADS:
          serviceImpl.getThreads((com.blinderjay.BBS.grpc.Con.bbsClientReq) request,
              (io.grpc.stub.StreamObserver<com.blinderjay.BBS.grpc.Con.bbsThread>) responseObserver);
          break;
        case METHODID_GEN_POSTS:
          serviceImpl.genPosts((com.blinderjay.BBS.grpc.Con.bbsClientReq) request,
              (io.grpc.stub.StreamObserver<com.blinderjay.BBS.grpc.Con.bbsPost>) responseObserver);
          break;
        case METHODID_CH_PASSWORD:
          serviceImpl.chPassword((com.blinderjay.BBS.grpc.Con.bbsClientReq) request,
              (io.grpc.stub.StreamObserver<com.blinderjay.BBS.grpc.Con.bbsServerRes>) responseObserver);
          break;
        case METHODID_REFRESH_USER_INFO:
          serviceImpl.refreshUserInfo((com.blinderjay.BBS.grpc.Con.bbsUserInfo) request,
              (io.grpc.stub.StreamObserver<com.blinderjay.BBS.grpc.Con.bbsServerRes>) responseObserver);
          break;
        case METHODID_PUSH_THREAD:
          serviceImpl.pushThread((com.blinderjay.BBS.grpc.Con.bbsThread) request,
              (io.grpc.stub.StreamObserver<com.blinderjay.BBS.grpc.Con.bbsServerRes>) responseObserver);
          break;
        case METHODID_PUSH_POSTS:
          serviceImpl.pushPosts((com.blinderjay.BBS.grpc.Con.bbsPost) request,
              (io.grpc.stub.StreamObserver<com.blinderjay.BBS.grpc.Con.bbsServerRes>) responseObserver);
          break;
        case METHODID_USER_LOGOUT:
          serviceImpl.userLogout((com.blinderjay.BBS.grpc.Con.bbsClientReq) request,
              (io.grpc.stub.StreamObserver<com.blinderjay.BBS.grpc.Con.bbsServerRes>) responseObserver);
          break;
        case METHODID_DEL_THREAD:
          serviceImpl.delThread((com.blinderjay.BBS.grpc.Con.bbsClientReq) request,
              (io.grpc.stub.StreamObserver<com.blinderjay.BBS.grpc.Con.bbsServerRes>) responseObserver);
          break;
        case METHODID_DEL_POST:
          serviceImpl.delPost((com.blinderjay.BBS.grpc.Con.bbsClientReq) request,
              (io.grpc.stub.StreamObserver<com.blinderjay.BBS.grpc.Con.bbsServerRes>) responseObserver);
          break;
        case METHODID_GETINFO:
          serviceImpl.getinfo((com.blinderjay.BBS.grpc.Con.userinfoReq) request,
              (io.grpc.stub.StreamObserver<com.blinderjay.BBS.grpc.Con.userinfoReply>) responseObserver);
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

  private static abstract class BBS_ConBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BBS_ConBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.blinderjay.BBS.grpc.Con.ContactService.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("BBS_Con");
    }
  }

  private static final class BBS_ConFileDescriptorSupplier
      extends BBS_ConBaseDescriptorSupplier {
    BBS_ConFileDescriptorSupplier() {}
  }

  private static final class BBS_ConMethodDescriptorSupplier
      extends BBS_ConBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    BBS_ConMethodDescriptorSupplier(String methodName) {
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
      synchronized (BBS_ConGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BBS_ConFileDescriptorSupplier())
              .addMethod(getUserRegisterMethod())
              .addMethod(getUserLoginMethod())
              .addMethod(getGetAllThreadsMethod())
              .addMethod(getGetUserInfoMethod())
              .addMethod(getGetThreadsMethod())
              .addMethod(getGenPostsMethod())
              .addMethod(getChPasswordMethod())
              .addMethod(getRefreshUserInfoMethod())
              .addMethod(getPushThreadMethod())
              .addMethod(getPushPostsMethod())
              .addMethod(getUserLogoutMethod())
              .addMethod(getDelThreadMethod())
              .addMethod(getDelPostMethod())
              .addMethod(getGetinfoMethod())
              .build();
        }
      }
    }
    return result;
  }
}
