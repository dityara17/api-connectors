/*
 * BitMEX API
 * ## REST API for the BitMEX Trading Platform  [View Changelog](/app/apiChangelog)    #### Getting Started  Base URI: [https://www.bitmex.com/api/v1](/api/v1)  ##### Fetching Data  All REST endpoints are documented below. You can try out any query right from this interface.  Most table queries accept `count`, `start`, and `reverse` params. Set `reverse=true` to get rows newest-first.  Additional documentation regarding filters, timestamps, and authentication is available in [the main API documentation](/app/restAPI).  *All* table data is available via the [Websocket](/app/wsAPI). We highly recommend using the socket if you want to have the quickest possible data without being subject to ratelimits.  ##### Return Types  By default, all data is returned as JSON. Send `?_format=csv` to get CSV data or `?_format=xml` to get XML data.  ##### Trade Data Queries  *This is only a small subset of what is available, to get you started.*  Fill in the parameters and click the `Try it out!` button to try any of these queries.  * [Pricing Data](#!/Quote/Quote_get)  * [Trade Data](#!/Trade/Trade_get)  * [OrderBook Data](#!/OrderBook/OrderBook_getL2)  * [Settlement Data](#!/Settlement/Settlement_get)  * [Exchange Statistics](#!/Stats/Stats_history)  Every function of the BitMEX.com platform is exposed here and documented. Many more functions are available.  ##### Swagger Specification  [⇩ Download Swagger JSON](swagger.json)    ## All API Endpoints  Click to expand a section. 
 *
 * OpenAPI spec version: 1.2.0
 * Contact: support@bitmex.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import org.threeten.bp.OffsetDateTime;

/**
 * Transaction
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-05-30T12:55:43.198-05:00")
public class Transaction {
  @SerializedName("transactID")
  private String transactID = null;

  @SerializedName("account")
  private BigDecimal account = null;

  @SerializedName("currency")
  private String currency = null;

  @SerializedName("transactType")
  private String transactType = null;

  @SerializedName("amount")
  private BigDecimal amount = null;

  @SerializedName("fee")
  private BigDecimal fee = null;

  @SerializedName("transactStatus")
  private String transactStatus = null;

  @SerializedName("address")
  private String address = null;

  @SerializedName("tx")
  private String tx = null;

  @SerializedName("text")
  private String text = null;

  @SerializedName("transactTime")
  private OffsetDateTime transactTime = null;

  @SerializedName("timestamp")
  private OffsetDateTime timestamp = null;

  public Transaction transactID(String transactID) {
    this.transactID = transactID;
    return this;
  }

   /**
   * Get transactID
   * @return transactID
  **/
  @ApiModelProperty(required = true, value = "")
  public String getTransactID() {
    return transactID;
  }

  public void setTransactID(String transactID) {
    this.transactID = transactID;
  }

  public Transaction account(BigDecimal account) {
    this.account = account;
    return this;
  }

   /**
   * Get account
   * @return account
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getAccount() {
    return account;
  }

  public void setAccount(BigDecimal account) {
    this.account = account;
  }

  public Transaction currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @ApiModelProperty(value = "")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public Transaction transactType(String transactType) {
    this.transactType = transactType;
    return this;
  }

   /**
   * Get transactType
   * @return transactType
  **/
  @ApiModelProperty(value = "")
  public String getTransactType() {
    return transactType;
  }

  public void setTransactType(String transactType) {
    this.transactType = transactType;
  }

  public Transaction amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public Transaction fee(BigDecimal fee) {
    this.fee = fee;
    return this;
  }

   /**
   * Get fee
   * @return fee
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getFee() {
    return fee;
  }

  public void setFee(BigDecimal fee) {
    this.fee = fee;
  }

  public Transaction transactStatus(String transactStatus) {
    this.transactStatus = transactStatus;
    return this;
  }

   /**
   * Get transactStatus
   * @return transactStatus
  **/
  @ApiModelProperty(value = "")
  public String getTransactStatus() {
    return transactStatus;
  }

  public void setTransactStatus(String transactStatus) {
    this.transactStatus = transactStatus;
  }

  public Transaction address(String address) {
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @ApiModelProperty(value = "")
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public Transaction tx(String tx) {
    this.tx = tx;
    return this;
  }

   /**
   * Get tx
   * @return tx
  **/
  @ApiModelProperty(value = "")
  public String getTx() {
    return tx;
  }

  public void setTx(String tx) {
    this.tx = tx;
  }

  public Transaction text(String text) {
    this.text = text;
    return this;
  }

   /**
   * Get text
   * @return text
  **/
  @ApiModelProperty(value = "")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public Transaction transactTime(OffsetDateTime transactTime) {
    this.transactTime = transactTime;
    return this;
  }

   /**
   * Get transactTime
   * @return transactTime
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getTransactTime() {
    return transactTime;
  }

  public void setTransactTime(OffsetDateTime transactTime) {
    this.transactTime = transactTime;
  }

  public Transaction timestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Get timestamp
   * @return timestamp
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Transaction transaction = (Transaction) o;
    return Objects.equals(this.transactID, transaction.transactID) &&
        Objects.equals(this.account, transaction.account) &&
        Objects.equals(this.currency, transaction.currency) &&
        Objects.equals(this.transactType, transaction.transactType) &&
        Objects.equals(this.amount, transaction.amount) &&
        Objects.equals(this.fee, transaction.fee) &&
        Objects.equals(this.transactStatus, transaction.transactStatus) &&
        Objects.equals(this.address, transaction.address) &&
        Objects.equals(this.tx, transaction.tx) &&
        Objects.equals(this.text, transaction.text) &&
        Objects.equals(this.transactTime, transaction.transactTime) &&
        Objects.equals(this.timestamp, transaction.timestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactID, account, currency, transactType, amount, fee, transactStatus, address, tx, text, transactTime, timestamp);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Transaction {\n");
    
    sb.append("    transactID: ").append(toIndentedString(transactID)).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    transactType: ").append(toIndentedString(transactType)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    fee: ").append(toIndentedString(fee)).append("\n");
    sb.append("    transactStatus: ").append(toIndentedString(transactStatus)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    tx: ").append(toIndentedString(tx)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    transactTime: ").append(toIndentedString(transactTime)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
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

