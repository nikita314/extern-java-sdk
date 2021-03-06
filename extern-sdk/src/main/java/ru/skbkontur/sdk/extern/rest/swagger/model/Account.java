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
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import ru.skbkontur.sdk.extern.rest.swagger.model.Link;

/**
 * Account
 */

public class Account {
  @SerializedName("id")
  private UUID id = null;

  @SerializedName("inn")
  private String inn = null;

  @SerializedName("kpp")
  private String kpp = null;

  @SerializedName("organization-name")
  private String organizationName = null;

  @SerializedName("links")
  private List<Link> links = null;

  public Account id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "00000000-0000-0000-0000-000000000000", value = "")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public Account inn(String inn) {
    this.inn = inn;
    return this;
  }

   /**
   * Get inn
   * @return inn
  **/
  @ApiModelProperty(value = "")
  public String getInn() {
    return inn;
  }

  public void setInn(String inn) {
    this.inn = inn;
  }

  public Account kpp(String kpp) {
    this.kpp = kpp;
    return this;
  }

   /**
   * Get kpp
   * @return kpp
  **/
  @ApiModelProperty(value = "")
  public String getKpp() {
    return kpp;
  }

  public void setKpp(String kpp) {
    this.kpp = kpp;
  }

  public Account organizationName(String organizationName) {
    this.organizationName = organizationName;
    return this;
  }

   /**
   * Get organizationName
   * @return organizationName
  **/
  @ApiModelProperty(value = "")
  public String getOrganizationName() {
    return organizationName;
  }

  public void setOrganizationName(String organizationName) {
    this.organizationName = organizationName;
  }

  public Account links(List<Link> links) {
    this.links = links;
    return this;
  }

  public Account addLinksItem(Link linksItem) {
    if (this.links == null) {
      this.links = new ArrayList<Link>();
    }
    this.links.add(linksItem);
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(value = "")
  public List<Link> getLinks() {
    return links;
  }

  public void setLinks(List<Link> links) {
    this.links = links;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Account account = (Account) o;
    return Objects.equals(this.id, account.id) &&
        Objects.equals(this.inn, account.inn) &&
        Objects.equals(this.kpp, account.kpp) &&
        Objects.equals(this.organizationName, account.organizationName) &&
        Objects.equals(this.links, account.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, inn, kpp, organizationName, links);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Account {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    inn: ").append(toIndentedString(inn)).append("\n");
    sb.append("    kpp: ").append(toIndentedString(kpp)).append("\n");
    sb.append("    organizationName: ").append(toIndentedString(organizationName)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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

