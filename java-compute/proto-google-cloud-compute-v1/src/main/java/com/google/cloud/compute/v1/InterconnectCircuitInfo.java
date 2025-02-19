/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

/**
 *
 *
 * <pre>
 * Describes a single physical circuit between the Customer and Google. CircuitInfo objects are created by Google, so all fields are output only.
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.InterconnectCircuitInfo}
 */
public final class InterconnectCircuitInfo extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.InterconnectCircuitInfo)
    InterconnectCircuitInfoOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use InterconnectCircuitInfo.newBuilder() to construct.
  private InterconnectCircuitInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private InterconnectCircuitInfo() {
    customerDemarcId_ = "";
    googleCircuitId_ = "";
    googleDemarcId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new InterconnectCircuitInfo();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private InterconnectCircuitInfo(
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
          case 230174874:
            {
              java.lang.String s = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              customerDemarcId_ = s;
              break;
            }
          case 2096117690:
            {
              java.lang.String s = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              googleCircuitId_ = s;
              break;
            }
          case -709397134:
            {
              java.lang.String s = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              googleDemarcId_ = s;
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_InterconnectCircuitInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_InterconnectCircuitInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.InterconnectCircuitInfo.class,
            com.google.cloud.compute.v1.InterconnectCircuitInfo.Builder.class);
  }

  private int bitField0_;
  public static final int CUSTOMER_DEMARC_ID_FIELD_NUMBER = 28771859;
  private volatile java.lang.Object customerDemarcId_;
  /**
   *
   *
   * <pre>
   * Customer-side demarc ID for this circuit.
   * </pre>
   *
   * <code>optional string customer_demarc_id = 28771859;</code>
   *
   * @return Whether the customerDemarcId field is set.
   */
  @java.lang.Override
  public boolean hasCustomerDemarcId() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Customer-side demarc ID for this circuit.
   * </pre>
   *
   * <code>optional string customer_demarc_id = 28771859;</code>
   *
   * @return The customerDemarcId.
   */
  @java.lang.Override
  public java.lang.String getCustomerDemarcId() {
    java.lang.Object ref = customerDemarcId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      customerDemarcId_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Customer-side demarc ID for this circuit.
   * </pre>
   *
   * <code>optional string customer_demarc_id = 28771859;</code>
   *
   * @return The bytes for customerDemarcId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getCustomerDemarcIdBytes() {
    java.lang.Object ref = customerDemarcId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      customerDemarcId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int GOOGLE_CIRCUIT_ID_FIELD_NUMBER = 262014711;
  private volatile java.lang.Object googleCircuitId_;
  /**
   *
   *
   * <pre>
   * Google-assigned unique ID for this circuit. Assigned at circuit turn-up.
   * </pre>
   *
   * <code>optional string google_circuit_id = 262014711;</code>
   *
   * @return Whether the googleCircuitId field is set.
   */
  @java.lang.Override
  public boolean hasGoogleCircuitId() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   *
   *
   * <pre>
   * Google-assigned unique ID for this circuit. Assigned at circuit turn-up.
   * </pre>
   *
   * <code>optional string google_circuit_id = 262014711;</code>
   *
   * @return The googleCircuitId.
   */
  @java.lang.Override
  public java.lang.String getGoogleCircuitId() {
    java.lang.Object ref = googleCircuitId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      googleCircuitId_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Google-assigned unique ID for this circuit. Assigned at circuit turn-up.
   * </pre>
   *
   * <code>optional string google_circuit_id = 262014711;</code>
   *
   * @return The bytes for googleCircuitId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getGoogleCircuitIdBytes() {
    java.lang.Object ref = googleCircuitId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      googleCircuitId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int GOOGLE_DEMARC_ID_FIELD_NUMBER = 448196270;
  private volatile java.lang.Object googleDemarcId_;
  /**
   *
   *
   * <pre>
   * Google-side demarc ID for this circuit. Assigned at circuit turn-up and provided by Google to the customer in the LOA.
   * </pre>
   *
   * <code>optional string google_demarc_id = 448196270;</code>
   *
   * @return Whether the googleDemarcId field is set.
   */
  @java.lang.Override
  public boolean hasGoogleDemarcId() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   *
   *
   * <pre>
   * Google-side demarc ID for this circuit. Assigned at circuit turn-up and provided by Google to the customer in the LOA.
   * </pre>
   *
   * <code>optional string google_demarc_id = 448196270;</code>
   *
   * @return The googleDemarcId.
   */
  @java.lang.Override
  public java.lang.String getGoogleDemarcId() {
    java.lang.Object ref = googleDemarcId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      googleDemarcId_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Google-side demarc ID for this circuit. Assigned at circuit turn-up and provided by Google to the customer in the LOA.
   * </pre>
   *
   * <code>optional string google_demarc_id = 448196270;</code>
   *
   * @return The bytes for googleDemarcId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getGoogleDemarcIdBytes() {
    java.lang.Object ref = googleDemarcId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      googleDemarcId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (((bitField0_ & 0x00000001) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 28771859, customerDemarcId_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 262014711, googleCircuitId_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 448196270, googleDemarcId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(28771859, customerDemarcId_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(262014711, googleCircuitId_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(448196270, googleDemarcId_);
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
    if (!(obj instanceof com.google.cloud.compute.v1.InterconnectCircuitInfo)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.InterconnectCircuitInfo other =
        (com.google.cloud.compute.v1.InterconnectCircuitInfo) obj;

    if (hasCustomerDemarcId() != other.hasCustomerDemarcId()) return false;
    if (hasCustomerDemarcId()) {
      if (!getCustomerDemarcId().equals(other.getCustomerDemarcId())) return false;
    }
    if (hasGoogleCircuitId() != other.hasGoogleCircuitId()) return false;
    if (hasGoogleCircuitId()) {
      if (!getGoogleCircuitId().equals(other.getGoogleCircuitId())) return false;
    }
    if (hasGoogleDemarcId() != other.hasGoogleDemarcId()) return false;
    if (hasGoogleDemarcId()) {
      if (!getGoogleDemarcId().equals(other.getGoogleDemarcId())) return false;
    }
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
    if (hasCustomerDemarcId()) {
      hash = (37 * hash) + CUSTOMER_DEMARC_ID_FIELD_NUMBER;
      hash = (53 * hash) + getCustomerDemarcId().hashCode();
    }
    if (hasGoogleCircuitId()) {
      hash = (37 * hash) + GOOGLE_CIRCUIT_ID_FIELD_NUMBER;
      hash = (53 * hash) + getGoogleCircuitId().hashCode();
    }
    if (hasGoogleDemarcId()) {
      hash = (37 * hash) + GOOGLE_DEMARC_ID_FIELD_NUMBER;
      hash = (53 * hash) + getGoogleDemarcId().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.InterconnectCircuitInfo parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.InterconnectCircuitInfo parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.InterconnectCircuitInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.InterconnectCircuitInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.InterconnectCircuitInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.InterconnectCircuitInfo parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.InterconnectCircuitInfo parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.InterconnectCircuitInfo parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.InterconnectCircuitInfo parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.InterconnectCircuitInfo parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.InterconnectCircuitInfo parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.InterconnectCircuitInfo parseFrom(
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

  public static Builder newBuilder(com.google.cloud.compute.v1.InterconnectCircuitInfo prototype) {
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
   * Describes a single physical circuit between the Customer and Google. CircuitInfo objects are created by Google, so all fields are output only.
   * </pre>
   *
   * Protobuf type {@code google.cloud.compute.v1.InterconnectCircuitInfo}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.InterconnectCircuitInfo)
      com.google.cloud.compute.v1.InterconnectCircuitInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_InterconnectCircuitInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_InterconnectCircuitInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.InterconnectCircuitInfo.class,
              com.google.cloud.compute.v1.InterconnectCircuitInfo.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.InterconnectCircuitInfo.newBuilder()
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
      customerDemarcId_ = "";
      bitField0_ = (bitField0_ & ~0x00000001);
      googleCircuitId_ = "";
      bitField0_ = (bitField0_ & ~0x00000002);
      googleDemarcId_ = "";
      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_InterconnectCircuitInfo_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.InterconnectCircuitInfo getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.InterconnectCircuitInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.InterconnectCircuitInfo build() {
      com.google.cloud.compute.v1.InterconnectCircuitInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.InterconnectCircuitInfo buildPartial() {
      com.google.cloud.compute.v1.InterconnectCircuitInfo result =
          new com.google.cloud.compute.v1.InterconnectCircuitInfo(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        to_bitField0_ |= 0x00000001;
      }
      result.customerDemarcId_ = customerDemarcId_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        to_bitField0_ |= 0x00000002;
      }
      result.googleCircuitId_ = googleCircuitId_;
      if (((from_bitField0_ & 0x00000004) != 0)) {
        to_bitField0_ |= 0x00000004;
      }
      result.googleDemarcId_ = googleDemarcId_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.compute.v1.InterconnectCircuitInfo) {
        return mergeFrom((com.google.cloud.compute.v1.InterconnectCircuitInfo) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.compute.v1.InterconnectCircuitInfo other) {
      if (other == com.google.cloud.compute.v1.InterconnectCircuitInfo.getDefaultInstance())
        return this;
      if (other.hasCustomerDemarcId()) {
        bitField0_ |= 0x00000001;
        customerDemarcId_ = other.customerDemarcId_;
        onChanged();
      }
      if (other.hasGoogleCircuitId()) {
        bitField0_ |= 0x00000002;
        googleCircuitId_ = other.googleCircuitId_;
        onChanged();
      }
      if (other.hasGoogleDemarcId()) {
        bitField0_ |= 0x00000004;
        googleDemarcId_ = other.googleDemarcId_;
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
      com.google.cloud.compute.v1.InterconnectCircuitInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.compute.v1.InterconnectCircuitInfo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private java.lang.Object customerDemarcId_ = "";
    /**
     *
     *
     * <pre>
     * Customer-side demarc ID for this circuit.
     * </pre>
     *
     * <code>optional string customer_demarc_id = 28771859;</code>
     *
     * @return Whether the customerDemarcId field is set.
     */
    public boolean hasCustomerDemarcId() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * Customer-side demarc ID for this circuit.
     * </pre>
     *
     * <code>optional string customer_demarc_id = 28771859;</code>
     *
     * @return The customerDemarcId.
     */
    public java.lang.String getCustomerDemarcId() {
      java.lang.Object ref = customerDemarcId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        customerDemarcId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Customer-side demarc ID for this circuit.
     * </pre>
     *
     * <code>optional string customer_demarc_id = 28771859;</code>
     *
     * @return The bytes for customerDemarcId.
     */
    public com.google.protobuf.ByteString getCustomerDemarcIdBytes() {
      java.lang.Object ref = customerDemarcId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        customerDemarcId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Customer-side demarc ID for this circuit.
     * </pre>
     *
     * <code>optional string customer_demarc_id = 28771859;</code>
     *
     * @param value The customerDemarcId to set.
     * @return This builder for chaining.
     */
    public Builder setCustomerDemarcId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      customerDemarcId_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Customer-side demarc ID for this circuit.
     * </pre>
     *
     * <code>optional string customer_demarc_id = 28771859;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearCustomerDemarcId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      customerDemarcId_ = getDefaultInstance().getCustomerDemarcId();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Customer-side demarc ID for this circuit.
     * </pre>
     *
     * <code>optional string customer_demarc_id = 28771859;</code>
     *
     * @param value The bytes for customerDemarcId to set.
     * @return This builder for chaining.
     */
    public Builder setCustomerDemarcIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      bitField0_ |= 0x00000001;
      customerDemarcId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object googleCircuitId_ = "";
    /**
     *
     *
     * <pre>
     * Google-assigned unique ID for this circuit. Assigned at circuit turn-up.
     * </pre>
     *
     * <code>optional string google_circuit_id = 262014711;</code>
     *
     * @return Whether the googleCircuitId field is set.
     */
    public boolean hasGoogleCircuitId() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * Google-assigned unique ID for this circuit. Assigned at circuit turn-up.
     * </pre>
     *
     * <code>optional string google_circuit_id = 262014711;</code>
     *
     * @return The googleCircuitId.
     */
    public java.lang.String getGoogleCircuitId() {
      java.lang.Object ref = googleCircuitId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        googleCircuitId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Google-assigned unique ID for this circuit. Assigned at circuit turn-up.
     * </pre>
     *
     * <code>optional string google_circuit_id = 262014711;</code>
     *
     * @return The bytes for googleCircuitId.
     */
    public com.google.protobuf.ByteString getGoogleCircuitIdBytes() {
      java.lang.Object ref = googleCircuitId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        googleCircuitId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Google-assigned unique ID for this circuit. Assigned at circuit turn-up.
     * </pre>
     *
     * <code>optional string google_circuit_id = 262014711;</code>
     *
     * @param value The googleCircuitId to set.
     * @return This builder for chaining.
     */
    public Builder setGoogleCircuitId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      googleCircuitId_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Google-assigned unique ID for this circuit. Assigned at circuit turn-up.
     * </pre>
     *
     * <code>optional string google_circuit_id = 262014711;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearGoogleCircuitId() {
      bitField0_ = (bitField0_ & ~0x00000002);
      googleCircuitId_ = getDefaultInstance().getGoogleCircuitId();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Google-assigned unique ID for this circuit. Assigned at circuit turn-up.
     * </pre>
     *
     * <code>optional string google_circuit_id = 262014711;</code>
     *
     * @param value The bytes for googleCircuitId to set.
     * @return This builder for chaining.
     */
    public Builder setGoogleCircuitIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      bitField0_ |= 0x00000002;
      googleCircuitId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object googleDemarcId_ = "";
    /**
     *
     *
     * <pre>
     * Google-side demarc ID for this circuit. Assigned at circuit turn-up and provided by Google to the customer in the LOA.
     * </pre>
     *
     * <code>optional string google_demarc_id = 448196270;</code>
     *
     * @return Whether the googleDemarcId field is set.
     */
    public boolean hasGoogleDemarcId() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     *
     *
     * <pre>
     * Google-side demarc ID for this circuit. Assigned at circuit turn-up and provided by Google to the customer in the LOA.
     * </pre>
     *
     * <code>optional string google_demarc_id = 448196270;</code>
     *
     * @return The googleDemarcId.
     */
    public java.lang.String getGoogleDemarcId() {
      java.lang.Object ref = googleDemarcId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        googleDemarcId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Google-side demarc ID for this circuit. Assigned at circuit turn-up and provided by Google to the customer in the LOA.
     * </pre>
     *
     * <code>optional string google_demarc_id = 448196270;</code>
     *
     * @return The bytes for googleDemarcId.
     */
    public com.google.protobuf.ByteString getGoogleDemarcIdBytes() {
      java.lang.Object ref = googleDemarcId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        googleDemarcId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Google-side demarc ID for this circuit. Assigned at circuit turn-up and provided by Google to the customer in the LOA.
     * </pre>
     *
     * <code>optional string google_demarc_id = 448196270;</code>
     *
     * @param value The googleDemarcId to set.
     * @return This builder for chaining.
     */
    public Builder setGoogleDemarcId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000004;
      googleDemarcId_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Google-side demarc ID for this circuit. Assigned at circuit turn-up and provided by Google to the customer in the LOA.
     * </pre>
     *
     * <code>optional string google_demarc_id = 448196270;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearGoogleDemarcId() {
      bitField0_ = (bitField0_ & ~0x00000004);
      googleDemarcId_ = getDefaultInstance().getGoogleDemarcId();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Google-side demarc ID for this circuit. Assigned at circuit turn-up and provided by Google to the customer in the LOA.
     * </pre>
     *
     * <code>optional string google_demarc_id = 448196270;</code>
     *
     * @param value The bytes for googleDemarcId to set.
     * @return This builder for chaining.
     */
    public Builder setGoogleDemarcIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      bitField0_ |= 0x00000004;
      googleDemarcId_ = value;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.InterconnectCircuitInfo)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.InterconnectCircuitInfo)
  private static final com.google.cloud.compute.v1.InterconnectCircuitInfo DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.InterconnectCircuitInfo();
  }

  public static com.google.cloud.compute.v1.InterconnectCircuitInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<InterconnectCircuitInfo> PARSER =
      new com.google.protobuf.AbstractParser<InterconnectCircuitInfo>() {
        @java.lang.Override
        public InterconnectCircuitInfo parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new InterconnectCircuitInfo(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<InterconnectCircuitInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<InterconnectCircuitInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.InterconnectCircuitInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
