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
import org.joda.time.DateTime;

/**
 * PassportInfo
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-01-18T09:09:47.467+03:00")
public class PassportInfo {
  @SerializedName("code")
  private String code = null;

  @SerializedName("series-number")
  private String seriesNumber = null;

  @SerializedName("issued-date")
  private DateTime issuedDate = null;

  @SerializedName("issued-by")
  private String issuedBy = null;

  public PassportInfo code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @ApiModelProperty(value = "")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public PassportInfo seriesNumber(String seriesNumber) {
    this.seriesNumber = seriesNumber;
    return this;
  }

   /**
   * Get seriesNumber
   * @return seriesNumber
  **/
  @ApiModelProperty(value = "")
  public String getSeriesNumber() {
    return seriesNumber;
  }

  public void setSeriesNumber(String seriesNumber) {
    this.seriesNumber = seriesNumber;
  }

  public PassportInfo issuedDate(DateTime issuedDate) {
    this.issuedDate = issuedDate;
    return this;
  }

   /**
   * Get issuedDate
   * @return issuedDate
  **/
  @ApiModelProperty(value = "")
  public DateTime getIssuedDate() {
    return issuedDate;
  }

  public void setIssuedDate(DateTime issuedDate) {
    this.issuedDate = issuedDate;
  }

  public PassportInfo issuedBy(String issuedBy) {
    this.issuedBy = issuedBy;
    return this;
  }

   /**
   * Get issuedBy
   * @return issuedBy
  **/
  @ApiModelProperty(value = "")
  public String getIssuedBy() {
    return issuedBy;
  }

  public void setIssuedBy(String issuedBy) {
    this.issuedBy = issuedBy;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PassportInfo passportInfo = (PassportInfo) o;
    return Objects.equals(this.code, passportInfo.code) &&
        Objects.equals(this.seriesNumber, passportInfo.seriesNumber) &&
        Objects.equals(this.issuedDate, passportInfo.issuedDate) &&
        Objects.equals(this.issuedBy, passportInfo.issuedBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, seriesNumber, issuedDate, issuedBy);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PassportInfo {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    seriesNumber: ").append(toIndentedString(seriesNumber)).append("\n");
    sb.append("    issuedDate: ").append(toIndentedString(issuedDate)).append("\n");
    sb.append("    issuedBy: ").append(toIndentedString(issuedBy)).append("\n");
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

