<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTP-8">
<meta name="viewprot" content = "width = device-width", initial-scale="1">
<link rel="stylesheet" href="css/bootstrap.css">
<title>JSP Web site</title>
</head>
<body>
  	<nav class="navbar navbar-default">
  		<div class="navbar-header">
  		<button type="button" class="navbar-toggle collapsed"
  			data-toggle="collapse" data-target="#bs-example-navbar-collapse-1"
  			aria-expanded="false">
  			<span class="icon-bar"></span>
  			<span class="icon-bar"></span>
  			<span class="icon-bar"></span>
  			</button>
  			<a class="navbar-brand" href="main.jsp">JSP Web site</a>
  	</div>
  	<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
  		<ul class="nav navbar-nav">
  			<li><a href="main.jsp">Main</a></li>
  			<li><a href="bbs.jsp">Bulletin board</a></li>
  		</ul>
  		<ul class="nav navbar-nav navbar-right">
  			<li class="dropdown">
  				<a href="#" class="dropdown-toggle"
  					data-toggle="dropdown" role="button" aria-haspopup="true"
  					aria-expanded="false">access<span class="caret"></span></a>
  					<ul class="dropdown-menu">
  						<li class="active"><a href="login.jsp">log-in</a></li>
  						<li><a href="join.jsp">join</a></li>
  					</ul>
  			  </li>
  		 </ul>
  	   </div>
  	</nav>
  	<div class="container">
  		<div class="col-lg-4"></div>
  		<div class="col-lg-4">
  			<div class="jumbotron" style="padding-top: 20px;">
  			<form method="post" action="loginAction.jsp">
  				<h3 style="text-align: center;">Login screen</h3>
  				<div class="form-group">
  				<input type="text" class="form-control" placeholder="ID" name="userID" maxlength="20">
  				</div>
  				
  				<div class="form-group">
  				        <input type="password" class="form-control" placeholder="PASSWORD" name="userPassword" maxlength="20">
  				     </div>
  				     <input type="submit" class="btn btn-primany form-control" value="Login"> 
  			    </form>
  			</div>
  		</div>
  		<div class="col-lg-4"></div>
  	</div>
  	<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
  	<script src="js/bootstrap.js"></script>
</body>
</html>
