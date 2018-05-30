/**
 * BitMEX API
 * ## REST API for the BitMEX Trading Platform  [View Changelog](/app/apiChangelog)    #### Getting Started  Base URI: [https://www.bitmex.com/api/v1](/api/v1)  ##### Fetching Data  All REST endpoints are documented below. You can try out any query right from this interface.  Most table queries accept `count`, `start`, and `reverse` params. Set `reverse=true` to get rows newest-first.  Additional documentation regarding filters, timestamps, and authentication is available in [the main API documentation](/app/restAPI).  *All* table data is available via the [Websocket](/app/wsAPI). We highly recommend using the socket if you want to have the quickest possible data without being subject to ratelimits.  ##### Return Types  By default, all data is returned as JSON. Send `?_format=csv` to get CSV data or `?_format=xml` to get XML data.  ##### Trade Data Queries  *This is only a small subset of what is available, to get you started.*  Fill in the parameters and click the `Try it out!` button to try any of these queries.  * [Pricing Data](#!/Quote/Quote_get)  * [Trade Data](#!/Trade/Trade_get)  * [OrderBook Data](#!/OrderBook/OrderBook_getL2)  * [Settlement Data](#!/Settlement/Settlement_get)  * [Exchange Statistics](#!/Stats/Stats_history)  Every function of the BitMEX.com platform is exposed here and documented. Many more functions are available.  ##### Swagger Specification  [⇩ Download Swagger JSON](swagger.json)    ## All API Endpoints  Click to expand a section. 
 *
 * OpenAPI spec version: 1.2.0
 * Contact: support@bitmex.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 *
 * Swagger Codegen version: 2.4.0-SNAPSHOT
 *
 * Do not edit the class manually.
 *
 */

(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD.
    define(['expect.js', '../../src/index'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    factory(require('expect.js'), require('../../src/index'));
  } else {
    // Browser globals (root is window)
    factory(root.expect, root.BitMexApi);
  }
}(this, function(expect, BitMexApi) {
  'use strict';

  var instance;

  beforeEach(function() {
    instance = new BitMexApi.Order();
  });

  var getProperty = function(object, getter, property) {
    // Use getter method if present; otherwise, get the property directly.
    if (typeof object[getter] === 'function')
      return object[getter]();
    else
      return object[property];
  }

  var setProperty = function(object, setter, property, value) {
    // Use setter method if present; otherwise, set the property directly.
    if (typeof object[setter] === 'function')
      object[setter](value);
    else
      object[property] = value;
  }

  describe('Order', function() {
    it('should create an instance of Order', function() {
      // uncomment below and update the code to test Order
      //var instance = new BitMexApi.Order();
      //expect(instance).to.be.a(BitMexApi.Order);
    });

    it('should have the property orderID (base name: "orderID")', function() {
      // uncomment below and update the code to test the property orderID
      //var instance = new BitMexApi.Order();
      //expect(instance).to.be();
    });

    it('should have the property clOrdID (base name: "clOrdID")', function() {
      // uncomment below and update the code to test the property clOrdID
      //var instance = new BitMexApi.Order();
      //expect(instance).to.be();
    });

    it('should have the property clOrdLinkID (base name: "clOrdLinkID")', function() {
      // uncomment below and update the code to test the property clOrdLinkID
      //var instance = new BitMexApi.Order();
      //expect(instance).to.be();
    });

    it('should have the property account (base name: "account")', function() {
      // uncomment below and update the code to test the property account
      //var instance = new BitMexApi.Order();
      //expect(instance).to.be();
    });

    it('should have the property symbol (base name: "symbol")', function() {
      // uncomment below and update the code to test the property symbol
      //var instance = new BitMexApi.Order();
      //expect(instance).to.be();
    });

    it('should have the property side (base name: "side")', function() {
      // uncomment below and update the code to test the property side
      //var instance = new BitMexApi.Order();
      //expect(instance).to.be();
    });

    it('should have the property simpleOrderQty (base name: "simpleOrderQty")', function() {
      // uncomment below and update the code to test the property simpleOrderQty
      //var instance = new BitMexApi.Order();
      //expect(instance).to.be();
    });

    it('should have the property orderQty (base name: "orderQty")', function() {
      // uncomment below and update the code to test the property orderQty
      //var instance = new BitMexApi.Order();
      //expect(instance).to.be();
    });

    it('should have the property price (base name: "price")', function() {
      // uncomment below and update the code to test the property price
      //var instance = new BitMexApi.Order();
      //expect(instance).to.be();
    });

    it('should have the property displayQty (base name: "displayQty")', function() {
      // uncomment below and update the code to test the property displayQty
      //var instance = new BitMexApi.Order();
      //expect(instance).to.be();
    });

    it('should have the property stopPx (base name: "stopPx")', function() {
      // uncomment below and update the code to test the property stopPx
      //var instance = new BitMexApi.Order();
      //expect(instance).to.be();
    });

    it('should have the property pegOffsetValue (base name: "pegOffsetValue")', function() {
      // uncomment below and update the code to test the property pegOffsetValue
      //var instance = new BitMexApi.Order();
      //expect(instance).to.be();
    });

    it('should have the property pegPriceType (base name: "pegPriceType")', function() {
      // uncomment below and update the code to test the property pegPriceType
      //var instance = new BitMexApi.Order();
      //expect(instance).to.be();
    });

    it('should have the property currency (base name: "currency")', function() {
      // uncomment below and update the code to test the property currency
      //var instance = new BitMexApi.Order();
      //expect(instance).to.be();
    });

    it('should have the property settlCurrency (base name: "settlCurrency")', function() {
      // uncomment below and update the code to test the property settlCurrency
      //var instance = new BitMexApi.Order();
      //expect(instance).to.be();
    });

    it('should have the property ordType (base name: "ordType")', function() {
      // uncomment below and update the code to test the property ordType
      //var instance = new BitMexApi.Order();
      //expect(instance).to.be();
    });

    it('should have the property timeInForce (base name: "timeInForce")', function() {
      // uncomment below and update the code to test the property timeInForce
      //var instance = new BitMexApi.Order();
      //expect(instance).to.be();
    });

    it('should have the property execInst (base name: "execInst")', function() {
      // uncomment below and update the code to test the property execInst
      //var instance = new BitMexApi.Order();
      //expect(instance).to.be();
    });

    it('should have the property contingencyType (base name: "contingencyType")', function() {
      // uncomment below and update the code to test the property contingencyType
      //var instance = new BitMexApi.Order();
      //expect(instance).to.be();
    });

    it('should have the property exDestination (base name: "exDestination")', function() {
      // uncomment below and update the code to test the property exDestination
      //var instance = new BitMexApi.Order();
      //expect(instance).to.be();
    });

    it('should have the property ordStatus (base name: "ordStatus")', function() {
      // uncomment below and update the code to test the property ordStatus
      //var instance = new BitMexApi.Order();
      //expect(instance).to.be();
    });

    it('should have the property triggered (base name: "triggered")', function() {
      // uncomment below and update the code to test the property triggered
      //var instance = new BitMexApi.Order();
      //expect(instance).to.be();
    });

    it('should have the property workingIndicator (base name: "workingIndicator")', function() {
      // uncomment below and update the code to test the property workingIndicator
      //var instance = new BitMexApi.Order();
      //expect(instance).to.be();
    });

    it('should have the property ordRejReason (base name: "ordRejReason")', function() {
      // uncomment below and update the code to test the property ordRejReason
      //var instance = new BitMexApi.Order();
      //expect(instance).to.be();
    });

    it('should have the property simpleLeavesQty (base name: "simpleLeavesQty")', function() {
      // uncomment below and update the code to test the property simpleLeavesQty
      //var instance = new BitMexApi.Order();
      //expect(instance).to.be();
    });

    it('should have the property leavesQty (base name: "leavesQty")', function() {
      // uncomment below and update the code to test the property leavesQty
      //var instance = new BitMexApi.Order();
      //expect(instance).to.be();
    });

    it('should have the property simpleCumQty (base name: "simpleCumQty")', function() {
      // uncomment below and update the code to test the property simpleCumQty
      //var instance = new BitMexApi.Order();
      //expect(instance).to.be();
    });

    it('should have the property cumQty (base name: "cumQty")', function() {
      // uncomment below and update the code to test the property cumQty
      //var instance = new BitMexApi.Order();
      //expect(instance).to.be();
    });

    it('should have the property avgPx (base name: "avgPx")', function() {
      // uncomment below and update the code to test the property avgPx
      //var instance = new BitMexApi.Order();
      //expect(instance).to.be();
    });

    it('should have the property multiLegReportingType (base name: "multiLegReportingType")', function() {
      // uncomment below and update the code to test the property multiLegReportingType
      //var instance = new BitMexApi.Order();
      //expect(instance).to.be();
    });

    it('should have the property text (base name: "text")', function() {
      // uncomment below and update the code to test the property text
      //var instance = new BitMexApi.Order();
      //expect(instance).to.be();
    });

    it('should have the property transactTime (base name: "transactTime")', function() {
      // uncomment below and update the code to test the property transactTime
      //var instance = new BitMexApi.Order();
      //expect(instance).to.be();
    });

    it('should have the property timestamp (base name: "timestamp")', function() {
      // uncomment below and update the code to test the property timestamp
      //var instance = new BitMexApi.Order();
      //expect(instance).to.be();
    });

  });

}));
