<?php
/**
 * TradeBinTest
 *
 * PHP version 5
 *
 * @category Class
 * @package  Swagger\Client
 * @author   Swagger Codegen team
 * @link     https://github.com/swagger-api/swagger-codegen
 */

/**
 * BitMEX API
 *
 * ## REST API for the BitMEX Trading Platform  [View Changelog](/app/apiChangelog)    #### Getting Started  Base URI: [https://www.bitmex.com/api/v1](/api/v1)  ##### Fetching Data  All REST endpoints are documented below. You can try out any query right from this interface.  Most table queries accept `count`, `start`, and `reverse` params. Set `reverse=true` to get rows newest-first.  Additional documentation regarding filters, timestamps, and authentication is available in [the main API documentation](/app/restAPI).  *All* table data is available via the [Websocket](/app/wsAPI). We highly recommend using the socket if you want to have the quickest possible data without being subject to ratelimits.  ##### Return Types  By default, all data is returned as JSON. Send `?_format=csv` to get CSV data or `?_format=xml` to get XML data.  ##### Trade Data Queries  *This is only a small subset of what is available, to get you started.*  Fill in the parameters and click the `Try it out!` button to try any of these queries.  * [Pricing Data](#!/Quote/Quote_get)  * [Trade Data](#!/Trade/Trade_get)  * [OrderBook Data](#!/OrderBook/OrderBook_getL2)  * [Settlement Data](#!/Settlement/Settlement_get)  * [Exchange Statistics](#!/Stats/Stats_history)  Every function of the BitMEX.com platform is exposed here and documented. Many more functions are available.  ##### Swagger Specification  [⇩ Download Swagger JSON](swagger.json)    ## All API Endpoints  Click to expand a section.
 *
 * OpenAPI spec version: 1.2.0
 * Contact: support@bitmex.com
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 * Swagger Codegen version: 2.4.0-SNAPSHOT
 */

/**
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * Please update the test case below to test the model.
 */

namespace Swagger\Client;

/**
 * TradeBinTest Class Doc Comment
 *
 * @category    Class
 * @description TradeBin
 * @package     Swagger\Client
 * @author      Swagger Codegen team
 * @link        https://github.com/swagger-api/swagger-codegen
 */
class TradeBinTest extends \PHPUnit_Framework_TestCase
{

    /**
     * Setup before running any test case
     */
    public static function setUpBeforeClass()
    {
    }

    /**
     * Setup before running each test case
     */
    public function setUp()
    {
    }

    /**
     * Clean up after running each test case
     */
    public function tearDown()
    {
    }

    /**
     * Clean up after running all test cases
     */
    public static function tearDownAfterClass()
    {
    }

    /**
     * Test "TradeBin"
     */
    public function testTradeBin()
    {
    }

    /**
     * Test attribute "timestamp"
     */
    public function testPropertyTimestamp()
    {
    }

    /**
     * Test attribute "symbol"
     */
    public function testPropertySymbol()
    {
    }

    /**
     * Test attribute "open"
     */
    public function testPropertyOpen()
    {
    }

    /**
     * Test attribute "high"
     */
    public function testPropertyHigh()
    {
    }

    /**
     * Test attribute "low"
     */
    public function testPropertyLow()
    {
    }

    /**
     * Test attribute "close"
     */
    public function testPropertyClose()
    {
    }

    /**
     * Test attribute "trades"
     */
    public function testPropertyTrades()
    {
    }

    /**
     * Test attribute "volume"
     */
    public function testPropertyVolume()
    {
    }

    /**
     * Test attribute "vwap"
     */
    public function testPropertyVwap()
    {
    }

    /**
     * Test attribute "last_size"
     */
    public function testPropertyLastSize()
    {
    }

    /**
     * Test attribute "turnover"
     */
    public function testPropertyTurnover()
    {
    }

    /**
     * Test attribute "home_notional"
     */
    public function testPropertyHomeNotional()
    {
    }

    /**
     * Test attribute "foreign_notional"
     */
    public function testPropertyForeignNotional()
    {
    }
}
