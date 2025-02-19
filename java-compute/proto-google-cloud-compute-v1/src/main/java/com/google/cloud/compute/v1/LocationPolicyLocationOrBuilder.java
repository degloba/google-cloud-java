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

public interface LocationPolicyLocationOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.LocationPolicyLocation)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Preference for a given location.
   * Check the Preference enum for the list of possible values.
   * </pre>
   *
   * <code>optional string preference = 150781147;</code>
   *
   * @return Whether the preference field is set.
   */
  boolean hasPreference();
  /**
   *
   *
   * <pre>
   * Preference for a given location.
   * Check the Preference enum for the list of possible values.
   * </pre>
   *
   * <code>optional string preference = 150781147;</code>
   *
   * @return The preference.
   */
  java.lang.String getPreference();
  /**
   *
   *
   * <pre>
   * Preference for a given location.
   * Check the Preference enum for the list of possible values.
   * </pre>
   *
   * <code>optional string preference = 150781147;</code>
   *
   * @return The bytes for preference.
   */
  com.google.protobuf.ByteString getPreferenceBytes();
}
