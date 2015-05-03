<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html>
	<head>
		<meta charset="utf-8">
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
		
		<script type="text/javascript">
		function getWebSericeCall(target, productCode)
		{
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
	        	target.href = url + productCode.value;
	        }
		}
		
		function postWebSericeCall(obj, textareaId)
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
		}		

		function callback(data) { 
		    var dataUrl = 'data:application/json,' + encodeURIComponent($.toJSON(data)); 

		    postBlank = true;
		    if(postBlank) { 
		        
		    } else { 
		        parent.results.location.href=dataUrl; 
		    }  

		    if(timeCall) { 
		       showTimeResult();
		    }

		    postBlank = false; 
		}

		function errorHandler(xhr, status, error) { 
		    alert("ERROR\nStatus: " + status + "\nError: " + error + "\nXHR.status: " + xhr.status + "\n" + xhr.statusText);
		    //parent.results.location.href = "about:blank" 
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
				<td><a href="products/" onclick='getWebSericeCall(this, document.getElementById("products_productCode"))'>/products/</a></td>
				<td>GET</td>
				<td>
					<textarea id="products_productCode" cols="100" rows="10">2280SUN</textarea>
				</td>
			</tr>	
			
			<tr>
				<td><a href="products/search" onclick='postWebSericeCall(this, "products_productSearch")'>/products/</a></td>
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
