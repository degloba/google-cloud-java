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

package com.google.cloud.talent.v4beta1;

import static com.google.cloud.talent.v4beta1.ApplicationServiceClient.ListApplicationsPagedResponse;

import com.google.api.core.ApiFunction;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.GoogleCredentialsProvider;
import com.google.api.gax.core.InstantiatingExecutorProvider;
import com.google.api.gax.grpc.InstantiatingGrpcChannelProvider;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.ClientSettings;
import com.google.api.gax.rpc.PagedCallSettings;
import com.google.api.gax.rpc.TransportChannelProvider;
import com.google.api.gax.rpc.UnaryCallSettings;
import com.google.cloud.talent.v4beta1.stub.ApplicationServiceStubSettings;
import com.google.protobuf.Empty;
import java.io.IOException;
import java.util.List;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Settings class to configure an instance of {@link ApplicationServiceClient}.
 *
 * <p>The default instance has everything set to sensible defaults:
 *
 * <ul>
 *   <li>The default service address (jobs.googleapis.com) and default port (443) are used.
 *   <li>Credentials are acquired automatically through Application Default Credentials.
 *   <li>Retries are configured for idempotent methods but not for non-idempotent methods.
 * </ul>
 *
 * <p>The builder of this class is recursive, so contained classes are themselves builders. When
 * build() is called, the tree of builders is called to create the complete settings object.
 *
 * <p>For example, to set the total timeout of createApplication to 30 seconds:
 *
 * <pre>{@code
 * // This snippet has been automatically generated for illustrative purposes only.
 * // It may require modifications to work in your environment.
 * ApplicationServiceSettings.Builder applicationServiceSettingsBuilder =
 *     ApplicationServiceSettings.newBuilder();
 * applicationServiceSettingsBuilder
 *     .createApplicationSettings()
 *     .setRetrySettings(
 *         applicationServiceSettingsBuilder
 *             .createApplicationSettings()
 *             .getRetrySettings()
 *             .toBuilder()
 *             .setTotalTimeout(Duration.ofSeconds(30))
 *             .build());
 * ApplicationServiceSettings applicationServiceSettings =
 *     applicationServiceSettingsBuilder.build();
 * }</pre>
 */
@BetaApi
@Generated("by gapic-generator-java")
public class ApplicationServiceSettings extends ClientSettings<ApplicationServiceSettings> {

  /** Returns the object with the settings used for calls to createApplication. */
  public UnaryCallSettings<CreateApplicationRequest, Application> createApplicationSettings() {
    return ((ApplicationServiceStubSettings) getStubSettings()).createApplicationSettings();
  }

  /** Returns the object with the settings used for calls to getApplication. */
  public UnaryCallSettings<GetApplicationRequest, Application> getApplicationSettings() {
    return ((ApplicationServiceStubSettings) getStubSettings()).getApplicationSettings();
  }

  /** Returns the object with the settings used for calls to updateApplication. */
  public UnaryCallSettings<UpdateApplicationRequest, Application> updateApplicationSettings() {
    return ((ApplicationServiceStubSettings) getStubSettings()).updateApplicationSettings();
  }

  /** Returns the object with the settings used for calls to deleteApplication. */
  public UnaryCallSettings<DeleteApplicationRequest, Empty> deleteApplicationSettings() {
    return ((ApplicationServiceStubSettings) getStubSettings()).deleteApplicationSettings();
  }

  /** Returns the object with the settings used for calls to listApplications. */
  public PagedCallSettings<
          ListApplicationsRequest, ListApplicationsResponse, ListApplicationsPagedResponse>
      listApplicationsSettings() {
    return ((ApplicationServiceStubSettings) getStubSettings()).listApplicationsSettings();
  }

  public static final ApplicationServiceSettings create(ApplicationServiceStubSettings stub)
      throws IOException {
    return new ApplicationServiceSettings.Builder(stub.toBuilder()).build();
  }

  /** Returns a builder for the default ExecutorProvider for this service. */
  public static InstantiatingExecutorProvider.Builder defaultExecutorProviderBuilder() {
    return ApplicationServiceStubSettings.defaultExecutorProviderBuilder();
  }

  /** Returns the default service endpoint. */
  public static String getDefaultEndpoint() {
    return ApplicationServiceStubSettings.getDefaultEndpoint();
  }

  /** Returns the default service scopes. */
  public static List<String> getDefaultServiceScopes() {
    return ApplicationServiceStubSettings.getDefaultServiceScopes();
  }

  /** Returns a builder for the default credentials for this service. */
  public static GoogleCredentialsProvider.Builder defaultCredentialsProviderBuilder() {
    return ApplicationServiceStubSettings.defaultCredentialsProviderBuilder();
  }

  /** Returns a builder for the default ChannelProvider for this service. */
  public static InstantiatingGrpcChannelProvider.Builder defaultGrpcTransportProviderBuilder() {
    return ApplicationServiceStubSettings.defaultGrpcTransportProviderBuilder();
  }

  public static TransportChannelProvider defaultTransportChannelProvider() {
    return ApplicationServiceStubSettings.defaultTransportChannelProvider();
  }

  @BetaApi("The surface for customizing headers is not stable yet and may change in the future.")
  public static ApiClientHeaderProvider.Builder defaultApiClientHeaderProviderBuilder() {
    return ApplicationServiceStubSettings.defaultApiClientHeaderProviderBuilder();
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

  protected ApplicationServiceSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);
  }

  /** Builder for ApplicationServiceSettings. */
  public static class Builder extends ClientSettings.Builder<ApplicationServiceSettings, Builder> {

    protected Builder() throws IOException {
      this(((ClientContext) null));
    }

    protected Builder(ClientContext clientContext) {
      super(ApplicationServiceStubSettings.newBuilder(clientContext));
    }

    protected Builder(ApplicationServiceSettings settings) {
      super(settings.getStubSettings().toBuilder());
    }

    protected Builder(ApplicationServiceStubSettings.Builder stubSettings) {
      super(stubSettings);
    }

    private static Builder createDefault() {
      return new Builder(ApplicationServiceStubSettings.newBuilder());
    }

    public ApplicationServiceStubSettings.Builder getStubSettingsBuilder() {
      return ((ApplicationServiceStubSettings.Builder) getStubSettings());
    }

    /**
     * Applies the given settings updater function to all of the unary API methods in this service.
     *
     * <p>Note: This method does not support applying settings to streaming methods.
     */
    public Builder applyToAllUnaryMethods(
        ApiFunction<UnaryCallSettings.Builder<?, ?>, Void> settingsUpdater) {
      super.applyToAllUnaryMethods(
          getStubSettingsBuilder().unaryMethodSettingsBuilders(), settingsUpdater);
      return this;
    }

    /** Returns the builder for the settings used for calls to createApplication. */
    public UnaryCallSettings.Builder<CreateApplicationRequest, Application>
        createApplicationSettings() {
      return getStubSettingsBuilder().createApplicationSettings();
    }

    /** Returns the builder for the settings used for calls to getApplication. */
    public UnaryCallSettings.Builder<GetApplicationRequest, Application> getApplicationSettings() {
      return getStubSettingsBuilder().getApplicationSettings();
    }

    /** Returns the builder for the settings used for calls to updateApplication. */
    public UnaryCallSettings.Builder<UpdateApplicationRequest, Application>
        updateApplicationSettings() {
      return getStubSettingsBuilder().updateApplicationSettings();
    }

    /** Returns the builder for the settings used for calls to deleteApplication. */
    public UnaryCallSettings.Builder<DeleteApplicationRequest, Empty> deleteApplicationSettings() {
      return getStubSettingsBuilder().deleteApplicationSettings();
    }

    /** Returns the builder for the settings used for calls to listApplications. */
    public PagedCallSettings.Builder<
            ListApplicationsRequest, ListApplicationsResponse, ListApplicationsPagedResponse>
        listApplicationsSettings() {
      return getStubSettingsBuilder().listApplicationsSettings();
    }

    @Override
    public ApplicationServiceSettings build() throws IOException {
      return new ApplicationServiceSettings(this);
    }
  }
}
