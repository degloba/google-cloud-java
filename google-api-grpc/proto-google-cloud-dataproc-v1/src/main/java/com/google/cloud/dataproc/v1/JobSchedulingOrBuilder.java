// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dataproc/v1/jobs.proto

package com.google.cloud.dataproc.v1;

public interface JobSchedulingOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataproc.v1.JobScheduling)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. Maximum number of times per hour a driver may be restarted as
   * a result of driver terminating with non-zero code before job is
   * reported failed.
   * A job may be reported as thrashing if driver exits with non-zero code
   * 4 times within 10 minute window.
   * Maximum value is 10.
   * </pre>
   *
   * <code>int32 max_failures_per_hour = 1;</code>
   */
  int getMaxFailuresPerHour();
}
