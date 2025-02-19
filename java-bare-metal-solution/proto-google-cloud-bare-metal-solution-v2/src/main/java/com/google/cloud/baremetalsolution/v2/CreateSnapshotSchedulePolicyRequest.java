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
// source: google/cloud/baremetalsolution/v2/baremetalsolution.proto

package com.google.cloud.baremetalsolution.v2;

/**
 *
 *
 * <pre>
 * Message for creating a snapshot schedule policy in a project.
 * </pre>
 *
 * Protobuf type {@code google.cloud.baremetalsolution.v2.CreateSnapshotSchedulePolicyRequest}
 */
public final class CreateSnapshotSchedulePolicyRequest
    extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.baremetalsolution.v2.CreateSnapshotSchedulePolicyRequest)
    CreateSnapshotSchedulePolicyRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CreateSnapshotSchedulePolicyRequest.newBuilder() to construct.
  private CreateSnapshotSchedulePolicyRequest(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreateSnapshotSchedulePolicyRequest() {
    parent_ = "";
    snapshotSchedulePolicyId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CreateSnapshotSchedulePolicyRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private CreateSnapshotSchedulePolicyRequest(
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
          case 10:
            {
              java.lang.String s = input.readStringRequireUtf8();

              parent_ = s;
              break;
            }
          case 18:
            {
              com.google.cloud.baremetalsolution.v2.SnapshotSchedulePolicy.Builder subBuilder =
                  null;
              if (snapshotSchedulePolicy_ != null) {
                subBuilder = snapshotSchedulePolicy_.toBuilder();
              }
              snapshotSchedulePolicy_ =
                  input.readMessage(
                      com.google.cloud.baremetalsolution.v2.SnapshotSchedulePolicy.parser(),
                      extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(snapshotSchedulePolicy_);
                snapshotSchedulePolicy_ = subBuilder.buildPartial();
              }

              break;
            }
          case 26:
            {
              java.lang.String s = input.readStringRequireUtf8();

              snapshotSchedulePolicyId_ = s;
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
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.baremetalsolution.v2.BaremetalsolutionProto
        .internal_static_google_cloud_baremetalsolution_v2_CreateSnapshotSchedulePolicyRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.baremetalsolution.v2.BaremetalsolutionProto
        .internal_static_google_cloud_baremetalsolution_v2_CreateSnapshotSchedulePolicyRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.baremetalsolution.v2.CreateSnapshotSchedulePolicyRequest.class,
            com.google.cloud.baremetalsolution.v2.CreateSnapshotSchedulePolicyRequest.Builder
                .class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  private volatile java.lang.Object parent_;
  /**
   *
   *
   * <pre>
   * Required. The parent project and location containing the SnapshotSchedulePolicy.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  @java.lang.Override
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
   * Required. The parent project and location containing the SnapshotSchedulePolicy.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  @java.lang.Override
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

  public static final int SNAPSHOT_SCHEDULE_POLICY_FIELD_NUMBER = 2;
  private com.google.cloud.baremetalsolution.v2.SnapshotSchedulePolicy snapshotSchedulePolicy_;
  /**
   *
   *
   * <pre>
   * Required. The SnapshotSchedulePolicy to create.
   * </pre>
   *
   * <code>
   * .google.cloud.baremetalsolution.v2.SnapshotSchedulePolicy snapshot_schedule_policy = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the snapshotSchedulePolicy field is set.
   */
  @java.lang.Override
  public boolean hasSnapshotSchedulePolicy() {
    return snapshotSchedulePolicy_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. The SnapshotSchedulePolicy to create.
   * </pre>
   *
   * <code>
   * .google.cloud.baremetalsolution.v2.SnapshotSchedulePolicy snapshot_schedule_policy = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The snapshotSchedulePolicy.
   */
  @java.lang.Override
  public com.google.cloud.baremetalsolution.v2.SnapshotSchedulePolicy getSnapshotSchedulePolicy() {
    return snapshotSchedulePolicy_ == null
        ? com.google.cloud.baremetalsolution.v2.SnapshotSchedulePolicy.getDefaultInstance()
        : snapshotSchedulePolicy_;
  }
  /**
   *
   *
   * <pre>
   * Required. The SnapshotSchedulePolicy to create.
   * </pre>
   *
   * <code>
   * .google.cloud.baremetalsolution.v2.SnapshotSchedulePolicy snapshot_schedule_policy = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.baremetalsolution.v2.SnapshotSchedulePolicyOrBuilder
      getSnapshotSchedulePolicyOrBuilder() {
    return getSnapshotSchedulePolicy();
  }

  public static final int SNAPSHOT_SCHEDULE_POLICY_ID_FIELD_NUMBER = 3;
  private volatile java.lang.Object snapshotSchedulePolicyId_;
  /**
   *
   *
   * <pre>
   * Required. Snapshot policy ID
   * </pre>
   *
   * <code>string snapshot_schedule_policy_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The snapshotSchedulePolicyId.
   */
  @java.lang.Override
  public java.lang.String getSnapshotSchedulePolicyId() {
    java.lang.Object ref = snapshotSchedulePolicyId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      snapshotSchedulePolicyId_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. Snapshot policy ID
   * </pre>
   *
   * <code>string snapshot_schedule_policy_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for snapshotSchedulePolicyId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getSnapshotSchedulePolicyIdBytes() {
    java.lang.Object ref = snapshotSchedulePolicyId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      snapshotSchedulePolicyId_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (snapshotSchedulePolicy_ != null) {
      output.writeMessage(2, getSnapshotSchedulePolicy());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(snapshotSchedulePolicyId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, snapshotSchedulePolicyId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    if (snapshotSchedulePolicy_ != null) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(2, getSnapshotSchedulePolicy());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(snapshotSchedulePolicyId_)) {
      size +=
          com.google.protobuf.GeneratedMessageV3.computeStringSize(3, snapshotSchedulePolicyId_);
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
    if (!(obj
        instanceof com.google.cloud.baremetalsolution.v2.CreateSnapshotSchedulePolicyRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.baremetalsolution.v2.CreateSnapshotSchedulePolicyRequest other =
        (com.google.cloud.baremetalsolution.v2.CreateSnapshotSchedulePolicyRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (hasSnapshotSchedulePolicy() != other.hasSnapshotSchedulePolicy()) return false;
    if (hasSnapshotSchedulePolicy()) {
      if (!getSnapshotSchedulePolicy().equals(other.getSnapshotSchedulePolicy())) return false;
    }
    if (!getSnapshotSchedulePolicyId().equals(other.getSnapshotSchedulePolicyId())) return false;
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
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    if (hasSnapshotSchedulePolicy()) {
      hash = (37 * hash) + SNAPSHOT_SCHEDULE_POLICY_FIELD_NUMBER;
      hash = (53 * hash) + getSnapshotSchedulePolicy().hashCode();
    }
    hash = (37 * hash) + SNAPSHOT_SCHEDULE_POLICY_ID_FIELD_NUMBER;
    hash = (53 * hash) + getSnapshotSchedulePolicyId().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.baremetalsolution.v2.CreateSnapshotSchedulePolicyRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.baremetalsolution.v2.CreateSnapshotSchedulePolicyRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.baremetalsolution.v2.CreateSnapshotSchedulePolicyRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.baremetalsolution.v2.CreateSnapshotSchedulePolicyRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.baremetalsolution.v2.CreateSnapshotSchedulePolicyRequest parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.baremetalsolution.v2.CreateSnapshotSchedulePolicyRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.baremetalsolution.v2.CreateSnapshotSchedulePolicyRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.baremetalsolution.v2.CreateSnapshotSchedulePolicyRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.baremetalsolution.v2.CreateSnapshotSchedulePolicyRequest
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.baremetalsolution.v2.CreateSnapshotSchedulePolicyRequest
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.baremetalsolution.v2.CreateSnapshotSchedulePolicyRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.baremetalsolution.v2.CreateSnapshotSchedulePolicyRequest parseFrom(
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
      com.google.cloud.baremetalsolution.v2.CreateSnapshotSchedulePolicyRequest prototype) {
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
   * Message for creating a snapshot schedule policy in a project.
   * </pre>
   *
   * Protobuf type {@code google.cloud.baremetalsolution.v2.CreateSnapshotSchedulePolicyRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.baremetalsolution.v2.CreateSnapshotSchedulePolicyRequest)
      com.google.cloud.baremetalsolution.v2.CreateSnapshotSchedulePolicyRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.baremetalsolution.v2.BaremetalsolutionProto
          .internal_static_google_cloud_baremetalsolution_v2_CreateSnapshotSchedulePolicyRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.baremetalsolution.v2.BaremetalsolutionProto
          .internal_static_google_cloud_baremetalsolution_v2_CreateSnapshotSchedulePolicyRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.baremetalsolution.v2.CreateSnapshotSchedulePolicyRequest.class,
              com.google.cloud.baremetalsolution.v2.CreateSnapshotSchedulePolicyRequest.Builder
                  .class);
    }

    // Construct using
    // com.google.cloud.baremetalsolution.v2.CreateSnapshotSchedulePolicyRequest.newBuilder()
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

      if (snapshotSchedulePolicyBuilder_ == null) {
        snapshotSchedulePolicy_ = null;
      } else {
        snapshotSchedulePolicy_ = null;
        snapshotSchedulePolicyBuilder_ = null;
      }
      snapshotSchedulePolicyId_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.baremetalsolution.v2.BaremetalsolutionProto
          .internal_static_google_cloud_baremetalsolution_v2_CreateSnapshotSchedulePolicyRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.baremetalsolution.v2.CreateSnapshotSchedulePolicyRequest
        getDefaultInstanceForType() {
      return com.google.cloud.baremetalsolution.v2.CreateSnapshotSchedulePolicyRequest
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.baremetalsolution.v2.CreateSnapshotSchedulePolicyRequest build() {
      com.google.cloud.baremetalsolution.v2.CreateSnapshotSchedulePolicyRequest result =
          buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.baremetalsolution.v2.CreateSnapshotSchedulePolicyRequest
        buildPartial() {
      com.google.cloud.baremetalsolution.v2.CreateSnapshotSchedulePolicyRequest result =
          new com.google.cloud.baremetalsolution.v2.CreateSnapshotSchedulePolicyRequest(this);
      result.parent_ = parent_;
      if (snapshotSchedulePolicyBuilder_ == null) {
        result.snapshotSchedulePolicy_ = snapshotSchedulePolicy_;
      } else {
        result.snapshotSchedulePolicy_ = snapshotSchedulePolicyBuilder_.build();
      }
      result.snapshotSchedulePolicyId_ = snapshotSchedulePolicyId_;
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
      if (other
          instanceof com.google.cloud.baremetalsolution.v2.CreateSnapshotSchedulePolicyRequest) {
        return mergeFrom(
            (com.google.cloud.baremetalsolution.v2.CreateSnapshotSchedulePolicyRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.baremetalsolution.v2.CreateSnapshotSchedulePolicyRequest other) {
      if (other
          == com.google.cloud.baremetalsolution.v2.CreateSnapshotSchedulePolicyRequest
              .getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        onChanged();
      }
      if (other.hasSnapshotSchedulePolicy()) {
        mergeSnapshotSchedulePolicy(other.getSnapshotSchedulePolicy());
      }
      if (!other.getSnapshotSchedulePolicyId().isEmpty()) {
        snapshotSchedulePolicyId_ = other.snapshotSchedulePolicyId_;
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
      com.google.cloud.baremetalsolution.v2.CreateSnapshotSchedulePolicyRequest parsedMessage =
          null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.baremetalsolution.v2.CreateSnapshotSchedulePolicyRequest)
                e.getUnfinishedMessage();
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
     * Required. The parent project and location containing the SnapshotSchedulePolicy.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The parent.
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
     * Required. The parent project and location containing the SnapshotSchedulePolicy.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The bytes for parent.
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
     * Required. The parent project and location containing the SnapshotSchedulePolicy.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The parent to set.
     * @return This builder for chaining.
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
     * Required. The parent project and location containing the SnapshotSchedulePolicy.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return This builder for chaining.
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
     * Required. The parent project and location containing the SnapshotSchedulePolicy.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The bytes for parent to set.
     * @return This builder for chaining.
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

    private com.google.cloud.baremetalsolution.v2.SnapshotSchedulePolicy snapshotSchedulePolicy_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.baremetalsolution.v2.SnapshotSchedulePolicy,
            com.google.cloud.baremetalsolution.v2.SnapshotSchedulePolicy.Builder,
            com.google.cloud.baremetalsolution.v2.SnapshotSchedulePolicyOrBuilder>
        snapshotSchedulePolicyBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The SnapshotSchedulePolicy to create.
     * </pre>
     *
     * <code>
     * .google.cloud.baremetalsolution.v2.SnapshotSchedulePolicy snapshot_schedule_policy = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the snapshotSchedulePolicy field is set.
     */
    public boolean hasSnapshotSchedulePolicy() {
      return snapshotSchedulePolicyBuilder_ != null || snapshotSchedulePolicy_ != null;
    }
    /**
     *
     *
     * <pre>
     * Required. The SnapshotSchedulePolicy to create.
     * </pre>
     *
     * <code>
     * .google.cloud.baremetalsolution.v2.SnapshotSchedulePolicy snapshot_schedule_policy = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The snapshotSchedulePolicy.
     */
    public com.google.cloud.baremetalsolution.v2.SnapshotSchedulePolicy
        getSnapshotSchedulePolicy() {
      if (snapshotSchedulePolicyBuilder_ == null) {
        return snapshotSchedulePolicy_ == null
            ? com.google.cloud.baremetalsolution.v2.SnapshotSchedulePolicy.getDefaultInstance()
            : snapshotSchedulePolicy_;
      } else {
        return snapshotSchedulePolicyBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The SnapshotSchedulePolicy to create.
     * </pre>
     *
     * <code>
     * .google.cloud.baremetalsolution.v2.SnapshotSchedulePolicy snapshot_schedule_policy = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setSnapshotSchedulePolicy(
        com.google.cloud.baremetalsolution.v2.SnapshotSchedulePolicy value) {
      if (snapshotSchedulePolicyBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        snapshotSchedulePolicy_ = value;
        onChanged();
      } else {
        snapshotSchedulePolicyBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The SnapshotSchedulePolicy to create.
     * </pre>
     *
     * <code>
     * .google.cloud.baremetalsolution.v2.SnapshotSchedulePolicy snapshot_schedule_policy = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setSnapshotSchedulePolicy(
        com.google.cloud.baremetalsolution.v2.SnapshotSchedulePolicy.Builder builderForValue) {
      if (snapshotSchedulePolicyBuilder_ == null) {
        snapshotSchedulePolicy_ = builderForValue.build();
        onChanged();
      } else {
        snapshotSchedulePolicyBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The SnapshotSchedulePolicy to create.
     * </pre>
     *
     * <code>
     * .google.cloud.baremetalsolution.v2.SnapshotSchedulePolicy snapshot_schedule_policy = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeSnapshotSchedulePolicy(
        com.google.cloud.baremetalsolution.v2.SnapshotSchedulePolicy value) {
      if (snapshotSchedulePolicyBuilder_ == null) {
        if (snapshotSchedulePolicy_ != null) {
          snapshotSchedulePolicy_ =
              com.google.cloud.baremetalsolution.v2.SnapshotSchedulePolicy.newBuilder(
                      snapshotSchedulePolicy_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          snapshotSchedulePolicy_ = value;
        }
        onChanged();
      } else {
        snapshotSchedulePolicyBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The SnapshotSchedulePolicy to create.
     * </pre>
     *
     * <code>
     * .google.cloud.baremetalsolution.v2.SnapshotSchedulePolicy snapshot_schedule_policy = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearSnapshotSchedulePolicy() {
      if (snapshotSchedulePolicyBuilder_ == null) {
        snapshotSchedulePolicy_ = null;
        onChanged();
      } else {
        snapshotSchedulePolicy_ = null;
        snapshotSchedulePolicyBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The SnapshotSchedulePolicy to create.
     * </pre>
     *
     * <code>
     * .google.cloud.baremetalsolution.v2.SnapshotSchedulePolicy snapshot_schedule_policy = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.baremetalsolution.v2.SnapshotSchedulePolicy.Builder
        getSnapshotSchedulePolicyBuilder() {

      onChanged();
      return getSnapshotSchedulePolicyFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The SnapshotSchedulePolicy to create.
     * </pre>
     *
     * <code>
     * .google.cloud.baremetalsolution.v2.SnapshotSchedulePolicy snapshot_schedule_policy = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.baremetalsolution.v2.SnapshotSchedulePolicyOrBuilder
        getSnapshotSchedulePolicyOrBuilder() {
      if (snapshotSchedulePolicyBuilder_ != null) {
        return snapshotSchedulePolicyBuilder_.getMessageOrBuilder();
      } else {
        return snapshotSchedulePolicy_ == null
            ? com.google.cloud.baremetalsolution.v2.SnapshotSchedulePolicy.getDefaultInstance()
            : snapshotSchedulePolicy_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The SnapshotSchedulePolicy to create.
     * </pre>
     *
     * <code>
     * .google.cloud.baremetalsolution.v2.SnapshotSchedulePolicy snapshot_schedule_policy = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.baremetalsolution.v2.SnapshotSchedulePolicy,
            com.google.cloud.baremetalsolution.v2.SnapshotSchedulePolicy.Builder,
            com.google.cloud.baremetalsolution.v2.SnapshotSchedulePolicyOrBuilder>
        getSnapshotSchedulePolicyFieldBuilder() {
      if (snapshotSchedulePolicyBuilder_ == null) {
        snapshotSchedulePolicyBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.baremetalsolution.v2.SnapshotSchedulePolicy,
                com.google.cloud.baremetalsolution.v2.SnapshotSchedulePolicy.Builder,
                com.google.cloud.baremetalsolution.v2.SnapshotSchedulePolicyOrBuilder>(
                getSnapshotSchedulePolicy(), getParentForChildren(), isClean());
        snapshotSchedulePolicy_ = null;
      }
      return snapshotSchedulePolicyBuilder_;
    }

    private java.lang.Object snapshotSchedulePolicyId_ = "";
    /**
     *
     *
     * <pre>
     * Required. Snapshot policy ID
     * </pre>
     *
     * <code>string snapshot_schedule_policy_id = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The snapshotSchedulePolicyId.
     */
    public java.lang.String getSnapshotSchedulePolicyId() {
      java.lang.Object ref = snapshotSchedulePolicyId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        snapshotSchedulePolicyId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Snapshot policy ID
     * </pre>
     *
     * <code>string snapshot_schedule_policy_id = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The bytes for snapshotSchedulePolicyId.
     */
    public com.google.protobuf.ByteString getSnapshotSchedulePolicyIdBytes() {
      java.lang.Object ref = snapshotSchedulePolicyId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        snapshotSchedulePolicyId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Snapshot policy ID
     * </pre>
     *
     * <code>string snapshot_schedule_policy_id = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @param value The snapshotSchedulePolicyId to set.
     * @return This builder for chaining.
     */
    public Builder setSnapshotSchedulePolicyId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      snapshotSchedulePolicyId_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Snapshot policy ID
     * </pre>
     *
     * <code>string snapshot_schedule_policy_id = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearSnapshotSchedulePolicyId() {

      snapshotSchedulePolicyId_ = getDefaultInstance().getSnapshotSchedulePolicyId();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Snapshot policy ID
     * </pre>
     *
     * <code>string snapshot_schedule_policy_id = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @param value The bytes for snapshotSchedulePolicyId to set.
     * @return This builder for chaining.
     */
    public Builder setSnapshotSchedulePolicyIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      snapshotSchedulePolicyId_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.baremetalsolution.v2.CreateSnapshotSchedulePolicyRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.baremetalsolution.v2.CreateSnapshotSchedulePolicyRequest)
  private static final com.google.cloud.baremetalsolution.v2.CreateSnapshotSchedulePolicyRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE =
        new com.google.cloud.baremetalsolution.v2.CreateSnapshotSchedulePolicyRequest();
  }

  public static com.google.cloud.baremetalsolution.v2.CreateSnapshotSchedulePolicyRequest
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateSnapshotSchedulePolicyRequest> PARSER =
      new com.google.protobuf.AbstractParser<CreateSnapshotSchedulePolicyRequest>() {
        @java.lang.Override
        public CreateSnapshotSchedulePolicyRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new CreateSnapshotSchedulePolicyRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<CreateSnapshotSchedulePolicyRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateSnapshotSchedulePolicyRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.baremetalsolution.v2.CreateSnapshotSchedulePolicyRequest
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
