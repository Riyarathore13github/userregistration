
<%@page import="com.isecure.DTO.UserDTO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% UserDTO user=(UserDTO)request.getSession().getAttribute("login");%>
<html>
<head>
<style type="text/css">
    body{
        background-image: url(B40.jpg);
background-repeat: no-repeat;
 background-size: 1600px 750px;
    }
#home
{
 font-family:"Times New Roman", Times, serif;
color:white;
text-align:center;
font-size:2rem;
}
#home ul li
{
display:inline-block;
padding:25px;
}
#home{
   
    background: rgba(173,255,47,0.7);

}
.hello{
   text-align:center;
   font-family:"Times New Roman", Times, serif;
color:white;

font-size:3.5rem;
}
.hello2{
     text-align:center;
   font-family:"Times New Roman", Times, serif;
color:white;

font-size:2.5rem;
}
.hello3{
    margin-top:150px;
     text-align:center;
   font-family:"Times New Roman", Times, serif;
color:white;


}
</style>
</head>
<body>

<div id=home>
<ul>
<li><a href="index.jsp">Home</a></li>
<li><a href="login.jsp">LogIn</a></li>
<li><a href="registration.jsp">Registration</a></li>
<li><a href="login.jsp">LogOut</a></li>
</ul>
</div>
    <div class="hello2">
        <h1 >  Welcome to our Website-<%=user.getName()%> </h1></div>
<div class="hello3">
<p><h1>
    The Success group of Institute of Engineering & Technology: 
    Where Excellence is Cultivated. An Accredited Center of Excellence dedicated to shaping future leaders.
   </h1>

</p>
</div>
</body>
</html>



