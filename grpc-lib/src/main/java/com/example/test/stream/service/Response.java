// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: StreamTest.proto

package com.example.test.stream.service;

/**
 * Protobuf type {@code com.example.test.stream.service.Response}
 */
public final class Response extends
        com.google.protobuf.GeneratedMessageV3 implements
        // @@protoc_insertion_point(message_implements:com.example.test.stream.service.Response)
        ResponseOrBuilder {
    public static final int RESPONSE_FIELD_NUMBER = 1;
    public static final int TIMESTAMP_FIELD_NUMBER = 2;
    public static final int B_FIELD_NUMBER = 3;
    private static final long serialVersionUID = 0L;
    // @@protoc_insertion_point(class_scope:com.example.test.stream.service.Response)
    private static final com.example.test.stream.service.Response DEFAULT_INSTANCE;
    private static final com.google.protobuf.Parser<Response>
            PARSER = new com.google.protobuf.AbstractParser<Response>() {
        @java.lang.Override
        public Response parsePartialFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return new Response(input, extensionRegistry);
        }
    };

    static {
        DEFAULT_INSTANCE = new com.example.test.stream.service.Response();
    }

    private volatile java.lang.Object response_;
    private long timestamp_;
    private com.google.protobuf.LazyStringList b_;
    private byte memoizedIsInitialized = -1;

    // Use Response.newBuilder() to construct.
    private Response(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private Response() {
        response_ = "";
        b_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    }

    private Response(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        this();
        if (extensionRegistry == null) {
            throw new java.lang.NullPointerException();
        }
        int mutable_bitField0_ = 0;
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
                com.google.protobuf.UnknownFieldSet.newBuilder();
        try {
            boolean done = false;
            while (!done) {
                int tag = input.readTag();
                switch (tag) {
                    case 0:
                        done = true;
                        break;
                    case 10: {
                        java.lang.String s = input.readStringRequireUtf8();

                        response_ = s;
                        break;
                    }
                    case 16: {

                        timestamp_ = input.readInt64();
                        break;
                    }
                    case 26: {
                        java.lang.String s = input.readStringRequireUtf8();
                        if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                            b_ = new com.google.protobuf.LazyStringArrayList();
                            mutable_bitField0_ |= 0x00000001;
                        }
                        b_.add(s);
                        break;
                    }
                    default: {
                        if (!parseUnknownField(
                                input, unknownFields, extensionRegistry, tag)) {
                            done = true;
                        }
                        break;
                    }
                }
            }
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(this);
        } catch (java.io.IOException e) {
            throw new com.google.protobuf.InvalidProtocolBufferException(
                    e).setUnfinishedMessage(this);
        } finally {
            if (((mutable_bitField0_ & 0x00000001) != 0)) {
                b_ = b_.getUnmodifiableView();
            }
            this.unknownFields = unknownFields.build();
            makeExtensionsImmutable();
        }
    }

    public static final com.google.protobuf.Descriptors.Descriptor
    getDescriptor() {
        return com.example.test.stream.service.StreamTest.internal_static_com_example_test_stream_service_Response_descriptor;
    }

    public static com.example.test.stream.service.Response parseFrom(
            java.nio.ByteBuffer data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static com.example.test.stream.service.Response parseFrom(
            java.nio.ByteBuffer data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.example.test.stream.service.Response parseFrom(
            com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static com.example.test.stream.service.Response parseFrom(
            com.google.protobuf.ByteString data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.example.test.stream.service.Response parseFrom(byte[] data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static com.example.test.stream.service.Response parseFrom(
            byte[] data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.example.test.stream.service.Response parseFrom(java.io.InputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input);
    }

    public static com.example.test.stream.service.Response parseFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static com.example.test.stream.service.Response parseDelimitedFrom(java.io.InputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseDelimitedWithIOException(PARSER, input);
    }

    public static com.example.test.stream.service.Response parseDelimitedFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }

    public static com.example.test.stream.service.Response parseFrom(
            com.google.protobuf.CodedInputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input);
    }

    public static com.example.test.stream.service.Response parseFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(com.example.test.stream.service.Response prototype) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    public static com.example.test.stream.service.Response getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.google.protobuf.Parser<Response> parser() {
        return PARSER;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
            UnusedPrivateParameter unused) {
        return new Response();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
        return this.unknownFields;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
    internalGetFieldAccessorTable() {
        return com.example.test.stream.service.StreamTest.internal_static_com_example_test_stream_service_Response_fieldAccessorTable
                .ensureFieldAccessorsInitialized(
                        com.example.test.stream.service.Response.class, com.example.test.stream.service.Response.Builder.class);
    }

    /**
     * <code>string response = 1;</code>
     *
     * @return The response.
     */
    @java.lang.Override
    public java.lang.String getResponse() {
        java.lang.Object ref = response_;
        if (ref instanceof java.lang.String) {
            return (java.lang.String) ref;
        } else {
            com.google.protobuf.ByteString bs =
                    (com.google.protobuf.ByteString) ref;
            java.lang.String s = bs.toStringUtf8();
            response_ = s;
            return s;
        }
    }

    /**
     * <code>string response = 1;</code>
     *
     * @return The bytes for response.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
    getResponseBytes() {
        java.lang.Object ref = response_;
        if (ref instanceof java.lang.String) {
            com.google.protobuf.ByteString b =
                    com.google.protobuf.ByteString.copyFromUtf8(
                            (java.lang.String) ref);
            response_ = b;
            return b;
        } else {
            return (com.google.protobuf.ByteString) ref;
        }
    }

    /**
     * <code>int64 timestamp = 2;</code>
     *
     * @return The timestamp.
     */
    @java.lang.Override
    public long getTimestamp() {
        return timestamp_;
    }

    /**
     * <code>repeated string b = 3;</code>
     *
     * @return A list containing the b.
     */
    public com.google.protobuf.ProtocolStringList
    getBList() {
        return b_;
    }

    /**
     * <code>repeated string b = 3;</code>
     *
     * @return The count of b.
     */
    public int getBCount() {
        return b_.size();
    }

    /**
     * <code>repeated string b = 3;</code>
     *
     * @param index The index of the element to return.
     * @return The b at the given index.
     */
    public java.lang.String getB(int index) {
        return b_.get(index);
    }

    /**
     * <code>repeated string b = 3;</code>
     *
     * @param index The index of the value to return.
     * @return The bytes of the b at the given index.
     */
    public com.google.protobuf.ByteString
    getBBytes(int index) {
        return b_.getByteString(index);
    }

    @java.lang.Override
    public final boolean isInitialized() {
        byte isInitialized = memoizedIsInitialized;
        if (isInitialized == 1) return true;
        if (isInitialized == 0) return false;

        memoizedIsInitialized = 1;
        return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
            throws java.io.IOException {
        if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(response_)) {
            com.google.protobuf.GeneratedMessageV3.writeString(output, 1, response_);
        }
        if (timestamp_ != 0L) {
            output.writeInt64(2, timestamp_);
        }
        for (int i = 0; i < b_.size(); i++) {
            com.google.protobuf.GeneratedMessageV3.writeString(output, 3, b_.getRaw(i));
        }
        unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
        int size = memoizedSize;
        if (size != -1) return size;

        size = 0;
        if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(response_)) {
            size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, response_);
        }
        if (timestamp_ != 0L) {
            size += com.google.protobuf.CodedOutputStream
                    .computeInt64Size(2, timestamp_);
        }
        {
            int dataSize = 0;
            for (int i = 0; i < b_.size(); i++) {
                dataSize += computeStringSizeNoTag(b_.getRaw(i));
            }
            size += dataSize;
            size += 1 * getBList().size();
        }
        size += unknownFields.getSerializedSize();
        memoizedSize = size;
        return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.example.test.stream.service.Response)) {
            return super.equals(obj);
        }
        com.example.test.stream.service.Response other = (com.example.test.stream.service.Response) obj;

        if (!getResponse()
                .equals(other.getResponse())) return false;
        if (getTimestamp()
                != other.getTimestamp()) return false;
        if (!getBList()
                .equals(other.getBList())) return false;
        if (!unknownFields.equals(other.unknownFields)) return false;
        return true;
    }

    @java.lang.Override
    public int hashCode() {
        if (memoizedHashCode != 0) {
            return memoizedHashCode;
        }
        int hash = 41;
        hash = (19 * hash) + getDescriptor().hashCode();
        hash = (37 * hash) + RESPONSE_FIELD_NUMBER;
        hash = (53 * hash) + getResponse().hashCode();
        hash = (37 * hash) + TIMESTAMP_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
                getTimestamp());
        if (getBCount() > 0) {
            hash = (37 * hash) + B_FIELD_NUMBER;
            hash = (53 * hash) + getBList().hashCode();
        }
        hash = (29 * hash) + unknownFields.hashCode();
        memoizedHashCode = hash;
        return hash;
    }

    @java.lang.Override
    public Builder newBuilderForType() {
        return newBuilder();
    }

    @java.lang.Override
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE
                ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
            com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        Builder builder = new Builder(parent);
        return builder;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Response> getParserForType() {
        return PARSER;
    }

    @java.lang.Override
    public com.example.test.stream.service.Response getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    /**
     * Protobuf type {@code com.example.test.stream.service.Response}
     */
    public static final class Builder extends
            com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
            // @@protoc_insertion_point(builder_implements:com.example.test.stream.service.Response)
            com.example.test.stream.service.ResponseOrBuilder {
        private int bitField0_;
        private java.lang.Object response_ = "";
        private long timestamp_;
        private com.google.protobuf.LazyStringList b_ = com.google.protobuf.LazyStringArrayList.EMPTY;

        // Construct using com.example.test.stream.service.Response.newBuilder()
        private Builder() {
            maybeForceBuilderInitialization();
        }

        private Builder(
                com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            maybeForceBuilderInitialization();
        }

        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return com.example.test.stream.service.StreamTest.internal_static_com_example_test_stream_service_Response_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return com.example.test.stream.service.StreamTest.internal_static_com_example_test_stream_service_Response_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            com.example.test.stream.service.Response.class, com.example.test.stream.service.Response.Builder.class);
        }

        private void maybeForceBuilderInitialization() {
            if (com.google.protobuf.GeneratedMessageV3
                    .alwaysUseFieldBuilders) {
            }
        }

        @java.lang.Override
        public Builder clear() {
            super.clear();
            response_ = "";

            timestamp_ = 0L;

            b_ = com.google.protobuf.LazyStringArrayList.EMPTY;
            bitField0_ = (bitField0_ & ~0x00000001);
            return this;
        }

        @java.lang.Override
        public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
            return com.example.test.stream.service.StreamTest.internal_static_com_example_test_stream_service_Response_descriptor;
        }

        @java.lang.Override
        public com.example.test.stream.service.Response getDefaultInstanceForType() {
            return com.example.test.stream.service.Response.getDefaultInstance();
        }

        @java.lang.Override
        public com.example.test.stream.service.Response build() {
            com.example.test.stream.service.Response result = buildPartial();
            if (!result.isInitialized()) {
                throw newUninitializedMessageException(result);
            }
            return result;
        }

        @java.lang.Override
        public com.example.test.stream.service.Response buildPartial() {
            com.example.test.stream.service.Response result = new com.example.test.stream.service.Response(this);
            int from_bitField0_ = bitField0_;
            result.response_ = response_;
            result.timestamp_ = timestamp_;
            if (((bitField0_ & 0x00000001) != 0)) {
                b_ = b_.getUnmodifiableView();
                bitField0_ = (bitField0_ & ~0x00000001);
            }
            result.b_ = b_;
            onBuilt();
            return result;
        }

        @java.lang.Override
        public Builder clone() {
            return super.clone();
        }

        @java.lang.Override
        public Builder setField(
                com.google.protobuf.Descriptors.FieldDescriptor field,
                java.lang.Object value) {
            return super.setField(field, value);
        }

        @java.lang.Override
        public Builder clearField(
                com.google.protobuf.Descriptors.FieldDescriptor field) {
            return super.clearField(field);
        }

        @java.lang.Override
        public Builder clearOneof(
                com.google.protobuf.Descriptors.OneofDescriptor oneof) {
            return super.clearOneof(oneof);
        }

        @java.lang.Override
        public Builder setRepeatedField(
                com.google.protobuf.Descriptors.FieldDescriptor field,
                int index, java.lang.Object value) {
            return super.setRepeatedField(field, index, value);
        }

        @java.lang.Override
        public Builder addRepeatedField(
                com.google.protobuf.Descriptors.FieldDescriptor field,
                java.lang.Object value) {
            return super.addRepeatedField(field, value);
        }

        @java.lang.Override
        public Builder mergeFrom(com.google.protobuf.Message other) {
            if (other instanceof com.example.test.stream.service.Response) {
                return mergeFrom((com.example.test.stream.service.Response) other);
            } else {
                super.mergeFrom(other);
                return this;
            }
        }

        public Builder mergeFrom(com.example.test.stream.service.Response other) {
            if (other == com.example.test.stream.service.Response.getDefaultInstance()) return this;
            if (!other.getResponse().isEmpty()) {
                response_ = other.response_;
                onChanged();
            }
            if (other.getTimestamp() != 0L) {
                setTimestamp(other.getTimestamp());
            }
            if (!other.b_.isEmpty()) {
                if (b_.isEmpty()) {
                    b_ = other.b_;
                    bitField0_ = (bitField0_ & ~0x00000001);
                } else {
                    ensureBIsMutable();
                    b_.addAll(other.b_);
                }
                onChanged();
            }
            this.mergeUnknownFields(other.unknownFields);
            onChanged();
            return this;
        }

        @java.lang.Override
        public final boolean isInitialized() {
            return true;
        }

        @java.lang.Override
        public Builder mergeFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            com.example.test.stream.service.Response parsedMessage = null;
            try {
                parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                parsedMessage = (com.example.test.stream.service.Response) e.getUnfinishedMessage();
                throw e.unwrapIOException();
            } finally {
                if (parsedMessage != null) {
                    mergeFrom(parsedMessage);
                }
            }
            return this;
        }

        /**
         * <code>string response = 1;</code>
         *
         * @return The response.
         */
        public java.lang.String getResponse() {
            java.lang.Object ref = response_;
            if (!(ref instanceof java.lang.String)) {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                response_ = s;
                return s;
            } else {
                return (java.lang.String) ref;
            }
        }

        /**
         * <code>string response = 1;</code>
         *
         * @param value The response to set.
         * @return This builder for chaining.
         */
        public Builder setResponse(
                java.lang.String value) {
            if (value == null) {
                throw new NullPointerException();
            }

            response_ = value;
            onChanged();
            return this;
        }

        /**
         * <code>string response = 1;</code>
         *
         * @return The bytes for response.
         */
        public com.google.protobuf.ByteString
        getResponseBytes() {
            java.lang.Object ref = response_;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                response_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        /**
         * <code>string response = 1;</code>
         *
         * @param value The bytes for response to set.
         * @return This builder for chaining.
         */
        public Builder setResponseBytes(
                com.google.protobuf.ByteString value) {
            if (value == null) {
                throw new NullPointerException();
            }
            checkByteStringIsUtf8(value);

            response_ = value;
            onChanged();
            return this;
        }

        /**
         * <code>string response = 1;</code>
         *
         * @return This builder for chaining.
         */
        public Builder clearResponse() {

            response_ = getDefaultInstance().getResponse();
            onChanged();
            return this;
        }

        /**
         * <code>int64 timestamp = 2;</code>
         *
         * @return The timestamp.
         */
        @java.lang.Override
        public long getTimestamp() {
            return timestamp_;
        }

        /**
         * <code>int64 timestamp = 2;</code>
         *
         * @param value The timestamp to set.
         * @return This builder for chaining.
         */
        public Builder setTimestamp(long value) {

            timestamp_ = value;
            onChanged();
            return this;
        }

        /**
         * <code>int64 timestamp = 2;</code>
         *
         * @return This builder for chaining.
         */
        public Builder clearTimestamp() {

            timestamp_ = 0L;
            onChanged();
            return this;
        }

        private void ensureBIsMutable() {
            if (!((bitField0_ & 0x00000001) != 0)) {
                b_ = new com.google.protobuf.LazyStringArrayList(b_);
                bitField0_ |= 0x00000001;
            }
        }

        /**
         * <code>repeated string b = 3;</code>
         *
         * @return A list containing the b.
         */
        public com.google.protobuf.ProtocolStringList
        getBList() {
            return b_.getUnmodifiableView();
        }

        /**
         * <code>repeated string b = 3;</code>
         *
         * @return The count of b.
         */
        public int getBCount() {
            return b_.size();
        }

        /**
         * <code>repeated string b = 3;</code>
         *
         * @param index The index of the element to return.
         * @return The b at the given index.
         */
        public java.lang.String getB(int index) {
            return b_.get(index);
        }

        /**
         * <code>repeated string b = 3;</code>
         *
         * @param index The index of the value to return.
         * @return The bytes of the b at the given index.
         */
        public com.google.protobuf.ByteString
        getBBytes(int index) {
            return b_.getByteString(index);
        }

        /**
         * <code>repeated string b = 3;</code>
         *
         * @param index The index to set the value at.
         * @param value The b to set.
         * @return This builder for chaining.
         */
        public Builder setB(
                int index, java.lang.String value) {
            if (value == null) {
                throw new NullPointerException();
            }
            ensureBIsMutable();
            b_.set(index, value);
            onChanged();
            return this;
        }

        /**
         * <code>repeated string b = 3;</code>
         *
         * @param value The b to add.
         * @return This builder for chaining.
         */
        public Builder addB(
                java.lang.String value) {
            if (value == null) {
                throw new NullPointerException();
            }
            ensureBIsMutable();
            b_.add(value);
            onChanged();
            return this;
        }

        /**
         * <code>repeated string b = 3;</code>
         *
         * @param values The b to add.
         * @return This builder for chaining.
         */
        public Builder addAllB(
                java.lang.Iterable<java.lang.String> values) {
            ensureBIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(
                    values, b_);
            onChanged();
            return this;
        }

        /**
         * <code>repeated string b = 3;</code>
         *
         * @return This builder for chaining.
         */
        public Builder clearB() {
            b_ = com.google.protobuf.LazyStringArrayList.EMPTY;
            bitField0_ = (bitField0_ & ~0x00000001);
            onChanged();
            return this;
        }

        /**
         * <code>repeated string b = 3;</code>
         *
         * @param value The bytes of the b to add.
         * @return This builder for chaining.
         */
        public Builder addBBytes(
                com.google.protobuf.ByteString value) {
            if (value == null) {
                throw new NullPointerException();
            }
            checkByteStringIsUtf8(value);
            ensureBIsMutable();
            b_.add(value);
            onChanged();
            return this;
        }

        @java.lang.Override
        public final Builder setUnknownFields(
                final com.google.protobuf.UnknownFieldSet unknownFields) {
            return super.setUnknownFields(unknownFields);
        }

        @java.lang.Override
        public final Builder mergeUnknownFields(
                final com.google.protobuf.UnknownFieldSet unknownFields) {
            return super.mergeUnknownFields(unknownFields);
        }


        // @@protoc_insertion_point(builder_scope:com.example.test.stream.service.Response)
    }

}
