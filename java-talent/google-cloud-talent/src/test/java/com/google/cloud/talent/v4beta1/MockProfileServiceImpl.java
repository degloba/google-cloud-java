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

import com.google.api.core.BetaApi;
import com.google.cloud.talent.v4beta1.ProfileServiceGrpc.ProfileServiceImplBase;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.Empty;
import io.grpc.stub.StreamObserver;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import javax.annotation.Generated;

@BetaApi
@Generated("by gapic-generator-java")
public class MockProfileServiceImpl extends ProfileServiceImplBase {
  private List<AbstractMessage> requests;
  private Queue<Object> responses;

  public MockProfileServiceImpl() {
    requests = new ArrayList<>();
    responses = new LinkedList<>();
  }

  public List<AbstractMessage> getRequests() {
    return requests;
  }

  public void addResponse(AbstractMessage response) {
    responses.add(response);
  }

  public void setResponses(List<AbstractMessage> responses) {
    this.responses = new LinkedList<Object>(responses);
  }

  public void addException(Exception exception) {
    responses.add(exception);
  }

  public void reset() {
    requests = new ArrayList<>();
    responses = new LinkedList<>();
  }

  @Override
  public void listProfiles(
      ListProfilesRequest request, StreamObserver<ListProfilesResponse> responseObserver) {
    Object response = responses.poll();
    if (response instanceof ListProfilesResponse) {
      requests.add(request);
      responseObserver.onNext(((ListProfilesResponse) response));
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError(((Exception) response));
    } else {
      responseObserver.onError(
          new IllegalArgumentException(
              String.format(
                  "Unrecognized response type %s for method ListProfiles, expected %s or %s",
                  response == null ? "null" : response.getClass().getName(),
                  ListProfilesResponse.class.getName(),
                  Exception.class.getName())));
    }
  }

  @Override
  public void createProfile(
      CreateProfileRequest request, StreamObserver<Profile> responseObserver) {
    Object response = responses.poll();
    if (response instanceof Profile) {
      requests.add(request);
      responseObserver.onNext(((Profile) response));
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError(((Exception) response));
    } else {
      responseObserver.onError(
          new IllegalArgumentException(
              String.format(
                  "Unrecognized response type %s for method CreateProfile, expected %s or %s",
                  response == null ? "null" : response.getClass().getName(),
                  Profile.class.getName(),
                  Exception.class.getName())));
    }
  }

  @Override
  public void getProfile(GetProfileRequest request, StreamObserver<Profile> responseObserver) {
    Object response = responses.poll();
    if (response instanceof Profile) {
      requests.add(request);
      responseObserver.onNext(((Profile) response));
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError(((Exception) response));
    } else {
      responseObserver.onError(
          new IllegalArgumentException(
              String.format(
                  "Unrecognized response type %s for method GetProfile, expected %s or %s",
                  response == null ? "null" : response.getClass().getName(),
                  Profile.class.getName(),
                  Exception.class.getName())));
    }
  }

  @Override
  public void updateProfile(
      UpdateProfileRequest request, StreamObserver<Profile> responseObserver) {
    Object response = responses.poll();
    if (response instanceof Profile) {
      requests.add(request);
      responseObserver.onNext(((Profile) response));
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError(((Exception) response));
    } else {
      responseObserver.onError(
          new IllegalArgumentException(
              String.format(
                  "Unrecognized response type %s for method UpdateProfile, expected %s or %s",
                  response == null ? "null" : response.getClass().getName(),
                  Profile.class.getName(),
                  Exception.class.getName())));
    }
  }

  @Override
  public void deleteProfile(DeleteProfileRequest request, StreamObserver<Empty> responseObserver) {
    Object response = responses.poll();
    if (response instanceof Empty) {
      requests.add(request);
      responseObserver.onNext(((Empty) response));
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError(((Exception) response));
    } else {
      responseObserver.onError(
          new IllegalArgumentException(
              String.format(
                  "Unrecognized response type %s for method DeleteProfile, expected %s or %s",
                  response == null ? "null" : response.getClass().getName(),
                  Empty.class.getName(),
                  Exception.class.getName())));
    }
  }

  @Override
  public void searchProfiles(
      SearchProfilesRequest request, StreamObserver<SearchProfilesResponse> responseObserver) {
    Object response = responses.poll();
    if (response instanceof SearchProfilesResponse) {
      requests.add(request);
      responseObserver.onNext(((SearchProfilesResponse) response));
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError(((Exception) response));
    } else {
      responseObserver.onError(
          new IllegalArgumentException(
              String.format(
                  "Unrecognized response type %s for method SearchProfiles, expected %s or %s",
                  response == null ? "null" : response.getClass().getName(),
                  SearchProfilesResponse.class.getName(),
                  Exception.class.getName())));
    }
  }
}
