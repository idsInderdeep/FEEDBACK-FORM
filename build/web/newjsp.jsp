<%-- 
    Document   : newjsp
    Created on : 26 Jun, 2018, 3:20:55 PM
    Author     : Inderdeep
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>NIELIT FORM</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
         <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
         <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
         <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
         <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
         <link rel="stylesheet" href="w3.css">
         
         <link rel="stylesheet" href="style.css">
         <script src="script.js"></script>
         
         
    </head>
    <body>
        
        <!-- HEADER -->
        <div class="header">
            <h4 class="display-4"><b>National Institute of Electronics & Information Technology</b></h4>
        </div>
            <marquee width="100%" direction="right" style="font-family:platino" >
         Developed by - <i>Inderdeep Singh</i>  
        </marquee>
    
        
        <!-- CARD-->
        <div class="card" style="padding-top: 2px">
         
          <h4 style="color:rgb(255, 62, 27);padding: 1%;">Student Feedback Form</h4> 
          
         <div class="w3-content w3-display-container">
  
           <!-- SELECTION -->  
             
             <div class="mySlides1" style="margin: auto;width:100%;position:relative;">
                 <%@ include file="newjsp1.jsp" %> 
                 
             </div> 
       
          <!-- QUESTION 1 -->                           
          <h1 class="mySlides1  w3-animate-zoom" style="width:100%;padding-left:20px;padding-top: 0px;">
                                       
            <div style="margin:auto;width:80%">
              
                <h4 style="padding-bottom:10px;"> 1. COURSE STRUCTURE :</h4> 
                
         <div style="padding-left:250px;">
          
              <label class="container">Excellent
                  <input type="radio" name="radio" value="0" id="radio1">
                     <span class="checkmark"></span>
                 </label>

                 <label class="container">Good
                     <input type="radio"  name="radio"  value="1" id="radio2">
                   <span class="checkmark"></span>
                 </label>

                 <label class="container">Average
                   <input type="radio"  name="radio" value="2" id="radio3">
                   <span class="checkmark"></span>
                 </label>
 
                 <label class="container">Poor
                    <input type="radio"  name="radio"  value="3" id="radio4">
                    <span class="checkmark"></span>
                 </label>
           
          </div> 
                
                
            </div>   
   
              <p id="print" style="display:none">aaaaaa</p>
              <div class="w3-light-grey w3-round" style="background-color: blueviolet">
                  <br> 
                   <label class="container">  
                 <button class="w3-button w3-round w3-green w3-display-left" style="opacity:0.6;margin-top:10px" onclick="plusDivs(-1, 0);" >&#10094;  PRE</button>      
                 <button class="w3-button w3-round w3-green w3-display-right " style="opacity:0.6;margin-top:10px" onclick="check(1,4,0)">NEXT &#10095;</button>
                 <!--&#10095;-->      
                 </label> 
                <br>   
                  <div class="w3-container w3-blue w3-round" style="width:8.33%"margin-top:30px><h4>1/12</h4></div>
               </div>
                 
            </h1>
         
          <!-- QUESTION 2 -->                           
          <h1 class="mySlides1 " style="width:100%;padding-left:20px;">
                                       
            <div style="margin:auto;width:80%;">
              
                <h4 style="padding-bottom:10px;" class="w3-animate-opacity"> 2. COURSE MATERIAL PROVIDED :</h4> 
                
         <div style="padding-left:250px" class="w3-animate-opacity">
          
              <label class="container">Excellent
                  <input type="radio" name="radio" value="0" id="radio5">
                     <span class="checkmark"></span>
                 </label>

                 <label class="container">Good
                     <input type="radio"  name="radio"  value="1" id="radio6">
                   <span class="checkmark"></span>
                 </label>

                 <label class="container">Average
                   <input type="radio"  name="radio" value="2" id="radio7">
                   <span class="checkmark"></span>
                 </label>
 
                 <label class="container">Poor
                    <input type="radio"  name="radio"  value="3" id="radio8">
                    <span class="checkmark"></span>
                 </label>
           
          </div> 
                
                
            </div>   
   
               <div class="w3-light-grey w3-round">
                  <br> 
                   <label class="container">      
                   <button class="w3-button w3-round w3-green w3-display-left" style="opacity:0.6;margin-top:10px" onclick="plusDivs(-1, 0);" >&#10094;  PRE</button>      
                 <button class="w3-button w3-round w3-green w3-display-right " style="opacity:0.6;margin-top:10px" onclick="check(5,8,1)">NEXT &#10095;</button>
                 <!--&#10095;-->      
                 </label> 
                <br>   
                  <div class="w3-container w3-blue w3-round w3-animate-right" style="width:24.99%"margin-top:30px><h4>2/12</h4></div>
               </div>
                 
            </h1>


          <!-- QUESTION 3 -->                           
          <h1 class="mySlides1" style="width:100%;padding-left:20px;">
                                       
            <div style="margin:auto;width:80%;">
              
                <h4 style="padding-bottom:10px;" class="w3-animate-opacity">3. FACULTY'S COURSE PREPARATION FOR CLASS :</h4> 
                
         <div style="padding-left:250px">
          
              <label class="container">Excellent
                  <input type="radio" name="radio" value="0" id="radio9" checked="">
                     <span class="checkmark"></span>
                 </label>

                 <label class="container">Good
                     <input type="radio"  name="radio"  value="1" id="radio10">
                   <span class="checkmark"></span>
                 </label>

                 <label class="container">Average
                   <input type="radio"  name="radio" value="2" id="radio11">
                   <span class="checkmark"></span>
                 </label>
 
                 <label class="container">Poor
                    <input type="radio"  name="radio"  value="3" id="radio12">
                    <span class="checkmark"></span>
                 </label>
           
          </div> 
                
                
            </div>   
   
               <div class="w3-light-grey w3-round">
                  <br> 
                   <label class="container"> 
                   <button class="w3-button w3-round w3-green w3-display-left" style="opacity:0.6;margin-top:10px" onclick="plusDivs(-1, 0);" >&#10094;  PRE</button>      
                 <button class="w3-button w3-round w3-green w3-display-right " style="opacity:0.6;margin-top:10px" onclick="check(9,12,2)">NEXT &#10095;</button>
                 <!--&#10095;-->      
                 </label> 
                <br>   
                  <div class="w3-container w3-blue w3-round w3-animate-right" style="width:33.32%"margin-top:30px><h4>3/12</h4></div>
               </div>
                 
            </h1>          
          
             
             <!-- QUESTION 4 -->
             
                                
          <h1 class="mySlides1 " style="width:100%;padding-left:20px;">
                                       
            <div style="margin:auto;width:80%;">
              
                <h4 style="padding-bottom:10px;" class="w3-animate-opacity"> 4. FACULTY'S KNOWLEDGE ABOUT THE COURSE :</h4> 
                
         <div style="padding-left:250px">
          
              <label class="container">Excellent
                  <input type="radio" name="radio" value="0" id="radio13" checked="">
                     <span class="checkmark"></span>
                 </label>

                 <label class="container">Good
                     <input type="radio"  name="radio"  value="1" id="radio14">
                   <span class="checkmark"></span>
                 </label>

                 <label class="container">Average
                   <input type="radio"  name="radio" value="2" id="radio15">
                   <span class="checkmark"></span>
                 </label>
 
                 <label class="container">Poor
                    <input type="radio"  name="radio"  value="3" id="radio16">
                    <span class="checkmark"></span>
                 </label>
           
          </div> 
                
                
            </div>   
   
               <div class="w3-light-grey w3-round">
                  <br> 
                   <label class="container">
                   <button class="w3-button w3-round w3-green w3-display-left" style="opacity:0.6;margin-top:10px" onclick="plusDivs(-1, 0);" >&#10094;  PRE</button>      
                 <button class="w3-button w3-round w3-green w3-display-right " style="opacity:0.6;margin-top:10px" onclick="check(13,16,3)">NEXT &#10095;</button>
                 <!--&#10095;-->      
                 </label> 
                <br>   
                  <div class="w3-container w3-blue w3-round w3-animate-right" style="width:41.65%"margin-top:30px><h4>4/12</h4></div>               </div>
                 
            </h1> 
             
             <!-- QUESTION 5 -->
                           
          <h1 class="mySlides1" style="width:100%;padding-left:20px;">
                                       
            <div style="margin:auto;width:80%;">
              
                <h4 style="padding-bottom:10px;" class="w3-animate-opacity"> 5. FACULTY'S RESPONSE TO QUESTIONS :</h4> 
                
         <div style="padding-left:250px">
          
              <label class="container">Excellent
                  <input type="radio" name="radio" value="0" id="radio17" checked="">
                     <span class="checkmark"></span>
                 </label>

                 <label class="container">Good
                     <input type="radio"  name="radio"  value="1" id="radio18">
                   <span class="checkmark"></span>
                 </label>

                 <label class="container">Average
                   <input type="radio"  name="radio" value="2" id="radio19">
                   <span class="checkmark"></span>
                 </label>
 
                 <label class="container">Poor
                    <input type="radio"  name="radio"  value="3" id="radio20">
                    <span class="checkmark"></span>
                 </label>
           
          </div> 
                
                
            </div>   
   
               <div class="w3-light-grey w3-round">
                  <br> 
                   <label class="container">        
                   <button class="w3-button w3-round w3-green w3-display-left" style="opacity:0.6;margin-top:10px" onclick="plusDivs(-1, 0);" >&#10094;  PRE</button>      
                 <button class="w3-button w3-round w3-green w3-display-right " style="opacity:0.6;margin-top:10px" onclick="check(17,20,4)">NEXT &#10095;</button>
                 <!--&#10095;-->      
                 </label> 
                <br>   
                  <div class="w3-container w3-blue w3-round w3-animate-right" style="width:41.65%"margin-top:30px><h4>5/12</h4></div>
               </div>
                 
            </h1>             
             
             <!-- QUESTION 6 -->
                  
          <h1 class="mySlides1 " style="width:100%;padding-left:20px;">
                                       
            <div style="margin:auto;width:80%;">
              
                <h4 style="padding-bottom:10px;" class="w3-animate-opacity"> 6. LAB INFRASTRUCTURE :</h4> 
                
         <div style="padding-left:250px">
          
              <label class="container">Excellent
                  <input type="radio" name="radio" value="0" id="radio21"checked="">
                     <span class="checkmark"></span>
                 </label>

                 <label class="container">Good
                     <input type="radio"  name="radio"  value="1" id="radio22">
                   <span class="checkmark"></span>
                 </label>

                 <label class="container">Average
                   <input type="radio"  name="radio" value="2" id="radio23">
                   <span class="checkmark"></span>
                 </label>
 
                 <label class="container">Poor
                    <input type="radio"  name="radio"  value="3" id="radio24">
                    <span class="checkmark"></span>
                 </label>
           
          </div> 
                
                
            </div>   
   
               <div class="w3-light-grey w3-round">
                  <br> 
                   <label class="container">  
                   <button class="w3-button w3-round w3-green w3-display-left" style="opacity:0.6;margin-top:10px" onclick="plusDivs(-1, 0);" >&#10094;  PRE</button>      
                 <button class="w3-button w3-round w3-green w3-display-right " style="opacity:0.6;margin-top:10px" onclick="check(21,24,5)">NEXT &#10095;</button>
                 <!--&#10095;-->      
                 </label> 
                <br>   
                  <div class="w3-container w3-blue w3-round w3-animate-right" style="width:49.98%"margin-top:30px><h4>6/12</h4></div>
               </div>
                 
            </h1>
             
             <!-- QUESTION 7 -->
                                     
          <h1 class="mySlides1" style="width:100%;padding-left:20px;">
                                       
            <div style="margin:auto;width:80%;">
              
                <h4 style="padding-bottom:10px;"class="w3-animate-opacity"> 7. REGULARITY IN CLASS :</h4> 
                
         <div style="padding-left:250px">
          
              <label class="container">Excellent
                  <input type="radio" name="radio" value="0" id="radio25" checked="">
                     <span class="checkmark"></span>
                 </label>

                 <label class="container">Good
                     <input type="radio"  name="radio"  value="1" id="radio26">
                   <span class="checkmark"></span>
                 </label>

                 <label class="container">Average
                   <input type="radio"  name="radio" value="2" id="radio27">
                   <span class="checkmark"></span>
                 </label>
 
                 <label class="container">Poor
                    <input type="radio"  name="radio"  value="3" id="radio28">
                    <span class="checkmark"></span>
                 </label>
           
          </div> 
                
                
            </div>   
   
               <div class="w3-light-grey w3-round">
                  <br> 
                   <label class="container">    
                   <button class="w3-button w3-round w3-green w3-display-left" style="opacity:0.6;margin-top:10px" onclick="plusDivs(-1, 0);" >&#10094;  PRE</button>      
                 <button class="w3-button w3-round w3-green w3-display-right " style="opacity:0.6;margin-top:10px" onclick="check(25,28,6)">NEXT &#10095;</button>
                 <!--&#10095;-->      
                 </label> 
                <br>   
                  <div class="w3-container w3-blue w3-round w3-animate-right" style="width:58.30%"margin-top:30px><h4>7/12</h4></div>
               </div>
                 
            </h1>            
            
        
            
                 <!-- QUESTION 8 -->
                                     
          <h1 class="mySlides1" style="width:100%;padding-left:20px;">
                                       
            <div style="margin:auto;width:80%;">
              
                <h4 style="padding-bottom:10px;" class="w3-animate-opacity"> 8. CLASS ROOM INFRASTRUCTURE :</h4> 
                
         <div style="padding-left:250px">
          
              <label class="container">Excellent
                  <input type="radio" name="radio" value="0" id="radio29">
                     <span class="checkmark"></span>
                 </label>

                 <label class="container">Good
                     <input type="radio"  name="radio"  value="1" id="radio30">
                   <span class="checkmark"></span>
                 </label>

                 <label class="container">Average
                   <input type="radio"  name="radio" value="2" id="radio31">
                   <span class="checkmark"></span>
                 </label>
 
                 <label class="container">Poor
                    <input type="radio"  name="radio"  value="3" id="radio32">
                    <span class="checkmark"></span>
                 </label>
           
          </div> 
                
                
            </div>   
   
               <div class="w3-light-grey w3-round">
                  <br> 
                   <label class="container">    
                   <button class="w3-button w3-round w3-green w3-display-left" style="opacity:0.6;margin-top:10px" onclick="plusDivs(-1, 0);" >&#10094;  PRE</button>      
                 <button class="w3-button w3-round w3-green w3-display-right " style="opacity:0.6;margin-top:10px" onclick="check(29,32,7)">NEXT &#10095;</button>
                 <!--&#10095;-->      
                 </label> 
                <br>   
                  <div class="w3-container w3-blue w3-round w3-animate-right" style="width:66.64%"margin-top:30px><h4>8/12</h4></div>
               </div>
                 
            </h1>            
            
                      <!-- QUESTION 9 -->
                                     
          <h1 class="mySlides1" style="width:100%;padding-left:20px;">
                                       
            <div style="margin:auto;width:80%;">
              
                <h4 style="padding-bottom:10px;"> 9. FACULTY'S METHOD OF PRESENTATION OF SUBJECTS :</h4> 
                
         <div style="padding-left:250px" class="w3-animate-opacity">
          
              <label class="container">Excellent
                  <input type="radio" name="radio" value="0" id="radio33">
                     <span class="checkmark"></span>
                 </label>

                 <label class="container">Good
                     <input type="radio"  name="radio"  value="1" id="radio34">
                   <span class="checkmark"></span>
                 </label>

                 <label class="container">Average
                   <input type="radio"  name="radio" value="2" id="radio35">
                   <span class="checkmark"></span>
                 </label>
 
                 <label class="container">Poor
                    <input type="radio"  name="radio"  value="3" id="radio36">
                    <span class="checkmark"></span>
                 </label>
           
          </div> 
                
                
            </div>   
   
               <div class="w3-light-grey w3-round">
                  <br> 
                   <label class="container">    
                   <button class="w3-button w3-round w3-green w3-display-left" style="opacity:0.6;margin-top:10px" onclick="plusDivs(-1, 0);" >&#10094;  PRE</button>      
                 <button class="w3-button w3-round w3-green w3-display-right " style="opacity:0.6;margin-top:10px" onclick="check(33,36,8)">NEXT &#10095;</button>
                 <!--&#10095;-->      
                 </label> 
                <br>   
                  <div class="w3-container w3-blue w3-round w3-animate-right" style="width:74.97%" margin-top:30px><h4>9/12</h4></div>
               </div>
                 
            </h1>            
            
  
        <!-- QUESTION 10 -->
                                     
          <h1 class="mySlides1 " style="width:100%;padding-left:20px;">
                                       
            <div style="margin:auto;width:80%;">
              
                <h4 style="padding-bottom:10px;" class="w3-animate-opacity"> 10. OVERALL IMPRESSION :</h4> 
                
         <div style="padding-left:250px">
          
              <label class="container">Excellent
                  <input type="radio" name="radio" value="0" id="radio37">
                     <span class="checkmark"></span>
                 </label>

                 <label class="container">Good
                     <input type="radio"  name="radio"  value="1" id="radio38">
                   <span class="checkmark"></span>
                 </label>

                 <label class="container">Average
                   <input type="radio"  name="radio" value="2" id="radio39">
                   <span class="checkmark"></span>
                 </label>
 
                 <label class="container">Poor
                    <input type="radio"  name="radio"  value="3" id="radio40">
                    <span class="checkmark"></span>
                 </label>
           
          </div> 
                
                
            </div>   
   
               <div class="w3-light-grey w3-round">
                  <br> 
                   <label class="container">    
                   <button class="w3-button w3-round w3-green w3-display-left" style="opacity:0.6;margin-top:10px" onclick="plusDivs(-1, 0);" >&#10094;  PRE</button>      
                 <button class="w3-button w3-round w3-green w3-display-right " style="opacity:0.6;margin-top:10px" onclick="check(37,40,9)">NEXT &#10095;</button>
                 <!--&#10095;-->      
                 </label> 
                <br>   
                  <div class="w3-container w3-blue w3-round w3-animate-right" style="width:83.3%"margin-top:30px><h4>10/12</h4></div>
               </div>
                 
           </h1>            
  
                            <!-- QUESTION 11 -->
                                     
          <h1 class="mySlides1" style="width:100%;padding-left:20px;">
                                       
            <div style="margin:auto;width:80%;">
              
                <h4 style="padding-bottom:10px;" class="w3-animate-opacity"> 11. FACULTY'S FOLLOWED THE SYLLABUS :</h4> 
                
         <div style="padding-left:250px;">
          
              <label class="container">YES
                  <input type="radio" name="radio" value="4" id="radio41">
                     <span class="checkmark"></span>
                 </label>

                 <label class="container">NO
                     <input type="radio"  name="radio"  value="5" id="radio42">
                   <span class="checkmark"></span>
                 </label>

           
          </div> 
                
                
            </div>   
   
               <div class="w3-light-grey w3-round" style="margin-top:80px">
                  <br> 
                   <label class="container">    
                   <button class="w3-button w3-round w3-green w3-display-left" style="opacity:0.6;margin-top:10px" onclick="plusDivs(-1, 0);" >&#10094;  PRE</button>      
                 <button class="w3-button w3-round w3-green w3-display-right " style="opacity:0.6;margin-top:10px" onclick="check(41,42,10)">NEXT &#10095;</button>
                 <!--&#10095;-->      
                 </label>
                <br>   
                  <div class="w3-container w3-blue w3-round" style="width:91.63%"margin-top:30px><h4>11/12</h4></div>
               </div>
                 
            </h1>            
            

                            <!-- QUESTION 12 -->
                                     
          <h1 class="mySlides1" style="width:100%;padding-left:20px;">
                                       
            <div style="margin:auto;width:80%;">
              
                <h4 style="padding-bottom:10px;" class="w3-animate-opacity"> 12. FACULTY'S FINISHED THE SYLLABUS :</h4> 
                
         <div style="padding-left:250px;">
          
              <label class="container">YES
                  <input type="radio" name="radio" value="4" id="radio43">
                     <span class="checkmark"></span>
                 </label>

                 <label class="container">NO
                     <input type="radio"  name="radio"  value="5" id="radio44">
                   <span class="checkmark"></span>
                 </label>

           
          </div> 
                
                
            </div>   
   
              <div class="w3-light-grey w3-round" style="margin-top:80px;" >
                  <br> 
                   <label class="container">    
                   <button class="w3-button w3-round w3-green w3-display-left" style="opacity:0.6;margin-top:10px" onclick="plusDivs(-1, 0);" >&#10094;  PRE</button>      
                 <button class="w3-button w3-round w3-green w3-display-right " style="opacity:0.6;margin-top:10px" onclick="check(43,44,11)">NEXT &#10095;</button>
                 <!--&#10095;-->      
                 </label> 
                <br>   
                  <div class="w3-container w3-blue w3-round w3-animate-right" style="width:99.96%"margin-top:30px><h4>12/12</h4></div>
               </div>
                 
            </h1>            

                            
                            <!-- COMMENT -->
                                     
          <h1 class="mySlides1" style="width:100%;padding-left:20px;padding-top: 10px;">
                                       
            <div style="margin:auto;width:100%;">
              
         <div style="padding-left:100px;width:100%">
          
                  <div class="w3-animate-right">
                  <p>What you like most in the course <p>
                  <input type="text" value=" " style="width:600px;font-size:10px;color:black; padding: 8px 16px;margin: 2px 1px;margin-right:0" id="t1">             
                  </div>
     
                  <div class="w3-animate-left">
                  <p>Area of improvement <p>
                  <input type="text" value=" " style="width:600px;font-size:10px;color:black; padding: 8px 16px;margin: 2px 1px;" id="t2">
                  </div>
                   
                    <div class="w3-animate-right">
                    <p>Any other comment <p>
                    <input type="text" value=" " style="width:600px;font-size:10px;color:black; padding: 8px 16px;margin: 2px 1px;" id="t3">
                    </div>
                 
                 
          </div> 
                
                
            </div>   
   
              <div class="w3-light-grey w3-round" style="margin-top:70px">
                   <label class="container">    
                   <button class="w3-button w3-round w3-green w3-display-left" style="opacity:0.6;margin-top:10px" onclick="plusDivs(-1, 0);" >&#10094;  PRE</button>      
                 <button class="w3-button w3-round w3-green w3-display-right " style="opacity:0.6;margin-top:10px" onclick="com()">DONE &#10095;</button>
                 <!--&#10095;-->      
                 </label> 

                 
            </h1>            
                            
                            
            <!-- THANKS AND SUBMIT -->

                                     
          <h1 class="mySlides1 " style="width:100%;padding-left:2%;padding-top: 1%">
                                       
            <div style="margin:auto;width:100%;">
              
                <h4 style="padding-bottom:10px;"></h4> 
                
         <div style="padding-left:90px">
          
             <label class="container" style="margin:auto;width:70%;padding-top:50px">
                  
               <div class="w3-animate-fading"> !! THANKS FOR MAKING US BETTER !!</div>  

               <p id="p" style="display:none" >TTTTTTTTTT</p> 
               <br>   
               <a href="newfile.html"></a>
<div class="w3-animate-bottom">               
<button class="w3-button w3-round w3-green" style="opacity:0.6;margin-left:150px;margin-top: 40px;width:auto" onclick="plusDivs(1, 0)"><a id="li" style="text-decoration: none;padding-right:50%; ">submit</a></button>
</div>             
             
             </label>
           
             
          </div> 
                
                
            </div>   
   
                 
            </h1>            
            
         </div>
     
      </div>
  
<script>
     
    var arr = [0,0,0,0,0,0,0,0,0,0,0,0];
    var str = ["","",""];
    var qry="feed.jsp?";
    var bid="tid="+<%out.println(""+tid);%>;
    var a="";
    function check(start,end,ques)
    { 
     var i;
     for(i=start;i<=end;i++)
     {
         var x="radio"+i;
            if(document.getElementById(x).checked) 
            {
                document.getElementById("print").innerHTML=bid;   
                arr[ques]=document.getElementById(x).value;
                plusDivs(1, 0);
            }   
            
            
     }
     
   /*if(ques==11)
     {
         list();
     }*/
  
  }
  
  function list()
  {       
    for(i=0;i<arr.length;i++)
    {
        n=arr[i];
     
        a=a+"&"+"q"+i+"=";
      
        a=a+n;
    }
   
        
   
  }
  
  function com()
  {
    var comment;  
    str[0]=document.getElementById("t1").value;
    //str[0]=comment;
    str[1]=document.getElementById("t2").value;
    //str[1]=comment;
     str[2]=document.getElementById("t3").value;
    //str[2]=comment;
   
        list();
        
        var i=0,j=12; 
        for(i=0;i<str.length;i++)
    {
        n=str[i];
     
        a=a+"&"+"q"+j+"=";
      
        a=a+n;       
        
        j++;
    }

 document.getElementById("p").innerHTML=a;
    document.getElementById("li").href=qry+bid+a;
    plusDivs(1, 0);    
  }
  
</script>
                 
 </body>
    
</html>