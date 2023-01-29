package com.example.test.stream.service;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 *
 */
@javax.annotation.Generated(
        value = "by gRPC proto compiler (version 1.43.1)",
        comments = "Source: StreamTest.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class TestGrpcStreamGrpc {

    public static final String SERVICE_NAME = "com.example.test.stream.service.TestGrpcStream";
    private static final int METHODID_TEST = 0;
    private static final int METHODID_TEST_STREAM_RESPONSE = 1;
    private static final int METHODID_TEST_STREAM_REQUEST = 2;
    private static final int METHODID_TEST_STREAM = 3;
    // Static method descriptors that strictly reflect the proto.
    private static volatile io.grpc.MethodDescriptor<com.example.test.stream.service.Request,
            com.example.test.stream.service.Response> getTestMethod;
    private static volatile io.grpc.MethodDescriptor<com.example.test.stream.service.Request,
            com.example.test.stream.service.Response> getTestStreamRequestMethod;
    private static volatile io.grpc.MethodDescriptor<com.example.test.stream.service.Request,
            com.example.test.stream.service.Response> getTestStreamResponseMethod;
    private static volatile io.grpc.MethodDescriptor<com.example.test.stream.service.Request,
            com.example.test.stream.service.Response> getTestStreamMethod;
    private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

    private TestGrpcStreamGrpc() {
    }

    @io.grpc.stub.annotations.RpcMethod(
            fullMethodName = SERVICE_NAME + '/' + "test",
            requestType = com.example.test.stream.service.Request.class,
            responseType = com.example.test.stream.service.Response.class,
            methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
    public static io.grpc.MethodDescriptor<com.example.test.stream.service.Request,
            com.example.test.stream.service.Response> getTestMethod() {
        io.grpc.MethodDescriptor<com.example.test.stream.service.Request, com.example.test.stream.service.Response> getTestMethod;
        if ((getTestMethod = TestGrpcStreamGrpc.getTestMethod) == null) {
            synchronized (TestGrpcStreamGrpc.class) {
                if ((getTestMethod = TestGrpcStreamGrpc.getTestMethod) == null) {
                    TestGrpcStreamGrpc.getTestMethod = getTestMethod =
                            io.grpc.MethodDescriptor.<com.example.test.stream.service.Request, com.example.test.stream.service.Response>newBuilder()
                                    .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                                    .setFullMethodName(generateFullMethodName(SERVICE_NAME, "test"))
                                    .setSampledToLocalTracing(true)
                                    .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.example.test.stream.service.Request.getDefaultInstance()))
                                    .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.example.test.stream.service.Response.getDefaultInstance()))
                                    .setSchemaDescriptor(new TestGrpcStreamMethodDescriptorSupplier("test"))
                                    .build();
                }
            }
        }
        return getTestMethod;
    }

    @io.grpc.stub.annotations.RpcMethod(
            fullMethodName = SERVICE_NAME + '/' + "testStreamRequest",
            requestType = com.example.test.stream.service.Request.class,
            responseType = com.example.test.stream.service.Response.class,
            methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
    public static io.grpc.MethodDescriptor<com.example.test.stream.service.Request,
            com.example.test.stream.service.Response> getTestStreamRequestMethod() {
        io.grpc.MethodDescriptor<com.example.test.stream.service.Request, com.example.test.stream.service.Response> getTestStreamRequestMethod;
        if ((getTestStreamRequestMethod = TestGrpcStreamGrpc.getTestStreamRequestMethod) == null) {
            synchronized (TestGrpcStreamGrpc.class) {
                if ((getTestStreamRequestMethod = TestGrpcStreamGrpc.getTestStreamRequestMethod) == null) {
                    TestGrpcStreamGrpc.getTestStreamRequestMethod = getTestStreamRequestMethod =
                            io.grpc.MethodDescriptor.<com.example.test.stream.service.Request, com.example.test.stream.service.Response>newBuilder()
                                    .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
                                    .setFullMethodName(generateFullMethodName(SERVICE_NAME, "testStreamRequest"))
                                    .setSampledToLocalTracing(true)
                                    .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.example.test.stream.service.Request.getDefaultInstance()))
                                    .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.example.test.stream.service.Response.getDefaultInstance()))
                                    .setSchemaDescriptor(new TestGrpcStreamMethodDescriptorSupplier("testStreamRequest"))
                                    .build();
                }
            }
        }
        return getTestStreamRequestMethod;
    }

    @io.grpc.stub.annotations.RpcMethod(
            fullMethodName = SERVICE_NAME + '/' + "testStreamResponse",
            requestType = com.example.test.stream.service.Request.class,
            responseType = com.example.test.stream.service.Response.class,
            methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
    public static io.grpc.MethodDescriptor<com.example.test.stream.service.Request,
            com.example.test.stream.service.Response> getTestStreamResponseMethod() {
        io.grpc.MethodDescriptor<com.example.test.stream.service.Request, com.example.test.stream.service.Response> getTestStreamResponseMethod;
        if ((getTestStreamResponseMethod = TestGrpcStreamGrpc.getTestStreamResponseMethod) == null) {
            synchronized (TestGrpcStreamGrpc.class) {
                if ((getTestStreamResponseMethod = TestGrpcStreamGrpc.getTestStreamResponseMethod) == null) {
                    TestGrpcStreamGrpc.getTestStreamResponseMethod = getTestStreamResponseMethod =
                            io.grpc.MethodDescriptor.<com.example.test.stream.service.Request, com.example.test.stream.service.Response>newBuilder()
                                    .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
                                    .setFullMethodName(generateFullMethodName(SERVICE_NAME, "testStreamResponse"))
                                    .setSampledToLocalTracing(true)
                                    .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.example.test.stream.service.Request.getDefaultInstance()))
                                    .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.example.test.stream.service.Response.getDefaultInstance()))
                                    .setSchemaDescriptor(new TestGrpcStreamMethodDescriptorSupplier("testStreamResponse"))
                                    .build();
                }
            }
        }
        return getTestStreamResponseMethod;
    }

    @io.grpc.stub.annotations.RpcMethod(
            fullMethodName = SERVICE_NAME + '/' + "testStream",
            requestType = com.example.test.stream.service.Request.class,
            responseType = com.example.test.stream.service.Response.class,
            methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
    public static io.grpc.MethodDescriptor<com.example.test.stream.service.Request,
            com.example.test.stream.service.Response> getTestStreamMethod() {
        io.grpc.MethodDescriptor<com.example.test.stream.service.Request, com.example.test.stream.service.Response> getTestStreamMethod;
        if ((getTestStreamMethod = TestGrpcStreamGrpc.getTestStreamMethod) == null) {
            synchronized (TestGrpcStreamGrpc.class) {
                if ((getTestStreamMethod = TestGrpcStreamGrpc.getTestStreamMethod) == null) {
                    TestGrpcStreamGrpc.getTestStreamMethod = getTestStreamMethod =
                            io.grpc.MethodDescriptor.<com.example.test.stream.service.Request, com.example.test.stream.service.Response>newBuilder()
                                    .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
                                    .setFullMethodName(generateFullMethodName(SERVICE_NAME, "testStream"))
                                    .setSampledToLocalTracing(true)
                                    .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.example.test.stream.service.Request.getDefaultInstance()))
                                    .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.example.test.stream.service.Response.getDefaultInstance()))
                                    .setSchemaDescriptor(new TestGrpcStreamMethodDescriptorSupplier("testStream"))
                                    .build();
                }
            }
        }
        return getTestStreamMethod;
    }

    /**
     * Creates a new async stub that supports all call types for the service
     */
    public static TestGrpcStreamStub newStub(io.grpc.Channel channel) {
        io.grpc.stub.AbstractStub.StubFactory<TestGrpcStreamStub> factory =
                new io.grpc.stub.AbstractStub.StubFactory<TestGrpcStreamStub>() {
                    @java.lang.Override
                    public TestGrpcStreamStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
                        return new TestGrpcStreamStub(channel, callOptions);
                    }
                };
        return TestGrpcStreamStub.newStub(factory, channel);
    }

    /**
     * Creates a new blocking-style stub that supports unary and streaming output calls on the service
     */
    public static TestGrpcStreamBlockingStub newBlockingStub(
            io.grpc.Channel channel) {
        io.grpc.stub.AbstractStub.StubFactory<TestGrpcStreamBlockingStub> factory =
                new io.grpc.stub.AbstractStub.StubFactory<TestGrpcStreamBlockingStub>() {
                    @java.lang.Override
                    public TestGrpcStreamBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
                        return new TestGrpcStreamBlockingStub(channel, callOptions);
                    }
                };
        return TestGrpcStreamBlockingStub.newStub(factory, channel);
    }

    /**
     * Creates a new ListenableFuture-style stub that supports unary calls on the service
     */
    public static TestGrpcStreamFutureStub newFutureStub(
            io.grpc.Channel channel) {
        io.grpc.stub.AbstractStub.StubFactory<TestGrpcStreamFutureStub> factory =
                new io.grpc.stub.AbstractStub.StubFactory<TestGrpcStreamFutureStub>() {
                    @java.lang.Override
                    public TestGrpcStreamFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
                        return new TestGrpcStreamFutureStub(channel, callOptions);
                    }
                };
        return TestGrpcStreamFutureStub.newStub(factory, channel);
    }

    public static io.grpc.ServiceDescriptor getServiceDescriptor() {
        io.grpc.ServiceDescriptor result = serviceDescriptor;
        if (result == null) {
            synchronized (TestGrpcStreamGrpc.class) {
                result = serviceDescriptor;
                if (result == null) {
                    serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
                            .setSchemaDescriptor(new TestGrpcStreamFileDescriptorSupplier())
                            .addMethod(getTestMethod())
                            .addMethod(getTestStreamRequestMethod())
                            .addMethod(getTestStreamResponseMethod())
                            .addMethod(getTestStreamMethod())
                            .build();
                }
            }
        }
        return result;
    }

    /**
     *
     */
    public static abstract class TestGrpcStreamImplBase implements io.grpc.BindableService {

        /**
         * <pre>
         * *
         * 普通流
         * </pre>
         */
        public void test(com.example.test.stream.service.Request request,
                         io.grpc.stub.StreamObserver<com.example.test.stream.service.Response> responseObserver) {
            io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTestMethod(), responseObserver);
        }

        /**
         * <pre>
         * *
         * 客户端流
         * </pre>
         */
        public io.grpc.stub.StreamObserver<com.example.test.stream.service.Request> testStreamRequest(
                io.grpc.stub.StreamObserver<com.example.test.stream.service.Response> responseObserver) {
            return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getTestStreamRequestMethod(), responseObserver);
        }

        /**
         * <pre>
         * *
         * 服务端流
         * </pre>
         */
        public void testStreamResponse(com.example.test.stream.service.Request request,
                                       io.grpc.stub.StreamObserver<com.example.test.stream.service.Response> responseObserver) {
            io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTestStreamResponseMethod(), responseObserver);
        }

        /**
         * <pre>
         * *
         * 双向流
         * </pre>
         */
        public io.grpc.stub.StreamObserver<com.example.test.stream.service.Request> testStream(
                io.grpc.stub.StreamObserver<com.example.test.stream.service.Response> responseObserver) {
            return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getTestStreamMethod(), responseObserver);
        }

        @java.lang.Override
        public final io.grpc.ServerServiceDefinition bindService() {
            return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
                    .addMethod(
                            getTestMethod(),
                            io.grpc.stub.ServerCalls.asyncUnaryCall(
                                    new MethodHandlers<
                                            com.example.test.stream.service.Request,
                                            com.example.test.stream.service.Response>(
                                            this, METHODID_TEST)))
                    .addMethod(
                            getTestStreamRequestMethod(),
                            io.grpc.stub.ServerCalls.asyncClientStreamingCall(
                                    new MethodHandlers<
                                            com.example.test.stream.service.Request,
                                            com.example.test.stream.service.Response>(
                                            this, METHODID_TEST_STREAM_REQUEST)))
                    .addMethod(
                            getTestStreamResponseMethod(),
                            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
                                    new MethodHandlers<
                                            com.example.test.stream.service.Request,
                                            com.example.test.stream.service.Response>(
                                            this, METHODID_TEST_STREAM_RESPONSE)))
                    .addMethod(
                            getTestStreamMethod(),
                            io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
                                    new MethodHandlers<
                                            com.example.test.stream.service.Request,
                                            com.example.test.stream.service.Response>(
                                            this, METHODID_TEST_STREAM)))
                    .build();
        }
    }

    /**
     *
     */
    public static final class TestGrpcStreamStub extends io.grpc.stub.AbstractAsyncStub<TestGrpcStreamStub> {
        private TestGrpcStreamStub(
                io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
        }

        @java.lang.Override
        protected TestGrpcStreamStub build(
                io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new TestGrpcStreamStub(channel, callOptions);
        }

        /**
         * <pre>
         * *
         * 普通流
         * </pre>
         */
        public void test(com.example.test.stream.service.Request request,
                         io.grpc.stub.StreamObserver<com.example.test.stream.service.Response> responseObserver) {
            io.grpc.stub.ClientCalls.asyncUnaryCall(
                    getChannel().newCall(getTestMethod(), getCallOptions()), request, responseObserver);
        }

        /**
         * <pre>
         * *
         * 客户端流
         * </pre>
         */
        public io.grpc.stub.StreamObserver<com.example.test.stream.service.Request> testStreamRequest(
                io.grpc.stub.StreamObserver<com.example.test.stream.service.Response> responseObserver) {
            return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
                    getChannel().newCall(getTestStreamRequestMethod(), getCallOptions()), responseObserver);
        }

        /**
         * <pre>
         * *
         * 服务端流
         * </pre>
         */
        public void testStreamResponse(com.example.test.stream.service.Request request,
                                       io.grpc.stub.StreamObserver<com.example.test.stream.service.Response> responseObserver) {
            io.grpc.stub.ClientCalls.asyncServerStreamingCall(
                    getChannel().newCall(getTestStreamResponseMethod(), getCallOptions()), request, responseObserver);
        }

        /**
         * <pre>
         * *
         * 双向流
         * </pre>
         */
        public io.grpc.stub.StreamObserver<com.example.test.stream.service.Request> testStream(
                io.grpc.stub.StreamObserver<com.example.test.stream.service.Response> responseObserver) {
            return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
                    getChannel().newCall(getTestStreamMethod(), getCallOptions()), responseObserver);
        }
    }

    /**
     *
     */
    public static final class TestGrpcStreamBlockingStub extends io.grpc.stub.AbstractBlockingStub<TestGrpcStreamBlockingStub> {
        private TestGrpcStreamBlockingStub(
                io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
        }

        @java.lang.Override
        protected TestGrpcStreamBlockingStub build(
                io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new TestGrpcStreamBlockingStub(channel, callOptions);
        }

        /**
         * <pre>
         * *
         * 普通流
         * </pre>
         */
        public com.example.test.stream.service.Response test(com.example.test.stream.service.Request request) {
            return io.grpc.stub.ClientCalls.blockingUnaryCall(
                    getChannel(), getTestMethod(), getCallOptions(), request);
        }

        /**
         * <pre>
         * *
         * 服务端流
         * </pre>
         */
        public java.util.Iterator<com.example.test.stream.service.Response> testStreamResponse(
                com.example.test.stream.service.Request request) {
            return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
                    getChannel(), getTestStreamResponseMethod(), getCallOptions(), request);
        }
    }

    /**
     *
     */
    public static final class TestGrpcStreamFutureStub extends io.grpc.stub.AbstractFutureStub<TestGrpcStreamFutureStub> {
        private TestGrpcStreamFutureStub(
                io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
        }

        @java.lang.Override
        protected TestGrpcStreamFutureStub build(
                io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new TestGrpcStreamFutureStub(channel, callOptions);
        }

        /**
         * <pre>
         * *
         * 普通流
         * </pre>
         */
        public com.google.common.util.concurrent.ListenableFuture<com.example.test.stream.service.Response> test(
                com.example.test.stream.service.Request request) {
            return io.grpc.stub.ClientCalls.futureUnaryCall(
                    getChannel().newCall(getTestMethod(), getCallOptions()), request);
        }
    }

    private static final class MethodHandlers<Req, Resp> implements
            io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
            io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
            io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
            io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
        private final TestGrpcStreamImplBase serviceImpl;
        private final int methodId;

        MethodHandlers(TestGrpcStreamImplBase serviceImpl, int methodId) {
            this.serviceImpl = serviceImpl;
            this.methodId = methodId;
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("unchecked")
        public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
            switch (methodId) {
                case METHODID_TEST:
                    serviceImpl.test((com.example.test.stream.service.Request) request,
                            (io.grpc.stub.StreamObserver<com.example.test.stream.service.Response>) responseObserver);
                    break;
                case METHODID_TEST_STREAM_RESPONSE:
                    serviceImpl.testStreamResponse((com.example.test.stream.service.Request) request,
                            (io.grpc.stub.StreamObserver<com.example.test.stream.service.Response>) responseObserver);
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
                case METHODID_TEST_STREAM_REQUEST:
                    return (io.grpc.stub.StreamObserver<Req>) serviceImpl.testStreamRequest(
                            (io.grpc.stub.StreamObserver<com.example.test.stream.service.Response>) responseObserver);
                case METHODID_TEST_STREAM:
                    return (io.grpc.stub.StreamObserver<Req>) serviceImpl.testStream(
                            (io.grpc.stub.StreamObserver<com.example.test.stream.service.Response>) responseObserver);
                default:
                    throw new AssertionError();
            }
        }
    }

    private static abstract class TestGrpcStreamBaseDescriptorSupplier
            implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
        TestGrpcStreamBaseDescriptorSupplier() {
        }

        @java.lang.Override
        public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
            return com.example.test.stream.service.StreamTest.getDescriptor();
        }

        @java.lang.Override
        public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
            return getFileDescriptor().findServiceByName("TestGrpcStream");
        }
    }

    private static final class TestGrpcStreamFileDescriptorSupplier
            extends TestGrpcStreamBaseDescriptorSupplier {
        TestGrpcStreamFileDescriptorSupplier() {
        }
    }

    private static final class TestGrpcStreamMethodDescriptorSupplier
            extends TestGrpcStreamBaseDescriptorSupplier
            implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
        private final String methodName;

        TestGrpcStreamMethodDescriptorSupplier(String methodName) {
            this.methodName = methodName;
        }

        @java.lang.Override
        public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
            return getServiceDescriptor().findMethodByName(methodName);
        }
    }
}
