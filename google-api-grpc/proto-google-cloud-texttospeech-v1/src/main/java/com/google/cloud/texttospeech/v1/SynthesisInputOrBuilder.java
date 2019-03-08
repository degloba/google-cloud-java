// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/texttospeech/v1/cloud_tts.proto

package com.google.cloud.texttospeech.v1;

public interface SynthesisInputOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.texttospeech.v1.SynthesisInput)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The raw text to be synthesized.
   * </pre>
   *
   * <code>string text = 1;</code>
   */
  java.lang.String getText();
  /**
   *
   *
   * <pre>
   * The raw text to be synthesized.
   * </pre>
   *
   * <code>string text = 1;</code>
   */
  com.google.protobuf.ByteString getTextBytes();

  /**
   *
   *
   * <pre>
   * The SSML document to be synthesized. The SSML document must be valid
   * and well-formed. Otherwise the RPC will fail and return
   * [google.rpc.Code.INVALID_ARGUMENT][]. For more information, see
   * [SSML](/speech/text-to-speech/docs/ssml).
   * </pre>
   *
   * <code>string ssml = 2;</code>
   */
  java.lang.String getSsml();
  /**
   *
   *
   * <pre>
   * The SSML document to be synthesized. The SSML document must be valid
   * and well-formed. Otherwise the RPC will fail and return
   * [google.rpc.Code.INVALID_ARGUMENT][]. For more information, see
   * [SSML](/speech/text-to-speech/docs/ssml).
   * </pre>
   *
   * <code>string ssml = 2;</code>
   */
  com.google.protobuf.ByteString getSsmlBytes();

  public com.google.cloud.texttospeech.v1.SynthesisInput.InputSourceCase getInputSourceCase();
}
