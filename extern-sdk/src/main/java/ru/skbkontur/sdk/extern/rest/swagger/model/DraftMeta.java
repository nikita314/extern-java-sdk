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
import ru.skbkontur.sdk.extern.rest.swagger.model.AccountInfo;
import ru.skbkontur.sdk.extern.rest.swagger.model.RecipientInfo;
import ru.skbkontur.sdk.extern.rest.swagger.model.SenderInfo;

/**
 * DraftMeta
 */

public class DraftMeta {
  @SerializedName("sender")
  private SenderInfo sender = null;

  @SerializedName("recipient")
  private RecipientInfo recipient = null;

  @SerializedName("organization")
  private AccountInfo organization = null;

  public DraftMeta sender(SenderInfo sender) {
    this.sender = sender;
    return this;
  }

   /**
   * Get sender
   * @return sender
  **/
  @ApiModelProperty(value = "")
  public SenderInfo getSender() {
    return sender;
  }

  public void setSender(SenderInfo sender) {
    this.sender = sender;
  }

  public DraftMeta recipient(RecipientInfo recipient) {
    this.recipient = recipient;
    return this;
  }

   /**
   * Get recipient
   * @return recipient
  **/
  @ApiModelProperty(value = "")
  public RecipientInfo getRecipient() {
    return recipient;
  }

  public void setRecipient(RecipientInfo recipient) {
    this.recipient = recipient;
  }

  public DraftMeta organization(AccountInfo organization) {
    this.organization = organization;
    return this;
  }

   /**
   * Get organization
   * @return organization
  **/
  @ApiModelProperty(value = "")
  public AccountInfo getOrganization() {
    return organization;
  }

  public void setOrganization(AccountInfo organization) {
    this.organization = organization;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DraftMeta draftMeta = (DraftMeta) o;
    return Objects.equals(this.sender, draftMeta.sender) &&
        Objects.equals(this.recipient, draftMeta.recipient) &&
        Objects.equals(this.organization, draftMeta.organization);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sender, recipient, organization);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DraftMeta {\n");
    
    sb.append("    sender: ").append(toIndentedString(sender)).append("\n");
    sb.append("    recipient: ").append(toIndentedString(recipient)).append("\n");
    sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
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

