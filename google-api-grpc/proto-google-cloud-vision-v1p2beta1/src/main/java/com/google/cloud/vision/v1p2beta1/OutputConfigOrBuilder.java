// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/vision/v1p2beta1/image_annotator.proto

package com.google.cloud.vision.v1p2beta1;

public interface OutputConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.vision.v1p2beta1.OutputConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The Google Cloud Storage location to write the output(s) to.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p2beta1.GcsDestination gcs_destination = 1;</code>
   */
  boolean hasGcsDestination();
  /**
   *
   *
   * <pre>
   * The Google Cloud Storage location to write the output(s) to.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p2beta1.GcsDestination gcs_destination = 1;</code>
   */
  com.google.cloud.vision.v1p2beta1.GcsDestination getGcsDestination();
  /**
   *
   *
   * <pre>
   * The Google Cloud Storage location to write the output(s) to.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p2beta1.GcsDestination gcs_destination = 1;</code>
   */
  com.google.cloud.vision.v1p2beta1.GcsDestinationOrBuilder getGcsDestinationOrBuilder();

  /**
   *
   *
   * <pre>
   * The max number of response protos to put into each output JSON file on GCS.
   * The valid range is [1, 100]. If not specified, the default value is 20.
   * For example, for one pdf file with 100 pages, 100 response protos will
   * be generated. If `batch_size` = 20, then 5 json files each
   * containing 20 response protos will be written under the prefix
   * `gcs_destination`.`uri`.
   * Currently, batch_size only applies to GcsDestination, with potential future
   * support for other output configurations.
   * </pre>
   *
   * <code>int32 batch_size = 2;</code>
   */
  int getBatchSize();
}
