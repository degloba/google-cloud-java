// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/firestore/v1/firestore.proto

package com.google.firestore.v1;

public interface ListDocumentsRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.firestore.v1.ListDocumentsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The parent resource name. In the format:
   * `projects/{project_id}/databases/{database_id}/documents` or
   * `projects/{project_id}/databases/{database_id}/documents/{document_path}`.
   * For example:
   * `projects/my-project/databases/my-database/documents` or
   * `projects/my-project/databases/my-database/documents/chatrooms/my-chatroom`
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * The parent resource name. In the format:
   * `projects/{project_id}/databases/{database_id}/documents` or
   * `projects/{project_id}/databases/{database_id}/documents/{document_path}`.
   * For example:
   * `projects/my-project/databases/my-database/documents` or
   * `projects/my-project/databases/my-database/documents/chatrooms/my-chatroom`
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * The collection ID, relative to `parent`, to list. For example: `chatrooms`
   * or `messages`.
   * </pre>
   *
   * <code>string collection_id = 2;</code>
   */
  java.lang.String getCollectionId();
  /**
   *
   *
   * <pre>
   * The collection ID, relative to `parent`, to list. For example: `chatrooms`
   * or `messages`.
   * </pre>
   *
   * <code>string collection_id = 2;</code>
   */
  com.google.protobuf.ByteString getCollectionIdBytes();

  /**
   *
   *
   * <pre>
   * The maximum number of documents to return.
   * </pre>
   *
   * <code>int32 page_size = 3;</code>
   */
  int getPageSize();

  /**
   *
   *
   * <pre>
   * The `next_page_token` value returned from a previous List request, if any.
   * </pre>
   *
   * <code>string page_token = 4;</code>
   */
  java.lang.String getPageToken();
  /**
   *
   *
   * <pre>
   * The `next_page_token` value returned from a previous List request, if any.
   * </pre>
   *
   * <code>string page_token = 4;</code>
   */
  com.google.protobuf.ByteString getPageTokenBytes();

  /**
   *
   *
   * <pre>
   * The order to sort results by. For example: `priority desc, name`.
   * </pre>
   *
   * <code>string order_by = 6;</code>
   */
  java.lang.String getOrderBy();
  /**
   *
   *
   * <pre>
   * The order to sort results by. For example: `priority desc, name`.
   * </pre>
   *
   * <code>string order_by = 6;</code>
   */
  com.google.protobuf.ByteString getOrderByBytes();

  /**
   *
   *
   * <pre>
   * The fields to return. If not set, returns all fields.
   * If a document has a field that is not present in this mask, that field
   * will not be returned in the response.
   * </pre>
   *
   * <code>.google.firestore.v1.DocumentMask mask = 7;</code>
   */
  boolean hasMask();
  /**
   *
   *
   * <pre>
   * The fields to return. If not set, returns all fields.
   * If a document has a field that is not present in this mask, that field
   * will not be returned in the response.
   * </pre>
   *
   * <code>.google.firestore.v1.DocumentMask mask = 7;</code>
   */
  com.google.firestore.v1.DocumentMask getMask();
  /**
   *
   *
   * <pre>
   * The fields to return. If not set, returns all fields.
   * If a document has a field that is not present in this mask, that field
   * will not be returned in the response.
   * </pre>
   *
   * <code>.google.firestore.v1.DocumentMask mask = 7;</code>
   */
  com.google.firestore.v1.DocumentMaskOrBuilder getMaskOrBuilder();

  /**
   *
   *
   * <pre>
   * Reads documents in a transaction.
   * </pre>
   *
   * <code>bytes transaction = 8;</code>
   */
  com.google.protobuf.ByteString getTransaction();

  /**
   *
   *
   * <pre>
   * Reads documents as they were at the given time.
   * This may not be older than 60 seconds.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp read_time = 10;</code>
   */
  boolean hasReadTime();
  /**
   *
   *
   * <pre>
   * Reads documents as they were at the given time.
   * This may not be older than 60 seconds.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp read_time = 10;</code>
   */
  com.google.protobuf.Timestamp getReadTime();
  /**
   *
   *
   * <pre>
   * Reads documents as they were at the given time.
   * This may not be older than 60 seconds.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp read_time = 10;</code>
   */
  com.google.protobuf.TimestampOrBuilder getReadTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * If the list should show missing documents. A missing document is a
   * document that does not exist but has sub-documents. These documents will
   * be returned with a key but will not have fields,
   * [Document.create_time][google.firestore.v1.Document.create_time], or
   * [Document.update_time][google.firestore.v1.Document.update_time] set.
   * Requests with `show_missing` may not specify `where` or
   * `order_by`.
   * </pre>
   *
   * <code>bool show_missing = 12;</code>
   */
  boolean getShowMissing();

  public com.google.firestore.v1.ListDocumentsRequest.ConsistencySelectorCase
      getConsistencySelectorCase();
}
