/*
 * Kontur.Extern.Api.Public
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package ru.skbkontur.sdk.extern.rest.swagger.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import ru.skbkontur.sdk.extern.rest.swagger.model.Urn;

/**
 * DocumentMeta
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-01-19T09:43:00.717+03:00")
public class DocumentMeta {
  @SerializedName("type")
  private Urn type = null;

  @SerializedName("filename")
  private String filename = null;

  @SerializedName("content-type")
  private String contentType = null;

  @SerializedName("encrypted")
  private Boolean encrypted = null;

  @SerializedName("compression-type")
  private Urn compressionType = null;

  public DocumentMeta type(Urn type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
  public Urn getType() {
    return type;
  }

  public void setType(Urn type) {
    this.type = type;
  }

  public DocumentMeta filename(String filename) {
    this.filename = filename;
    return this;
  }

   /**
   * Get filename
   * @return filename
  **/
  @ApiModelProperty(value = "")
  public String getFilename() {
    return filename;
  }

  public void setFilename(String filename) {
    this.filename = filename;
  }

  public DocumentMeta contentType(String contentType) {
    this.contentType = contentType;
    return this;
  }

   /**
   * Get contentType
   * @return contentType
  **/
  @ApiModelProperty(value = "")
  public String getContentType() {
    return contentType;
  }

  public void setContentType(String contentType) {
    this.contentType = contentType;
  }

  public DocumentMeta encrypted(Boolean encrypted) {
    this.encrypted = encrypted;
    return this;
  }

   /**
   * Get encrypted
   * @return encrypted
  **/
  @ApiModelProperty(value = "")
  public Boolean getEncrypted() {
    return encrypted;
  }

  public void setEncrypted(Boolean encrypted) {
    this.encrypted = encrypted;
  }

  public DocumentMeta compressionType(Urn compressionType) {
    this.compressionType = compressionType;
    return this;
  }

   /**
   * Get compressionType
   * @return compressionType
  **/
  @ApiModelProperty(value = "")
  public Urn getCompressionType() {
    return compressionType;
  }

  public void setCompressionType(Urn compressionType) {
    this.compressionType = compressionType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentMeta documentMeta = (DocumentMeta) o;
    return Objects.equals(this.type, documentMeta.type) &&
        Objects.equals(this.filename, documentMeta.filename) &&
        Objects.equals(this.contentType, documentMeta.contentType) &&
        Objects.equals(this.encrypted, documentMeta.encrypted) &&
        Objects.equals(this.compressionType, documentMeta.compressionType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, filename, contentType, encrypted, compressionType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentMeta {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    encrypted: ").append(toIndentedString(encrypted)).append("\n");
    sb.append("    compressionType: ").append(toIndentedString(compressionType)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

