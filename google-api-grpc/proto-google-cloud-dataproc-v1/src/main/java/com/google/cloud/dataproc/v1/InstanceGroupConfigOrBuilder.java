// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dataproc/v1/clusters.proto

package com.google.cloud.dataproc.v1;

public interface InstanceGroupConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataproc.v1.InstanceGroupConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. The number of VM instances in the instance group.
   * For master instance groups, must be set to 1.
   * </pre>
   *
   * <code>int32 num_instances = 1;</code>
   */
  int getNumInstances();

  /**
   *
   *
   * <pre>
   * Output only. The list of instance names. Cloud Dataproc derives the names
   * from `cluster_name`, `num_instances`, and the instance group.
   * </pre>
   *
   * <code>repeated string instance_names = 2;</code>
   */
  java.util.List<java.lang.String> getInstanceNamesList();
  /**
   *
   *
   * <pre>
   * Output only. The list of instance names. Cloud Dataproc derives the names
   * from `cluster_name`, `num_instances`, and the instance group.
   * </pre>
   *
   * <code>repeated string instance_names = 2;</code>
   */
  int getInstanceNamesCount();
  /**
   *
   *
   * <pre>
   * Output only. The list of instance names. Cloud Dataproc derives the names
   * from `cluster_name`, `num_instances`, and the instance group.
   * </pre>
   *
   * <code>repeated string instance_names = 2;</code>
   */
  java.lang.String getInstanceNames(int index);
  /**
   *
   *
   * <pre>
   * Output only. The list of instance names. Cloud Dataproc derives the names
   * from `cluster_name`, `num_instances`, and the instance group.
   * </pre>
   *
   * <code>repeated string instance_names = 2;</code>
   */
  com.google.protobuf.ByteString getInstanceNamesBytes(int index);

  /**
   *
   *
   * <pre>
   * Optional. The Compute Engine image resource used for cluster
   * instances. It can be specified or may be inferred from
   * `SoftwareConfig.image_version`.
   * </pre>
   *
   * <code>string image_uri = 3;</code>
   */
  java.lang.String getImageUri();
  /**
   *
   *
   * <pre>
   * Optional. The Compute Engine image resource used for cluster
   * instances. It can be specified or may be inferred from
   * `SoftwareConfig.image_version`.
   * </pre>
   *
   * <code>string image_uri = 3;</code>
   */
  com.google.protobuf.ByteString getImageUriBytes();

  /**
   *
   *
   * <pre>
   * Optional. The Compute Engine machine type used for cluster instances.
   * A full URL, partial URI, or short name are valid. Examples:
   * * `https://www.googleapis.com/compute/v1/projects/[project_id]/zones/us-east1-a/machineTypes/n1-standard-2`
   * * `projects/[project_id]/zones/us-east1-a/machineTypes/n1-standard-2`
   * * `n1-standard-2`
   * **Auto Zone Exception**: If you are using the Cloud Dataproc
   * [Auto Zone
   * Placement](/dataproc/docs/concepts/configuring-clusters/auto-zone#using_auto_zone_placement)
   * feature, you must use the short name of the machine type
   * resource, for example, `n1-standard-2`.
   * </pre>
   *
   * <code>string machine_type_uri = 4;</code>
   */
  java.lang.String getMachineTypeUri();
  /**
   *
   *
   * <pre>
   * Optional. The Compute Engine machine type used for cluster instances.
   * A full URL, partial URI, or short name are valid. Examples:
   * * `https://www.googleapis.com/compute/v1/projects/[project_id]/zones/us-east1-a/machineTypes/n1-standard-2`
   * * `projects/[project_id]/zones/us-east1-a/machineTypes/n1-standard-2`
   * * `n1-standard-2`
   * **Auto Zone Exception**: If you are using the Cloud Dataproc
   * [Auto Zone
   * Placement](/dataproc/docs/concepts/configuring-clusters/auto-zone#using_auto_zone_placement)
   * feature, you must use the short name of the machine type
   * resource, for example, `n1-standard-2`.
   * </pre>
   *
   * <code>string machine_type_uri = 4;</code>
   */
  com.google.protobuf.ByteString getMachineTypeUriBytes();

  /**
   *
   *
   * <pre>
   * Optional. Disk option config settings.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1.DiskConfig disk_config = 5;</code>
   */
  boolean hasDiskConfig();
  /**
   *
   *
   * <pre>
   * Optional. Disk option config settings.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1.DiskConfig disk_config = 5;</code>
   */
  com.google.cloud.dataproc.v1.DiskConfig getDiskConfig();
  /**
   *
   *
   * <pre>
   * Optional. Disk option config settings.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1.DiskConfig disk_config = 5;</code>
   */
  com.google.cloud.dataproc.v1.DiskConfigOrBuilder getDiskConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Specifies that this instance group contains preemptible
   * instances.
   * </pre>
   *
   * <code>bool is_preemptible = 6;</code>
   */
  boolean getIsPreemptible();

  /**
   *
   *
   * <pre>
   * Output only. The config for Compute Engine Instance Group
   * Manager that manages this group.
   * This is only used for preemptible instance groups.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1.ManagedGroupConfig managed_group_config = 7;</code>
   */
  boolean hasManagedGroupConfig();
  /**
   *
   *
   * <pre>
   * Output only. The config for Compute Engine Instance Group
   * Manager that manages this group.
   * This is only used for preemptible instance groups.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1.ManagedGroupConfig managed_group_config = 7;</code>
   */
  com.google.cloud.dataproc.v1.ManagedGroupConfig getManagedGroupConfig();
  /**
   *
   *
   * <pre>
   * Output only. The config for Compute Engine Instance Group
   * Manager that manages this group.
   * This is only used for preemptible instance groups.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1.ManagedGroupConfig managed_group_config = 7;</code>
   */
  com.google.cloud.dataproc.v1.ManagedGroupConfigOrBuilder getManagedGroupConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. The Compute Engine accelerator configuration for these
   * instances.
   * **Beta Feature**: This feature is still under development. It may be
   * changed before final release.
   * </pre>
   *
   * <code>repeated .google.cloud.dataproc.v1.AcceleratorConfig accelerators = 8;</code>
   */
  java.util.List<com.google.cloud.dataproc.v1.AcceleratorConfig> getAcceleratorsList();
  /**
   *
   *
   * <pre>
   * Optional. The Compute Engine accelerator configuration for these
   * instances.
   * **Beta Feature**: This feature is still under development. It may be
   * changed before final release.
   * </pre>
   *
   * <code>repeated .google.cloud.dataproc.v1.AcceleratorConfig accelerators = 8;</code>
   */
  com.google.cloud.dataproc.v1.AcceleratorConfig getAccelerators(int index);
  /**
   *
   *
   * <pre>
   * Optional. The Compute Engine accelerator configuration for these
   * instances.
   * **Beta Feature**: This feature is still under development. It may be
   * changed before final release.
   * </pre>
   *
   * <code>repeated .google.cloud.dataproc.v1.AcceleratorConfig accelerators = 8;</code>
   */
  int getAcceleratorsCount();
  /**
   *
   *
   * <pre>
   * Optional. The Compute Engine accelerator configuration for these
   * instances.
   * **Beta Feature**: This feature is still under development. It may be
   * changed before final release.
   * </pre>
   *
   * <code>repeated .google.cloud.dataproc.v1.AcceleratorConfig accelerators = 8;</code>
   */
  java.util.List<? extends com.google.cloud.dataproc.v1.AcceleratorConfigOrBuilder>
      getAcceleratorsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Optional. The Compute Engine accelerator configuration for these
   * instances.
   * **Beta Feature**: This feature is still under development. It may be
   * changed before final release.
   * </pre>
   *
   * <code>repeated .google.cloud.dataproc.v1.AcceleratorConfig accelerators = 8;</code>
   */
  com.google.cloud.dataproc.v1.AcceleratorConfigOrBuilder getAcceleratorsOrBuilder(int index);
}
