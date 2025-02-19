/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/documentai/v1beta1/document.proto

package com.google.cloud.documentai.v1beta1;

public final class DocumentProto {
  private DocumentProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_documentai_v1beta1_Document_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_documentai_v1beta1_Document_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_documentai_v1beta1_Document_ShardInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_documentai_v1beta1_Document_ShardInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_documentai_v1beta1_Document_Style_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_documentai_v1beta1_Document_Style_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_documentai_v1beta1_Document_Style_FontSize_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_documentai_v1beta1_Document_Style_FontSize_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_documentai_v1beta1_Document_Page_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_documentai_v1beta1_Document_Page_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_documentai_v1beta1_Document_Page_Dimension_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_documentai_v1beta1_Document_Page_Dimension_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_documentai_v1beta1_Document_Page_Layout_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_documentai_v1beta1_Document_Page_Layout_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_documentai_v1beta1_Document_Page_Block_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_documentai_v1beta1_Document_Page_Block_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_documentai_v1beta1_Document_Page_Paragraph_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_documentai_v1beta1_Document_Page_Paragraph_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_documentai_v1beta1_Document_Page_Line_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_documentai_v1beta1_Document_Page_Line_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_documentai_v1beta1_Document_Page_Token_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_documentai_v1beta1_Document_Page_Token_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_documentai_v1beta1_Document_Page_Token_DetectedBreak_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_documentai_v1beta1_Document_Page_Token_DetectedBreak_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_documentai_v1beta1_Document_Page_VisualElement_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_documentai_v1beta1_Document_Page_VisualElement_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_documentai_v1beta1_Document_Page_Table_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_documentai_v1beta1_Document_Page_Table_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_documentai_v1beta1_Document_Page_Table_TableRow_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_documentai_v1beta1_Document_Page_Table_TableRow_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_documentai_v1beta1_Document_Page_Table_TableCell_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_documentai_v1beta1_Document_Page_Table_TableCell_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_documentai_v1beta1_Document_Page_FormField_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_documentai_v1beta1_Document_Page_FormField_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_documentai_v1beta1_Document_Page_DetectedLanguage_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_documentai_v1beta1_Document_Page_DetectedLanguage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_documentai_v1beta1_Document_Entity_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_documentai_v1beta1_Document_Entity_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_documentai_v1beta1_Document_EntityRelation_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_documentai_v1beta1_Document_EntityRelation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_documentai_v1beta1_Document_TextAnchor_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_documentai_v1beta1_Document_TextAnchor_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_documentai_v1beta1_Document_TextAnchor_TextSegment_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_documentai_v1beta1_Document_TextAnchor_TextSegment_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n.google/cloud/documentai/v1beta1/docume"
          + "nt.proto\022\037google.cloud.documentai.v1beta"
          + "1\032\034google/api/annotations.proto\032\037google/"
          + "api/field_behavior.proto\032.google/cloud/d"
          + "ocumentai/v1beta1/geometry.proto\032\027google"
          + "/rpc/status.proto\032\027google/type/color.pro"
          + "to\"\377$\n\010Document\022\r\n\003uri\030\001 \001(\tH\000\022\021\n\007conten"
          + "t\030\002 \001(\014H\000\022\021\n\tmime_type\030\003 \001(\t\022\014\n\004text\030\004 \001"
          + "(\t\022D\n\013text_styles\030\005 \003(\0132/.google.cloud.d"
          + "ocumentai.v1beta1.Document.Style\022=\n\005page"
          + "s\030\006 \003(\0132..google.cloud.documentai.v1beta"
          + "1.Document.Page\022B\n\010entities\030\007 \003(\01320.goog"
          + "le.cloud.documentai.v1beta1.Document.Ent"
          + "ity\022R\n\020entity_relations\030\010 \003(\01328.google.c"
          + "loud.documentai.v1beta1.Document.EntityR"
          + "elation\022G\n\nshard_info\030\t \001(\01323.google.clo"
          + "ud.documentai.v1beta1.Document.ShardInfo"
          + "\022!\n\005error\030\n \001(\0132\022.google.rpc.Status\032J\n\tS"
          + "hardInfo\022\023\n\013shard_index\030\001 \001(\003\022\023\n\013shard_c"
          + "ount\030\002 \001(\003\022\023\n\013text_offset\030\003 \001(\003\032\332\002\n\005Styl"
          + "e\022I\n\013text_anchor\030\001 \001(\01324.google.cloud.do"
          + "cumentai.v1beta1.Document.TextAnchor\022!\n\005"
          + "color\030\002 \001(\0132\022.google.type.Color\022,\n\020backg"
          + "round_color\030\003 \001(\0132\022.google.type.Color\022\023\n"
          + "\013font_weight\030\004 \001(\t\022\022\n\ntext_style\030\005 \001(\t\022\027"
          + "\n\017text_decoration\030\006 \001(\t\022K\n\tfont_size\030\007 \001"
          + "(\01328.google.cloud.documentai.v1beta1.Doc"
          + "ument.Style.FontSize\032&\n\010FontSize\022\014\n\004size"
          + "\030\001 \001(\002\022\014\n\004unit\030\002 \001(\t\032\366\032\n\004Page\022\023\n\013page_nu"
          + "mber\030\001 \001(\005\022K\n\tdimension\030\002 \001(\01328.google.c"
          + "loud.documentai.v1beta1.Document.Page.Di"
          + "mension\022E\n\006layout\030\003 \001(\01325.google.cloud.d"
          + "ocumentai.v1beta1.Document.Page.Layout\022["
          + "\n\022detected_languages\030\004 \003(\0132?.google.clou"
          + "d.documentai.v1beta1.Document.Page.Detec"
          + "tedLanguage\022D\n\006blocks\030\005 \003(\01324.google.clo"
          + "ud.documentai.v1beta1.Document.Page.Bloc"
          + "k\022L\n\nparagraphs\030\006 \003(\01328.google.cloud.doc"
          + "umentai.v1beta1.Document.Page.Paragraph\022"
          + "B\n\005lines\030\007 \003(\01323.google.cloud.documentai"
          + ".v1beta1.Document.Page.Line\022D\n\006tokens\030\010 "
          + "\003(\01324.google.cloud.documentai.v1beta1.Do"
          + "cument.Page.Token\022U\n\017visual_elements\030\t \003"
          + "(\0132<.google.cloud.documentai.v1beta1.Doc"
          + "ument.Page.VisualElement\022D\n\006tables\030\n \003(\013"
          + "24.google.cloud.documentai.v1beta1.Docum"
          + "ent.Page.Table\022M\n\013form_fields\030\013 \003(\01328.go"
          + "ogle.cloud.documentai.v1beta1.Document.P"
          + "age.FormField\0328\n\tDimension\022\r\n\005width\030\001 \001("
          + "\002\022\016\n\006height\030\002 \001(\002\022\014\n\004unit\030\003 \001(\t\032\354\002\n\006Layo"
          + "ut\022I\n\013text_anchor\030\001 \001(\01324.google.cloud.d"
          + "ocumentai.v1beta1.Document.TextAnchor\022\022\n"
          + "\nconfidence\030\002 \001(\002\022D\n\rbounding_poly\030\003 \001(\013"
          + "2-.google.cloud.documentai.v1beta1.Bound"
          + "ingPoly\022V\n\013orientation\030\004 \001(\0162A.google.cl"
          + "oud.documentai.v1beta1.Document.Page.Lay"
          + "out.Orientation\"e\n\013Orientation\022\033\n\027ORIENT"
          + "ATION_UNSPECIFIED\020\000\022\013\n\007PAGE_UP\020\001\022\016\n\nPAGE"
          + "_RIGHT\020\002\022\r\n\tPAGE_DOWN\020\003\022\r\n\tPAGE_LEFT\020\004\032\253"
          + "\001\n\005Block\022E\n\006layout\030\001 \001(\01325.google.cloud."
          + "documentai.v1beta1.Document.Page.Layout\022"
          + "[\n\022detected_languages\030\002 \003(\0132?.google.clo"
          + "ud.documentai.v1beta1.Document.Page.Dete"
          + "ctedLanguage\032\257\001\n\tParagraph\022E\n\006layout\030\001 \001"
          + "(\01325.google.cloud.documentai.v1beta1.Doc"
          + "ument.Page.Layout\022[\n\022detected_languages\030"
          + "\002 \003(\0132?.google.cloud.documentai.v1beta1."
          + "Document.Page.DetectedLanguage\032\252\001\n\004Line\022"
          + "E\n\006layout\030\001 \001(\01325.google.cloud.documenta"
          + "i.v1beta1.Document.Page.Layout\022[\n\022detect"
          + "ed_languages\030\002 \003(\0132?.google.cloud.docume"
          + "ntai.v1beta1.Document.Page.DetectedLangu"
          + "age\032\265\003\n\005Token\022E\n\006layout\030\001 \001(\01325.google.c"
          + "loud.documentai.v1beta1.Document.Page.La"
          + "yout\022Z\n\016detected_break\030\002 \001(\0132B.google.cl"
          + "oud.documentai.v1beta1.Document.Page.Tok"
          + "en.DetectedBreak\022[\n\022detected_languages\030\003"
          + " \003(\0132?.google.cloud.documentai.v1beta1.D"
          + "ocument.Page.DetectedLanguage\032\253\001\n\rDetect"
          + "edBreak\022U\n\004type\030\001 \001(\0162G.google.cloud.doc"
          + "umentai.v1beta1.Document.Page.Token.Dete"
          + "ctedBreak.Type\"C\n\004Type\022\024\n\020TYPE_UNSPECIFI"
          + "ED\020\000\022\t\n\005SPACE\020\001\022\016\n\nWIDE_SPACE\020\002\022\n\n\006HYPHE"
          + "N\020\003\032\301\001\n\rVisualElement\022E\n\006layout\030\001 \001(\01325."
          + "google.cloud.documentai.v1beta1.Document"
          + ".Page.Layout\022\014\n\004type\030\002 \001(\t\022[\n\022detected_l"
          + "anguages\030\003 \003(\0132?.google.cloud.documentai"
          + ".v1beta1.Document.Page.DetectedLanguage\032"
          + "\202\005\n\005Table\022E\n\006layout\030\001 \001(\01325.google.cloud"
          + ".documentai.v1beta1.Document.Page.Layout"
          + "\022R\n\013header_rows\030\002 \003(\0132=.google.cloud.doc"
          + "umentai.v1beta1.Document.Page.Table.Tabl"
          + "eRow\022P\n\tbody_rows\030\003 \003(\0132=.google.cloud.d"
          + "ocumentai.v1beta1.Document.Page.Table.Ta"
          + "bleRow\022[\n\022detected_languages\030\004 \003(\0132?.goo"
          + "gle.cloud.documentai.v1beta1.Document.Pa"
          + "ge.DetectedLanguage\032Y\n\010TableRow\022M\n\005cells"
          + "\030\001 \003(\0132>.google.cloud.documentai.v1beta1"
          + ".Document.Page.Table.TableCell\032\323\001\n\tTable"
          + "Cell\022E\n\006layout\030\001 \001(\01325.google.cloud.docu"
          + "mentai.v1beta1.Document.Page.Layout\022\020\n\010r"
          + "ow_span\030\002 \001(\005\022\020\n\010col_span\030\003 \001(\005\022[\n\022detec"
          + "ted_languages\030\004 \003(\0132?.google.cloud.docum"
          + "entai.v1beta1.Document.Page.DetectedLang"
          + "uage\032\347\002\n\tFormField\022I\n\nfield_name\030\001 \001(\01325"
          + ".google.cloud.documentai.v1beta1.Documen"
          + "t.Page.Layout\022J\n\013field_value\030\002 \001(\01325.goo"
          + "gle.cloud.documentai.v1beta1.Document.Pa"
          + "ge.Layout\022`\n\027name_detected_languages\030\003 \003"
          + "(\0132?.google.cloud.documentai.v1beta1.Doc"
          + "ument.Page.DetectedLanguage\022a\n\030value_det"
          + "ected_languages\030\004 \003(\0132?.google.cloud.doc"
          + "umentai.v1beta1.Document.Page.DetectedLa"
          + "nguage\032=\n\020DetectedLanguage\022\025\n\rlanguage_c"
          + "ode\030\001 \001(\t\022\022\n\nconfidence\030\002 \001(\002\032\220\001\n\006Entity"
          + "\022I\n\013text_anchor\030\001 \001(\01324.google.cloud.doc"
          + "umentai.v1beta1.Document.TextAnchor\022\021\n\004t"
          + "ype\030\002 \001(\tB\003\340A\002\022\024\n\014mention_text\030\003 \001(\t\022\022\n\n"
          + "mention_id\030\004 \001(\t\032I\n\016EntityRelation\022\022\n\nsu"
          + "bject_id\030\001 \001(\t\022\021\n\tobject_id\030\002 \001(\t\022\020\n\010rel"
          + "ation\030\003 \001(\t\032\234\001\n\nTextAnchor\022W\n\rtext_segme"
          + "nts\030\001 \003(\0132@.google.cloud.documentai.v1be"
          + "ta1.Document.TextAnchor.TextSegment\0325\n\013T"
          + "extSegment\022\023\n\013start_index\030\001 \001(\003\022\021\n\tend_i"
          + "ndex\030\002 \001(\003B\010\n\006sourceB\352\001\n#com.google.clou"
          + "d.documentai.v1beta1B\rDocumentProtoP\001ZIg"
          + "oogle.golang.org/genproto/googleapis/clo"
          + "ud/documentai/v1beta1;documentai\252\002\037Googl"
          + "e.Cloud.DocumentAI.V1Beta1\312\002\037Google\\Clou"
          + "d\\DocumentAI\\V1beta1\352\002\"Google::Cloud::Do"
          + "cumentAI::V1beta1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.cloud.documentai.v1beta1.GeometryProto.getDescriptor(),
              com.google.rpc.StatusProto.getDescriptor(),
              com.google.type.ColorProto.getDescriptor(),
            });
    internal_static_google_cloud_documentai_v1beta1_Document_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_documentai_v1beta1_Document_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_documentai_v1beta1_Document_descriptor,
            new java.lang.String[] {
              "Uri",
              "Content",
              "MimeType",
              "Text",
              "TextStyles",
              "Pages",
              "Entities",
              "EntityRelations",
              "ShardInfo",
              "Error",
              "Source",
            });
    internal_static_google_cloud_documentai_v1beta1_Document_ShardInfo_descriptor =
        internal_static_google_cloud_documentai_v1beta1_Document_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_documentai_v1beta1_Document_ShardInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_documentai_v1beta1_Document_ShardInfo_descriptor,
            new java.lang.String[] {
              "ShardIndex", "ShardCount", "TextOffset",
            });
    internal_static_google_cloud_documentai_v1beta1_Document_Style_descriptor =
        internal_static_google_cloud_documentai_v1beta1_Document_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_documentai_v1beta1_Document_Style_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_documentai_v1beta1_Document_Style_descriptor,
            new java.lang.String[] {
              "TextAnchor",
              "Color",
              "BackgroundColor",
              "FontWeight",
              "TextStyle",
              "TextDecoration",
              "FontSize",
            });
    internal_static_google_cloud_documentai_v1beta1_Document_Style_FontSize_descriptor =
        internal_static_google_cloud_documentai_v1beta1_Document_Style_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_documentai_v1beta1_Document_Style_FontSize_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_documentai_v1beta1_Document_Style_FontSize_descriptor,
            new java.lang.String[] {
              "Size", "Unit",
            });
    internal_static_google_cloud_documentai_v1beta1_Document_Page_descriptor =
        internal_static_google_cloud_documentai_v1beta1_Document_descriptor.getNestedTypes().get(2);
    internal_static_google_cloud_documentai_v1beta1_Document_Page_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_documentai_v1beta1_Document_Page_descriptor,
            new java.lang.String[] {
              "PageNumber",
              "Dimension",
              "Layout",
              "DetectedLanguages",
              "Blocks",
              "Paragraphs",
              "Lines",
              "Tokens",
              "VisualElements",
              "Tables",
              "FormFields",
            });
    internal_static_google_cloud_documentai_v1beta1_Document_Page_Dimension_descriptor =
        internal_static_google_cloud_documentai_v1beta1_Document_Page_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_documentai_v1beta1_Document_Page_Dimension_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_documentai_v1beta1_Document_Page_Dimension_descriptor,
            new java.lang.String[] {
              "Width", "Height", "Unit",
            });
    internal_static_google_cloud_documentai_v1beta1_Document_Page_Layout_descriptor =
        internal_static_google_cloud_documentai_v1beta1_Document_Page_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_documentai_v1beta1_Document_Page_Layout_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_documentai_v1beta1_Document_Page_Layout_descriptor,
            new java.lang.String[] {
              "TextAnchor", "Confidence", "BoundingPoly", "Orientation",
            });
    internal_static_google_cloud_documentai_v1beta1_Document_Page_Block_descriptor =
        internal_static_google_cloud_documentai_v1beta1_Document_Page_descriptor
            .getNestedTypes()
            .get(2);
    internal_static_google_cloud_documentai_v1beta1_Document_Page_Block_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_documentai_v1beta1_Document_Page_Block_descriptor,
            new java.lang.String[] {
              "Layout", "DetectedLanguages",
            });
    internal_static_google_cloud_documentai_v1beta1_Document_Page_Paragraph_descriptor =
        internal_static_google_cloud_documentai_v1beta1_Document_Page_descriptor
            .getNestedTypes()
            .get(3);
    internal_static_google_cloud_documentai_v1beta1_Document_Page_Paragraph_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_documentai_v1beta1_Document_Page_Paragraph_descriptor,
            new java.lang.String[] {
              "Layout", "DetectedLanguages",
            });
    internal_static_google_cloud_documentai_v1beta1_Document_Page_Line_descriptor =
        internal_static_google_cloud_documentai_v1beta1_Document_Page_descriptor
            .getNestedTypes()
            .get(4);
    internal_static_google_cloud_documentai_v1beta1_Document_Page_Line_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_documentai_v1beta1_Document_Page_Line_descriptor,
            new java.lang.String[] {
              "Layout", "DetectedLanguages",
            });
    internal_static_google_cloud_documentai_v1beta1_Document_Page_Token_descriptor =
        internal_static_google_cloud_documentai_v1beta1_Document_Page_descriptor
            .getNestedTypes()
            .get(5);
    internal_static_google_cloud_documentai_v1beta1_Document_Page_Token_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_documentai_v1beta1_Document_Page_Token_descriptor,
            new java.lang.String[] {
              "Layout", "DetectedBreak", "DetectedLanguages",
            });
    internal_static_google_cloud_documentai_v1beta1_Document_Page_Token_DetectedBreak_descriptor =
        internal_static_google_cloud_documentai_v1beta1_Document_Page_Token_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_documentai_v1beta1_Document_Page_Token_DetectedBreak_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_documentai_v1beta1_Document_Page_Token_DetectedBreak_descriptor,
            new java.lang.String[] {
              "Type",
            });
    internal_static_google_cloud_documentai_v1beta1_Document_Page_VisualElement_descriptor =
        internal_static_google_cloud_documentai_v1beta1_Document_Page_descriptor
            .getNestedTypes()
            .get(6);
    internal_static_google_cloud_documentai_v1beta1_Document_Page_VisualElement_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_documentai_v1beta1_Document_Page_VisualElement_descriptor,
            new java.lang.String[] {
              "Layout", "Type", "DetectedLanguages",
            });
    internal_static_google_cloud_documentai_v1beta1_Document_Page_Table_descriptor =
        internal_static_google_cloud_documentai_v1beta1_Document_Page_descriptor
            .getNestedTypes()
            .get(7);
    internal_static_google_cloud_documentai_v1beta1_Document_Page_Table_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_documentai_v1beta1_Document_Page_Table_descriptor,
            new java.lang.String[] {
              "Layout", "HeaderRows", "BodyRows", "DetectedLanguages",
            });
    internal_static_google_cloud_documentai_v1beta1_Document_Page_Table_TableRow_descriptor =
        internal_static_google_cloud_documentai_v1beta1_Document_Page_Table_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_documentai_v1beta1_Document_Page_Table_TableRow_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_documentai_v1beta1_Document_Page_Table_TableRow_descriptor,
            new java.lang.String[] {
              "Cells",
            });
    internal_static_google_cloud_documentai_v1beta1_Document_Page_Table_TableCell_descriptor =
        internal_static_google_cloud_documentai_v1beta1_Document_Page_Table_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_documentai_v1beta1_Document_Page_Table_TableCell_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_documentai_v1beta1_Document_Page_Table_TableCell_descriptor,
            new java.lang.String[] {
              "Layout", "RowSpan", "ColSpan", "DetectedLanguages",
            });
    internal_static_google_cloud_documentai_v1beta1_Document_Page_FormField_descriptor =
        internal_static_google_cloud_documentai_v1beta1_Document_Page_descriptor
            .getNestedTypes()
            .get(8);
    internal_static_google_cloud_documentai_v1beta1_Document_Page_FormField_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_documentai_v1beta1_Document_Page_FormField_descriptor,
            new java.lang.String[] {
              "FieldName", "FieldValue", "NameDetectedLanguages", "ValueDetectedLanguages",
            });
    internal_static_google_cloud_documentai_v1beta1_Document_Page_DetectedLanguage_descriptor =
        internal_static_google_cloud_documentai_v1beta1_Document_Page_descriptor
            .getNestedTypes()
            .get(9);
    internal_static_google_cloud_documentai_v1beta1_Document_Page_DetectedLanguage_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_documentai_v1beta1_Document_Page_DetectedLanguage_descriptor,
            new java.lang.String[] {
              "LanguageCode", "Confidence",
            });
    internal_static_google_cloud_documentai_v1beta1_Document_Entity_descriptor =
        internal_static_google_cloud_documentai_v1beta1_Document_descriptor.getNestedTypes().get(3);
    internal_static_google_cloud_documentai_v1beta1_Document_Entity_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_documentai_v1beta1_Document_Entity_descriptor,
            new java.lang.String[] {
              "TextAnchor", "Type", "MentionText", "MentionId",
            });
    internal_static_google_cloud_documentai_v1beta1_Document_EntityRelation_descriptor =
        internal_static_google_cloud_documentai_v1beta1_Document_descriptor.getNestedTypes().get(4);
    internal_static_google_cloud_documentai_v1beta1_Document_EntityRelation_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_documentai_v1beta1_Document_EntityRelation_descriptor,
            new java.lang.String[] {
              "SubjectId", "ObjectId", "Relation",
            });
    internal_static_google_cloud_documentai_v1beta1_Document_TextAnchor_descriptor =
        internal_static_google_cloud_documentai_v1beta1_Document_descriptor.getNestedTypes().get(5);
    internal_static_google_cloud_documentai_v1beta1_Document_TextAnchor_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_documentai_v1beta1_Document_TextAnchor_descriptor,
            new java.lang.String[] {
              "TextSegments",
            });
    internal_static_google_cloud_documentai_v1beta1_Document_TextAnchor_TextSegment_descriptor =
        internal_static_google_cloud_documentai_v1beta1_Document_TextAnchor_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_documentai_v1beta1_Document_TextAnchor_TextSegment_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_documentai_v1beta1_Document_TextAnchor_TextSegment_descriptor,
            new java.lang.String[] {
              "StartIndex", "EndIndex",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.cloud.documentai.v1beta1.GeometryProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
    com.google.type.ColorProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
