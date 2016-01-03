<%@ page import="java.util.*,crudoperation.UserInfo" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="#D8D8D8">
<script src="WEB-INF/ajax.js"></script>
<form method="post"  action="myservlet">

<table style="font-size:13">

<tr>
<td><h5>EMPLOYEE PROFILE</h5></td>
<td></td>
</tr>
<tr>
<td>User Name</td>
<td><input type="text" name="uname" value="" /> </td>
</tr>
<tr>
<td>
<label for="value">Address</label></td>
<td>
<input type="text" id="Address" name="Address"></td>
</tr>
<tr>
<td>
<label for="from_date">Age</label></td>

<td>
<input type="text" id="Age" name="Age"></td>
</tr>
<tr>
<td>
<label for="to_date">DateOfJoining</label></td>
<td>
<input type="text" id="DOJ" name="DOJ"></td>
</tr>
<tr>
<td>
<label for="to_date">DateOfBirth</label></td>
<td>
<input type="text" id="DOB" name="DOB"></td>
</tr>
<tr>
<td>
<label for="to_date">Technology</label></td>
<td>
<input type="text" id="Technology" name="Technology"></td>
</tr>
<tr>
<td>
<input type="submit" name="button1"  value="Insert"/></td>
<td>
<input type="reset" name="button2" value="Reset"/></td>
</tr></table>
</fieldset>
<br></br>

<form>
<h5>PROFILE DETAILS</h5>
<table border="1" id="tablestr" style="font-size:13">
<tr>
<td>NAME</td>
<td>ADDRESS</td>
<td>DOJ</td>
<td>DOB</td>
<td>TECHNOLOGY</td>
<td>AGE</td>
</tr>

<%

ArrayList<UserInfo> ar=(ArrayList)session.getAttribute("store");
if(ar  !=null)
{
	for(UserInfo user1:ar){%>
	<tr>
	<td><%=user1.getName()%></td>
	<td><%=user1.getAddress()%></td>
	<td><%=user1.getDoj()%></td>
	<td><%=user1.getDob()%></td>
	<td><%=user1.getTechnology()%></td>
	<td><%=user1.getAge()%></td>
	</tr>
	<%} }%>
	</table>
	
	</td>
	</td>
	</tr>
	<td>
	<input type="submit" name="button3"  value="delete"/></td>
	
	</table>
	
		
	
	

		 <script type="text/javascript" >
	 
	 /*
	  * creates a new XMLHttpRequest object which is the backbone of AJAX,
	  * or returns false if the browser doesn't support it
	  */
	 function getXMLHttpRequest() {
	 	var xmlHttpReq = false;
	 	// to create XMLHttpRequest object in non-Microsoft browsers
	 	if (window.XMLHttpRequest) {
	 		xmlHttpReq = new XMLHttpRequest();
	 	} else if (window.ActiveXObject) {
	 		try {
	 			// to create XMLHttpRequest object in later versions
	 			// of Internet Explorer
	 			xmlHttpReq = new ActiveXObject("Msxml2.XMLHTTP");
	 		} catch (exp1) {
	 			try {
	 				// to create XMLHttpRequest object in older versions
	 				// of Internet Explorer
	 				xmlHttpReq = new ActiveXObject("Microsoft.XMLHTTP");
	 			} catch (exp2) {
	 				xmlHttpReq = false;
	 			}
	 		}
	 	}
	 	return xmlHttpReq;
	 }
	 /*
	  * AJAX call starts with this function
	  */
	 function makeRequest() {
	 	var xmlHttpRequest = getXMLHttpRequest();
	 	xmlHttpRequest.onreadystatechange = getReadyStateHandler(xmlHttpRequest);
	 	xmlHttpRequest.open("POST", "helloWorld.do", true);
	 	xmlHttpRequest.setRequestHeader("Content-Type",
	 			"application/x-www-form-urlencoded");
	 	xmlHttpRequest.send(null);
	 }

	 /*
	  * Returns a function that waits for the state change in XMLHttpRequest
	  */
	 function getReadyStateHandler(xmlHttpRequest) {

	 	// an anonymous function returned
	 	// it listens to the XMLHttpRequest instance
	 	return function() {
	 		if (xmlHttpRequest.readyState == 4) {
	 			if (xmlHttpRequest.status == 200  ) {
	 				alert(xmlHttpRequest.responseText);
	 				document.getElementById("hello").innerHTML = xmlHttpRequest.responseText;
	 			} else {
	 				alert("HTTP error " + xmlHttpRequest.status + ": " + xmlHttpRequest.statusText);
	 			}
	 		}
	 	};
	 }

	 
	 
	 </script>

		 



  <div id="hello"><input type="button" name="button3" onclick="makeRequest()" value="AJAX"/></div>




</form>
<form method="post"  action="myservlet">
<h5>SEARCH DETAILS</h5>
<table border="1" id="tablestr" style="font-size:13">
<tr>
<td>
<label for="Age">Search Profile based on Name Using Lamda Exp</label></td>

<td>
<input type="text" id="Age1" name="Age1"></td>
<td><input type="submit" name="button4"  value="Search"/></td>
</tr>


<table border="1" id="tablestr" style="font-size:13">
<tr>
<td>NAME</td>
<td>ADDRESS</td>
<td>DOJ</td>
<td>DOB</td>
<td>TECHNOLOGY</td>
<td>AGE</td>
</tr>

<%

ArrayList<UserInfo> ar1=(ArrayList)session.getAttribute("store1");
if(ar1  !=null)
{
	for(UserInfo user1:ar1){%>
	<tr>
	<td><%=user1.getName()%></td>
	<td><%=user1.getAddress()%></td>
	<td><%=user1.getDoj()%></td>
	<td><%=user1.getDob()%></td>
	<td><%=user1.getTechnology()%></td>
	<td><%=user1.getAge()%></td>
	</tr>
	<%} }%>
	</table>
	
	</td>
	</td>
	</tr>
	
	</table>

</table>



</body>
</html>