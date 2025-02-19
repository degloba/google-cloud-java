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
// source: google/container/v1beta1/cluster_service.proto

package com.google.container.v1beta1;

/**
 *
 *
 * <pre>
 * Parameters for node pool-level network config.
 * </pre>
 *
 * Protobuf type {@code google.container.v1beta1.NodeNetworkConfig}
 */
public final class NodeNetworkConfig extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.container.v1beta1.NodeNetworkConfig)
    NodeNetworkConfigOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use NodeNetworkConfig.newBuilder() to construct.
  private NodeNetworkConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private NodeNetworkConfig() {
    podRange_ = "";
    podIpv4CidrBlock_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new NodeNetworkConfig();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private NodeNetworkConfig(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
          case 32:
            {
              createPodRange_ = input.readBool();
              break;
            }
          case 42:
            {
              java.lang.String s = input.readStringRequireUtf8();

              podRange_ = s;
              break;
            }
          case 50:
            {
              java.lang.String s = input.readStringRequireUtf8();

              podIpv4CidrBlock_ = s;
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
    return com.google.container.v1beta1.ClusterServiceProto
        .internal_static_google_container_v1beta1_NodeNetworkConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.container.v1beta1.ClusterServiceProto
        .internal_static_google_container_v1beta1_NodeNetworkConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.container.v1beta1.NodeNetworkConfig.class,
            com.google.container.v1beta1.NodeNetworkConfig.Builder.class);
  }

  public static final int CREATE_POD_RANGE_FIELD_NUMBER = 4;
  private boolean createPodRange_;
  /**
   *
   *
   * <pre>
   * Input only. Whether to create a new range for pod IPs in this node pool.
   * Defaults are provided for `pod_range` and `pod_ipv4_cidr_block` if they
   * are not specified.
   * If neither `create_pod_range` or `pod_range` are specified, the
   * cluster-level default (`ip_allocation_policy.cluster_ipv4_cidr_block`) is
   * used.
   * Only applicable if `ip_allocation_policy.use_ip_aliases` is true.
   * This field cannot be changed after the node pool has been created.
   * </pre>
   *
   * <code>bool create_pod_range = 4 [(.google.api.field_behavior) = INPUT_ONLY];</code>
   *
   * @return The createPodRange.
   */
  @java.lang.Override
  public boolean getCreatePodRange() {
    return createPodRange_;
  }

  public static final int POD_RANGE_FIELD_NUMBER = 5;
  private volatile java.lang.Object podRange_;
  /**
   *
   *
   * <pre>
   * The ID of the secondary range for pod IPs.
   * If `create_pod_range` is true, this ID is used for the new range.
   * If `create_pod_range` is false, uses an existing secondary range with this
   * ID.
   * Only applicable if `ip_allocation_policy.use_ip_aliases` is true.
   * This field cannot be changed after the node pool has been created.
   * </pre>
   *
   * <code>string pod_range = 5;</code>
   *
   * @return The podRange.
   */
  @java.lang.Override
  public java.lang.String getPodRange() {
    java.lang.Object ref = podRange_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      podRange_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The ID of the secondary range for pod IPs.
   * If `create_pod_range` is true, this ID is used for the new range.
   * If `create_pod_range` is false, uses an existing secondary range with this
   * ID.
   * Only applicable if `ip_allocation_policy.use_ip_aliases` is true.
   * This field cannot be changed after the node pool has been created.
   * </pre>
   *
   * <code>string pod_range = 5;</code>
   *
   * @return The bytes for podRange.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getPodRangeBytes() {
    java.lang.Object ref = podRange_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      podRange_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int POD_IPV4_CIDR_BLOCK_FIELD_NUMBER = 6;
  private volatile java.lang.Object podIpv4CidrBlock_;
  /**
   *
   *
   * <pre>
   * The IP address range for pod IPs in this node pool.
   * Only applicable if `create_pod_range` is true.
   * Set to blank to have a range chosen with the default size.
   * Set to /netmask (e.g. `/14`) to have a range chosen with a specific
   * netmask.
   * Set to a
   * [CIDR](https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing)
   * notation (e.g. `10.96.0.0/14`) to pick a specific range to use.
   * Only applicable if `ip_allocation_policy.use_ip_aliases` is true.
   * This field cannot be changed after the node pool has been created.
   * </pre>
   *
   * <code>string pod_ipv4_cidr_block = 6;</code>
   *
   * @return The podIpv4CidrBlock.
   */
  @java.lang.Override
  public java.lang.String getPodIpv4CidrBlock() {
    java.lang.Object ref = podIpv4CidrBlock_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      podIpv4CidrBlock_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The IP address range for pod IPs in this node pool.
   * Only applicable if `create_pod_range` is true.
   * Set to blank to have a range chosen with the default size.
   * Set to /netmask (e.g. `/14`) to have a range chosen with a specific
   * netmask.
   * Set to a
   * [CIDR](https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing)
   * notation (e.g. `10.96.0.0/14`) to pick a specific range to use.
   * Only applicable if `ip_allocation_policy.use_ip_aliases` is true.
   * This field cannot be changed after the node pool has been created.
   * </pre>
   *
   * <code>string pod_ipv4_cidr_block = 6;</code>
   *
   * @return The bytes for podIpv4CidrBlock.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getPodIpv4CidrBlockBytes() {
    java.lang.Object ref = podIpv4CidrBlock_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      podIpv4CidrBlock_ = b;
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
    if (createPodRange_ != false) {
      output.writeBool(4, createPodRange_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(podRange_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, podRange_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(podIpv4CidrBlock_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 6, podIpv4CidrBlock_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (createPodRange_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(4, createPodRange_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(podRange_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, podRange_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(podIpv4CidrBlock_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, podIpv4CidrBlock_);
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
    if (!(obj instanceof com.google.container.v1beta1.NodeNetworkConfig)) {
      return super.equals(obj);
    }
    com.google.container.v1beta1.NodeNetworkConfig other =
        (com.google.container.v1beta1.NodeNetworkConfig) obj;

    if (getCreatePodRange() != other.getCreatePodRange()) return false;
    if (!getPodRange().equals(other.getPodRange())) return false;
    if (!getPodIpv4CidrBlock().equals(other.getPodIpv4CidrBlock())) return false;
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
    hash = (37 * hash) + CREATE_POD_RANGE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getCreatePodRange());
    hash = (37 * hash) + POD_RANGE_FIELD_NUMBER;
    hash = (53 * hash) + getPodRange().hashCode();
    hash = (37 * hash) + POD_IPV4_CIDR_BLOCK_FIELD_NUMBER;
    hash = (53 * hash) + getPodIpv4CidrBlock().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.container.v1beta1.NodeNetworkConfig parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.container.v1beta1.NodeNetworkConfig parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.container.v1beta1.NodeNetworkConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.container.v1beta1.NodeNetworkConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.container.v1beta1.NodeNetworkConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.container.v1beta1.NodeNetworkConfig parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.container.v1beta1.NodeNetworkConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.container.v1beta1.NodeNetworkConfig parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.container.v1beta1.NodeNetworkConfig parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.container.v1beta1.NodeNetworkConfig parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.container.v1beta1.NodeNetworkConfig parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.container.v1beta1.NodeNetworkConfig parseFrom(
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

  public static Builder newBuilder(com.google.container.v1beta1.NodeNetworkConfig prototype) {
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
   * Parameters for node pool-level network config.
   * </pre>
   *
   * Protobuf type {@code google.container.v1beta1.NodeNetworkConfig}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.container.v1beta1.NodeNetworkConfig)
      com.google.container.v1beta1.NodeNetworkConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.container.v1beta1.ClusterServiceProto
          .internal_static_google_container_v1beta1_NodeNetworkConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.container.v1beta1.ClusterServiceProto
          .internal_static_google_container_v1beta1_NodeNetworkConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.container.v1beta1.NodeNetworkConfig.class,
              com.google.container.v1beta1.NodeNetworkConfig.Builder.class);
    }

    // Construct using com.google.container.v1beta1.NodeNetworkConfig.newBuilder()
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
      createPodRange_ = false;

      podRange_ = "";

      podIpv4CidrBlock_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.container.v1beta1.ClusterServiceProto
          .internal_static_google_container_v1beta1_NodeNetworkConfig_descriptor;
    }

    @java.lang.Override
    public com.google.container.v1beta1.NodeNetworkConfig getDefaultInstanceForType() {
      return com.google.container.v1beta1.NodeNetworkConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.container.v1beta1.NodeNetworkConfig build() {
      com.google.container.v1beta1.NodeNetworkConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.container.v1beta1.NodeNetworkConfig buildPartial() {
      com.google.container.v1beta1.NodeNetworkConfig result =
          new com.google.container.v1beta1.NodeNetworkConfig(this);
      result.createPodRange_ = createPodRange_;
      result.podRange_ = podRange_;
      result.podIpv4CidrBlock_ = podIpv4CidrBlock_;
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
      if (other instanceof com.google.container.v1beta1.NodeNetworkConfig) {
        return mergeFrom((com.google.container.v1beta1.NodeNetworkConfig) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.container.v1beta1.NodeNetworkConfig other) {
      if (other == com.google.container.v1beta1.NodeNetworkConfig.getDefaultInstance()) return this;
      if (other.getCreatePodRange() != false) {
        setCreatePodRange(other.getCreatePodRange());
      }
      if (!other.getPodRange().isEmpty()) {
        podRange_ = other.podRange_;
        onChanged();
      }
      if (!other.getPodIpv4CidrBlock().isEmpty()) {
        podIpv4CidrBlock_ = other.podIpv4CidrBlock_;
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
      com.google.container.v1beta1.NodeNetworkConfig parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.container.v1beta1.NodeNetworkConfig) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private boolean createPodRange_;
    /**
     *
     *
     * <pre>
     * Input only. Whether to create a new range for pod IPs in this node pool.
     * Defaults are provided for `pod_range` and `pod_ipv4_cidr_block` if they
     * are not specified.
     * If neither `create_pod_range` or `pod_range` are specified, the
     * cluster-level default (`ip_allocation_policy.cluster_ipv4_cidr_block`) is
     * used.
     * Only applicable if `ip_allocation_policy.use_ip_aliases` is true.
     * This field cannot be changed after the node pool has been created.
     * </pre>
     *
     * <code>bool create_pod_range = 4 [(.google.api.field_behavior) = INPUT_ONLY];</code>
     *
     * @return The createPodRange.
     */
    @java.lang.Override
    public boolean getCreatePodRange() {
      return createPodRange_;
    }
    /**
     *
     *
     * <pre>
     * Input only. Whether to create a new range for pod IPs in this node pool.
     * Defaults are provided for `pod_range` and `pod_ipv4_cidr_block` if they
     * are not specified.
     * If neither `create_pod_range` or `pod_range` are specified, the
     * cluster-level default (`ip_allocation_policy.cluster_ipv4_cidr_block`) is
     * used.
     * Only applicable if `ip_allocation_policy.use_ip_aliases` is true.
     * This field cannot be changed after the node pool has been created.
     * </pre>
     *
     * <code>bool create_pod_range = 4 [(.google.api.field_behavior) = INPUT_ONLY];</code>
     *
     * @param value The createPodRange to set.
     * @return This builder for chaining.
     */
    public Builder setCreatePodRange(boolean value) {

      createPodRange_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Input only. Whether to create a new range for pod IPs in this node pool.
     * Defaults are provided for `pod_range` and `pod_ipv4_cidr_block` if they
     * are not specified.
     * If neither `create_pod_range` or `pod_range` are specified, the
     * cluster-level default (`ip_allocation_policy.cluster_ipv4_cidr_block`) is
     * used.
     * Only applicable if `ip_allocation_policy.use_ip_aliases` is true.
     * This field cannot be changed after the node pool has been created.
     * </pre>
     *
     * <code>bool create_pod_range = 4 [(.google.api.field_behavior) = INPUT_ONLY];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearCreatePodRange() {

      createPodRange_ = false;
      onChanged();
      return this;
    }

    private java.lang.Object podRange_ = "";
    /**
     *
     *
     * <pre>
     * The ID of the secondary range for pod IPs.
     * If `create_pod_range` is true, this ID is used for the new range.
     * If `create_pod_range` is false, uses an existing secondary range with this
     * ID.
     * Only applicable if `ip_allocation_policy.use_ip_aliases` is true.
     * This field cannot be changed after the node pool has been created.
     * </pre>
     *
     * <code>string pod_range = 5;</code>
     *
     * @return The podRange.
     */
    public java.lang.String getPodRange() {
      java.lang.Object ref = podRange_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        podRange_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The ID of the secondary range for pod IPs.
     * If `create_pod_range` is true, this ID is used for the new range.
     * If `create_pod_range` is false, uses an existing secondary range with this
     * ID.
     * Only applicable if `ip_allocation_policy.use_ip_aliases` is true.
     * This field cannot be changed after the node pool has been created.
     * </pre>
     *
     * <code>string pod_range = 5;</code>
     *
     * @return The bytes for podRange.
     */
    public com.google.protobuf.ByteString getPodRangeBytes() {
      java.lang.Object ref = podRange_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        podRange_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The ID of the secondary range for pod IPs.
     * If `create_pod_range` is true, this ID is used for the new range.
     * If `create_pod_range` is false, uses an existing secondary range with this
     * ID.
     * Only applicable if `ip_allocation_policy.use_ip_aliases` is true.
     * This field cannot be changed after the node pool has been created.
     * </pre>
     *
     * <code>string pod_range = 5;</code>
     *
     * @param value The podRange to set.
     * @return This builder for chaining.
     */
    public Builder setPodRange(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      podRange_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The ID of the secondary range for pod IPs.
     * If `create_pod_range` is true, this ID is used for the new range.
     * If `create_pod_range` is false, uses an existing secondary range with this
     * ID.
     * Only applicable if `ip_allocation_policy.use_ip_aliases` is true.
     * This field cannot be changed after the node pool has been created.
     * </pre>
     *
     * <code>string pod_range = 5;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearPodRange() {

      podRange_ = getDefaultInstance().getPodRange();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The ID of the secondary range for pod IPs.
     * If `create_pod_range` is true, this ID is used for the new range.
     * If `create_pod_range` is false, uses an existing secondary range with this
     * ID.
     * Only applicable if `ip_allocation_policy.use_ip_aliases` is true.
     * This field cannot be changed after the node pool has been created.
     * </pre>
     *
     * <code>string pod_range = 5;</code>
     *
     * @param value The bytes for podRange to set.
     * @return This builder for chaining.
     */
    public Builder setPodRangeBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      podRange_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object podIpv4CidrBlock_ = "";
    /**
     *
     *
     * <pre>
     * The IP address range for pod IPs in this node pool.
     * Only applicable if `create_pod_range` is true.
     * Set to blank to have a range chosen with the default size.
     * Set to /netmask (e.g. `/14`) to have a range chosen with a specific
     * netmask.
     * Set to a
     * [CIDR](https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing)
     * notation (e.g. `10.96.0.0/14`) to pick a specific range to use.
     * Only applicable if `ip_allocation_policy.use_ip_aliases` is true.
     * This field cannot be changed after the node pool has been created.
     * </pre>
     *
     * <code>string pod_ipv4_cidr_block = 6;</code>
     *
     * @return The podIpv4CidrBlock.
     */
    public java.lang.String getPodIpv4CidrBlock() {
      java.lang.Object ref = podIpv4CidrBlock_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        podIpv4CidrBlock_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The IP address range for pod IPs in this node pool.
     * Only applicable if `create_pod_range` is true.
     * Set to blank to have a range chosen with the default size.
     * Set to /netmask (e.g. `/14`) to have a range chosen with a specific
     * netmask.
     * Set to a
     * [CIDR](https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing)
     * notation (e.g. `10.96.0.0/14`) to pick a specific range to use.
     * Only applicable if `ip_allocation_policy.use_ip_aliases` is true.
     * This field cannot be changed after the node pool has been created.
     * </pre>
     *
     * <code>string pod_ipv4_cidr_block = 6;</code>
     *
     * @return The bytes for podIpv4CidrBlock.
     */
    public com.google.protobuf.ByteString getPodIpv4CidrBlockBytes() {
      java.lang.Object ref = podIpv4CidrBlock_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        podIpv4CidrBlock_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The IP address range for pod IPs in this node pool.
     * Only applicable if `create_pod_range` is true.
     * Set to blank to have a range chosen with the default size.
     * Set to /netmask (e.g. `/14`) to have a range chosen with a specific
     * netmask.
     * Set to a
     * [CIDR](https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing)
     * notation (e.g. `10.96.0.0/14`) to pick a specific range to use.
     * Only applicable if `ip_allocation_policy.use_ip_aliases` is true.
     * This field cannot be changed after the node pool has been created.
     * </pre>
     *
     * <code>string pod_ipv4_cidr_block = 6;</code>
     *
     * @param value The podIpv4CidrBlock to set.
     * @return This builder for chaining.
     */
    public Builder setPodIpv4CidrBlock(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      podIpv4CidrBlock_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The IP address range for pod IPs in this node pool.
     * Only applicable if `create_pod_range` is true.
     * Set to blank to have a range chosen with the default size.
     * Set to /netmask (e.g. `/14`) to have a range chosen with a specific
     * netmask.
     * Set to a
     * [CIDR](https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing)
     * notation (e.g. `10.96.0.0/14`) to pick a specific range to use.
     * Only applicable if `ip_allocation_policy.use_ip_aliases` is true.
     * This field cannot be changed after the node pool has been created.
     * </pre>
     *
     * <code>string pod_ipv4_cidr_block = 6;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearPodIpv4CidrBlock() {

      podIpv4CidrBlock_ = getDefaultInstance().getPodIpv4CidrBlock();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The IP address range for pod IPs in this node pool.
     * Only applicable if `create_pod_range` is true.
     * Set to blank to have a range chosen with the default size.
     * Set to /netmask (e.g. `/14`) to have a range chosen with a specific
     * netmask.
     * Set to a
     * [CIDR](https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing)
     * notation (e.g. `10.96.0.0/14`) to pick a specific range to use.
     * Only applicable if `ip_allocation_policy.use_ip_aliases` is true.
     * This field cannot be changed after the node pool has been created.
     * </pre>
     *
     * <code>string pod_ipv4_cidr_block = 6;</code>
     *
     * @param value The bytes for podIpv4CidrBlock to set.
     * @return This builder for chaining.
     */
    public Builder setPodIpv4CidrBlockBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      podIpv4CidrBlock_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.container.v1beta1.NodeNetworkConfig)
  }

  // @@protoc_insertion_point(class_scope:google.container.v1beta1.NodeNetworkConfig)
  private static final com.google.container.v1beta1.NodeNetworkConfig DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.container.v1beta1.NodeNetworkConfig();
  }

  public static com.google.container.v1beta1.NodeNetworkConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<NodeNetworkConfig> PARSER =
      new com.google.protobuf.AbstractParser<NodeNetworkConfig>() {
        @java.lang.Override
        public NodeNetworkConfig parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new NodeNetworkConfig(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<NodeNetworkConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<NodeNetworkConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.container.v1beta1.NodeNetworkConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
