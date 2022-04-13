<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<%@include file="./base.jsp" %>
</head>
<body>
<div class="container mt-3">
<div class="col-md-4"></div>
<div class="col-md-4">
<form action="handle-AddCollege" method="post">
  <div class="form-group">
    <label >Name</label>
    <input type="text" class="form-control" name="name" id="clgName" placeholder="Enter College Name">
   </div>
  <div class="form-group">
   <label >State</label>
    <input type="text" class="form-control" name="state" id="clgState" placeholder="Enter College State">
   
  </div>
 <a href="${pageContext.request.contextPath}/" class="btn btn-danger">Back</a>
  <button type="submit" class="btn btn-primary">Submit</button>
  </div>

<div class="col-md-4"></div>
</div>
</form>
</body>
</html>