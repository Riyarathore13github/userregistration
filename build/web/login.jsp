
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <title>
            userlogin page
              
        </title>
        <style>
            body{
                background-image:url(B14.jpg);
                background-repeat: no-repeat;
 background-size: 1600px 750px;
            }
        </style>
        <link rel="stylesheet" href="style.css" >
    </head>
    <body>
        <section class="container">
              <header><h1>LogIn Page</h1></header>
              <form action="loginServlet" method="post"  class="form">
            <div class="input-box">
                <label> Name</label>
                <input type="text" name="name" placeholder="Enter your Name" required>
            </div>
             <div class="input-box">
                <label> Password</label>
                <input type="password"placeholder="Enter your Password" minlength="6" name="password" required>
            </div>
                <%String error=(String)session.getAttribute("error");
                session.removeAttribute("error");
                if(error!=null){
                %>
                <div> <p><%=error%></p></div>
                <%}%>
                
             <div class="button">
                
                <input type="Submit" value="LogIn">
            </div>
        </section>
</form>
    </body>
</html>
