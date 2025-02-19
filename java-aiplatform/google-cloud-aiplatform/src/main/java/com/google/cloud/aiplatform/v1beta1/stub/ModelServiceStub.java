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

package com.google.cloud.aiplatform.v1beta1.stub;

import static com.google.cloud.aiplatform.v1beta1.ModelServiceClient.ListModelEvaluationSlicesPagedResponse;
import static com.google.cloud.aiplatform.v1beta1.ModelServiceClient.ListModelEvaluationsPagedResponse;
import static com.google.cloud.aiplatform.v1beta1.ModelServiceClient.ListModelVersionsPagedResponse;
import static com.google.cloud.aiplatform.v1beta1.ModelServiceClient.ListModelsPagedResponse;

import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.OperationCallable;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.aiplatform.v1beta1.DeleteModelRequest;
import com.google.cloud.aiplatform.v1beta1.DeleteModelVersionRequest;
import com.google.cloud.aiplatform.v1beta1.DeleteOperationMetadata;
import com.google.cloud.aiplatform.v1beta1.ExportModelOperationMetadata;
import com.google.cloud.aiplatform.v1beta1.ExportModelRequest;
import com.google.cloud.aiplatform.v1beta1.ExportModelResponse;
import com.google.cloud.aiplatform.v1beta1.GetModelEvaluationRequest;
import com.google.cloud.aiplatform.v1beta1.GetModelEvaluationSliceRequest;
import com.google.cloud.aiplatform.v1beta1.GetModelRequest;
import com.google.cloud.aiplatform.v1beta1.ImportModelEvaluationRequest;
import com.google.cloud.aiplatform.v1beta1.ListModelEvaluationSlicesRequest;
import com.google.cloud.aiplatform.v1beta1.ListModelEvaluationSlicesResponse;
import com.google.cloud.aiplatform.v1beta1.ListModelEvaluationsRequest;
import com.google.cloud.aiplatform.v1beta1.ListModelEvaluationsResponse;
import com.google.cloud.aiplatform.v1beta1.ListModelVersionsRequest;
import com.google.cloud.aiplatform.v1beta1.ListModelVersionsResponse;
import com.google.cloud.aiplatform.v1beta1.ListModelsRequest;
import com.google.cloud.aiplatform.v1beta1.ListModelsResponse;
import com.google.cloud.aiplatform.v1beta1.MergeVersionAliasesRequest;
import com.google.cloud.aiplatform.v1beta1.Model;
import com.google.cloud.aiplatform.v1beta1.ModelEvaluation;
import com.google.cloud.aiplatform.v1beta1.ModelEvaluationSlice;
import com.google.cloud.aiplatform.v1beta1.UpdateModelRequest;
import com.google.cloud.aiplatform.v1beta1.UploadModelOperationMetadata;
import com.google.cloud.aiplatform.v1beta1.UploadModelRequest;
import com.google.cloud.aiplatform.v1beta1.UploadModelResponse;
import com.google.longrunning.Operation;
import com.google.longrunning.stub.OperationsStub;
import com.google.protobuf.Empty;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Base stub class for the ModelService service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@BetaApi
@Generated("by gapic-generator-java")
public abstract class ModelServiceStub implements BackgroundResource {

  public OperationsStub getOperationsStub() {
    throw new UnsupportedOperationException("Not implemented: getOperationsStub()");
  }

  public OperationCallable<UploadModelRequest, UploadModelResponse, UploadModelOperationMetadata>
      uploadModelOperationCallable() {
    throw new UnsupportedOperationException("Not implemented: uploadModelOperationCallable()");
  }

  public UnaryCallable<UploadModelRequest, Operation> uploadModelCallable() {
    throw new UnsupportedOperationException("Not implemented: uploadModelCallable()");
  }

  public UnaryCallable<GetModelRequest, Model> getModelCallable() {
    throw new UnsupportedOperationException("Not implemented: getModelCallable()");
  }

  public UnaryCallable<ListModelsRequest, ListModelsPagedResponse> listModelsPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: listModelsPagedCallable()");
  }

  public UnaryCallable<ListModelsRequest, ListModelsResponse> listModelsCallable() {
    throw new UnsupportedOperationException("Not implemented: listModelsCallable()");
  }

  public UnaryCallable<ListModelVersionsRequest, ListModelVersionsPagedResponse>
      listModelVersionsPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: listModelVersionsPagedCallable()");
  }

  public UnaryCallable<ListModelVersionsRequest, ListModelVersionsResponse>
      listModelVersionsCallable() {
    throw new UnsupportedOperationException("Not implemented: listModelVersionsCallable()");
  }

  public UnaryCallable<UpdateModelRequest, Model> updateModelCallable() {
    throw new UnsupportedOperationException("Not implemented: updateModelCallable()");
  }

  public OperationCallable<DeleteModelRequest, Empty, DeleteOperationMetadata>
      deleteModelOperationCallable() {
    throw new UnsupportedOperationException("Not implemented: deleteModelOperationCallable()");
  }

  public UnaryCallable<DeleteModelRequest, Operation> deleteModelCallable() {
    throw new UnsupportedOperationException("Not implemented: deleteModelCallable()");
  }

  public OperationCallable<DeleteModelVersionRequest, Empty, DeleteOperationMetadata>
      deleteModelVersionOperationCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: deleteModelVersionOperationCallable()");
  }

  public UnaryCallable<DeleteModelVersionRequest, Operation> deleteModelVersionCallable() {
    throw new UnsupportedOperationException("Not implemented: deleteModelVersionCallable()");
  }

  public UnaryCallable<MergeVersionAliasesRequest, Model> mergeVersionAliasesCallable() {
    throw new UnsupportedOperationException("Not implemented: mergeVersionAliasesCallable()");
  }

  public OperationCallable<ExportModelRequest, ExportModelResponse, ExportModelOperationMetadata>
      exportModelOperationCallable() {
    throw new UnsupportedOperationException("Not implemented: exportModelOperationCallable()");
  }

  public UnaryCallable<ExportModelRequest, Operation> exportModelCallable() {
    throw new UnsupportedOperationException("Not implemented: exportModelCallable()");
  }

  public UnaryCallable<ImportModelEvaluationRequest, ModelEvaluation>
      importModelEvaluationCallable() {
    throw new UnsupportedOperationException("Not implemented: importModelEvaluationCallable()");
  }

  public UnaryCallable<GetModelEvaluationRequest, ModelEvaluation> getModelEvaluationCallable() {
    throw new UnsupportedOperationException("Not implemented: getModelEvaluationCallable()");
  }

  public UnaryCallable<ListModelEvaluationsRequest, ListModelEvaluationsPagedResponse>
      listModelEvaluationsPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: listModelEvaluationsPagedCallable()");
  }

  public UnaryCallable<ListModelEvaluationsRequest, ListModelEvaluationsResponse>
      listModelEvaluationsCallable() {
    throw new UnsupportedOperationException("Not implemented: listModelEvaluationsCallable()");
  }

  public UnaryCallable<GetModelEvaluationSliceRequest, ModelEvaluationSlice>
      getModelEvaluationSliceCallable() {
    throw new UnsupportedOperationException("Not implemented: getModelEvaluationSliceCallable()");
  }

  public UnaryCallable<ListModelEvaluationSlicesRequest, ListModelEvaluationSlicesPagedResponse>
      listModelEvaluationSlicesPagedCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: listModelEvaluationSlicesPagedCallable()");
  }

  public UnaryCallable<ListModelEvaluationSlicesRequest, ListModelEvaluationSlicesResponse>
      listModelEvaluationSlicesCallable() {
    throw new UnsupportedOperationException("Not implemented: listModelEvaluationSlicesCallable()");
  }

  @Override
  public abstract void close();
}
