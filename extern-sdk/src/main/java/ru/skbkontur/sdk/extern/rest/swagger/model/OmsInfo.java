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

/**
 * OmsInfo
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-01-19T09:43:00.717+03:00")
public class OmsInfo {
  @SerializedName("tfoms")
  private String tfoms = null;

  public OmsInfo tfoms(String tfoms) {
    this.tfoms = tfoms;
    return this;
  }

   /**
   * Get tfoms
   * @return tfoms
  **/
  @ApiModelProperty(value = "")
  public String getTfoms() {
    return tfoms;
  }

  public void setTfoms(String tfoms) {
    this.tfoms = tfoms;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OmsInfo omsInfo = (OmsInfo) o;
    return Objects.equals(this.tfoms, omsInfo.tfoms);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tfoms);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OmsInfo {\n");
    
    sb.append("    tfoms: ").append(toIndentedString(tfoms)).append("\n");
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

