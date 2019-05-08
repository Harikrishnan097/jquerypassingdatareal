<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.candidjava.Mapworking" %>
    <%@ page import=" java.util.HashMap" %>
      <%@ page import="java.util.HashSet" %>
        <%@ page import="java.util.Map" %>
         <%@ page import="java.util.Set" %>
    
    
   
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<script src="http://code.jquery.com/jquery-latest.js">   
        </script>
        <script>
            $(document).ready(function() {                        
                $('#selectcon').change(function() {  
                	
                    var cat=$('#selectcon').val();
                   
                 $.get('Selectdrop',{selectcon:cat},function(responseText) { 
                        $('#welcometext').text(responseText);         
                    });
                });
            });
        </script>
</head>
<body>
<jsp:useBean id="mapwk" class="com.candidjava.Mapworking" scope="session"/>
<%Map<String,Set<String>> drop = mapwk.getdropdown(); %>
<%out.print(drop); %>


<select id ="selectcon">

<%for ( String key : drop.keySet() ) {%>
   <option value="<%=key%>"> <%=key%></option>
<%} %>

</select>
<select>
<option > </option>

</select>
</body>
</html>