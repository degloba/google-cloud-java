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
 * Protobuf type {@code google.cloud.compute.v1.ProjectsDisableXpnResourceRequest}
 */
public final class ProjectsDisableXpnResourceRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.ProjectsDisableXpnResourceRequest)
    ProjectsDisableXpnResourceRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ProjectsDisableXpnResourceRequest.newBuilder() to construct.
  private ProjectsDisableXpnResourceRequest(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ProjectsDisableXpnResourceRequest() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ProjectsDisableXpnResourceRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private ProjectsDisableXpnResourceRequest(
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
          case 1067077050:
            {
              com.google.cloud.compute.v1.XpnResourceId.Builder subBuilder = null;
              if (((bitField0_ & 0x00000001) != 0)) {
                subBuilder = xpnResource_.toBuilder();
              }
              xpnResource_ =
                  input.readMessage(
                      com.google.cloud.compute.v1.XpnResourceId.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(xpnResource_);
                xpnResource_ = subBuilder.buildPartial();
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
        .internal_static_google_cloud_compute_v1_ProjectsDisableXpnResourceRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_ProjectsDisableXpnResourceRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.ProjectsDisableXpnResourceRequest.class,
            com.google.cloud.compute.v1.ProjectsDisableXpnResourceRequest.Builder.class);
  }

  private int bitField0_;
  public static final int XPN_RESOURCE_FIELD_NUMBER = 133384631;
  private com.google.cloud.compute.v1.XpnResourceId xpnResource_;
  /**
   *
   *
   * <pre>
   * Service resource (a.k.a service project) ID.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.XpnResourceId xpn_resource = 133384631;</code>
   *
   * @return Whether the xpnResource field is set.
   */
  @java.lang.Override
  public boolean hasXpnResource() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Service resource (a.k.a service project) ID.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.XpnResourceId xpn_resource = 133384631;</code>
   *
   * @return The xpnResource.
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.XpnResourceId getXpnResource() {
    return xpnResource_ == null
        ? com.google.cloud.compute.v1.XpnResourceId.getDefaultInstance()
        : xpnResource_;
  }
  /**
   *
   *
   * <pre>
   * Service resource (a.k.a service project) ID.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.XpnResourceId xpn_resource = 133384631;</code>
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.XpnResourceIdOrBuilder getXpnResourceOrBuilder() {
    return xpnResource_ == null
        ? com.google.cloud.compute.v1.XpnResourceId.getDefaultInstance()
        : xpnResource_;
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
      output.writeMessage(133384631, getXpnResource());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(133384631, getXpnResource());
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
    if (!(obj instanceof com.google.cloud.compute.v1.ProjectsDisableXpnResourceRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.ProjectsDisableXpnResourceRequest other =
        (com.google.cloud.compute.v1.ProjectsDisableXpnResourceRequest) obj;

    if (hasXpnResource() != other.hasXpnResource()) return false;
    if (hasXpnResource()) {
      if (!getXpnResource().equals(other.getXpnResource())) return false;
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
    if (hasXpnResource()) {
      hash = (37 * hash) + XPN_RESOURCE_FIELD_NUMBER;
      hash = (53 * hash) + getXpnResource().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.ProjectsDisableXpnResourceRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.ProjectsDisableXpnResourceRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.ProjectsDisableXpnResourceRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.ProjectsDisableXpnResourceRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.ProjectsDisableXpnResourceRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.ProjectsDisableXpnResourceRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.ProjectsDisableXpnResourceRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.ProjectsDisableXpnResourceRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.ProjectsDisableXpnResourceRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.ProjectsDisableXpnResourceRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.ProjectsDisableXpnResourceRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.ProjectsDisableXpnResourceRequest parseFrom(
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
      com.google.cloud.compute.v1.ProjectsDisableXpnResourceRequest prototype) {
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
   * Protobuf type {@code google.cloud.compute.v1.ProjectsDisableXpnResourceRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.ProjectsDisableXpnResourceRequest)
      com.google.cloud.compute.v1.ProjectsDisableXpnResourceRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_ProjectsDisableXpnResourceRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_ProjectsDisableXpnResourceRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.ProjectsDisableXpnResourceRequest.class,
              com.google.cloud.compute.v1.ProjectsDisableXpnResourceRequest.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.ProjectsDisableXpnResourceRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getXpnResourceFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (xpnResourceBuilder_ == null) {
        xpnResource_ = null;
      } else {
        xpnResourceBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_ProjectsDisableXpnResourceRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.ProjectsDisableXpnResourceRequest
        getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.ProjectsDisableXpnResourceRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.ProjectsDisableXpnResourceRequest build() {
      com.google.cloud.compute.v1.ProjectsDisableXpnResourceRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.ProjectsDisableXpnResourceRequest buildPartial() {
      com.google.cloud.compute.v1.ProjectsDisableXpnResourceRequest result =
          new com.google.cloud.compute.v1.ProjectsDisableXpnResourceRequest(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        if (xpnResourceBuilder_ == null) {
          result.xpnResource_ = xpnResource_;
        } else {
          result.xpnResource_ = xpnResourceBuilder_.build();
        }
        to_bitField0_ |= 0x00000001;
      }
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
      if (other instanceof com.google.cloud.compute.v1.ProjectsDisableXpnResourceRequest) {
        return mergeFrom((com.google.cloud.compute.v1.ProjectsDisableXpnResourceRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.compute.v1.ProjectsDisableXpnResourceRequest other) {
      if (other
          == com.google.cloud.compute.v1.ProjectsDisableXpnResourceRequest.getDefaultInstance())
        return this;
      if (other.hasXpnResource()) {
        mergeXpnResource(other.getXpnResource());
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
      com.google.cloud.compute.v1.ProjectsDisableXpnResourceRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.compute.v1.ProjectsDisableXpnResourceRequest)
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

    private com.google.cloud.compute.v1.XpnResourceId xpnResource_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.compute.v1.XpnResourceId,
            com.google.cloud.compute.v1.XpnResourceId.Builder,
            com.google.cloud.compute.v1.XpnResourceIdOrBuilder>
        xpnResourceBuilder_;
    /**
     *
     *
     * <pre>
     * Service resource (a.k.a service project) ID.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.XpnResourceId xpn_resource = 133384631;</code>
     *
     * @return Whether the xpnResource field is set.
     */
    public boolean hasXpnResource() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * Service resource (a.k.a service project) ID.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.XpnResourceId xpn_resource = 133384631;</code>
     *
     * @return The xpnResource.
     */
    public com.google.cloud.compute.v1.XpnResourceId getXpnResource() {
      if (xpnResourceBuilder_ == null) {
        return xpnResource_ == null
            ? com.google.cloud.compute.v1.XpnResourceId.getDefaultInstance()
            : xpnResource_;
      } else {
        return xpnResourceBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Service resource (a.k.a service project) ID.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.XpnResourceId xpn_resource = 133384631;</code>
     */
    public Builder setXpnResource(com.google.cloud.compute.v1.XpnResourceId value) {
      if (xpnResourceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        xpnResource_ = value;
        onChanged();
      } else {
        xpnResourceBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Service resource (a.k.a service project) ID.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.XpnResourceId xpn_resource = 133384631;</code>
     */
    public Builder setXpnResource(
        com.google.cloud.compute.v1.XpnResourceId.Builder builderForValue) {
      if (xpnResourceBuilder_ == null) {
        xpnResource_ = builderForValue.build();
        onChanged();
      } else {
        xpnResourceBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Service resource (a.k.a service project) ID.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.XpnResourceId xpn_resource = 133384631;</code>
     */
    public Builder mergeXpnResource(com.google.cloud.compute.v1.XpnResourceId value) {
      if (xpnResourceBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && xpnResource_ != null
            && xpnResource_ != com.google.cloud.compute.v1.XpnResourceId.getDefaultInstance()) {
          xpnResource_ =
              com.google.cloud.compute.v1.XpnResourceId.newBuilder(xpnResource_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          xpnResource_ = value;
        }
        onChanged();
      } else {
        xpnResourceBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Service resource (a.k.a service project) ID.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.XpnResourceId xpn_resource = 133384631;</code>
     */
    public Builder clearXpnResource() {
      if (xpnResourceBuilder_ == null) {
        xpnResource_ = null;
        onChanged();
      } else {
        xpnResourceBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }
    /**
     *
     *
     * <pre>
     * Service resource (a.k.a service project) ID.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.XpnResourceId xpn_resource = 133384631;</code>
     */
    public com.google.cloud.compute.v1.XpnResourceId.Builder getXpnResourceBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getXpnResourceFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Service resource (a.k.a service project) ID.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.XpnResourceId xpn_resource = 133384631;</code>
     */
    public com.google.cloud.compute.v1.XpnResourceIdOrBuilder getXpnResourceOrBuilder() {
      if (xpnResourceBuilder_ != null) {
        return xpnResourceBuilder_.getMessageOrBuilder();
      } else {
        return xpnResource_ == null
            ? com.google.cloud.compute.v1.XpnResourceId.getDefaultInstance()
            : xpnResource_;
      }
    }
    /**
     *
     *
     * <pre>
     * Service resource (a.k.a service project) ID.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.XpnResourceId xpn_resource = 133384631;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.compute.v1.XpnResourceId,
            com.google.cloud.compute.v1.XpnResourceId.Builder,
            com.google.cloud.compute.v1.XpnResourceIdOrBuilder>
        getXpnResourceFieldBuilder() {
      if (xpnResourceBuilder_ == null) {
        xpnResourceBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.compute.v1.XpnResourceId,
                com.google.cloud.compute.v1.XpnResourceId.Builder,
                com.google.cloud.compute.v1.XpnResourceIdOrBuilder>(
                getXpnResource(), getParentForChildren(), isClean());
        xpnResource_ = null;
      }
      return xpnResourceBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.ProjectsDisableXpnResourceRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.ProjectsDisableXpnResourceRequest)
  private static final com.google.cloud.compute.v1.ProjectsDisableXpnResourceRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.ProjectsDisableXpnResourceRequest();
  }

  public static com.google.cloud.compute.v1.ProjectsDisableXpnResourceRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ProjectsDisableXpnResourceRequest> PARSER =
      new com.google.protobuf.AbstractParser<ProjectsDisableXpnResourceRequest>() {
        @java.lang.Override
        public ProjectsDisableXpnResourceRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new ProjectsDisableXpnResourceRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<ProjectsDisableXpnResourceRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ProjectsDisableXpnResourceRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.ProjectsDisableXpnResourceRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
