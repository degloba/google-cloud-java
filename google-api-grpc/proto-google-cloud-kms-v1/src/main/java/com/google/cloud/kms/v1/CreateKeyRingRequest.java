// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/kms/v1/service.proto

package com.google.cloud.kms.v1;

/**
 *
 *
 * <pre>
 * Request message for
 * [KeyManagementService.CreateKeyRing][google.cloud.kms.v1.KeyManagementService.CreateKeyRing].
 * </pre>
 *
 * Protobuf type {@code google.cloud.kms.v1.CreateKeyRingRequest}
 */
public final class CreateKeyRingRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.kms.v1.CreateKeyRingRequest)
    CreateKeyRingRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CreateKeyRingRequest.newBuilder() to construct.
  private CreateKeyRingRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreateKeyRingRequest() {
    parent_ = "";
    keyRingId_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private CreateKeyRingRequest(
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
          case 10:
            {
              java.lang.String s = input.readStringRequireUtf8();

              parent_ = s;
              break;
            }
          case 18:
            {
              java.lang.String s = input.readStringRequireUtf8();

              keyRingId_ = s;
              break;
            }
          case 26:
            {
              com.google.cloud.kms.v1.KeyRing.Builder subBuilder = null;
              if (keyRing_ != null) {
                subBuilder = keyRing_.toBuilder();
              }
              keyRing_ =
                  input.readMessage(com.google.cloud.kms.v1.KeyRing.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(keyRing_);
                keyRing_ = subBuilder.buildPartial();
              }

              break;
            }
          default:
            {
              if (!parseUnknownFieldProto3(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.kms.v1.KmsProto
        .internal_static_google_cloud_kms_v1_CreateKeyRingRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.kms.v1.KmsProto
        .internal_static_google_cloud_kms_v1_CreateKeyRingRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.kms.v1.CreateKeyRingRequest.class,
            com.google.cloud.kms.v1.CreateKeyRingRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  private volatile java.lang.Object parent_;
  /**
   *
   *
   * <pre>
   * Required. The resource name of the location associated with the
   * [KeyRings][google.cloud.kms.v1.KeyRing], in the format
   * `projects/&#42;&#47;locations/&#42;`.
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The resource name of the location associated with the
   * [KeyRings][google.cloud.kms.v1.KeyRing], in the format
   * `projects/&#42;&#47;locations/&#42;`.
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  public com.google.protobuf.ByteString getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int KEY_RING_ID_FIELD_NUMBER = 2;
  private volatile java.lang.Object keyRingId_;
  /**
   *
   *
   * <pre>
   * Required. It must be unique within a location and match the regular
   * expression `[a-zA-Z0-9_-]{1,63}`
   * </pre>
   *
   * <code>string key_ring_id = 2;</code>
   */
  public java.lang.String getKeyRingId() {
    java.lang.Object ref = keyRingId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      keyRingId_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. It must be unique within a location and match the regular
   * expression `[a-zA-Z0-9_-]{1,63}`
   * </pre>
   *
   * <code>string key_ring_id = 2;</code>
   */
  public com.google.protobuf.ByteString getKeyRingIdBytes() {
    java.lang.Object ref = keyRingId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      keyRingId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int KEY_RING_FIELD_NUMBER = 3;
  private com.google.cloud.kms.v1.KeyRing keyRing_;
  /**
   *
   *
   * <pre>
   * A [KeyRing][google.cloud.kms.v1.KeyRing] with initial field values.
   * </pre>
   *
   * <code>.google.cloud.kms.v1.KeyRing key_ring = 3;</code>
   */
  public boolean hasKeyRing() {
    return keyRing_ != null;
  }
  /**
   *
   *
   * <pre>
   * A [KeyRing][google.cloud.kms.v1.KeyRing] with initial field values.
   * </pre>
   *
   * <code>.google.cloud.kms.v1.KeyRing key_ring = 3;</code>
   */
  public com.google.cloud.kms.v1.KeyRing getKeyRing() {
    return keyRing_ == null ? com.google.cloud.kms.v1.KeyRing.getDefaultInstance() : keyRing_;
  }
  /**
   *
   *
   * <pre>
   * A [KeyRing][google.cloud.kms.v1.KeyRing] with initial field values.
   * </pre>
   *
   * <code>.google.cloud.kms.v1.KeyRing key_ring = 3;</code>
   */
  public com.google.cloud.kms.v1.KeyRingOrBuilder getKeyRingOrBuilder() {
    return getKeyRing();
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (!getParentBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (!getKeyRingIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, keyRingId_);
    }
    if (keyRing_ != null) {
      output.writeMessage(3, getKeyRing());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getParentBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    if (!getKeyRingIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, keyRingId_);
    }
    if (keyRing_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, getKeyRing());
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
    if (!(obj instanceof com.google.cloud.kms.v1.CreateKeyRingRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.kms.v1.CreateKeyRingRequest other =
        (com.google.cloud.kms.v1.CreateKeyRingRequest) obj;

    boolean result = true;
    result = result && getParent().equals(other.getParent());
    result = result && getKeyRingId().equals(other.getKeyRingId());
    result = result && (hasKeyRing() == other.hasKeyRing());
    if (hasKeyRing()) {
      result = result && getKeyRing().equals(other.getKeyRing());
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
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    hash = (37 * hash) + KEY_RING_ID_FIELD_NUMBER;
    hash = (53 * hash) + getKeyRingId().hashCode();
    if (hasKeyRing()) {
      hash = (37 * hash) + KEY_RING_FIELD_NUMBER;
      hash = (53 * hash) + getKeyRing().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.kms.v1.CreateKeyRingRequest parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.kms.v1.CreateKeyRingRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.kms.v1.CreateKeyRingRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.kms.v1.CreateKeyRingRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.kms.v1.CreateKeyRingRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.kms.v1.CreateKeyRingRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.kms.v1.CreateKeyRingRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.kms.v1.CreateKeyRingRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.kms.v1.CreateKeyRingRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.kms.v1.CreateKeyRingRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.kms.v1.CreateKeyRingRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.kms.v1.CreateKeyRingRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.cloud.kms.v1.CreateKeyRingRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Request message for
   * [KeyManagementService.CreateKeyRing][google.cloud.kms.v1.KeyManagementService.CreateKeyRing].
   * </pre>
   *
   * Protobuf type {@code google.cloud.kms.v1.CreateKeyRingRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.kms.v1.CreateKeyRingRequest)
      com.google.cloud.kms.v1.CreateKeyRingRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.kms.v1.KmsProto
          .internal_static_google_cloud_kms_v1_CreateKeyRingRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.kms.v1.KmsProto
          .internal_static_google_cloud_kms_v1_CreateKeyRingRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.kms.v1.CreateKeyRingRequest.class,
              com.google.cloud.kms.v1.CreateKeyRingRequest.Builder.class);
    }

    // Construct using com.google.cloud.kms.v1.CreateKeyRingRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      parent_ = "";

      keyRingId_ = "";

      if (keyRingBuilder_ == null) {
        keyRing_ = null;
      } else {
        keyRing_ = null;
        keyRingBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.kms.v1.KmsProto
          .internal_static_google_cloud_kms_v1_CreateKeyRingRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.kms.v1.CreateKeyRingRequest getDefaultInstanceForType() {
      return com.google.cloud.kms.v1.CreateKeyRingRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.kms.v1.CreateKeyRingRequest build() {
      com.google.cloud.kms.v1.CreateKeyRingRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.kms.v1.CreateKeyRingRequest buildPartial() {
      com.google.cloud.kms.v1.CreateKeyRingRequest result =
          new com.google.cloud.kms.v1.CreateKeyRingRequest(this);
      result.parent_ = parent_;
      result.keyRingId_ = keyRingId_;
      if (keyRingBuilder_ == null) {
        result.keyRing_ = keyRing_;
      } else {
        result.keyRing_ = keyRingBuilder_.build();
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
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.kms.v1.CreateKeyRingRequest) {
        return mergeFrom((com.google.cloud.kms.v1.CreateKeyRingRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.kms.v1.CreateKeyRingRequest other) {
      if (other == com.google.cloud.kms.v1.CreateKeyRingRequest.getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        onChanged();
      }
      if (!other.getKeyRingId().isEmpty()) {
        keyRingId_ = other.keyRingId_;
        onChanged();
      }
      if (other.hasKeyRing()) {
        mergeKeyRing(other.getKeyRing());
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
      com.google.cloud.kms.v1.CreateKeyRingRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.kms.v1.CreateKeyRingRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object parent_ = "";
    /**
     *
     *
     * <pre>
     * Required. The resource name of the location associated with the
     * [KeyRings][google.cloud.kms.v1.KeyRing], in the format
     * `projects/&#42;&#47;locations/&#42;`.
     * </pre>
     *
     * <code>string parent = 1;</code>
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The resource name of the location associated with the
     * [KeyRings][google.cloud.kms.v1.KeyRing], in the format
     * `projects/&#42;&#47;locations/&#42;`.
     * </pre>
     *
     * <code>string parent = 1;</code>
     */
    public com.google.protobuf.ByteString getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The resource name of the location associated with the
     * [KeyRings][google.cloud.kms.v1.KeyRing], in the format
     * `projects/&#42;&#47;locations/&#42;`.
     * </pre>
     *
     * <code>string parent = 1;</code>
     */
    public Builder setParent(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      parent_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The resource name of the location associated with the
     * [KeyRings][google.cloud.kms.v1.KeyRing], in the format
     * `projects/&#42;&#47;locations/&#42;`.
     * </pre>
     *
     * <code>string parent = 1;</code>
     */
    public Builder clearParent() {

      parent_ = getDefaultInstance().getParent();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The resource name of the location associated with the
     * [KeyRings][google.cloud.kms.v1.KeyRing], in the format
     * `projects/&#42;&#47;locations/&#42;`.
     * </pre>
     *
     * <code>string parent = 1;</code>
     */
    public Builder setParentBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      parent_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object keyRingId_ = "";
    /**
     *
     *
     * <pre>
     * Required. It must be unique within a location and match the regular
     * expression `[a-zA-Z0-9_-]{1,63}`
     * </pre>
     *
     * <code>string key_ring_id = 2;</code>
     */
    public java.lang.String getKeyRingId() {
      java.lang.Object ref = keyRingId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        keyRingId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. It must be unique within a location and match the regular
     * expression `[a-zA-Z0-9_-]{1,63}`
     * </pre>
     *
     * <code>string key_ring_id = 2;</code>
     */
    public com.google.protobuf.ByteString getKeyRingIdBytes() {
      java.lang.Object ref = keyRingId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        keyRingId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. It must be unique within a location and match the regular
     * expression `[a-zA-Z0-9_-]{1,63}`
     * </pre>
     *
     * <code>string key_ring_id = 2;</code>
     */
    public Builder setKeyRingId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      keyRingId_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. It must be unique within a location and match the regular
     * expression `[a-zA-Z0-9_-]{1,63}`
     * </pre>
     *
     * <code>string key_ring_id = 2;</code>
     */
    public Builder clearKeyRingId() {

      keyRingId_ = getDefaultInstance().getKeyRingId();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. It must be unique within a location and match the regular
     * expression `[a-zA-Z0-9_-]{1,63}`
     * </pre>
     *
     * <code>string key_ring_id = 2;</code>
     */
    public Builder setKeyRingIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      keyRingId_ = value;
      onChanged();
      return this;
    }

    private com.google.cloud.kms.v1.KeyRing keyRing_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.kms.v1.KeyRing,
            com.google.cloud.kms.v1.KeyRing.Builder,
            com.google.cloud.kms.v1.KeyRingOrBuilder>
        keyRingBuilder_;
    /**
     *
     *
     * <pre>
     * A [KeyRing][google.cloud.kms.v1.KeyRing] with initial field values.
     * </pre>
     *
     * <code>.google.cloud.kms.v1.KeyRing key_ring = 3;</code>
     */
    public boolean hasKeyRing() {
      return keyRingBuilder_ != null || keyRing_ != null;
    }
    /**
     *
     *
     * <pre>
     * A [KeyRing][google.cloud.kms.v1.KeyRing] with initial field values.
     * </pre>
     *
     * <code>.google.cloud.kms.v1.KeyRing key_ring = 3;</code>
     */
    public com.google.cloud.kms.v1.KeyRing getKeyRing() {
      if (keyRingBuilder_ == null) {
        return keyRing_ == null ? com.google.cloud.kms.v1.KeyRing.getDefaultInstance() : keyRing_;
      } else {
        return keyRingBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * A [KeyRing][google.cloud.kms.v1.KeyRing] with initial field values.
     * </pre>
     *
     * <code>.google.cloud.kms.v1.KeyRing key_ring = 3;</code>
     */
    public Builder setKeyRing(com.google.cloud.kms.v1.KeyRing value) {
      if (keyRingBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        keyRing_ = value;
        onChanged();
      } else {
        keyRingBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * A [KeyRing][google.cloud.kms.v1.KeyRing] with initial field values.
     * </pre>
     *
     * <code>.google.cloud.kms.v1.KeyRing key_ring = 3;</code>
     */
    public Builder setKeyRing(com.google.cloud.kms.v1.KeyRing.Builder builderForValue) {
      if (keyRingBuilder_ == null) {
        keyRing_ = builderForValue.build();
        onChanged();
      } else {
        keyRingBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * A [KeyRing][google.cloud.kms.v1.KeyRing] with initial field values.
     * </pre>
     *
     * <code>.google.cloud.kms.v1.KeyRing key_ring = 3;</code>
     */
    public Builder mergeKeyRing(com.google.cloud.kms.v1.KeyRing value) {
      if (keyRingBuilder_ == null) {
        if (keyRing_ != null) {
          keyRing_ =
              com.google.cloud.kms.v1.KeyRing.newBuilder(keyRing_).mergeFrom(value).buildPartial();
        } else {
          keyRing_ = value;
        }
        onChanged();
      } else {
        keyRingBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * A [KeyRing][google.cloud.kms.v1.KeyRing] with initial field values.
     * </pre>
     *
     * <code>.google.cloud.kms.v1.KeyRing key_ring = 3;</code>
     */
    public Builder clearKeyRing() {
      if (keyRingBuilder_ == null) {
        keyRing_ = null;
        onChanged();
      } else {
        keyRing_ = null;
        keyRingBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * A [KeyRing][google.cloud.kms.v1.KeyRing] with initial field values.
     * </pre>
     *
     * <code>.google.cloud.kms.v1.KeyRing key_ring = 3;</code>
     */
    public com.google.cloud.kms.v1.KeyRing.Builder getKeyRingBuilder() {

      onChanged();
      return getKeyRingFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * A [KeyRing][google.cloud.kms.v1.KeyRing] with initial field values.
     * </pre>
     *
     * <code>.google.cloud.kms.v1.KeyRing key_ring = 3;</code>
     */
    public com.google.cloud.kms.v1.KeyRingOrBuilder getKeyRingOrBuilder() {
      if (keyRingBuilder_ != null) {
        return keyRingBuilder_.getMessageOrBuilder();
      } else {
        return keyRing_ == null ? com.google.cloud.kms.v1.KeyRing.getDefaultInstance() : keyRing_;
      }
    }
    /**
     *
     *
     * <pre>
     * A [KeyRing][google.cloud.kms.v1.KeyRing] with initial field values.
     * </pre>
     *
     * <code>.google.cloud.kms.v1.KeyRing key_ring = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.kms.v1.KeyRing,
            com.google.cloud.kms.v1.KeyRing.Builder,
            com.google.cloud.kms.v1.KeyRingOrBuilder>
        getKeyRingFieldBuilder() {
      if (keyRingBuilder_ == null) {
        keyRingBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.kms.v1.KeyRing,
                com.google.cloud.kms.v1.KeyRing.Builder,
                com.google.cloud.kms.v1.KeyRingOrBuilder>(
                getKeyRing(), getParentForChildren(), isClean());
        keyRing_ = null;
      }
      return keyRingBuilder_;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.kms.v1.CreateKeyRingRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.kms.v1.CreateKeyRingRequest)
  private static final com.google.cloud.kms.v1.CreateKeyRingRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.kms.v1.CreateKeyRingRequest();
  }

  public static com.google.cloud.kms.v1.CreateKeyRingRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateKeyRingRequest> PARSER =
      new com.google.protobuf.AbstractParser<CreateKeyRingRequest>() {
        @java.lang.Override
        public CreateKeyRingRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new CreateKeyRingRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<CreateKeyRingRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateKeyRingRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.kms.v1.CreateKeyRingRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
