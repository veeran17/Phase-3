<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ page import="java.util.*"%>
      <%@ page import="com.cisco.Sporty_shoes.Entity.Product"%>
   
   
   
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%List<Product> Plist=(List<Product>) request.getAttribute("Plist"); %>
<%for(Product u: Plist){ %>
<div class="card">
    <form action="addsale/<%= u.getPid() %>/<%=u.getPP() %>">
      <h1><%= u.getPname() %></h1>
      <p class="PP"><%=u.getPP() %></p>
      <p><button>Buy</button></p>
    </form>
</div>
<%} %>

</body>
</html>