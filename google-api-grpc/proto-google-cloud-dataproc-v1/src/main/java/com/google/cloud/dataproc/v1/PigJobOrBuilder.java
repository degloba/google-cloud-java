// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dataproc/v1/jobs.proto

package com.google.cloud.dataproc.v1;

public interface PigJobOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataproc.v1.PigJob)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The HCFS URI of the script that contains the Pig queries.
   * </pre>
   *
   * <code>string query_file_uri = 1;</code>
   */
  java.lang.String getQueryFileUri();
  /**
   *
   *
   * <pre>
   * The HCFS URI of the script that contains the Pig queries.
   * </pre>
   *
   * <code>string query_file_uri = 1;</code>
   */
  com.google.protobuf.ByteString getQueryFileUriBytes();

  /**
   *
   *
   * <pre>
   * A list of queries.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1.QueryList query_list = 2;</code>
   */
  boolean hasQueryList();
  /**
   *
   *
   * <pre>
   * A list of queries.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1.QueryList query_list = 2;</code>
   */
  com.google.cloud.dataproc.v1.QueryList getQueryList();
  /**
   *
   *
   * <pre>
   * A list of queries.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1.QueryList query_list = 2;</code>
   */
  com.google.cloud.dataproc.v1.QueryListOrBuilder getQueryListOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Whether to continue executing queries if a query fails.
   * The default value is `false`. Setting to `true` can be useful when
   * executing independent parallel queries.
   * </pre>
   *
   * <code>bool continue_on_failure = 3;</code>
   */
  boolean getContinueOnFailure();

  /**
   *
   *
   * <pre>
   * Optional. Mapping of query variable names to values (equivalent to the Pig
   * command: `name=[value]`).
   * </pre>
   *
   * <code>map&lt;string, string&gt; script_variables = 4;</code>
   */
  int getScriptVariablesCount();
  /**
   *
   *
   * <pre>
   * Optional. Mapping of query variable names to values (equivalent to the Pig
   * command: `name=[value]`).
   * </pre>
   *
   * <code>map&lt;string, string&gt; script_variables = 4;</code>
   */
  boolean containsScriptVariables(java.lang.String key);
  /** Use {@link #getScriptVariablesMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getScriptVariables();
  /**
   *
   *
   * <pre>
   * Optional. Mapping of query variable names to values (equivalent to the Pig
   * command: `name=[value]`).
   * </pre>
   *
   * <code>map&lt;string, string&gt; script_variables = 4;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getScriptVariablesMap();
  /**
   *
   *
   * <pre>
   * Optional. Mapping of query variable names to values (equivalent to the Pig
   * command: `name=[value]`).
   * </pre>
   *
   * <code>map&lt;string, string&gt; script_variables = 4;</code>
   */
  java.lang.String getScriptVariablesOrDefault(java.lang.String key, java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Optional. Mapping of query variable names to values (equivalent to the Pig
   * command: `name=[value]`).
   * </pre>
   *
   * <code>map&lt;string, string&gt; script_variables = 4;</code>
   */
  java.lang.String getScriptVariablesOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Optional. A mapping of property names to values, used to configure Pig.
   * Properties that conflict with values set by the Cloud Dataproc API may be
   * overwritten. Can include properties set in /etc/hadoop/conf/&#42;-site.xml,
   * /etc/pig/conf/pig.properties, and classes in user code.
   * </pre>
   *
   * <code>map&lt;string, string&gt; properties = 5;</code>
   */
  int getPropertiesCount();
  /**
   *
   *
   * <pre>
   * Optional. A mapping of property names to values, used to configure Pig.
   * Properties that conflict with values set by the Cloud Dataproc API may be
   * overwritten. Can include properties set in /etc/hadoop/conf/&#42;-site.xml,
   * /etc/pig/conf/pig.properties, and classes in user code.
   * </pre>
   *
   * <code>map&lt;string, string&gt; properties = 5;</code>
   */
  boolean containsProperties(java.lang.String key);
  /** Use {@link #getPropertiesMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getProperties();
  /**
   *
   *
   * <pre>
   * Optional. A mapping of property names to values, used to configure Pig.
   * Properties that conflict with values set by the Cloud Dataproc API may be
   * overwritten. Can include properties set in /etc/hadoop/conf/&#42;-site.xml,
   * /etc/pig/conf/pig.properties, and classes in user code.
   * </pre>
   *
   * <code>map&lt;string, string&gt; properties = 5;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getPropertiesMap();
  /**
   *
   *
   * <pre>
   * Optional. A mapping of property names to values, used to configure Pig.
   * Properties that conflict with values set by the Cloud Dataproc API may be
   * overwritten. Can include properties set in /etc/hadoop/conf/&#42;-site.xml,
   * /etc/pig/conf/pig.properties, and classes in user code.
   * </pre>
   *
   * <code>map&lt;string, string&gt; properties = 5;</code>
   */
  java.lang.String getPropertiesOrDefault(java.lang.String key, java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Optional. A mapping of property names to values, used to configure Pig.
   * Properties that conflict with values set by the Cloud Dataproc API may be
   * overwritten. Can include properties set in /etc/hadoop/conf/&#42;-site.xml,
   * /etc/pig/conf/pig.properties, and classes in user code.
   * </pre>
   *
   * <code>map&lt;string, string&gt; properties = 5;</code>
   */
  java.lang.String getPropertiesOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Optional. HCFS URIs of jar files to add to the CLASSPATH of
   * the Pig Client and Hadoop MapReduce (MR) tasks. Can contain Pig UDFs.
   * </pre>
   *
   * <code>repeated string jar_file_uris = 6;</code>
   */
  java.util.List<java.lang.String> getJarFileUrisList();
  /**
   *
   *
   * <pre>
   * Optional. HCFS URIs of jar files to add to the CLASSPATH of
   * the Pig Client and Hadoop MapReduce (MR) tasks. Can contain Pig UDFs.
   * </pre>
   *
   * <code>repeated string jar_file_uris = 6;</code>
   */
  int getJarFileUrisCount();
  /**
   *
   *
   * <pre>
   * Optional. HCFS URIs of jar files to add to the CLASSPATH of
   * the Pig Client and Hadoop MapReduce (MR) tasks. Can contain Pig UDFs.
   * </pre>
   *
   * <code>repeated string jar_file_uris = 6;</code>
   */
  java.lang.String getJarFileUris(int index);
  /**
   *
   *
   * <pre>
   * Optional. HCFS URIs of jar files to add to the CLASSPATH of
   * the Pig Client and Hadoop MapReduce (MR) tasks. Can contain Pig UDFs.
   * </pre>
   *
   * <code>repeated string jar_file_uris = 6;</code>
   */
  com.google.protobuf.ByteString getJarFileUrisBytes(int index);

  /**
   *
   *
   * <pre>
   * Optional. The runtime log config for job execution.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1.LoggingConfig logging_config = 7;</code>
   */
  boolean hasLoggingConfig();
  /**
   *
   *
   * <pre>
   * Optional. The runtime log config for job execution.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1.LoggingConfig logging_config = 7;</code>
   */
  com.google.cloud.dataproc.v1.LoggingConfig getLoggingConfig();
  /**
   *
   *
   * <pre>
   * Optional. The runtime log config for job execution.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1.LoggingConfig logging_config = 7;</code>
   */
  com.google.cloud.dataproc.v1.LoggingConfigOrBuilder getLoggingConfigOrBuilder();

  public com.google.cloud.dataproc.v1.PigJob.QueriesCase getQueriesCase();
}
