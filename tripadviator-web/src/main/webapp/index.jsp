<!doctype html public "-//w3c//dtd html 4.01 frameset//en" "http://www.w3.org/tr/html4/frameset.dtd">

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html>
	<head>
		<title>Web Service Testing Suite</title>
		
		<style> 
		    body { 
		        font-family: arial, sans-serif, serif, fantasy;
		    } 
		    textarea {
		        width: 98%; 
		        height: 100%;
		    }  
		    td.help { 
		        width: 1200px; 
		    }
		    
		    .section {
		        background: rgb(224, 239, 244);
		        color: black; 
		    }  
		    
		    td { 
		        border: 1px solid #8D857D;
		    } 
		</style>
		
		<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
		<script>
		
		(function ($) {
			'use strict';

			var escape = /["\\\x00-\x1f\x7f-\x9f]/g,
				meta = {
					'\b': '\\b',
					'\t': '\\t',
					'\n': '\\n',
					'\f': '\\f',
					'\r': '\\r',
					'"': '\\"',
					'\\': '\\\\'
				},
				hasOwn = Object.prototype.hasOwnProperty;

			/**
			 * jQuery.toJSON
			 * Converts the given argument into a JSON representation.
			 *
			 * @param o {Mixed} The json-serializable *thing* to be converted
			 *
			 * If an object has a toJSON prototype, that will be used to get the representation.
			 * Non-integer/string keys are skipped in the object, as are keys that point to a
			 * function.
			 *
			 */
			$.toJSON = typeof JSON === 'object' && JSON.stringify ? JSON.stringify : function (o) {
				if (o === null) {
					return 'null';
				}

				var pairs, k, name, val,
					type = $.type(o);

				if (type === 'undefined') {
					return undefined;
				}

				// Also covers instantiated Number and Boolean objects,
				// which are typeof 'object' but thanks to $.type, we
				// catch them here. I don't know whether it is right
				// or wrong that instantiated primitives are not
				// exported to JSON as an {"object":..}.
				// We choose this path because that's what the browsers did.
				if (type === 'number' || type === 'boolean') {
					return String(o);
				}
				if (type === 'string') {
					return $.quoteString(o);
				}
				if (typeof o.toJSON === 'function') {
					return $.toJSON(o.toJSON());
				}
				if (type === 'date') {
					var month = o.getUTCMonth() + 1,
						day = o.getUTCDate(),
						year = o.getUTCFullYear(),
						hours = o.getUTCHours(),
						minutes = o.getUTCMinutes(),
						seconds = o.getUTCSeconds(),
						milli = o.getUTCMilliseconds();

					if (month < 10) {
						month = '0' + month;
					}
					if (day < 10) {
						day = '0' + day;
					}
					if (hours < 10) {
						hours = '0' + hours;
					}
					if (minutes < 10) {
						minutes = '0' + minutes;
					}
					if (seconds < 10) {
						seconds = '0' + seconds;
					}
					if (milli < 100) {
						milli = '0' + milli;
					}
					if (milli < 10) {
						milli = '0' + milli;
					}
					return '"' + year + '-' + month + '-' + day + 'T' +
						hours + ':' + minutes + ':' + seconds +
						'.' + milli + 'Z"';
				}

				pairs = [];

				if ($.isArray(o)) {
					for (k = 0; k < o.length; k++) {
						pairs.push($.toJSON(o[k]) || 'null');
					}
					return '[' + pairs.join(',') + ']';
				}

				// Any other object (plain object, RegExp, ..)
				// Need to do typeof instead of $.type, because we also
				// want to catch non-plain objects.
				if (typeof o === 'object') {
					for (k in o) {
						// Only include own properties,
						// Filter out inherited prototypes
						if (hasOwn.call(o, k)) {
							// Keys must be numerical or string. Skip others
							type = typeof k;
							if (type === 'number') {
								name = '"' + k + '"';
							} else if (type === 'string') {
								name = $.quoteString(k);
							} else {
								continue;
							}
							type = typeof o[k];

							// Invalid values like these return undefined
							// from toJSON, however those object members
							// shouldn't be included in the JSON string at all.
							if (type !== 'function' && type !== 'undefined') {
								val = $.toJSON(o[k]);
								pairs.push(name + ':' + val);
							}
						}
					}
					return '{' + pairs.join(',') + '}';
				}
			};

			/**
			 * jQuery.evalJSON
			 * Evaluates a given json string.
			 *
			 * @param str {String}
			 */
			$.evalJSON = typeof JSON === 'object' && JSON.parse ? JSON.parse : function (str) {
				/*jshint evil: true */
				return eval('(' + str + ')');
			};

			/**
			 * jQuery.secureEvalJSON
			 * Evals JSON in a way that is *more* secure.
			 *
			 * @param str {String}
			 */
			$.secureEvalJSON = typeof JSON === 'object' && JSON.parse ? JSON.parse : function (str) {
				var filtered =
					str
					.replace(/\\["\\\/bfnrtu]/g, '@')
					.replace(/"[^"\\\n\r]*"|true|false|null|-?\d+(?:\.\d*)?(?:[eE][+\-]?\d+)?/g, ']')
					.replace(/(?:^|:|,)(?:\s*\[)+/g, '');

				if (/^[\],:{}\s]*$/.test(filtered)) {
					/*jshint evil: true */
					return eval('(' + str + ')');
				}
				throw new SyntaxError('Error parsing JSON, source is not valid.');
			};

			/**
			 * jQuery.quoteString
			 * Returns a string-repr of a string, escaping quotes intelligently.
			 * Mostly a support function for toJSON.
			 * Examples:
			 * >>> jQuery.quoteString('apple')
			 * "apple"
			 *
			 * >>> jQuery.quoteString('"Where are we going?", she asked.')
			 * "\"Where are we going?\", she asked."
			 */
			$.quoteString = function (str) {
				if (str.match(escape)) {
					return '"' + str.replace(escape, function (a) {
						var c = meta[a];
						if (typeof c === 'string') {
							return c;
						}
						c = a.charCodeAt();
						return '\\u00' + Math.floor(c / 16).toString(16) + (c % 16).toString(16);
					}) + '"';
				}
				return '"' + str + '"';
			};

		}(jQuery));
		</script>
		
		<script type="text/javascript">
		function getRequest(target, productCode, oldWindow)
		{
			if(oldWindow) 
			{ 
	            blankResultsFrame();
	        } 
			
	        var url;  
	        
	        if(target.origHref != undefined) 
	        { 
	            url = target.origHref; 
	        } 
	        else 
	        { 
	        	target.origHref = target.href; 
	            url = target.href;
	        }      
	        
	        if(productCode == null) 
	        { 
	        	target.href = url;
	        } 
	        else 
	        {  
	        	target.href = url + $('#' + productCode).val(); 
	        }
		}
		
		function postRequest(obj, textareaId)
		{
			var url = obj.href;
	        
	        var data = $('#' + textareaId).val(); 
	        
	        jQuery.ajax({
	            'type': 'POST',
	            'url': url,
	            'contentType': 'application/json',
	            'data': data,
	            'dataType': 'json',
	            'success': callback, 
	            'error': errorHandler
	        });
	        
	        return false;
		}		

		function callback(data) 
		{
		    var dataUrl = 'data:application/json,' + encodeURIComponent($.toJSON(data)); 

		    postBlank = false;
		    
		    if(postBlank) { 
		        window.open(dataUrl, "_blank");
		    } else { 
		        parent.results.location.href=dataUrl; 
		    }  
		}

		function errorHandler(xhr, status, error) { 
		    console.log("Status: " + status + " Error: " + error + " XHR.status: " + xhr.status + "\n" + xhr.statusText);
		}
		
		function blankResultsFrame() { 
		    parent.results.location.href = "spinner.jsp"; 
		}
		</script>
	</head> 
	<body>
		<table border="0" style="table-layout: fixed; border: 0px;" width="100%"  > 
			<tr>
				<td>Web Serivce URL</td>
				<td>HTTP Method</td>
				<td>Parameter</td>
			</tr>
			
			<tr>
				<td><a href="products/" onclick='getRequest(this, "products_productCode", "false")' target="results">/products/</a></td>
				<td>GET</td>
				<td>
					<textarea id="products_productCode" cols="100" rows="10">2280SUN</textarea>
				</td>
			</tr>	
			
			<tr>
				<td><a href="products/search" onclick='return postRequest(this, "products_productSearch")'>/products/</a></td>
				<td>POST</td>
				<td>
					<textarea id="products_productSearch" cols="100" rows="20">
{
	"startDate":    "2014-01-01",
	"endDate":      "2016-01-01",
	"topX":         "1-15",
	"destId":       648,
	"currencyCode": "USD",
	"catId":        0,
	"subCatId":     0,
	"dealsOnly":    false
}
					</textarea>
				</td>
			</tr>					
		</table>
	</body>
</html>
