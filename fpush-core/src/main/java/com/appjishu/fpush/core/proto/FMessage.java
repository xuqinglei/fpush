// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: fmessage.proto

package com.appjishu.fpush.core.proto;

/**
 * Protobuf type {@code com.appjishu.fpush.core.proto.FMessage}
 */
public  final class FMessage extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.appjishu.fpush.core.proto.FMessage)
    FMessageOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FMessage.newBuilder() to construct.
  private FMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FMessage() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private FMessage(
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
            com.appjishu.fpush.core.proto.FHeader.Builder subBuilder = null;
            if (header_ != null) {
              subBuilder = header_.toBuilder();
            }
            header_ = input.readMessage(com.appjishu.fpush.core.proto.FHeader.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(header_);
              header_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            com.appjishu.fpush.core.proto.FBody.Builder subBuilder = null;
            if (body_ != null) {
              subBuilder = body_.toBuilder();
            }
            body_ = input.readMessage(com.appjishu.fpush.core.proto.FBody.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(body_);
              body_ = subBuilder.buildPartial();
            }

            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.appjishu.fpush.core.proto.FMessageCollection.internal_static_com_appjishu_fpush_core_proto_FMessage_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.appjishu.fpush.core.proto.FMessageCollection.internal_static_com_appjishu_fpush_core_proto_FMessage_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.appjishu.fpush.core.proto.FMessage.class, com.appjishu.fpush.core.proto.FMessage.Builder.class);
  }

  public static final int HEADER_FIELD_NUMBER = 1;
  private com.appjishu.fpush.core.proto.FHeader header_;
  /**
   * <code>.com.appjishu.fpush.core.proto.FHeader header = 1;</code>
   */
  public boolean hasHeader() {
    return header_ != null;
  }
  /**
   * <code>.com.appjishu.fpush.core.proto.FHeader header = 1;</code>
   */
  public com.appjishu.fpush.core.proto.FHeader getHeader() {
    return header_ == null ? com.appjishu.fpush.core.proto.FHeader.getDefaultInstance() : header_;
  }
  /**
   * <code>.com.appjishu.fpush.core.proto.FHeader header = 1;</code>
   */
  public com.appjishu.fpush.core.proto.FHeaderOrBuilder getHeaderOrBuilder() {
    return getHeader();
  }

  public static final int BODY_FIELD_NUMBER = 2;
  private com.appjishu.fpush.core.proto.FBody body_;
  /**
   * <code>.com.appjishu.fpush.core.proto.FBody body = 2;</code>
   */
  public boolean hasBody() {
    return body_ != null;
  }
  /**
   * <code>.com.appjishu.fpush.core.proto.FBody body = 2;</code>
   */
  public com.appjishu.fpush.core.proto.FBody getBody() {
    return body_ == null ? com.appjishu.fpush.core.proto.FBody.getDefaultInstance() : body_;
  }
  /**
   * <code>.com.appjishu.fpush.core.proto.FBody body = 2;</code>
   */
  public com.appjishu.fpush.core.proto.FBodyOrBuilder getBodyOrBuilder() {
    return getBody();
  }

  private byte memoizedIsInitialized = -1;
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
    if (header_ != null) {
      output.writeMessage(1, getHeader());
    }
    if (body_ != null) {
      output.writeMessage(2, getBody());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (header_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getHeader());
    }
    if (body_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getBody());
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
    if (!(obj instanceof com.appjishu.fpush.core.proto.FMessage)) {
      return super.equals(obj);
    }
    com.appjishu.fpush.core.proto.FMessage other = (com.appjishu.fpush.core.proto.FMessage) obj;

    boolean result = true;
    result = result && (hasHeader() == other.hasHeader());
    if (hasHeader()) {
      result = result && getHeader()
          .equals(other.getHeader());
    }
    result = result && (hasBody() == other.hasBody());
    if (hasBody()) {
      result = result && getBody()
          .equals(other.getBody());
    }
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasHeader()) {
      hash = (37 * hash) + HEADER_FIELD_NUMBER;
      hash = (53 * hash) + getHeader().hashCode();
    }
    if (hasBody()) {
      hash = (37 * hash) + BODY_FIELD_NUMBER;
      hash = (53 * hash) + getBody().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.appjishu.fpush.core.proto.FMessage parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.appjishu.fpush.core.proto.FMessage parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.appjishu.fpush.core.proto.FMessage parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.appjishu.fpush.core.proto.FMessage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.appjishu.fpush.core.proto.FMessage parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.appjishu.fpush.core.proto.FMessage parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.appjishu.fpush.core.proto.FMessage parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.appjishu.fpush.core.proto.FMessage parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.appjishu.fpush.core.proto.FMessage parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.appjishu.fpush.core.proto.FMessage parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.appjishu.fpush.core.proto.FMessage parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.appjishu.fpush.core.proto.FMessage parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.appjishu.fpush.core.proto.FMessage prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
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
  /**
   * Protobuf type {@code com.appjishu.fpush.core.proto.FMessage}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.appjishu.fpush.core.proto.FMessage)
      com.appjishu.fpush.core.proto.FMessageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.appjishu.fpush.core.proto.FMessageCollection.internal_static_com_appjishu_fpush_core_proto_FMessage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.appjishu.fpush.core.proto.FMessageCollection.internal_static_com_appjishu_fpush_core_proto_FMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.appjishu.fpush.core.proto.FMessage.class, com.appjishu.fpush.core.proto.FMessage.Builder.class);
    }

    // Construct using com.appjishu.fpush.core.proto.FMessage.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (headerBuilder_ == null) {
        header_ = null;
      } else {
        header_ = null;
        headerBuilder_ = null;
      }
      if (bodyBuilder_ == null) {
        body_ = null;
      } else {
        body_ = null;
        bodyBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.appjishu.fpush.core.proto.FMessageCollection.internal_static_com_appjishu_fpush_core_proto_FMessage_descriptor;
    }

    @java.lang.Override
    public com.appjishu.fpush.core.proto.FMessage getDefaultInstanceForType() {
      return com.appjishu.fpush.core.proto.FMessage.getDefaultInstance();
    }

    @java.lang.Override
    public com.appjishu.fpush.core.proto.FMessage build() {
      com.appjishu.fpush.core.proto.FMessage result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.appjishu.fpush.core.proto.FMessage buildPartial() {
      com.appjishu.fpush.core.proto.FMessage result = new com.appjishu.fpush.core.proto.FMessage(this);
      if (headerBuilder_ == null) {
        result.header_ = header_;
      } else {
        result.header_ = headerBuilder_.build();
      }
      if (bodyBuilder_ == null) {
        result.body_ = body_;
      } else {
        result.body_ = bodyBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.appjishu.fpush.core.proto.FMessage) {
        return mergeFrom((com.appjishu.fpush.core.proto.FMessage)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.appjishu.fpush.core.proto.FMessage other) {
      if (other == com.appjishu.fpush.core.proto.FMessage.getDefaultInstance()) return this;
      if (other.hasHeader()) {
        mergeHeader(other.getHeader());
      }
      if (other.hasBody()) {
        mergeBody(other.getBody());
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
      com.appjishu.fpush.core.proto.FMessage parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.appjishu.fpush.core.proto.FMessage) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.appjishu.fpush.core.proto.FHeader header_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.appjishu.fpush.core.proto.FHeader, com.appjishu.fpush.core.proto.FHeader.Builder, com.appjishu.fpush.core.proto.FHeaderOrBuilder> headerBuilder_;
    /**
     * <code>.com.appjishu.fpush.core.proto.FHeader header = 1;</code>
     */
    public boolean hasHeader() {
      return headerBuilder_ != null || header_ != null;
    }
    /**
     * <code>.com.appjishu.fpush.core.proto.FHeader header = 1;</code>
     */
    public com.appjishu.fpush.core.proto.FHeader getHeader() {
      if (headerBuilder_ == null) {
        return header_ == null ? com.appjishu.fpush.core.proto.FHeader.getDefaultInstance() : header_;
      } else {
        return headerBuilder_.getMessage();
      }
    }
    /**
     * <code>.com.appjishu.fpush.core.proto.FHeader header = 1;</code>
     */
    public Builder setHeader(com.appjishu.fpush.core.proto.FHeader value) {
      if (headerBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        header_ = value;
        onChanged();
      } else {
        headerBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.com.appjishu.fpush.core.proto.FHeader header = 1;</code>
     */
    public Builder setHeader(
        com.appjishu.fpush.core.proto.FHeader.Builder builderForValue) {
      if (headerBuilder_ == null) {
        header_ = builderForValue.build();
        onChanged();
      } else {
        headerBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.com.appjishu.fpush.core.proto.FHeader header = 1;</code>
     */
    public Builder mergeHeader(com.appjishu.fpush.core.proto.FHeader value) {
      if (headerBuilder_ == null) {
        if (header_ != null) {
          header_ =
            com.appjishu.fpush.core.proto.FHeader.newBuilder(header_).mergeFrom(value).buildPartial();
        } else {
          header_ = value;
        }
        onChanged();
      } else {
        headerBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.com.appjishu.fpush.core.proto.FHeader header = 1;</code>
     */
    public Builder clearHeader() {
      if (headerBuilder_ == null) {
        header_ = null;
        onChanged();
      } else {
        header_ = null;
        headerBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.com.appjishu.fpush.core.proto.FHeader header = 1;</code>
     */
    public com.appjishu.fpush.core.proto.FHeader.Builder getHeaderBuilder() {
      
      onChanged();
      return getHeaderFieldBuilder().getBuilder();
    }
    /**
     * <code>.com.appjishu.fpush.core.proto.FHeader header = 1;</code>
     */
    public com.appjishu.fpush.core.proto.FHeaderOrBuilder getHeaderOrBuilder() {
      if (headerBuilder_ != null) {
        return headerBuilder_.getMessageOrBuilder();
      } else {
        return header_ == null ?
            com.appjishu.fpush.core.proto.FHeader.getDefaultInstance() : header_;
      }
    }
    /**
     * <code>.com.appjishu.fpush.core.proto.FHeader header = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.appjishu.fpush.core.proto.FHeader, com.appjishu.fpush.core.proto.FHeader.Builder, com.appjishu.fpush.core.proto.FHeaderOrBuilder> 
        getHeaderFieldBuilder() {
      if (headerBuilder_ == null) {
        headerBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.appjishu.fpush.core.proto.FHeader, com.appjishu.fpush.core.proto.FHeader.Builder, com.appjishu.fpush.core.proto.FHeaderOrBuilder>(
                getHeader(),
                getParentForChildren(),
                isClean());
        header_ = null;
      }
      return headerBuilder_;
    }

    private com.appjishu.fpush.core.proto.FBody body_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.appjishu.fpush.core.proto.FBody, com.appjishu.fpush.core.proto.FBody.Builder, com.appjishu.fpush.core.proto.FBodyOrBuilder> bodyBuilder_;
    /**
     * <code>.com.appjishu.fpush.core.proto.FBody body = 2;</code>
     */
    public boolean hasBody() {
      return bodyBuilder_ != null || body_ != null;
    }
    /**
     * <code>.com.appjishu.fpush.core.proto.FBody body = 2;</code>
     */
    public com.appjishu.fpush.core.proto.FBody getBody() {
      if (bodyBuilder_ == null) {
        return body_ == null ? com.appjishu.fpush.core.proto.FBody.getDefaultInstance() : body_;
      } else {
        return bodyBuilder_.getMessage();
      }
    }
    /**
     * <code>.com.appjishu.fpush.core.proto.FBody body = 2;</code>
     */
    public Builder setBody(com.appjishu.fpush.core.proto.FBody value) {
      if (bodyBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        body_ = value;
        onChanged();
      } else {
        bodyBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.com.appjishu.fpush.core.proto.FBody body = 2;</code>
     */
    public Builder setBody(
        com.appjishu.fpush.core.proto.FBody.Builder builderForValue) {
      if (bodyBuilder_ == null) {
        body_ = builderForValue.build();
        onChanged();
      } else {
        bodyBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.com.appjishu.fpush.core.proto.FBody body = 2;</code>
     */
    public Builder mergeBody(com.appjishu.fpush.core.proto.FBody value) {
      if (bodyBuilder_ == null) {
        if (body_ != null) {
          body_ =
            com.appjishu.fpush.core.proto.FBody.newBuilder(body_).mergeFrom(value).buildPartial();
        } else {
          body_ = value;
        }
        onChanged();
      } else {
        bodyBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.com.appjishu.fpush.core.proto.FBody body = 2;</code>
     */
    public Builder clearBody() {
      if (bodyBuilder_ == null) {
        body_ = null;
        onChanged();
      } else {
        body_ = null;
        bodyBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.com.appjishu.fpush.core.proto.FBody body = 2;</code>
     */
    public com.appjishu.fpush.core.proto.FBody.Builder getBodyBuilder() {
      
      onChanged();
      return getBodyFieldBuilder().getBuilder();
    }
    /**
     * <code>.com.appjishu.fpush.core.proto.FBody body = 2;</code>
     */
    public com.appjishu.fpush.core.proto.FBodyOrBuilder getBodyOrBuilder() {
      if (bodyBuilder_ != null) {
        return bodyBuilder_.getMessageOrBuilder();
      } else {
        return body_ == null ?
            com.appjishu.fpush.core.proto.FBody.getDefaultInstance() : body_;
      }
    }
    /**
     * <code>.com.appjishu.fpush.core.proto.FBody body = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.appjishu.fpush.core.proto.FBody, com.appjishu.fpush.core.proto.FBody.Builder, com.appjishu.fpush.core.proto.FBodyOrBuilder> 
        getBodyFieldBuilder() {
      if (bodyBuilder_ == null) {
        bodyBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.appjishu.fpush.core.proto.FBody, com.appjishu.fpush.core.proto.FBody.Builder, com.appjishu.fpush.core.proto.FBodyOrBuilder>(
                getBody(),
                getParentForChildren(),
                isClean());
        body_ = null;
      }
      return bodyBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:com.appjishu.fpush.core.proto.FMessage)
  }

  // @@protoc_insertion_point(class_scope:com.appjishu.fpush.core.proto.FMessage)
  private static final com.appjishu.fpush.core.proto.FMessage DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.appjishu.fpush.core.proto.FMessage();
  }

  public static com.appjishu.fpush.core.proto.FMessage getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FMessage>
      PARSER = new com.google.protobuf.AbstractParser<FMessage>() {
    @java.lang.Override
    public FMessage parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new FMessage(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<FMessage> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FMessage> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.appjishu.fpush.core.proto.FMessage getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

