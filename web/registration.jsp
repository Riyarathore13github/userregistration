<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html lang="en">
  <head>
    <meta charset="UTF-8" >
    <meta name="viewport" content="width=device-width, initial-scale=1.0" >
    <meta http-equiv="X-UA-Compatible" content="ie=edge" >
   
    <link rel="stylesheet" href="style.css" >
      <style>
            body{
                background-image:url(g12.jpg);
                background-repeat: no-repeat;
 background-size: 1600px 1500px;
            }
        </style>
  </head>
  <body>
    <section class="container">
        <header><h1>Registration Page</h1></header>
      <form action="RegistrationServlet" method="Post" class="form">
        <div class="input-box">
          <label> Name</label>
          <input type="text" placeholder="Enter your name" name="name" id="name" required >
        </div>
           <div class="input-box">
          <label> Address</label>
          <input type="text" placeholder="Enter your Address" name="address" id="address"required >
        </div>
        <div class="input-box">
          <label>Email </label>
          <input type="email" placeholder="Enter your email" name="email" id="email" required >
        </div>
        <div class="column">
          <div class="input-box">
            <label>Mobile Number</label>
            <input type="text" placeholder="Enter your Mobile number" name="mobile" id="mobile"   minlength="10" required >
          </div>
          <div class="input-box">
            <label>Birth Date</label>
            <input type="date" placeholder="Enter your birth date" name="date" id="date" required >
          </div>
        </div>
        <div class="input-box">
            <label>Gender</label>
             <div class="select-box">
               <select name="gender"id="gender">
                <option hidden>Gender</option>
                <option>Male</option>
                <option> Female</option>
                <option>other</option>
             
              </select>
             </div>
          </div>
        
           <div class="input-box">
          <label> Department</label>
          <input type="text" placeholder="Enter your name" name="department" id="department" required />
        </div>
           <div class="input-box">
          <label> Program</label>
          <input type="text" placeholder="Enter your name" name="program" id="program"required />
        </div>
              <div class="column">
          <div class="input-box">
            <label>Branch</label>
             <div class="select-box">
               <select name="branch" id="branch">
                <option hidden>Branch</option>
                <option>Computer Science Engineering</option>
                <option> Mechanical engineering</option>
                <option>Chemical Engineering</option>
                <option>Civil Engineering</option>
                <option>Electrical Engineering</option>
                <option>Automobile Engineering</option>
              </select>
             </div>
          </div>
          <div class="input-box">
            <label>Admission year</label>
            <div class="select-box">
               <select name="admission" id="admission">
                <option hidden>Year</option>
                <option>2020</option>
                <option>2021</option>
                <option>2022</option>
                <option>2023</option>
                <option>2024</option>
                <option> 2025</option>
              </select>
          </div>
          </div>
        </div>
            <div class="input-box">
          <label> Password </label>
          <input type="password" placeholder="Enter your Password" minlength="6" name="password" id="password" required >
        </div>
          <input type="submit" value="Registration">
  
      </form>
    </section>
  </body>
</html>

