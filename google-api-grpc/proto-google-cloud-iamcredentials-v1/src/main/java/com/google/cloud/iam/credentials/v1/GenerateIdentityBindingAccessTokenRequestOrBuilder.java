// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/iam/credentials/v1/common.proto

package com.google.cloud.iam.credentials.v1;

public interface GenerateIdentityBindingAccessTokenRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.iam.credentials.v1.GenerateIdentityBindingAccessTokenRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The resource name of the service account for which the credentials
   * are requested, in the following format:
   * `projects/-/serviceAccounts/{ACCOUNT_EMAIL_OR_UNIQUEID}`.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * The resource name of the service account for which the credentials
   * are requested, in the following format:
   * `projects/-/serviceAccounts/{ACCOUNT_EMAIL_OR_UNIQUEID}`.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Code to identify the scopes to be included in the OAuth 2.0 access token.
   * See https://developers.google.com/identity/protocols/googlescopes for more
   * information.
   * At least one value required.
   * </pre>
   *
   * <code>repeated string scope = 2;</code>
   */
  java.util.List<java.lang.String> getScopeList();
  /**
   *
   *
   * <pre>
   * Code to identify the scopes to be included in the OAuth 2.0 access token.
   * See https://developers.google.com/identity/protocols/googlescopes for more
   * information.
   * At least one value required.
   * </pre>
   *
   * <code>repeated string scope = 2;</code>
   */
  int getScopeCount();
  /**
   *
   *
   * <pre>
   * Code to identify the scopes to be included in the OAuth 2.0 access token.
   * See https://developers.google.com/identity/protocols/googlescopes for more
   * information.
   * At least one value required.
   * </pre>
   *
   * <code>repeated string scope = 2;</code>
   */
  java.lang.String getScope(int index);
  /**
   *
   *
   * <pre>
   * Code to identify the scopes to be included in the OAuth 2.0 access token.
   * See https://developers.google.com/identity/protocols/googlescopes for more
   * information.
   * At least one value required.
   * </pre>
   *
   * <code>repeated string scope = 2;</code>
   */
  com.google.protobuf.ByteString getScopeBytes(int index);

  /**
   *
   *
   * <pre>
   * Required. Input token.
   * Must be in JWT format according to
   * RFC7523 (https://tools.ietf.org/html/rfc7523)
   * and must have 'kid' field in the header.
   * Supported signing algorithms: RS256 (RS512, ES256, ES512 coming soon).
   * Mandatory payload fields (along the lines of RFC 7523, section 3):
   * - iss: issuer of the token. Must provide a discovery document at
   *        $iss/.well-known/openid-configuration . The document needs to be
   *        formatted according to section 4.2 of the OpenID Connect Discovery
   *        1.0 specification.
   * - iat: Issue time in seconds since epoch. Must be in the past.
   * - exp: Expiration time in seconds since epoch. Must be less than 48 hours
   *        after iat. We recommend to create tokens that last shorter than 6
   *        hours to improve security unless business reasons mandate longer
   *        expiration times. Shorter token lifetimes are generally more secure
   *        since tokens that have been exfiltrated by attackers can be used for
   *        a shorter time. you can configure the maximum lifetime of the
   *        incoming token in the configuration of the mapper.
   *        The resulting Google token will expire within an hour or at "exp",
   *        whichever is earlier.
   * - sub: JWT subject, identity asserted in the JWT.
   * - aud: Configured in the mapper policy. By default the service account
   *        email.
   * Claims from the incoming token can be transferred into the output token
   * accoding to the mapper configuration. The outgoing claim size is limited.
   * Outgoing claims size must be less than 4kB serialized as JSON without
   * whitespace.
   * Example header:
   * {
   *   "alg": "RS256",
   *   "kid": "92a4265e14ab04d4d228a48d10d4ca31610936f8"
   * }
   * Example payload:
   * {
   *   "iss": "https://accounts.google.com",
   *   "iat": 1517963104,
   *   "exp": 1517966704,
   *   "aud": "https://iamcredentials.googleapis.com/",
   *   "sub": "113475438248934895348",
   *   "my_claims": {
   *     "additional_claim": "value"
   *   }
   * }
   * </pre>
   *
   * <code>string jwt = 3;</code>
   */
  java.lang.String getJwt();
  /**
   *
   *
   * <pre>
   * Required. Input token.
   * Must be in JWT format according to
   * RFC7523 (https://tools.ietf.org/html/rfc7523)
   * and must have 'kid' field in the header.
   * Supported signing algorithms: RS256 (RS512, ES256, ES512 coming soon).
   * Mandatory payload fields (along the lines of RFC 7523, section 3):
   * - iss: issuer of the token. Must provide a discovery document at
   *        $iss/.well-known/openid-configuration . The document needs to be
   *        formatted according to section 4.2 of the OpenID Connect Discovery
   *        1.0 specification.
   * - iat: Issue time in seconds since epoch. Must be in the past.
   * - exp: Expiration time in seconds since epoch. Must be less than 48 hours
   *        after iat. We recommend to create tokens that last shorter than 6
   *        hours to improve security unless business reasons mandate longer
   *        expiration times. Shorter token lifetimes are generally more secure
   *        since tokens that have been exfiltrated by attackers can be used for
   *        a shorter time. you can configure the maximum lifetime of the
   *        incoming token in the configuration of the mapper.
   *        The resulting Google token will expire within an hour or at "exp",
   *        whichever is earlier.
   * - sub: JWT subject, identity asserted in the JWT.
   * - aud: Configured in the mapper policy. By default the service account
   *        email.
   * Claims from the incoming token can be transferred into the output token
   * accoding to the mapper configuration. The outgoing claim size is limited.
   * Outgoing claims size must be less than 4kB serialized as JSON without
   * whitespace.
   * Example header:
   * {
   *   "alg": "RS256",
   *   "kid": "92a4265e14ab04d4d228a48d10d4ca31610936f8"
   * }
   * Example payload:
   * {
   *   "iss": "https://accounts.google.com",
   *   "iat": 1517963104,
   *   "exp": 1517966704,
   *   "aud": "https://iamcredentials.googleapis.com/",
   *   "sub": "113475438248934895348",
   *   "my_claims": {
   *     "additional_claim": "value"
   *   }
   * }
   * </pre>
   *
   * <code>string jwt = 3;</code>
   */
  com.google.protobuf.ByteString getJwtBytes();
}
