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
// source: google/cloud/secretmanager/v1/resources.proto

package com.google.cloud.secretmanager.v1;

public final class ResourcesProto {
  private ResourcesProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_secretmanager_v1_Secret_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_secretmanager_v1_Secret_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_secretmanager_v1_Secret_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_secretmanager_v1_Secret_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_secretmanager_v1_Secret_VersionAliasesEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_secretmanager_v1_Secret_VersionAliasesEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_secretmanager_v1_SecretVersion_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_secretmanager_v1_SecretVersion_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_secretmanager_v1_Replication_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_secretmanager_v1_Replication_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_secretmanager_v1_Replication_Automatic_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_secretmanager_v1_Replication_Automatic_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_secretmanager_v1_Replication_UserManaged_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_secretmanager_v1_Replication_UserManaged_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_secretmanager_v1_Replication_UserManaged_Replica_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_secretmanager_v1_Replication_UserManaged_Replica_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_secretmanager_v1_CustomerManagedEncryption_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_secretmanager_v1_CustomerManagedEncryption_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_secretmanager_v1_ReplicationStatus_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_secretmanager_v1_ReplicationStatus_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_secretmanager_v1_ReplicationStatus_AutomaticStatus_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_secretmanager_v1_ReplicationStatus_AutomaticStatus_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_secretmanager_v1_ReplicationStatus_UserManagedStatus_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_secretmanager_v1_ReplicationStatus_UserManagedStatus_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_secretmanager_v1_ReplicationStatus_UserManagedStatus_ReplicaStatus_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_secretmanager_v1_ReplicationStatus_UserManagedStatus_ReplicaStatus_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_secretmanager_v1_CustomerManagedEncryptionStatus_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_secretmanager_v1_CustomerManagedEncryptionStatus_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_secretmanager_v1_Topic_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_secretmanager_v1_Topic_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_secretmanager_v1_Rotation_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_secretmanager_v1_Rotation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_secretmanager_v1_SecretPayload_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_secretmanager_v1_SecretPayload_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n-google/cloud/secretmanager/v1/resource"
          + "s.proto\022\035google.cloud.secretmanager.v1\032\034"
          + "google/api/annotations.proto\032\037google/api"
          + "/field_behavior.proto\032\031google/api/resour"
          + "ce.proto\032\036google/protobuf/duration.proto"
          + "\032\037google/protobuf/timestamp.proto\"\356\005\n\006Se"
          + "cret\022\021\n\004name\030\001 \001(\tB\003\340A\003\022G\n\013replication\030\002"
          + " \001(\0132*.google.cloud.secretmanager.v1.Rep"
          + "licationB\006\340A\005\340A\002\0224\n\013create_time\030\003 \001(\0132\032."
          + "google.protobuf.TimestampB\003\340A\003\022A\n\006labels"
          + "\030\004 \003(\01321.google.cloud.secretmanager.v1.S"
          + "ecret.LabelsEntry\0229\n\006topics\030\005 \003(\0132$.goog"
          + "le.cloud.secretmanager.v1.TopicB\003\340A\001\0226\n\013"
          + "expire_time\030\006 \001(\0132\032.google.protobuf.Time"
          + "stampB\003\340A\001H\000\022-\n\003ttl\030\007 \001(\0132\031.google.proto"
          + "buf.DurationB\003\340A\004H\000\022\021\n\004etag\030\010 \001(\tB\003\340A\001\022>"
          + "\n\010rotation\030\t \001(\0132\'.google.cloud.secretma"
          + "nager.v1.RotationB\003\340A\001\022W\n\017version_aliase"
          + "s\030\013 \003(\01329.google.cloud.secretmanager.v1."
          + "Secret.VersionAliasesEntryB\003\340A\001\032-\n\013Label"
          + "sEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\0325"
          + "\n\023VersionAliasesEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005va"
          + "lue\030\002 \001(\003:\0028\001:M\352AJ\n#secretmanager.google"
          + "apis.com/Secret\022#projects/{project}/secr"
          + "ets/{secret}B\014\n\nexpiration\"\242\004\n\rSecretVer"
          + "sion\022\021\n\004name\030\001 \001(\tB\003\340A\003\0224\n\013create_time\030\002"
          + " \001(\0132\032.google.protobuf.TimestampB\003\340A\003\0225\n"
          + "\014destroy_time\030\003 \001(\0132\032.google.protobuf.Ti"
          + "mestampB\003\340A\003\022F\n\005state\030\004 \001(\01622.google.clo"
          + "ud.secretmanager.v1.SecretVersion.StateB"
          + "\003\340A\003\022L\n\022replication_status\030\005 \001(\01320.googl"
          + "e.cloud.secretmanager.v1.ReplicationStat"
          + "us\022\021\n\004etag\030\006 \001(\tB\003\340A\003\022.\n!client_specifie"
          + "d_payload_checksum\030\007 \001(\010B\003\340A\003\"H\n\005State\022\025"
          + "\n\021STATE_UNSPECIFIED\020\000\022\013\n\007ENABLED\020\001\022\014\n\010DI"
          + "SABLED\020\002\022\r\n\tDESTROYED\020\003:n\352Ak\n*secretmana"
          + "ger.googleapis.com/SecretVersion\022=projec"
          + "ts/{project}/secrets/{secret}/versions/{"
          + "secret_version}\"\220\004\n\013Replication\022I\n\tautom"
          + "atic\030\001 \001(\01324.google.cloud.secretmanager."
          + "v1.Replication.AutomaticH\000\022N\n\014user_manag"
          + "ed\030\002 \001(\01326.google.cloud.secretmanager.v1"
          + ".Replication.UserManagedH\000\032o\n\tAutomatic\022"
          + "b\n\033customer_managed_encryption\030\001 \001(\01328.g"
          + "oogle.cloud.secretmanager.v1.CustomerMan"
          + "agedEncryptionB\003\340A\001\032\345\001\n\013UserManaged\022U\n\010r"
          + "eplicas\030\001 \003(\0132>.google.cloud.secretmanag"
          + "er.v1.Replication.UserManaged.ReplicaB\003\340"
          + "A\002\032\177\n\007Replica\022\020\n\010location\030\001 \001(\t\022b\n\033custo"
          + "mer_managed_encryption\030\002 \001(\01328.google.cl"
          + "oud.secretmanager.v1.CustomerManagedEncr"
          + "yptionB\003\340A\001B\r\n\013replication\"6\n\031CustomerMa"
          + "nagedEncryption\022\031\n\014kms_key_name\030\001 \001(\tB\003\340"
          + "A\002\"\353\004\n\021ReplicationStatus\022U\n\tautomatic\030\001 "
          + "\001(\0132@.google.cloud.secretmanager.v1.Repl"
          + "icationStatus.AutomaticStatusH\000\022Z\n\014user_"
          + "managed\030\002 \001(\0132B.google.cloud.secretmanag"
          + "er.v1.ReplicationStatus.UserManagedStatu"
          + "sH\000\032{\n\017AutomaticStatus\022h\n\033customer_manag"
          + "ed_encryption\030\001 \001(\0132>.google.cloud.secre"
          + "tmanager.v1.CustomerManagedEncryptionSta"
          + "tusB\003\340A\003\032\217\002\n\021UserManagedStatus\022g\n\010replic"
          + "as\030\001 \003(\0132P.google.cloud.secretmanager.v1"
          + ".ReplicationStatus.UserManagedStatus.Rep"
          + "licaStatusB\003\340A\003\032\220\001\n\rReplicaStatus\022\025\n\010loc"
          + "ation\030\001 \001(\tB\003\340A\003\022h\n\033customer_managed_enc"
          + "ryption\030\002 \001(\0132>.google.cloud.secretmanag"
          + "er.v1.CustomerManagedEncryptionStatusB\003\340"
          + "A\003B\024\n\022replication_status\"D\n\037CustomerMana"
          + "gedEncryptionStatus\022!\n\024kms_key_version_n"
          + "ame\030\001 \001(\tB\003\340A\002\"_\n\005Topic\022\021\n\004name\030\001 \001(\tB\003\340"
          + "A\002:C\352A@\n\033pubsub.googleapis.com/Topic\022!pr"
          + "ojects/{project}/topics/{topic}\"\200\001\n\010Rota"
          + "tion\022;\n\022next_rotation_time\030\001 \001(\0132\032.googl"
          + "e.protobuf.TimestampB\003\340A\001\0227\n\017rotation_pe"
          + "riod\030\002 \001(\0132\031.google.protobuf.DurationB\003\340"
          + "A\004\"L\n\rSecretPayload\022\014\n\004data\030\001 \001(\014\022\035\n\013dat"
          + "a_crc32c\030\002 \001(\003B\003\340A\001H\000\210\001\001B\016\n\014_data_crc32c"
          + "B\355\001\n!com.google.cloud.secretmanager.v1B\016"
          + "ResourcesProtoP\001ZJgoogle.golang.org/genp"
          + "roto/googleapis/cloud/secretmanager/v1;s"
          + "ecretmanager\370\001\001\242\002\003GSM\252\002\035Google.Cloud.Sec"
          + "retManager.V1\312\002\035Google\\Cloud\\SecretManag"
          + "er\\V1\352\002 Google::Cloud::SecretManager::V1"
          + "b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.protobuf.DurationProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_secretmanager_v1_Secret_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_secretmanager_v1_Secret_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_secretmanager_v1_Secret_descriptor,
            new java.lang.String[] {
              "Name",
              "Replication",
              "CreateTime",
              "Labels",
              "Topics",
              "ExpireTime",
              "Ttl",
              "Etag",
              "Rotation",
              "VersionAliases",
              "Expiration",
            });
    internal_static_google_cloud_secretmanager_v1_Secret_LabelsEntry_descriptor =
        internal_static_google_cloud_secretmanager_v1_Secret_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_secretmanager_v1_Secret_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_secretmanager_v1_Secret_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_secretmanager_v1_Secret_VersionAliasesEntry_descriptor =
        internal_static_google_cloud_secretmanager_v1_Secret_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_secretmanager_v1_Secret_VersionAliasesEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_secretmanager_v1_Secret_VersionAliasesEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_secretmanager_v1_SecretVersion_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_secretmanager_v1_SecretVersion_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_secretmanager_v1_SecretVersion_descriptor,
            new java.lang.String[] {
              "Name",
              "CreateTime",
              "DestroyTime",
              "State",
              "ReplicationStatus",
              "Etag",
              "ClientSpecifiedPayloadChecksum",
            });
    internal_static_google_cloud_secretmanager_v1_Replication_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_secretmanager_v1_Replication_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_secretmanager_v1_Replication_descriptor,
            new java.lang.String[] {
              "Automatic", "UserManaged", "Replication",
            });
    internal_static_google_cloud_secretmanager_v1_Replication_Automatic_descriptor =
        internal_static_google_cloud_secretmanager_v1_Replication_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_secretmanager_v1_Replication_Automatic_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_secretmanager_v1_Replication_Automatic_descriptor,
            new java.lang.String[] {
              "CustomerManagedEncryption",
            });
    internal_static_google_cloud_secretmanager_v1_Replication_UserManaged_descriptor =
        internal_static_google_cloud_secretmanager_v1_Replication_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_secretmanager_v1_Replication_UserManaged_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_secretmanager_v1_Replication_UserManaged_descriptor,
            new java.lang.String[] {
              "Replicas",
            });
    internal_static_google_cloud_secretmanager_v1_Replication_UserManaged_Replica_descriptor =
        internal_static_google_cloud_secretmanager_v1_Replication_UserManaged_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_secretmanager_v1_Replication_UserManaged_Replica_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_secretmanager_v1_Replication_UserManaged_Replica_descriptor,
            new java.lang.String[] {
              "Location", "CustomerManagedEncryption",
            });
    internal_static_google_cloud_secretmanager_v1_CustomerManagedEncryption_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_secretmanager_v1_CustomerManagedEncryption_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_secretmanager_v1_CustomerManagedEncryption_descriptor,
            new java.lang.String[] {
              "KmsKeyName",
            });
    internal_static_google_cloud_secretmanager_v1_ReplicationStatus_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_secretmanager_v1_ReplicationStatus_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_secretmanager_v1_ReplicationStatus_descriptor,
            new java.lang.String[] {
              "Automatic", "UserManaged", "ReplicationStatus",
            });
    internal_static_google_cloud_secretmanager_v1_ReplicationStatus_AutomaticStatus_descriptor =
        internal_static_google_cloud_secretmanager_v1_ReplicationStatus_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_secretmanager_v1_ReplicationStatus_AutomaticStatus_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_secretmanager_v1_ReplicationStatus_AutomaticStatus_descriptor,
            new java.lang.String[] {
              "CustomerManagedEncryption",
            });
    internal_static_google_cloud_secretmanager_v1_ReplicationStatus_UserManagedStatus_descriptor =
        internal_static_google_cloud_secretmanager_v1_ReplicationStatus_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_secretmanager_v1_ReplicationStatus_UserManagedStatus_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_secretmanager_v1_ReplicationStatus_UserManagedStatus_descriptor,
            new java.lang.String[] {
              "Replicas",
            });
    internal_static_google_cloud_secretmanager_v1_ReplicationStatus_UserManagedStatus_ReplicaStatus_descriptor =
        internal_static_google_cloud_secretmanager_v1_ReplicationStatus_UserManagedStatus_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_secretmanager_v1_ReplicationStatus_UserManagedStatus_ReplicaStatus_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_secretmanager_v1_ReplicationStatus_UserManagedStatus_ReplicaStatus_descriptor,
            new java.lang.String[] {
              "Location", "CustomerManagedEncryption",
            });
    internal_static_google_cloud_secretmanager_v1_CustomerManagedEncryptionStatus_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_secretmanager_v1_CustomerManagedEncryptionStatus_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_secretmanager_v1_CustomerManagedEncryptionStatus_descriptor,
            new java.lang.String[] {
              "KmsKeyVersionName",
            });
    internal_static_google_cloud_secretmanager_v1_Topic_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_secretmanager_v1_Topic_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_secretmanager_v1_Topic_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_secretmanager_v1_Rotation_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_secretmanager_v1_Rotation_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_secretmanager_v1_Rotation_descriptor,
            new java.lang.String[] {
              "NextRotationTime", "RotationPeriod",
            });
    internal_static_google_cloud_secretmanager_v1_SecretPayload_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_secretmanager_v1_SecretPayload_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_secretmanager_v1_SecretPayload_descriptor,
            new java.lang.String[] {
              "Data", "DataCrc32C", "DataCrc32C",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
