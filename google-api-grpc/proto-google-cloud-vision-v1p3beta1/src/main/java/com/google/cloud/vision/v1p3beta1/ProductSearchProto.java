// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/vision/v1p3beta1/product_search.proto

package com.google.cloud.vision.v1p3beta1;

public final class ProductSearchProto {
  private ProductSearchProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_vision_v1p3beta1_ProductSearchParams_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_vision_v1p3beta1_ProductSearchParams_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_vision_v1p3beta1_ProductSearchResults_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_vision_v1p3beta1_ProductSearchResults_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_vision_v1p3beta1_ProductSearchResults_ProductInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_vision_v1p3beta1_ProductSearchResults_ProductInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_vision_v1p3beta1_ProductSearchResults_Result_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_vision_v1p3beta1_ProductSearchResults_Result_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n2google/cloud/vision/v1p3beta1/product_"
          + "search.proto\022\035google.cloud.vision.v1p3be"
          + "ta1\032\034google/api/annotations.proto\032,googl"
          + "e/cloud/vision/v1p3beta1/geometry.proto\032"
          + ":google/cloud/vision/v1p3beta1/product_s"
          + "earch_service.proto\032\037google/protobuf/tim"
          + "estamp.proto\"\262\003\n\023ProductSearchParams\022\024\n\014"
          + "catalog_name\030\001 \001(\t\022F\n\010category\030\002 \001(\01624.g"
          + "oogle.cloud.vision.v1p3beta1.ProductSear"
          + "chCategory\022\030\n\020product_category\030\005 \001(\t\022W\n\030"
          + "normalized_bounding_poly\030\003 \001(\01325.google."
          + "cloud.vision.v1p3beta1.NormalizedBoundin"
          + "gPoly\022B\n\rbounding_poly\030\t \001(\0132+.google.cl"
          + "oud.vision.v1p3beta1.BoundingPoly\022E\n\004vie"
          + "w\030\004 \001(\01627.google.cloud.vision.v1p3beta1."
          + "ProductSearchResultsView\022\023\n\013product_set\030"
          + "\006 \001(\t\022\032\n\022product_categories\030\007 \003(\t\022\016\n\006fil"
          + "ter\030\010 \001(\t\"\356\003\n\024ProductSearchResults\022F\n\010ca"
          + "tegory\030\001 \001(\01624.google.cloud.vision.v1p3b"
          + "eta1.ProductSearchCategory\022\030\n\020product_ca"
          + "tegory\030\004 \001(\t\022.\n\nindex_time\030\002 \001(\0132\032.googl"
          + "e.protobuf.Timestamp\022Q\n\010products\030\003 \003(\0132?"
          + ".google.cloud.vision.v1p3beta1.ProductSe"
          + "archResults.ProductInfo\022K\n\007results\030\005 \003(\013"
          + "2:.google.cloud.vision.v1p3beta1.Product"
          + "SearchResults.Result\032C\n\013ProductInfo\022\022\n\np"
          + "roduct_id\030\001 \001(\t\022\021\n\timage_uri\030\002 \001(\t\022\r\n\005sc"
          + "ore\030\003 \001(\002\032_\n\006Result\0227\n\007product\030\001 \001(\0132&.g"
          + "oogle.cloud.vision.v1p3beta1.Product\022\r\n\005"
          + "score\030\002 \001(\002\022\r\n\005image\030\003 \001(\t*U\n\025ProductSea"
          + "rchCategory\022\'\n#PRODUCT_SEARCH_CATEGORY_U"
          + "NSPECIFIED\020\000\022\t\n\005SHOES\020\001\022\010\n\004BAGS\020\002*/\n\030Pro"
          + "ductSearchResultsView\022\t\n\005BASIC\020\000\022\010\n\004FULL"
          + "\020\001B\201\001\n!com.google.cloud.vision.v1p3beta1"
          + "B\022ProductSearchProtoP\001ZCgoogle.golang.or"
          + "g/genproto/googleapis/cloud/vision/v1p3b"
          + "eta1;vision\370\001\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
        descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.cloud.vision.v1p3beta1.GeometryProto.getDescriptor(),
          com.google.cloud.vision.v1p3beta1.ProductSearchServiceProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        },
        assigner);
    internal_static_google_cloud_vision_v1p3beta1_ProductSearchParams_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_vision_v1p3beta1_ProductSearchParams_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_vision_v1p3beta1_ProductSearchParams_descriptor,
            new java.lang.String[] {
              "CatalogName",
              "Category",
              "ProductCategory",
              "NormalizedBoundingPoly",
              "BoundingPoly",
              "View",
              "ProductSet",
              "ProductCategories",
              "Filter",
            });
    internal_static_google_cloud_vision_v1p3beta1_ProductSearchResults_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_vision_v1p3beta1_ProductSearchResults_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_vision_v1p3beta1_ProductSearchResults_descriptor,
            new java.lang.String[] {
              "Category", "ProductCategory", "IndexTime", "Products", "Results",
            });
    internal_static_google_cloud_vision_v1p3beta1_ProductSearchResults_ProductInfo_descriptor =
        internal_static_google_cloud_vision_v1p3beta1_ProductSearchResults_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_vision_v1p3beta1_ProductSearchResults_ProductInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_vision_v1p3beta1_ProductSearchResults_ProductInfo_descriptor,
            new java.lang.String[] {
              "ProductId", "ImageUri", "Score",
            });
    internal_static_google_cloud_vision_v1p3beta1_ProductSearchResults_Result_descriptor =
        internal_static_google_cloud_vision_v1p3beta1_ProductSearchResults_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_vision_v1p3beta1_ProductSearchResults_Result_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_vision_v1p3beta1_ProductSearchResults_Result_descriptor,
            new java.lang.String[] {
              "Product", "Score", "Image",
            });
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.cloud.vision.v1p3beta1.GeometryProto.getDescriptor();
    com.google.cloud.vision.v1p3beta1.ProductSearchServiceProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
