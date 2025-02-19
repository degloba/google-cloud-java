/*
 * Copyright 2022 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.optimization.v1.stub;

import com.google.api.core.ApiFunction;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.GaxProperties;
import com.google.api.gax.core.GoogleCredentialsProvider;
import com.google.api.gax.core.InstantiatingExecutorProvider;
import com.google.api.gax.grpc.GaxGrpcProperties;
import com.google.api.gax.grpc.GrpcTransportChannel;
import com.google.api.gax.grpc.InstantiatingGrpcChannelProvider;
import com.google.api.gax.grpc.ProtoOperationTransformers;
import com.google.api.gax.longrunning.OperationSnapshot;
import com.google.api.gax.longrunning.OperationTimedPollAlgorithm;
import com.google.api.gax.retrying.RetrySettings;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.OperationCallSettings;
import com.google.api.gax.rpc.StatusCode;
import com.google.api.gax.rpc.StubSettings;
import com.google.api.gax.rpc.TransportChannelProvider;
import com.google.api.gax.rpc.UnaryCallSettings;
import com.google.cloud.optimization.v1.AsyncModelMetadata;
import com.google.cloud.optimization.v1.BatchOptimizeToursRequest;
import com.google.cloud.optimization.v1.BatchOptimizeToursResponse;
import com.google.cloud.optimization.v1.OptimizeToursRequest;
import com.google.cloud.optimization.v1.OptimizeToursResponse;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.longrunning.Operation;
import java.io.IOException;
import java.util.List;
import javax.annotation.Generated;
import org.threeten.bp.Duration;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Settings class to configure an instance of {@link FleetRoutingStub}.
 *
 * <p>The default instance has everything set to sensible defaults:
 *
 * <ul>
 *   <li>The default service address (cloudoptimization.googleapis.com) and default port (443) are
 *       used.
 *   <li>Credentials are acquired automatically through Application Default Credentials.
 *   <li>Retries are configured for idempotent methods but not for non-idempotent methods.
 * </ul>
 *
 * <p>The builder of this class is recursive, so contained classes are themselves builders. When
 * build() is called, the tree of builders is called to create the complete settings object.
 *
 * <p>For example, to set the total timeout of optimizeTours to 30 seconds:
 *
 * <pre>{@code
 * // This snippet has been automatically generated for illustrative purposes only.
 * // It may require modifications to work in your environment.
 * FleetRoutingStubSettings.Builder fleetRoutingSettingsBuilder =
 *     FleetRoutingStubSettings.newBuilder();
 * fleetRoutingSettingsBuilder
 *     .optimizeToursSettings()
 *     .setRetrySettings(
 *         fleetRoutingSettingsBuilder
 *             .optimizeToursSettings()
 *             .getRetrySettings()
 *             .toBuilder()
 *             .setTotalTimeout(Duration.ofSeconds(30))
 *             .build());
 * FleetRoutingStubSettings fleetRoutingSettings = fleetRoutingSettingsBuilder.build();
 * }</pre>
 */
@Generated("by gapic-generator-java")
public class FleetRoutingStubSettings extends StubSettings<FleetRoutingStubSettings> {
  /** The default scopes of the service. */
  private static final ImmutableList<String> DEFAULT_SERVICE_SCOPES =
      ImmutableList.<String>builder().add("https://www.googleapis.com/auth/cloud-platform").build();

  private final UnaryCallSettings<OptimizeToursRequest, OptimizeToursResponse>
      optimizeToursSettings;
  private final UnaryCallSettings<BatchOptimizeToursRequest, Operation> batchOptimizeToursSettings;
  private final OperationCallSettings<
          BatchOptimizeToursRequest, BatchOptimizeToursResponse, AsyncModelMetadata>
      batchOptimizeToursOperationSettings;

  /** Returns the object with the settings used for calls to optimizeTours. */
  public UnaryCallSettings<OptimizeToursRequest, OptimizeToursResponse> optimizeToursSettings() {
    return optimizeToursSettings;
  }

  /** Returns the object with the settings used for calls to batchOptimizeTours. */
  public UnaryCallSettings<BatchOptimizeToursRequest, Operation> batchOptimizeToursSettings() {
    return batchOptimizeToursSettings;
  }

  /** Returns the object with the settings used for calls to batchOptimizeTours. */
  public OperationCallSettings<
          BatchOptimizeToursRequest, BatchOptimizeToursResponse, AsyncModelMetadata>
      batchOptimizeToursOperationSettings() {
    return batchOptimizeToursOperationSettings;
  }

  public FleetRoutingStub createStub() throws IOException {
    if (getTransportChannelProvider()
        .getTransportName()
        .equals(GrpcTransportChannel.getGrpcTransportName())) {
      return GrpcFleetRoutingStub.create(this);
    }
    throw new UnsupportedOperationException(
        String.format(
            "Transport not supported: %s", getTransportChannelProvider().getTransportName()));
  }

  /** Returns a builder for the default ExecutorProvider for this service. */
  public static InstantiatingExecutorProvider.Builder defaultExecutorProviderBuilder() {
    return InstantiatingExecutorProvider.newBuilder();
  }

  /** Returns the default service endpoint. */
  public static String getDefaultEndpoint() {
    return "cloudoptimization.googleapis.com:443";
  }

  /** Returns the default mTLS service endpoint. */
  public static String getDefaultMtlsEndpoint() {
    return "cloudoptimization.mtls.googleapis.com:443";
  }

  /** Returns the default service scopes. */
  public static List<String> getDefaultServiceScopes() {
    return DEFAULT_SERVICE_SCOPES;
  }

  /** Returns a builder for the default credentials for this service. */
  public static GoogleCredentialsProvider.Builder defaultCredentialsProviderBuilder() {
    return GoogleCredentialsProvider.newBuilder()
        .setScopesToApply(DEFAULT_SERVICE_SCOPES)
        .setUseJwtAccessWithScope(true);
  }

  /** Returns a builder for the default ChannelProvider for this service. */
  public static InstantiatingGrpcChannelProvider.Builder defaultGrpcTransportProviderBuilder() {
    return InstantiatingGrpcChannelProvider.newBuilder()
        .setMaxInboundMessageSize(Integer.MAX_VALUE);
  }

  public static TransportChannelProvider defaultTransportChannelProvider() {
    return defaultGrpcTransportProviderBuilder().build();
  }

  @BetaApi("The surface for customizing headers is not stable yet and may change in the future.")
  public static ApiClientHeaderProvider.Builder defaultApiClientHeaderProviderBuilder() {
    return ApiClientHeaderProvider.newBuilder()
        .setGeneratedLibToken(
            "gapic", GaxProperties.getLibraryVersion(FleetRoutingStubSettings.class))
        .setTransportToken(
            GaxGrpcProperties.getGrpcTokenName(), GaxGrpcProperties.getGrpcVersion());
  }

  /** Returns a new builder for this class. */
  public static Builder newBuilder() {
    return Builder.createDefault();
  }

  /** Returns a new builder for this class. */
  public static Builder newBuilder(ClientContext clientContext) {
    return new Builder(clientContext);
  }

  /** Returns a builder containing all the values of this settings class. */
  public Builder toBuilder() {
    return new Builder(this);
  }

  protected FleetRoutingStubSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);

    optimizeToursSettings = settingsBuilder.optimizeToursSettings().build();
    batchOptimizeToursSettings = settingsBuilder.batchOptimizeToursSettings().build();
    batchOptimizeToursOperationSettings =
        settingsBuilder.batchOptimizeToursOperationSettings().build();
  }

  /** Builder for FleetRoutingStubSettings. */
  public static class Builder extends StubSettings.Builder<FleetRoutingStubSettings, Builder> {
    private final ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders;
    private final UnaryCallSettings.Builder<OptimizeToursRequest, OptimizeToursResponse>
        optimizeToursSettings;
    private final UnaryCallSettings.Builder<BatchOptimizeToursRequest, Operation>
        batchOptimizeToursSettings;
    private final OperationCallSettings.Builder<
            BatchOptimizeToursRequest, BatchOptimizeToursResponse, AsyncModelMetadata>
        batchOptimizeToursOperationSettings;
    private static final ImmutableMap<String, ImmutableSet<StatusCode.Code>>
        RETRYABLE_CODE_DEFINITIONS;

    static {
      ImmutableMap.Builder<String, ImmutableSet<StatusCode.Code>> definitions =
          ImmutableMap.builder();
      definitions.put(
          "retry_policy_0_codes",
          ImmutableSet.copyOf(Lists.<StatusCode.Code>newArrayList(StatusCode.Code.UNAVAILABLE)));
      definitions.put(
          "retry_policy_1_codes",
          ImmutableSet.copyOf(Lists.<StatusCode.Code>newArrayList(StatusCode.Code.UNAVAILABLE)));
      RETRYABLE_CODE_DEFINITIONS = definitions.build();
    }

    private static final ImmutableMap<String, RetrySettings> RETRY_PARAM_DEFINITIONS;

    static {
      ImmutableMap.Builder<String, RetrySettings> definitions = ImmutableMap.builder();
      RetrySettings settings = null;
      settings =
          RetrySettings.newBuilder()
              .setInitialRetryDelay(Duration.ofMillis(1000L))
              .setRetryDelayMultiplier(1.3)
              .setMaxRetryDelay(Duration.ofMillis(10000L))
              .setInitialRpcTimeout(Duration.ofMillis(3600000L))
              .setRpcTimeoutMultiplier(1.0)
              .setMaxRpcTimeout(Duration.ofMillis(3600000L))
              .setTotalTimeout(Duration.ofMillis(3600000L))
              .build();
      definitions.put("retry_policy_0_params", settings);
      settings =
          RetrySettings.newBuilder()
              .setInitialRetryDelay(Duration.ofMillis(1000L))
              .setRetryDelayMultiplier(1.3)
              .setMaxRetryDelay(Duration.ofMillis(10000L))
              .setInitialRpcTimeout(Duration.ofMillis(60000L))
              .setRpcTimeoutMultiplier(1.0)
              .setMaxRpcTimeout(Duration.ofMillis(60000L))
              .setTotalTimeout(Duration.ofMillis(60000L))
              .build();
      definitions.put("retry_policy_1_params", settings);
      RETRY_PARAM_DEFINITIONS = definitions.build();
    }

    protected Builder() {
      this(((ClientContext) null));
    }

    protected Builder(ClientContext clientContext) {
      super(clientContext);

      optimizeToursSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      batchOptimizeToursSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      batchOptimizeToursOperationSettings = OperationCallSettings.newBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              optimizeToursSettings, batchOptimizeToursSettings);
      initDefaults(this);
    }

    protected Builder(FleetRoutingStubSettings settings) {
      super(settings);

      optimizeToursSettings = settings.optimizeToursSettings.toBuilder();
      batchOptimizeToursSettings = settings.batchOptimizeToursSettings.toBuilder();
      batchOptimizeToursOperationSettings =
          settings.batchOptimizeToursOperationSettings.toBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              optimizeToursSettings, batchOptimizeToursSettings);
    }

    private static Builder createDefault() {
      Builder builder = new Builder(((ClientContext) null));

      builder.setTransportChannelProvider(defaultTransportChannelProvider());
      builder.setCredentialsProvider(defaultCredentialsProviderBuilder().build());
      builder.setInternalHeaderProvider(defaultApiClientHeaderProviderBuilder().build());
      builder.setEndpoint(getDefaultEndpoint());
      builder.setMtlsEndpoint(getDefaultMtlsEndpoint());
      builder.setSwitchToMtlsEndpointAllowed(true);

      return initDefaults(builder);
    }

    private static Builder initDefaults(Builder builder) {
      builder
          .optimizeToursSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .batchOptimizeToursSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_1_params"));

      builder
          .batchOptimizeToursOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<BatchOptimizeToursRequest, OperationSnapshot>newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_1_codes"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_1_params"))
                  .build())
          .setResponseTransformer(
              ProtoOperationTransformers.ResponseTransformer.create(
                  BatchOptimizeToursResponse.class))
          .setMetadataTransformer(
              ProtoOperationTransformers.MetadataTransformer.create(AsyncModelMetadata.class))
          .setPollingAlgorithm(
              OperationTimedPollAlgorithm.create(
                  RetrySettings.newBuilder()
                      .setInitialRetryDelay(Duration.ofMillis(30000L))
                      .setRetryDelayMultiplier(1.5)
                      .setMaxRetryDelay(Duration.ofMillis(120000L))
                      .setInitialRpcTimeout(Duration.ZERO)
                      .setRpcTimeoutMultiplier(1.0)
                      .setMaxRpcTimeout(Duration.ZERO)
                      .setTotalTimeout(Duration.ofMillis(3600000L))
                      .build()));

      return builder;
    }

    /**
     * Applies the given settings updater function to all of the unary API methods in this service.
     *
     * <p>Note: This method does not support applying settings to streaming methods.
     */
    public Builder applyToAllUnaryMethods(
        ApiFunction<UnaryCallSettings.Builder<?, ?>, Void> settingsUpdater) {
      super.applyToAllUnaryMethods(unaryMethodSettingsBuilders, settingsUpdater);
      return this;
    }

    public ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders() {
      return unaryMethodSettingsBuilders;
    }

    /** Returns the builder for the settings used for calls to optimizeTours. */
    public UnaryCallSettings.Builder<OptimizeToursRequest, OptimizeToursResponse>
        optimizeToursSettings() {
      return optimizeToursSettings;
    }

    /** Returns the builder for the settings used for calls to batchOptimizeTours. */
    public UnaryCallSettings.Builder<BatchOptimizeToursRequest, Operation>
        batchOptimizeToursSettings() {
      return batchOptimizeToursSettings;
    }

    /** Returns the builder for the settings used for calls to batchOptimizeTours. */
    @BetaApi(
        "The surface for use by generated code is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<
            BatchOptimizeToursRequest, BatchOptimizeToursResponse, AsyncModelMetadata>
        batchOptimizeToursOperationSettings() {
      return batchOptimizeToursOperationSettings;
    }

    @Override
    public FleetRoutingStubSettings build() throws IOException {
      return new FleetRoutingStubSettings(this);
    }
  }
}
