// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HelloWorld.proto

package com.grpc.grpcserver.server;

public final class HelloWorld {
    static final com.google.protobuf.Descriptors.Descriptor
            internal_static_com_grpc_grpcserver_server_Person_descriptor;
    static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_com_grpc_grpcserver_server_Person_fieldAccessorTable;
    static final com.google.protobuf.Descriptors.Descriptor
            internal_static_com_grpc_grpcserver_server_Greeting_descriptor;
    static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_com_grpc_grpcserver_server_Greeting_fieldAccessorTable;
    private static com.google.protobuf.Descriptors.FileDescriptor
            descriptor;

    static {
        java.lang.String[] descriptorData = {
                "\n\020HelloWorld.proto\022\032com.grpc.grpcserver." +
                        "server\"/\n\006Person\022\022\n\nfirst_name\030\001 \001(\t\022\021\n\t" +
                        "last_name\030\002 \001(\t\"\033\n\010Greeting\022\017\n\007message\030\001" +
                        " \001(\t2i\n\021HelloWorldService\022T\n\010sayHello\022\"." +
                        "com.grpc.grpcserver.server.Person\032$.com." +
                        "grpc.grpcserver.server.GreetingB\005P\001\210\001\001b\006" +
                        "proto3"
        };
        descriptor = com.google.protobuf.Descriptors.FileDescriptor
                .internalBuildGeneratedFileFrom(descriptorData,
                        new com.google.protobuf.Descriptors.FileDescriptor[]{
                        });
        internal_static_com_grpc_grpcserver_server_Person_descriptor =
                getDescriptor().getMessageTypes().get(0);
        internal_static_com_grpc_grpcserver_server_Person_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_com_grpc_grpcserver_server_Person_descriptor,
                new java.lang.String[]{"FirstName", "LastName",});
        internal_static_com_grpc_grpcserver_server_Greeting_descriptor =
                getDescriptor().getMessageTypes().get(1);
        internal_static_com_grpc_grpcserver_server_Greeting_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_com_grpc_grpcserver_server_Greeting_descriptor,
                new java.lang.String[]{"Message",});
    }

    private HelloWorld() {
    }

    public static void registerAllExtensions(
            com.google.protobuf.ExtensionRegistryLite registry) {
    }

    public static void registerAllExtensions(
            com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions(
                (com.google.protobuf.ExtensionRegistryLite) registry);
    }

    public static com.google.protobuf.Descriptors.FileDescriptor
    getDescriptor() {
        return descriptor;
    }

    // @@protoc_insertion_point(outer_class_scope)
}
