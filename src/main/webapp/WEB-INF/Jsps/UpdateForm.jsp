<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
                <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>

<title>Insert title here</title>
</head>
<body>
<div class="card mx-auto" style="width: 48rem;">
  <div class="card-body">
    <h5 class="card-title">Registration Form</h5>
    <h6 class="card-subtitle mb-2 text-muted">Sak Software</h6>
    <form action="upd" method="post">
    <div>
    <label for="id">Student's Name:</label>
    </div>
    <div>
    <input type ="text" name="id" value="${u.id }" class="form-control" readonly>
    </div>
    <div>
    <label for="firstName">Student's First Name:</label>
    </div>
    <div>
    <input type ="text" name="firstName" value="${u.firstName}" class="form-control">
    </div>
    <div>
    <label for="lastName">Student's Last Name:</label>
    </div>
    <div>
    <input type ="text" name="lastName" value="${u.lastName}" class="form-control">
    </div>
    <div>
    <label for="email">Email ID:</label></div>
    <div><input type="email" name="email" value="${u.email}"class="form-control"></div>
    <div><label for="age">Age:</label></div>
    <div><input type="text" name="age" value="${u.age}"class="form-control"></div><br>
    
    <div><input type="submit" class="btn btn-success"></div>
    
    
    </form>
    
  </div>
</div>
</body>
</html>