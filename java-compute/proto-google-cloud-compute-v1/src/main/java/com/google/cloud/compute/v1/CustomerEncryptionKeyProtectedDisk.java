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
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.CustomerEncryptionKeyProtectedDisk}
 */
public final class CustomerEncryptionKeyProtectedDisk extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.CustomerEncryptionKeyProtectedDisk)
    CustomerEncryptionKeyProtectedDiskOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CustomerEncryptionKeyProtectedDisk.newBuilder() to construct.
  private CustomerEncryptionKeyProtectedDisk(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CustomerEncryptionKeyProtectedDisk() {
    source_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CustomerEncryptionKeyProtectedDisk();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private CustomerEncryptionKeyProtectedDisk(
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
          case 1417887962:
            {
              java.lang.String s = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              source_ = s;
              break;
            }
          case -2121681878:
            {
              com.google.cloud.compute.v1.CustomerEncryptionKey.Builder subBuilder = null;
              if (((bitField0_ & 0x00000001) != 0)) {
                subBuilder = diskEncryptionKey_.toBuilder();
              }
              diskEncryptionKey_ =
                  input.readMessage(
                      com.google.cloud.compute.v1.CustomerEncryptionKey.parser(),
                      extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(diskEncryptionKey_);
                diskEncryptionKey_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000001;
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
        .internal_static_google_cloud_compute_v1_CustomerEncryptionKeyProtectedDisk_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_CustomerEncryptionKeyProtectedDisk_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.CustomerEncryptionKeyProtectedDisk.class,
            com.google.cloud.compute.v1.CustomerEncryptionKeyProtectedDisk.Builder.class);
  }

  private int bitField0_;
  public static final int DISK_ENCRYPTION_KEY_FIELD_NUMBER = 271660677;
  private com.google.cloud.compute.v1.CustomerEncryptionKey diskEncryptionKey_;
  /**
   *
   *
   * <pre>
   * Decrypts data associated with the disk with a customer-supplied encryption key.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.CustomerEncryptionKey disk_encryption_key = 271660677;
   * </code>
   *
   * @return Whether the diskEncryptionKey field is set.
   */
  @java.lang.Override
  public boolean hasDiskEncryptionKey() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Decrypts data associated with the disk with a customer-supplied encryption key.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.CustomerEncryptionKey disk_encryption_key = 271660677;
   * </code>
   *
   * @return The diskEncryptionKey.
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.CustomerEncryptionKey getDiskEncryptionKey() {
    return diskEncryptionKey_ == null
        ? com.google.cloud.compute.v1.CustomerEncryptionKey.getDefaultInstance()
        : diskEncryptionKey_;
  }
  /**
   *
   *
   * <pre>
   * Decrypts data associated with the disk with a customer-supplied encryption key.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.CustomerEncryptionKey disk_encryption_key = 271660677;
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.CustomerEncryptionKeyOrBuilder
      getDiskEncryptionKeyOrBuilder() {
    return diskEncryptionKey_ == null
        ? com.google.cloud.compute.v1.CustomerEncryptionKey.getDefaultInstance()
        : diskEncryptionKey_;
  }

  public static final int SOURCE_FIELD_NUMBER = 177235995;
  private volatile java.lang.Object source_;
  /**
   *
   *
   * <pre>
   * Specifies a valid partial or full URL to an existing Persistent Disk resource. This field is only applicable for persistent disks. For example: "source": "/compute/v1/projects/project_id/zones/zone/disks/ disk_name
   * </pre>
   *
   * <code>optional string source = 177235995;</code>
   *
   * @return Whether the source field is set.
   */
  @java.lang.Override
  public boolean hasSource() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   *
   *
   * <pre>
   * Specifies a valid partial or full URL to an existing Persistent Disk resource. This field is only applicable for persistent disks. For example: "source": "/compute/v1/projects/project_id/zones/zone/disks/ disk_name
   * </pre>
   *
   * <code>optional string source = 177235995;</code>
   *
   * @return The source.
   */
  @java.lang.Override
  public java.lang.String getSource() {
    java.lang.Object ref = source_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      source_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Specifies a valid partial or full URL to an existing Persistent Disk resource. This field is only applicable for persistent disks. For example: "source": "/compute/v1/projects/project_id/zones/zone/disks/ disk_name
   * </pre>
   *
   * <code>optional string source = 177235995;</code>
   *
   * @return The bytes for source.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getSourceBytes() {
    java.lang.Object ref = source_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      source_ = b;
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
    if (((bitField0_ & 0x00000002) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 177235995, source_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(271660677, getDiskEncryptionKey());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(177235995, source_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              271660677, getDiskEncryptionKey());
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
    if (!(obj instanceof com.google.cloud.compute.v1.CustomerEncryptionKeyProtectedDisk)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.CustomerEncryptionKeyProtectedDisk other =
        (com.google.cloud.compute.v1.CustomerEncryptionKeyProtectedDisk) obj;

    if (hasDiskEncryptionKey() != other.hasDiskEncryptionKey()) return false;
    if (hasDiskEncryptionKey()) {
      if (!getDiskEncryptionKey().equals(other.getDiskEncryptionKey())) return false;
    }
    if (hasSource() != other.hasSource()) return false;
    if (hasSource()) {
      if (!getSource().equals(other.getSource())) return false;
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
    if (hasDiskEncryptionKey()) {
      hash = (37 * hash) + DISK_ENCRYPTION_KEY_FIELD_NUMBER;
      hash = (53 * hash) + getDiskEncryptionKey().hashCode();
    }
    if (hasSource()) {
      hash = (37 * hash) + SOURCE_FIELD_NUMBER;
      hash = (53 * hash) + getSource().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.CustomerEncryptionKeyProtectedDisk parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.CustomerEncryptionKeyProtectedDisk parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.CustomerEncryptionKeyProtectedDisk parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.CustomerEncryptionKeyProtectedDisk parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.CustomerEncryptionKeyProtectedDisk parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.CustomerEncryptionKeyProtectedDisk parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.CustomerEncryptionKeyProtectedDisk parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.CustomerEncryptionKeyProtectedDisk parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.CustomerEncryptionKeyProtectedDisk parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.CustomerEncryptionKeyProtectedDisk parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.CustomerEncryptionKeyProtectedDisk parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.CustomerEncryptionKeyProtectedDisk parseFrom(
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

  public static Builder newBuilder(
      com.google.cloud.compute.v1.CustomerEncryptionKeyProtectedDisk prototype) {
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
   * </pre>
   *
   * Protobuf type {@code google.cloud.compute.v1.CustomerEncryptionKeyProtectedDisk}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.CustomerEncryptionKeyProtectedDisk)
      com.google.cloud.compute.v1.CustomerEncryptionKeyProtectedDiskOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_CustomerEncryptionKeyProtectedDisk_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_CustomerEncryptionKeyProtectedDisk_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.CustomerEncryptionKeyProtectedDisk.class,
              com.google.cloud.compute.v1.CustomerEncryptionKeyProtectedDisk.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.CustomerEncryptionKeyProtectedDisk.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getDiskEncryptionKeyFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (diskEncryptionKeyBuilder_ == null) {
        diskEncryptionKey_ = null;
      } else {
        diskEncryptionKeyBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      source_ = "";
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_CustomerEncryptionKeyProtectedDisk_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.CustomerEncryptionKeyProtectedDisk
        getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.CustomerEncryptionKeyProtectedDisk.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.CustomerEncryptionKeyProtectedDisk build() {
      com.google.cloud.compute.v1.CustomerEncryptionKeyProtectedDisk result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.CustomerEncryptionKeyProtectedDisk buildPartial() {
      com.google.cloud.compute.v1.CustomerEncryptionKeyProtectedDisk result =
          new com.google.cloud.compute.v1.CustomerEncryptionKeyProtectedDisk(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        if (diskEncryptionKeyBuilder_ == null) {
          result.diskEncryptionKey_ = diskEncryptionKey_;
        } else {
          result.diskEncryptionKey_ = diskEncryptionKeyBuilder_.build();
        }
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        to_bitField0_ |= 0x00000002;
      }
      result.source_ = source_;
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
      if (other instanceof com.google.cloud.compute.v1.CustomerEncryptionKeyProtectedDisk) {
        return mergeFrom((com.google.cloud.compute.v1.CustomerEncryptionKeyProtectedDisk) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.compute.v1.CustomerEncryptionKeyProtectedDisk other) {
      if (other
          == com.google.cloud.compute.v1.CustomerEncryptionKeyProtectedDisk.getDefaultInstance())
        return this;
      if (other.hasDiskEncryptionKey()) {
        mergeDiskEncryptionKey(other.getDiskEncryptionKey());
      }
      if (other.hasSource()) {
        bitField0_ |= 0x00000002;
        source_ = other.source_;
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
      com.google.cloud.compute.v1.CustomerEncryptionKeyProtectedDisk parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.compute.v1.CustomerEncryptionKeyProtectedDisk)
                e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private com.google.cloud.compute.v1.CustomerEncryptionKey diskEncryptionKey_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.compute.v1.CustomerEncryptionKey,
            com.google.cloud.compute.v1.CustomerEncryptionKey.Builder,
            com.google.cloud.compute.v1.CustomerEncryptionKeyOrBuilder>
        diskEncryptionKeyBuilder_;
    /**
     *
     *
     * <pre>
     * Decrypts data associated with the disk with a customer-supplied encryption key.
     * </pre>
     *
     * <code>
     * optional .google.cloud.compute.v1.CustomerEncryptionKey disk_encryption_key = 271660677;
     * </code>
     *
     * @return Whether the diskEncryptionKey field is set.
     */
    public boolean hasDiskEncryptionKey() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * Decrypts data associated with the disk with a customer-supplied encryption key.
     * </pre>
     *
     * <code>
     * optional .google.cloud.compute.v1.CustomerEncryptionKey disk_encryption_key = 271660677;
     * </code>
     *
     * @return The diskEncryptionKey.
     */
    public com.google.cloud.compute.v1.CustomerEncryptionKey getDiskEncryptionKey() {
      if (diskEncryptionKeyBuilder_ == null) {
        return diskEncryptionKey_ == null
            ? com.google.cloud.compute.v1.CustomerEncryptionKey.getDefaultInstance()
            : diskEncryptionKey_;
      } else {
        return diskEncryptionKeyBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Decrypts data associated with the disk with a customer-supplied encryption key.
     * </pre>
     *
     * <code>
     * optional .google.cloud.compute.v1.CustomerEncryptionKey disk_encryption_key = 271660677;
     * </code>
     */
    public Builder setDiskEncryptionKey(com.google.cloud.compute.v1.CustomerEncryptionKey value) {
      if (diskEncryptionKeyBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        diskEncryptionKey_ = value;
        onChanged();
      } else {
        diskEncryptionKeyBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Decrypts data associated with the disk with a customer-supplied encryption key.
     * </pre>
     *
     * <code>
     * optional .google.cloud.compute.v1.CustomerEncryptionKey disk_encryption_key = 271660677;
     * </code>
     */
    public Builder setDiskEncryptionKey(
        com.google.cloud.compute.v1.CustomerEncryptionKey.Builder builderForValue) {
      if (diskEncryptionKeyBuilder_ == null) {
        diskEncryptionKey_ = builderForValue.build();
        onChanged();
      } else {
        diskEncryptionKeyBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Decrypts data associated with the disk with a customer-supplied encryption key.
     * </pre>
     *
     * <code>
     * optional .google.cloud.compute.v1.CustomerEncryptionKey disk_encryption_key = 271660677;
     * </code>
     */
    public Builder mergeDiskEncryptionKey(com.google.cloud.compute.v1.CustomerEncryptionKey value) {
      if (diskEncryptionKeyBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && diskEncryptionKey_ != null
            && diskEncryptionKey_
                != com.google.cloud.compute.v1.CustomerEncryptionKey.getDefaultInstance()) {
          diskEncryptionKey_ =
              com.google.cloud.compute.v1.CustomerEncryptionKey.newBuilder(diskEncryptionKey_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          diskEncryptionKey_ = value;
        }
        onChanged();
      } else {
        diskEncryptionKeyBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Decrypts data associated with the disk with a customer-supplied encryption key.
     * </pre>
     *
     * <code>
     * optional .google.cloud.compute.v1.CustomerEncryptionKey disk_encryption_key = 271660677;
     * </code>
     */
    public Builder clearDiskEncryptionKey() {
      if (diskEncryptionKeyBuilder_ == null) {
        diskEncryptionKey_ = null;
        onChanged();
      } else {
        diskEncryptionKeyBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }
    /**
     *
     *
     * <pre>
     * Decrypts data associated with the disk with a customer-supplied encryption key.
     * </pre>
     *
     * <code>
     * optional .google.cloud.compute.v1.CustomerEncryptionKey disk_encryption_key = 271660677;
     * </code>
     */
    public com.google.cloud.compute.v1.CustomerEncryptionKey.Builder getDiskEncryptionKeyBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getDiskEncryptionKeyFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Decrypts data associated with the disk with a customer-supplied encryption key.
     * </pre>
     *
     * <code>
     * optional .google.cloud.compute.v1.CustomerEncryptionKey disk_encryption_key = 271660677;
     * </code>
     */
    public com.google.cloud.compute.v1.CustomerEncryptionKeyOrBuilder
        getDiskEncryptionKeyOrBuilder() {
      if (diskEncryptionKeyBuilder_ != null) {
        return diskEncryptionKeyBuilder_.getMessageOrBuilder();
      } else {
        return diskEncryptionKey_ == null
            ? com.google.cloud.compute.v1.CustomerEncryptionKey.getDefaultInstance()
            : diskEncryptionKey_;
      }
    }
    /**
     *
     *
     * <pre>
     * Decrypts data associated with the disk with a customer-supplied encryption key.
     * </pre>
     *
     * <code>
     * optional .google.cloud.compute.v1.CustomerEncryptionKey disk_encryption_key = 271660677;
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.compute.v1.CustomerEncryptionKey,
            com.google.cloud.compute.v1.CustomerEncryptionKey.Builder,
            com.google.cloud.compute.v1.CustomerEncryptionKeyOrBuilder>
        getDiskEncryptionKeyFieldBuilder() {
      if (diskEncryptionKeyBuilder_ == null) {
        diskEncryptionKeyBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.compute.v1.CustomerEncryptionKey,
                com.google.cloud.compute.v1.CustomerEncryptionKey.Builder,
                com.google.cloud.compute.v1.CustomerEncryptionKeyOrBuilder>(
                getDiskEncryptionKey(), getParentForChildren(), isClean());
        diskEncryptionKey_ = null;
      }
      return diskEncryptionKeyBuilder_;
    }

    private java.lang.Object source_ = "";
    /**
     *
     *
     * <pre>
     * Specifies a valid partial or full URL to an existing Persistent Disk resource. This field is only applicable for persistent disks. For example: "source": "/compute/v1/projects/project_id/zones/zone/disks/ disk_name
     * </pre>
     *
     * <code>optional string source = 177235995;</code>
     *
     * @return Whether the source field is set.
     */
    public boolean hasSource() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * Specifies a valid partial or full URL to an existing Persistent Disk resource. This field is only applicable for persistent disks. For example: "source": "/compute/v1/projects/project_id/zones/zone/disks/ disk_name
     * </pre>
     *
     * <code>optional string source = 177235995;</code>
     *
     * @return The source.
     */
    public java.lang.String getSource() {
      java.lang.Object ref = source_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        source_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Specifies a valid partial or full URL to an existing Persistent Disk resource. This field is only applicable for persistent disks. For example: "source": "/compute/v1/projects/project_id/zones/zone/disks/ disk_name
     * </pre>
     *
     * <code>optional string source = 177235995;</code>
     *
     * @return The bytes for source.
     */
    public com.google.protobuf.ByteString getSourceBytes() {
      java.lang.Object ref = source_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        source_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Specifies a valid partial or full URL to an existing Persistent Disk resource. This field is only applicable for persistent disks. For example: "source": "/compute/v1/projects/project_id/zones/zone/disks/ disk_name
     * </pre>
     *
     * <code>optional string source = 177235995;</code>
     *
     * @param value The source to set.
     * @return This builder for chaining.
     */
    public Builder setSource(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      source_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Specifies a valid partial or full URL to an existing Persistent Disk resource. This field is only applicable for persistent disks. For example: "source": "/compute/v1/projects/project_id/zones/zone/disks/ disk_name
     * </pre>
     *
     * <code>optional string source = 177235995;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearSource() {
      bitField0_ = (bitField0_ & ~0x00000002);
      source_ = getDefaultInstance().getSource();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Specifies a valid partial or full URL to an existing Persistent Disk resource. This field is only applicable for persistent disks. For example: "source": "/compute/v1/projects/project_id/zones/zone/disks/ disk_name
     * </pre>
     *
     * <code>optional string source = 177235995;</code>
     *
     * @param value The bytes for source to set.
     * @return This builder for chaining.
     */
    public Builder setSourceBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      bitField0_ |= 0x00000002;
      source_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.CustomerEncryptionKeyProtectedDisk)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.CustomerEncryptionKeyProtectedDisk)
  private static final com.google.cloud.compute.v1.CustomerEncryptionKeyProtectedDisk
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.CustomerEncryptionKeyProtectedDisk();
  }

  public static com.google.cloud.compute.v1.CustomerEncryptionKeyProtectedDisk
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CustomerEncryptionKeyProtectedDisk> PARSER =
      new com.google.protobuf.AbstractParser<CustomerEncryptionKeyProtectedDisk>() {
        @java.lang.Override
        public CustomerEncryptionKeyProtectedDisk parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new CustomerEncryptionKeyProtectedDisk(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<CustomerEncryptionKeyProtectedDisk> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CustomerEncryptionKeyProtectedDisk> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.CustomerEncryptionKeyProtectedDisk
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
