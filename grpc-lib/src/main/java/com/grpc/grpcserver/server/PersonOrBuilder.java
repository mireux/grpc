// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HelloWorld.proto

package com.grpc.grpcserver.server;

public interface PersonOrBuilder extends
        // @@protoc_insertion_point(interface_extends:com.grpc.grpcserver.server.Person)
        com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string first_name = 1;</code>
     *
     * @return The firstName.
     */
    java.lang.String getFirstName();

    /**
     * <code>string first_name = 1;</code>
     *
     * @return The bytes for firstName.
     */
    com.google.protobuf.ByteString
    getFirstNameBytes();

    /**
     * <code>string last_name = 2;</code>
     *
     * @return The lastName.
     */
    java.lang.String getLastName();

    /**
     * <code>string last_name = 2;</code>
     *
     * @return The bytes for lastName.
     */
    com.google.protobuf.ByteString
    getLastNameBytes();
}