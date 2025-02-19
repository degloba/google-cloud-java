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

public interface ListSnapshotSchedulePoliciesResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.baremetalsolution.v2.ListSnapshotSchedulePoliciesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The snapshot schedule policies registered in this project.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.baremetalsolution.v2.SnapshotSchedulePolicy snapshot_schedule_policies = 1;
   * </code>
   */
  java.util.List<com.google.cloud.baremetalsolution.v2.SnapshotSchedulePolicy>
      getSnapshotSchedulePoliciesList();
  /**
   *
   *
   * <pre>
   * The snapshot schedule policies registered in this project.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.baremetalsolution.v2.SnapshotSchedulePolicy snapshot_schedule_policies = 1;
   * </code>
   */
  com.google.cloud.baremetalsolution.v2.SnapshotSchedulePolicy getSnapshotSchedulePolicies(
      int index);
  /**
   *
   *
   * <pre>
   * The snapshot schedule policies registered in this project.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.baremetalsolution.v2.SnapshotSchedulePolicy snapshot_schedule_policies = 1;
   * </code>
   */
  int getSnapshotSchedulePoliciesCount();
  /**
   *
   *
   * <pre>
   * The snapshot schedule policies registered in this project.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.baremetalsolution.v2.SnapshotSchedulePolicy snapshot_schedule_policies = 1;
   * </code>
   */
  java.util.List<? extends com.google.cloud.baremetalsolution.v2.SnapshotSchedulePolicyOrBuilder>
      getSnapshotSchedulePoliciesOrBuilderList();
  /**
   *
   *
   * <pre>
   * The snapshot schedule policies registered in this project.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.baremetalsolution.v2.SnapshotSchedulePolicy snapshot_schedule_policies = 1;
   * </code>
   */
  com.google.cloud.baremetalsolution.v2.SnapshotSchedulePolicyOrBuilder
      getSnapshotSchedulePoliciesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Token to retrieve the next page of results, or empty if there are no more
   * results in the list.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   *
   *
   * <pre>
   * Token to retrieve the next page of results, or empty if there are no more
   * results in the list.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();
}
