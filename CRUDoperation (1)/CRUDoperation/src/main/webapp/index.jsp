<html>
<head>
<%@include file="/views/base.jsp" %>
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
   
</head>
<body>

<div class="container">

<div class="row">
<div class="col-md-12">

<h1 class="text-center mb-3">Welcome To ORS</h1>

<table class="table table-striped">
  <thead>
    <tr>
      <th scope="col">S. No.</th>
      <th scope="col">College Name</th>
      <th scope="col">State</th>
      <th scope="col">Action</th>
      
    </tr>
  </thead>
  <tbody>
  
 <ol>
		<c:forEach var="emp" items="${empList}">
		
			<li>${emp}</li>
			
		</c:forEach>
	</ol>
  </tbody>
</table>

<div class="container text-center">
<a href="add-college" class="btn btn-success">Add College</a>
</div>

</div>

</div>

</div>



</body>
</html>
