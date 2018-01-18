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
 * PfrInfo
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-01-18T09:09:47.467+03:00")
public class PfrInfo {
  @SerializedName("category-code")
  private String categoryCode = null;

  @SerializedName("registration-number")
  private String registrationNumber = null;

  @SerializedName("registration-number-ip")
  private String registrationNumberIp = null;

  public PfrInfo categoryCode(String categoryCode) {
    this.categoryCode = categoryCode;
    return this;
  }

   /**
   * Get categoryCode
   * @return categoryCode
  **/
  @ApiModelProperty(value = "")
  public String getCategoryCode() {
    return categoryCode;
  }

  public void setCategoryCode(String categoryCode) {
    this.categoryCode = categoryCode;
  }

  public PfrInfo registrationNumber(String registrationNumber) {
    this.registrationNumber = registrationNumber;
    return this;
  }

   /**
   * Get registrationNumber
   * @return registrationNumber
  **/
  @ApiModelProperty(value = "")
  public String getRegistrationNumber() {
    return registrationNumber;
  }

  public void setRegistrationNumber(String registrationNumber) {
    this.registrationNumber = registrationNumber;
  }

  public PfrInfo registrationNumberIp(String registrationNumberIp) {
    this.registrationNumberIp = registrationNumberIp;
    return this;
  }

   /**
   * Get registrationNumberIp
   * @return registrationNumberIp
  **/
  @ApiModelProperty(value = "")
  public String getRegistrationNumberIp() {
    return registrationNumberIp;
  }

  public void setRegistrationNumberIp(String registrationNumberIp) {
    this.registrationNumberIp = registrationNumberIp;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PfrInfo pfrInfo = (PfrInfo) o;
    return Objects.equals(this.categoryCode, pfrInfo.categoryCode) &&
        Objects.equals(this.registrationNumber, pfrInfo.registrationNumber) &&
        Objects.equals(this.registrationNumberIp, pfrInfo.registrationNumberIp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(categoryCode, registrationNumber, registrationNumberIp);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PfrInfo {\n");
    
    sb.append("    categoryCode: ").append(toIndentedString(categoryCode)).append("\n");
    sb.append("    registrationNumber: ").append(toIndentedString(registrationNumber)).append("\n");
    sb.append("    registrationNumberIp: ").append(toIndentedString(registrationNumberIp)).append("\n");
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

