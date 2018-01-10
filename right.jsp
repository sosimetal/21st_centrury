<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="omadiki_java2.*" %>


<%@page import="java.util.*" %> 




<% request.setCharacterEncoding("utf-8");
%>
<% String text= request.getParameter("input");
SpellCheck sc = new SpellCheck();
Phonetic ph=new Phonetic();
ph.codeDictionary();
sc.dictionary();
int wrong_words=0;
SpellDAO sp = new SpellDAO();
sp.insertDict();

 %>

<!DOCTYPE html>
<html lang="en">

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
			<%
			
				text = sc.removePun(text);
				text = text.toLowerCase();	 
				String arr[] = text.split(" ");
				
					
				
				%>
			
				<h4> Input text:</h4>
				<textarea readonly class ="form-control" rows="8" cols="150" ><%=text%> </textarea>
				
			
			<div class="text-center">
			<input type="submit"  name="button" id="button" value="Check" class="btn btn-info btn-lg"/>   
			
			</div>
			<div class="form-group">
				 <h4> Result: </h4>
				<textarea readonly class="form-control" rows="10" id="text1">
<%
for (int i = 0; i < arr.length; i++) {
	
    if(sc.findWord(arr[i])==false) {
		if(sc.findWord(arr[i])==false) {
        		if(sc.suggestions(arr[i]).isEmpty()) { %>
        			<%=arr[i]%> <h6> : Λυπούμαστε αλλά αυτή η λέξη δεν υπάρχει στο λεξικό μας. </h6>
        			<%wrong_words=1;
        		} else {%>
        			<%=arr[i]%> <h6>Λάθος --- Πιθανές Λέξεις: <%=sc.suggestions(arr[i])%> </h6>
        			<%wrong_words++;
        		}         
        }
	}
	%>
	<%
        if(wrong_words==0)
        { %>
			<h6>Δεν βρέθηκαν λάθη</h6>
        <%}
}
				%>
				
			
				</textarea>
			</div>
		
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
