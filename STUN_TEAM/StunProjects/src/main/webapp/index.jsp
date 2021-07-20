<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <!-- <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">-->
    <link rel="stylesheet" href="bootstrap4.css">
    
    <title>Hello, world!</title>
    
    <style>
    #hello /*아이디 설정  */
    {
    	color:white;
    }
    #bye
    {
    	color:yellow;
    }
    .btn/*클래스 설정  */
    {
    	font-style : italic
    }
    div.ldj
    {
    	background : springgreen
    }
    div
    {
    	border : 1px solid black
    }
    .lng>h1 /* 자손 */
    {
    	font-size:xx-large
    }
    .lng h1 /* 후손 */
    {
    	text-decoration : underline
    }
    </style>
  </head>
  <body>
    <div class ="ldj">
    <h1 id="hello" class = "btn btn-danger">Hello, world!</h1>
    <h1 id="bye" class = "btn btn-dark">bye, world!</h1>
    </div>
    
    
    <div class ="lng">
    	<h1 id="hello" class = "btn btn-danger">배고팡</h1>
    	<h2 class=btn-primary> 저녘은 마라샹궈</h2>
    	<div>
    		<h1 id="bye" class = "btn btn-dark">bye, world!</h1>
    		<h2 class=btn-primary> 점심은 피자</h2>
    	</div>
    </div>
    
    
    <!-- Optional JavaScript; choose one of the two! -->

    <!-- Option 1: Bootstrap Bundle with Popper -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>

    <!-- Option 2: Separate Popper and Bootstrap JS -->
    <!--
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js" integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF" crossorigin="anonymous"></script>
    -->
  </body>
</html>