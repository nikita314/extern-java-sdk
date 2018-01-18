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
import ru.skbkontur.sdk.extern.rest.swagger.model.Address;
import ru.skbkontur.sdk.extern.rest.swagger.model.EmployeeInfo;
import ru.skbkontur.sdk.extern.rest.swagger.model.FnsInfo;
import ru.skbkontur.sdk.extern.rest.swagger.model.FssInfo;
import ru.skbkontur.sdk.extern.rest.swagger.model.IndividualInfo;
import ru.skbkontur.sdk.extern.rest.swagger.model.OmsInfo;
import ru.skbkontur.sdk.extern.rest.swagger.model.OrganizationInfo;
import ru.skbkontur.sdk.extern.rest.swagger.model.PfrInfo;

/**
 * AccountInfo
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-01-18T09:09:47.467+03:00")
public class AccountInfo {
  /**
   * Gets or Sets type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    NUMBER_1(1),
    
    NUMBER_2(2),
    
    NUMBER_3(3),
    
    NUMBER_4(4);

    private Integer value;

    TypeEnum(Integer value) {
      this.value = value;
    }

    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        Integer value = jsonReader.nextInt();
        return TypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("type")
  private TypeEnum type = null;

  @SerializedName("inn")
  private String inn = null;

  @SerializedName("full-name")
  private String fullName = null;

  @SerializedName("short-name")
  private String shortName = null;

  @SerializedName("ogrn")
  private String ogrn = null;

  @SerializedName("okato")
  private String okato = null;

  @SerializedName("oktmo")
  private String oktmo = null;

  @SerializedName("okved")
  private String okved = null;

  @SerializedName("okpo")
  private String okpo = null;

  @SerializedName("chief")
  private EmployeeInfo chief = null;

  @SerializedName("phone")
  private String phone = null;

  @SerializedName("address-registration")
  private Address addressRegistration = null;

  @SerializedName("address-actual")
  private Address addressActual = null;

  @SerializedName("pfr")
  private PfrInfo pfr = null;

  @SerializedName("fss")
  private FssInfo fss = null;

  @SerializedName("fns")
  private FnsInfo fns = null;

  @SerializedName("oms")
  private OmsInfo oms = null;

  @SerializedName("organization")
  private OrganizationInfo organization = null;

  @SerializedName("individual")
  private IndividualInfo individual = null;

  public AccountInfo type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public AccountInfo inn(String inn) {
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

  public AccountInfo fullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

   /**
   * Get fullName
   * @return fullName
  **/
  @ApiModelProperty(value = "")
  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public AccountInfo shortName(String shortName) {
    this.shortName = shortName;
    return this;
  }

   /**
   * Get shortName
   * @return shortName
  **/
  @ApiModelProperty(value = "")
  public String getShortName() {
    return shortName;
  }

  public void setShortName(String shortName) {
    this.shortName = shortName;
  }

  public AccountInfo ogrn(String ogrn) {
    this.ogrn = ogrn;
    return this;
  }

   /**
   * Get ogrn
   * @return ogrn
  **/
  @ApiModelProperty(value = "")
  public String getOgrn() {
    return ogrn;
  }

  public void setOgrn(String ogrn) {
    this.ogrn = ogrn;
  }

  public AccountInfo okato(String okato) {
    this.okato = okato;
    return this;
  }

   /**
   * Get okato
   * @return okato
  **/
  @ApiModelProperty(value = "")
  public String getOkato() {
    return okato;
  }

  public void setOkato(String okato) {
    this.okato = okato;
  }

  public AccountInfo oktmo(String oktmo) {
    this.oktmo = oktmo;
    return this;
  }

   /**
   * Get oktmo
   * @return oktmo
  **/
  @ApiModelProperty(value = "")
  public String getOktmo() {
    return oktmo;
  }

  public void setOktmo(String oktmo) {
    this.oktmo = oktmo;
  }

  public AccountInfo okved(String okved) {
    this.okved = okved;
    return this;
  }

   /**
   * Get okved
   * @return okved
  **/
  @ApiModelProperty(value = "")
  public String getOkved() {
    return okved;
  }

  public void setOkved(String okved) {
    this.okved = okved;
  }

  public AccountInfo okpo(String okpo) {
    this.okpo = okpo;
    return this;
  }

   /**
   * Get okpo
   * @return okpo
  **/
  @ApiModelProperty(value = "")
  public String getOkpo() {
    return okpo;
  }

  public void setOkpo(String okpo) {
    this.okpo = okpo;
  }

  public AccountInfo chief(EmployeeInfo chief) {
    this.chief = chief;
    return this;
  }

   /**
   * Get chief
   * @return chief
  **/
  @ApiModelProperty(value = "")
  public EmployeeInfo getChief() {
    return chief;
  }

  public void setChief(EmployeeInfo chief) {
    this.chief = chief;
  }

  public AccountInfo phone(String phone) {
    this.phone = phone;
    return this;
  }

   /**
   * Get phone
   * @return phone
  **/
  @ApiModelProperty(value = "")
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public AccountInfo addressRegistration(Address addressRegistration) {
    this.addressRegistration = addressRegistration;
    return this;
  }

   /**
   * Get addressRegistration
   * @return addressRegistration
  **/
  @ApiModelProperty(value = "")
  public Address getAddressRegistration() {
    return addressRegistration;
  }

  public void setAddressRegistration(Address addressRegistration) {
    this.addressRegistration = addressRegistration;
  }

  public AccountInfo addressActual(Address addressActual) {
    this.addressActual = addressActual;
    return this;
  }

   /**
   * Get addressActual
   * @return addressActual
  **/
  @ApiModelProperty(value = "")
  public Address getAddressActual() {
    return addressActual;
  }

  public void setAddressActual(Address addressActual) {
    this.addressActual = addressActual;
  }

  public AccountInfo pfr(PfrInfo pfr) {
    this.pfr = pfr;
    return this;
  }

   /**
   * Get pfr
   * @return pfr
  **/
  @ApiModelProperty(value = "")
  public PfrInfo getPfr() {
    return pfr;
  }

  public void setPfr(PfrInfo pfr) {
    this.pfr = pfr;
  }

  public AccountInfo fss(FssInfo fss) {
    this.fss = fss;
    return this;
  }

   /**
   * Get fss
   * @return fss
  **/
  @ApiModelProperty(value = "")
  public FssInfo getFss() {
    return fss;
  }

  public void setFss(FssInfo fss) {
    this.fss = fss;
  }

  public AccountInfo fns(FnsInfo fns) {
    this.fns = fns;
    return this;
  }

   /**
   * Get fns
   * @return fns
  **/
  @ApiModelProperty(value = "")
  public FnsInfo getFns() {
    return fns;
  }

  public void setFns(FnsInfo fns) {
    this.fns = fns;
  }

  public AccountInfo oms(OmsInfo oms) {
    this.oms = oms;
    return this;
  }

   /**
   * Get oms
   * @return oms
  **/
  @ApiModelProperty(value = "")
  public OmsInfo getOms() {
    return oms;
  }

  public void setOms(OmsInfo oms) {
    this.oms = oms;
  }

  public AccountInfo organization(OrganizationInfo organization) {
    this.organization = organization;
    return this;
  }

   /**
   * Get organization
   * @return organization
  **/
  @ApiModelProperty(value = "")
  public OrganizationInfo getOrganization() {
    return organization;
  }

  public void setOrganization(OrganizationInfo organization) {
    this.organization = organization;
  }

  public AccountInfo individual(IndividualInfo individual) {
    this.individual = individual;
    return this;
  }

   /**
   * Get individual
   * @return individual
  **/
  @ApiModelProperty(value = "")
  public IndividualInfo getIndividual() {
    return individual;
  }

  public void setIndividual(IndividualInfo individual) {
    this.individual = individual;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountInfo accountInfo = (AccountInfo) o;
    return Objects.equals(this.type, accountInfo.type) &&
        Objects.equals(this.inn, accountInfo.inn) &&
        Objects.equals(this.fullName, accountInfo.fullName) &&
        Objects.equals(this.shortName, accountInfo.shortName) &&
        Objects.equals(this.ogrn, accountInfo.ogrn) &&
        Objects.equals(this.okato, accountInfo.okato) &&
        Objects.equals(this.oktmo, accountInfo.oktmo) &&
        Objects.equals(this.okved, accountInfo.okved) &&
        Objects.equals(this.okpo, accountInfo.okpo) &&
        Objects.equals(this.chief, accountInfo.chief) &&
        Objects.equals(this.phone, accountInfo.phone) &&
        Objects.equals(this.addressRegistration, accountInfo.addressRegistration) &&
        Objects.equals(this.addressActual, accountInfo.addressActual) &&
        Objects.equals(this.pfr, accountInfo.pfr) &&
        Objects.equals(this.fss, accountInfo.fss) &&
        Objects.equals(this.fns, accountInfo.fns) &&
        Objects.equals(this.oms, accountInfo.oms) &&
        Objects.equals(this.organization, accountInfo.organization) &&
        Objects.equals(this.individual, accountInfo.individual);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, inn, fullName, shortName, ogrn, okato, oktmo, okved, okpo, chief, phone, addressRegistration, addressActual, pfr, fss, fns, oms, organization, individual);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountInfo {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    inn: ").append(toIndentedString(inn)).append("\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    shortName: ").append(toIndentedString(shortName)).append("\n");
    sb.append("    ogrn: ").append(toIndentedString(ogrn)).append("\n");
    sb.append("    okato: ").append(toIndentedString(okato)).append("\n");
    sb.append("    oktmo: ").append(toIndentedString(oktmo)).append("\n");
    sb.append("    okved: ").append(toIndentedString(okved)).append("\n");
    sb.append("    okpo: ").append(toIndentedString(okpo)).append("\n");
    sb.append("    chief: ").append(toIndentedString(chief)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    addressRegistration: ").append(toIndentedString(addressRegistration)).append("\n");
    sb.append("    addressActual: ").append(toIndentedString(addressActual)).append("\n");
    sb.append("    pfr: ").append(toIndentedString(pfr)).append("\n");
    sb.append("    fss: ").append(toIndentedString(fss)).append("\n");
    sb.append("    fns: ").append(toIndentedString(fns)).append("\n");
    sb.append("    oms: ").append(toIndentedString(oms)).append("\n");
    sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
    sb.append("    individual: ").append(toIndentedString(individual)).append("\n");
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

