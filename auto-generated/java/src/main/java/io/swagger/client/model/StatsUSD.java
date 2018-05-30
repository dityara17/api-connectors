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

/**
 * StatsUSD
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-05-30T12:55:43.198-05:00")
public class StatsUSD {
  @SerializedName("rootSymbol")
  private String rootSymbol = null;

  @SerializedName("currency")
  private String currency = null;

  @SerializedName("turnover24h")
  private BigDecimal turnover24h = null;

  @SerializedName("turnover30d")
  private BigDecimal turnover30d = null;

  @SerializedName("turnover365d")
  private BigDecimal turnover365d = null;

  @SerializedName("turnover")
  private BigDecimal turnover = null;

  public StatsUSD rootSymbol(String rootSymbol) {
    this.rootSymbol = rootSymbol;
    return this;
  }

   /**
   * Get rootSymbol
   * @return rootSymbol
  **/
  @ApiModelProperty(required = true, value = "")
  public String getRootSymbol() {
    return rootSymbol;
  }

  public void setRootSymbol(String rootSymbol) {
    this.rootSymbol = rootSymbol;
  }

  public StatsUSD currency(String currency) {
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

  public StatsUSD turnover24h(BigDecimal turnover24h) {
    this.turnover24h = turnover24h;
    return this;
  }

   /**
   * Get turnover24h
   * @return turnover24h
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getTurnover24h() {
    return turnover24h;
  }

  public void setTurnover24h(BigDecimal turnover24h) {
    this.turnover24h = turnover24h;
  }

  public StatsUSD turnover30d(BigDecimal turnover30d) {
    this.turnover30d = turnover30d;
    return this;
  }

   /**
   * Get turnover30d
   * @return turnover30d
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getTurnover30d() {
    return turnover30d;
  }

  public void setTurnover30d(BigDecimal turnover30d) {
    this.turnover30d = turnover30d;
  }

  public StatsUSD turnover365d(BigDecimal turnover365d) {
    this.turnover365d = turnover365d;
    return this;
  }

   /**
   * Get turnover365d
   * @return turnover365d
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getTurnover365d() {
    return turnover365d;
  }

  public void setTurnover365d(BigDecimal turnover365d) {
    this.turnover365d = turnover365d;
  }

  public StatsUSD turnover(BigDecimal turnover) {
    this.turnover = turnover;
    return this;
  }

   /**
   * Get turnover
   * @return turnover
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getTurnover() {
    return turnover;
  }

  public void setTurnover(BigDecimal turnover) {
    this.turnover = turnover;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatsUSD statsUSD = (StatsUSD) o;
    return Objects.equals(this.rootSymbol, statsUSD.rootSymbol) &&
        Objects.equals(this.currency, statsUSD.currency) &&
        Objects.equals(this.turnover24h, statsUSD.turnover24h) &&
        Objects.equals(this.turnover30d, statsUSD.turnover30d) &&
        Objects.equals(this.turnover365d, statsUSD.turnover365d) &&
        Objects.equals(this.turnover, statsUSD.turnover);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rootSymbol, currency, turnover24h, turnover30d, turnover365d, turnover);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatsUSD {\n");
    
    sb.append("    rootSymbol: ").append(toIndentedString(rootSymbol)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    turnover24h: ").append(toIndentedString(turnover24h)).append("\n");
    sb.append("    turnover30d: ").append(toIndentedString(turnover30d)).append("\n");
    sb.append("    turnover365d: ").append(toIndentedString(turnover365d)).append("\n");
    sb.append("    turnover: ").append(toIndentedString(turnover)).append("\n");
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

