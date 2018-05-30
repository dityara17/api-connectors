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
 * Individual &amp; Bucketed Trades
 */
@ApiModel(description = "Individual & Bucketed Trades")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-05-30T12:55:43.198-05:00")
public class Trade {
  @SerializedName("timestamp")
  private OffsetDateTime timestamp = null;

  @SerializedName("symbol")
  private String symbol = null;

  @SerializedName("side")
  private String side = null;

  @SerializedName("size")
  private BigDecimal size = null;

  @SerializedName("price")
  private Double price = null;

  @SerializedName("tickDirection")
  private String tickDirection = null;

  @SerializedName("trdMatchID")
  private String trdMatchID = null;

  @SerializedName("grossValue")
  private BigDecimal grossValue = null;

  @SerializedName("homeNotional")
  private Double homeNotional = null;

  @SerializedName("foreignNotional")
  private Double foreignNotional = null;

  public Trade timestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Get timestamp
   * @return timestamp
  **/
  @ApiModelProperty(required = true, value = "")
  public OffsetDateTime getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
  }

  public Trade symbol(String symbol) {
    this.symbol = symbol;
    return this;
  }

   /**
   * Get symbol
   * @return symbol
  **/
  @ApiModelProperty(required = true, value = "")
  public String getSymbol() {
    return symbol;
  }

  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }

  public Trade side(String side) {
    this.side = side;
    return this;
  }

   /**
   * Get side
   * @return side
  **/
  @ApiModelProperty(value = "")
  public String getSide() {
    return side;
  }

  public void setSide(String side) {
    this.side = side;
  }

  public Trade size(BigDecimal size) {
    this.size = size;
    return this;
  }

   /**
   * Get size
   * @return size
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getSize() {
    return size;
  }

  public void setSize(BigDecimal size) {
    this.size = size;
  }

  public Trade price(Double price) {
    this.price = price;
    return this;
  }

   /**
   * Get price
   * @return price
  **/
  @ApiModelProperty(value = "")
  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  public Trade tickDirection(String tickDirection) {
    this.tickDirection = tickDirection;
    return this;
  }

   /**
   * Get tickDirection
   * @return tickDirection
  **/
  @ApiModelProperty(value = "")
  public String getTickDirection() {
    return tickDirection;
  }

  public void setTickDirection(String tickDirection) {
    this.tickDirection = tickDirection;
  }

  public Trade trdMatchID(String trdMatchID) {
    this.trdMatchID = trdMatchID;
    return this;
  }

   /**
   * Get trdMatchID
   * @return trdMatchID
  **/
  @ApiModelProperty(value = "")
  public String getTrdMatchID() {
    return trdMatchID;
  }

  public void setTrdMatchID(String trdMatchID) {
    this.trdMatchID = trdMatchID;
  }

  public Trade grossValue(BigDecimal grossValue) {
    this.grossValue = grossValue;
    return this;
  }

   /**
   * Get grossValue
   * @return grossValue
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getGrossValue() {
    return grossValue;
  }

  public void setGrossValue(BigDecimal grossValue) {
    this.grossValue = grossValue;
  }

  public Trade homeNotional(Double homeNotional) {
    this.homeNotional = homeNotional;
    return this;
  }

   /**
   * Get homeNotional
   * @return homeNotional
  **/
  @ApiModelProperty(value = "")
  public Double getHomeNotional() {
    return homeNotional;
  }

  public void setHomeNotional(Double homeNotional) {
    this.homeNotional = homeNotional;
  }

  public Trade foreignNotional(Double foreignNotional) {
    this.foreignNotional = foreignNotional;
    return this;
  }

   /**
   * Get foreignNotional
   * @return foreignNotional
  **/
  @ApiModelProperty(value = "")
  public Double getForeignNotional() {
    return foreignNotional;
  }

  public void setForeignNotional(Double foreignNotional) {
    this.foreignNotional = foreignNotional;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Trade trade = (Trade) o;
    return Objects.equals(this.timestamp, trade.timestamp) &&
        Objects.equals(this.symbol, trade.symbol) &&
        Objects.equals(this.side, trade.side) &&
        Objects.equals(this.size, trade.size) &&
        Objects.equals(this.price, trade.price) &&
        Objects.equals(this.tickDirection, trade.tickDirection) &&
        Objects.equals(this.trdMatchID, trade.trdMatchID) &&
        Objects.equals(this.grossValue, trade.grossValue) &&
        Objects.equals(this.homeNotional, trade.homeNotional) &&
        Objects.equals(this.foreignNotional, trade.foreignNotional);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timestamp, symbol, side, size, price, tickDirection, trdMatchID, grossValue, homeNotional, foreignNotional);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Trade {\n");
    
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    side: ").append(toIndentedString(side)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    tickDirection: ").append(toIndentedString(tickDirection)).append("\n");
    sb.append("    trdMatchID: ").append(toIndentedString(trdMatchID)).append("\n");
    sb.append("    grossValue: ").append(toIndentedString(grossValue)).append("\n");
    sb.append("    homeNotional: ").append(toIndentedString(homeNotional)).append("\n");
    sb.append("    foreignNotional: ").append(toIndentedString(foreignNotional)).append("\n");
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

