# coding: utf-8

"""
    BitMEX API

    ## REST API for the BitMEX Trading Platform  [View Changelog](/app/apiChangelog)    #### Getting Started  Base URI: [https://www.bitmex.com/api/v1](/api/v1)  ##### Fetching Data  All REST endpoints are documented below. You can try out any query right from this interface.  Most table queries accept `count`, `start`, and `reverse` params. Set `reverse=true` to get rows newest-first.  Additional documentation regarding filters, timestamps, and authentication is available in [the main API documentation](/app/restAPI).  *All* table data is available via the [Websocket](/app/wsAPI). We highly recommend using the socket if you want to have the quickest possible data without being subject to ratelimits.  ##### Return Types  By default, all data is returned as JSON. Send `?_format=csv` to get CSV data or `?_format=xml` to get XML data.  ##### Trade Data Queries  *This is only a small subset of what is available, to get you started.*  Fill in the parameters and click the `Try it out!` button to try any of these queries.  * [Pricing Data](#!/Quote/Quote_get)  * [Trade Data](#!/Trade/Trade_get)  * [OrderBook Data](#!/OrderBook/OrderBook_getL2)  * [Settlement Data](#!/Settlement/Settlement_get)  * [Exchange Statistics](#!/Stats/Stats_history)  Every function of the BitMEX.com platform is exposed here and documented. Many more functions are available.  ##### Swagger Specification  [⇩ Download Swagger JSON](swagger.json)    ## All API Endpoints  Click to expand a section.   # noqa: E501

    OpenAPI spec version: 1.2.0
    Contact: support@bitmex.com
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


import pprint
import re  # noqa: F401

import six


class UserCommission(object):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    """
    Attributes:
      swagger_types (dict): The key is attribute name
                            and the value is attribute type.
      attribute_map (dict): The key is attribute name
                            and the value is json key in definition.
    """
    swagger_types = {
        'maker_fee': 'float',
        'taker_fee': 'float',
        'settlement_fee': 'float',
        'max_fee': 'float'
    }

    attribute_map = {
        'maker_fee': 'makerFee',
        'taker_fee': 'takerFee',
        'settlement_fee': 'settlementFee',
        'max_fee': 'maxFee'
    }

    def __init__(self, maker_fee=None, taker_fee=None, settlement_fee=None, max_fee=None):  # noqa: E501
        """UserCommission - a model defined in Swagger"""  # noqa: E501

        self._maker_fee = None
        self._taker_fee = None
        self._settlement_fee = None
        self._max_fee = None
        self.discriminator = None

        if maker_fee is not None:
            self.maker_fee = maker_fee
        if taker_fee is not None:
            self.taker_fee = taker_fee
        if settlement_fee is not None:
            self.settlement_fee = settlement_fee
        if max_fee is not None:
            self.max_fee = max_fee

    @property
    def maker_fee(self):
        """Gets the maker_fee of this UserCommission.  # noqa: E501


        :return: The maker_fee of this UserCommission.  # noqa: E501
        :rtype: float
        """
        return self._maker_fee

    @maker_fee.setter
    def maker_fee(self, maker_fee):
        """Sets the maker_fee of this UserCommission.


        :param maker_fee: The maker_fee of this UserCommission.  # noqa: E501
        :type: float
        """

        self._maker_fee = maker_fee

    @property
    def taker_fee(self):
        """Gets the taker_fee of this UserCommission.  # noqa: E501


        :return: The taker_fee of this UserCommission.  # noqa: E501
        :rtype: float
        """
        return self._taker_fee

    @taker_fee.setter
    def taker_fee(self, taker_fee):
        """Sets the taker_fee of this UserCommission.


        :param taker_fee: The taker_fee of this UserCommission.  # noqa: E501
        :type: float
        """

        self._taker_fee = taker_fee

    @property
    def settlement_fee(self):
        """Gets the settlement_fee of this UserCommission.  # noqa: E501


        :return: The settlement_fee of this UserCommission.  # noqa: E501
        :rtype: float
        """
        return self._settlement_fee

    @settlement_fee.setter
    def settlement_fee(self, settlement_fee):
        """Sets the settlement_fee of this UserCommission.


        :param settlement_fee: The settlement_fee of this UserCommission.  # noqa: E501
        :type: float
        """

        self._settlement_fee = settlement_fee

    @property
    def max_fee(self):
        """Gets the max_fee of this UserCommission.  # noqa: E501


        :return: The max_fee of this UserCommission.  # noqa: E501
        :rtype: float
        """
        return self._max_fee

    @max_fee.setter
    def max_fee(self, max_fee):
        """Sets the max_fee of this UserCommission.


        :param max_fee: The max_fee of this UserCommission.  # noqa: E501
        :type: float
        """

        self._max_fee = max_fee

    def to_dict(self):
        """Returns the model properties as a dict"""
        result = {}

        for attr, _ in six.iteritems(self.swagger_types):
            value = getattr(self, attr)
            if isinstance(value, list):
                result[attr] = list(map(
                    lambda x: x.to_dict() if hasattr(x, "to_dict") else x,
                    value
                ))
            elif hasattr(value, "to_dict"):
                result[attr] = value.to_dict()
            elif isinstance(value, dict):
                result[attr] = dict(map(
                    lambda item: (item[0], item[1].to_dict())
                    if hasattr(item[1], "to_dict") else item,
                    value.items()
                ))
            else:
                result[attr] = value

        return result

    def to_str(self):
        """Returns the string representation of the model"""
        return pprint.pformat(self.to_dict())

    def __repr__(self):
        """For `print` and `pprint`"""
        return self.to_str()

    def __eq__(self, other):
        """Returns true if both objects are equal"""
        if not isinstance(other, UserCommission):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
