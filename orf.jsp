<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="omadiki_java2.*" %>



<%@page import="java.util.*" %> 

<!DOCTYPE html>
<html lang="en">
<% request.setCharacterEncoding("utf-8");
response.setCharacterEncoding("utf-8");%>
	<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
	<meta name="description" content="Exercise Template 2017-2018">
	<meta name="author" content="jdoe@example.com">

	<title>Ορθογραφικός έλεγχος</title>

	<!-- Bootstrap core CSS -->
	<link rel="stylesheet" href="css/bootstrap.min.css">

	<!-- Custom styles for this template -->
	<link href="css/modern-business.css" rel="stylesheet">

	<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
	<!--[if lt IE 9]>
		  <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
		  <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
	<![endif]-->
	</head>
	 <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
        <div class="container">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-ex1-collapse">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="">Ορθογραφικός έλεγχος</a>
            </div>

            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse navbar-ex1-collapse">
            </div>
            <!-- /.navbar-collapse -->
        </div>
        <!-- /.container -->
    </nav>
	
	<div class="container">

	<div class="row">
			<br>
			<br>
            <div class="panel panel-danger">
			<div class="panel-heading custom_class" >
			<h4><p class="text-info"> <b>21st Century</b> </p> </h4>
			</div>
			</div>
			<form action="right.jsp" method="post" name="registrationform">
			
				<div class="form-group">
					 <h4>Input text:</h4>
					
						<textarea class ="form-control" rows="8" cols="150" id="input" name="input"></textarea>
					
					
				
				</div>			
			
			<div class="form-group">        
					<div class="col-sm-offset-5 col-sm-6">
						<button type="Submit" class="btn btn-info">  <span class="glyphicon glyphicon-cog"></span>	Check</button>
						
					</div>
			</div>
			
			<div class=row>
			<div class="col-sm-12">
			<h4>Result:</h4>
					
						<textarea readonly class ="form-control" rows="8" cols="150" ></textarea>
			</div>
			
			</div>
		</form>	
			
		
        </div>
	</div>
	<div id="foot">
       <footer class="text-center">
       	<div id="grizo">
			<hr>
       		<p><strong>Copyright &copy; 21st century</p></strong>

            </div>
        </footer>
	</div>
