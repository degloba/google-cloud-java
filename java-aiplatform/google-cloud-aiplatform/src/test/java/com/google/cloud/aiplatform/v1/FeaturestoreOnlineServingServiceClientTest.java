/*
 * Copyright 2021 Google LLC
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

package com.google.cloud.aiplatform.v1;

import com.google.api.gax.core.NoCredentialsProvider;
import com.google.api.gax.grpc.GaxGrpcProperties;
import com.google.api.gax.grpc.testing.LocalChannelProvider;
import com.google.api.gax.grpc.testing.MockGrpcService;
import com.google.api.gax.grpc.testing.MockServiceHelper;
import com.google.api.gax.grpc.testing.MockStreamObserver;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.InvalidArgumentException;
import com.google.api.gax.rpc.ServerStreamingCallable;
import com.google.api.gax.rpc.StatusCode;
import com.google.protobuf.AbstractMessage;
import io.grpc.StatusRuntimeException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import javax.annotation.Generated;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

@Generated("by gapic-generator-java")
public class FeaturestoreOnlineServingServiceClientTest {
  private static MockFeaturestoreOnlineServingService mockFeaturestoreOnlineServingService;
  private static MockServiceHelper mockServiceHelper;
  private LocalChannelProvider channelProvider;
  private FeaturestoreOnlineServingServiceClient client;

  @BeforeClass
  public static void startStaticServer() {
    mockFeaturestoreOnlineServingService = new MockFeaturestoreOnlineServingService();
    mockServiceHelper =
        new MockServiceHelper(
            UUID.randomUUID().toString(),
            Arrays.<MockGrpcService>asList(mockFeaturestoreOnlineServingService));
    mockServiceHelper.start();
  }

  @AfterClass
  public static void stopServer() {
    mockServiceHelper.stop();
  }

  @Before
  public void setUp() throws IOException {
    mockServiceHelper.reset();
    channelProvider = mockServiceHelper.createChannelProvider();
    FeaturestoreOnlineServingServiceSettings settings =
        FeaturestoreOnlineServingServiceSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = FeaturestoreOnlineServingServiceClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  public void readFeatureValuesTest() throws Exception {
    ReadFeatureValuesResponse expectedResponse =
        ReadFeatureValuesResponse.newBuilder()
            .setHeader(ReadFeatureValuesResponse.Header.newBuilder().build())
            .setEntityView(ReadFeatureValuesResponse.EntityView.newBuilder().build())
            .build();
    mockFeaturestoreOnlineServingService.addResponse(expectedResponse);

    EntityTypeName entityType =
        EntityTypeName.of("[PROJECT]", "[LOCATION]", "[FEATURESTORE]", "[ENTITY_TYPE]");

    ReadFeatureValuesResponse actualResponse = client.readFeatureValues(entityType);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockFeaturestoreOnlineServingService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ReadFeatureValuesRequest actualRequest = ((ReadFeatureValuesRequest) actualRequests.get(0));

    Assert.assertEquals(entityType.toString(), actualRequest.getEntityType());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void readFeatureValuesExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockFeaturestoreOnlineServingService.addException(exception);

    try {
      EntityTypeName entityType =
          EntityTypeName.of("[PROJECT]", "[LOCATION]", "[FEATURESTORE]", "[ENTITY_TYPE]");
      client.readFeatureValues(entityType);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void readFeatureValuesTest2() throws Exception {
    ReadFeatureValuesResponse expectedResponse =
        ReadFeatureValuesResponse.newBuilder()
            .setHeader(ReadFeatureValuesResponse.Header.newBuilder().build())
            .setEntityView(ReadFeatureValuesResponse.EntityView.newBuilder().build())
            .build();
    mockFeaturestoreOnlineServingService.addResponse(expectedResponse);

    String entityType = "entityType-1482998339";

    ReadFeatureValuesResponse actualResponse = client.readFeatureValues(entityType);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockFeaturestoreOnlineServingService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ReadFeatureValuesRequest actualRequest = ((ReadFeatureValuesRequest) actualRequests.get(0));

    Assert.assertEquals(entityType, actualRequest.getEntityType());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void readFeatureValuesExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockFeaturestoreOnlineServingService.addException(exception);

    try {
      String entityType = "entityType-1482998339";
      client.readFeatureValues(entityType);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void streamingReadFeatureValuesTest() throws Exception {
    ReadFeatureValuesResponse expectedResponse =
        ReadFeatureValuesResponse.newBuilder()
            .setHeader(ReadFeatureValuesResponse.Header.newBuilder().build())
            .setEntityView(ReadFeatureValuesResponse.EntityView.newBuilder().build())
            .build();
    mockFeaturestoreOnlineServingService.addResponse(expectedResponse);
    StreamingReadFeatureValuesRequest request =
        StreamingReadFeatureValuesRequest.newBuilder()
            .setEntityType(
                EntityTypeName.of("[PROJECT]", "[LOCATION]", "[FEATURESTORE]", "[ENTITY_TYPE]")
                    .toString())
            .addAllEntityIds(new ArrayList<String>())
            .setFeatureSelector(FeatureSelector.newBuilder().build())
            .build();

    MockStreamObserver<ReadFeatureValuesResponse> responseObserver = new MockStreamObserver<>();

    ServerStreamingCallable<StreamingReadFeatureValuesRequest, ReadFeatureValuesResponse> callable =
        client.streamingReadFeatureValuesCallable();
    callable.serverStreamingCall(request, responseObserver);

    List<ReadFeatureValuesResponse> actualResponses = responseObserver.future().get();
    Assert.assertEquals(1, actualResponses.size());
    Assert.assertEquals(expectedResponse, actualResponses.get(0));
  }

  @Test
  public void streamingReadFeatureValuesExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockFeaturestoreOnlineServingService.addException(exception);
    StreamingReadFeatureValuesRequest request =
        StreamingReadFeatureValuesRequest.newBuilder()
            .setEntityType(
                EntityTypeName.of("[PROJECT]", "[LOCATION]", "[FEATURESTORE]", "[ENTITY_TYPE]")
                    .toString())
            .addAllEntityIds(new ArrayList<String>())
            .setFeatureSelector(FeatureSelector.newBuilder().build())
            .build();

    MockStreamObserver<ReadFeatureValuesResponse> responseObserver = new MockStreamObserver<>();

    ServerStreamingCallable<StreamingReadFeatureValuesRequest, ReadFeatureValuesResponse> callable =
        client.streamingReadFeatureValuesCallable();
    callable.serverStreamingCall(request, responseObserver);

    try {
      List<ReadFeatureValuesResponse> actualResponses = responseObserver.future().get();
      Assert.fail("No exception thrown");
    } catch (ExecutionException e) {
      Assert.assertTrue(e.getCause() instanceof InvalidArgumentException);
      InvalidArgumentException apiException = ((InvalidArgumentException) e.getCause());
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }
}
