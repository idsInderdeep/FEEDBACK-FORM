<%-- 
    Document   : detail
    Created on : 28 Jun, 2018, 10:09:01 PM
    Author     : Inderdeep
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
        <%@ page  import="java.sql.DriverManager;"%>
        <%@ page  import="javax.swing.*"%>
        <%@ page  import="java.sql.*"%>
        <%@ page  import="java.util.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="w3.css">
        <title>NIELIT SHOW FEEDBACK</title>
        
<style>
 .header{
  color:white;  
  overflow:hidden; 
  text-align: center;
  background-color:rgb(60, 179, 113);
  padding: 20px 10px;
  box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2), 0 6px 20px 0 rgba(0, 0, 0, 0.19);
}

.card {
    /* Add shadows to create the "card" effect */
    box-shadow: 0 4px 8px 0 rgba(0,0,0,0.2);
    transition: 0.3s;
    padding:5px;
    
    position:relative;
    top: 30%;
    left: 32%;
    right: 30%;
    width:70%;
    height:75%;
    margin-top: -5em; 
    margin-left: -15em; 
    border: 1px solid #ccc;
    background-color: wheat;
 
}

/* On mouse-over, add a deeper shadow */
.card:hover {
    box-shadow: 0 8px 16px 0 rgba(0,0,0,0.2);
}

/* Add some padding inside the card container */
.cont {
    padding: 2px 16px;
}

</style>    
        
    </head>
  
    <body style="background-color: #cc6600;color:black;">
       
<marquee width="100%" direction="right" style="background-color:black;">
  <p style="font-family:platino;color:white;font-size:12px;">Developed By - Inderdeep Singh</p>  
</marquee>

        <div class="card" style="margin-top:10px;margin-bottom:10px;height:60%;width:70%;padding-top: 5px"> 
            
        <%!
            ResultSet rs;
            int tid, total;
            int flag=0;
            String psw,name;
            float temp;
            ArrayList<String> question=new ArrayList<String>();
                       ArrayList<String> a = new ArrayList<String>();
                       ArrayList<String> b= new ArrayList<String>();
                       ArrayList<String> c = new ArrayList<String>();
            Iterator itr = question.iterator(); 
        %>
        <%
                psw=request.getParameter("psw");
                name=request.getParameter("name");
                try
                   {
                       Class.forName("com.mysql.jdbc.Driver").newInstance();
                       Connection con = (Connection)DriverManager.getConnection("jdbc:Mysql://localhost:3306/web1","root","");
      
                       String str = "select * from login ";
                       Statement stmt = con.createStatement();
      
                        rs = stmt.executeQuery(str);
                        
                        while(rs.next())
                        {
                            if(rs.getString("uname").equalsIgnoreCase(name)&&rs.getString("psw").equals(psw))
                            {
                                tid=rs.getInt("tid");
                                flag=1;
                            }
                        }
                        
                        if(flag==1)
                        {
                          
                        } 
                        else
                        {
                            out.println("SORRY LOGIN ID NOT FOUND");
                            %>
                            <hr>
                            <a href="index.html">CLICK TO GO BACK</a>
                            <%
                        }
                     con.close();
                    }catch(Exception e)
                   {
                       e.printStackTrace();
                   }
                 
       %> 
                         <h1 style="color:black"> Teacher Name : <%out.println(name);%> </h1>
                         <hr>
                          
      <% 
                       

                try
                   {
                       Class.forName("com.mysql.jdbc.Driver").newInstance();
                       Connection con = (Connection)DriverManager.getConnection("jdbc:Mysql://localhost:3306/web1","root","");
      
                       String str = "select count(tid) as t from feedback where tid="+tid+"";
                       
                       Statement stmt = con.createStatement();
      
                       ResultSet rs = stmt.executeQuery(str);
                       
                       
                       while(rs.next())
                       {
                           int n=rs.getInt("t");
                          
        %> 
                         <h3 style="color:black"> Total number of Feedbacks : <%out.println(n);%> </h3>
                         <hr>
                          
        <% 
                       }
                 con.close();
                   }catch(Exception e)
                   {
                       e.printStackTrace();
                   }
            
                
            
                question.add(" 1. COURSE STRUCTURE :");
                question.add(" 2. COURSE MATERIAL PROVIDED :");
                question.add(" 3. FACULTY'S COURSE PREPARATION FOR CLASS :");
                question.add(" 4. FACULTY'S KNOWLEDGE ABOUT THE COURSE :");
                question.add(" 5. FACULTY'S RESPONSE TO QUESTIONS :");
                question.add(" 6. LAB INFRASTRUCTURE :");
                question.add(" 7. REGULARITY IN CLASS :");
                question.add(" 8. CLASS ROOM INFRASTRUCTURE :");
                question.add(" 9. FACULTY'S METHOD OF PRESENTATION OF SUBJECTS :");
                question.add(" 10. OVERALL IMPRESSION :");
                question.add(" 11. FACULTY'S FOLLOWED THE SYLLABUS :");
                question.add(" 12. FACULTY'S FINISHED THE SYLLABUS :");
         

                  try
                   {
                       Class.forName("com.mysql.jdbc.Driver").newInstance();
                       Connection con = (Connection)DriverManager.getConnection("jdbc:Mysql://localhost:3306/web1","root","");
      
                       String str = "select count(tid) as total from feedback where tid="+tid+"";
                       
                       Statement stmt = con.createStatement();
      
                       ResultSet rs = stmt.executeQuery(str);
                       
                       
                       while(rs.next())
                       {
                           total=rs.getInt("total");
                       }
                    con.close();
                   }catch(Exception e)
                   {
                       e.printStackTrace();
                   }
      
            
            
           for(int i=0;i<12;i++)
           {
            
            %>
             <h4 style="padding-left:20px;"> <%out.println(question.get(i));%> <h4>  
            <%           
               
              if(i<10)
              {   
               for(int j=0;j<4;j++)
               {
                   try
                   {
                       Class.forName("com.mysql.jdbc.Driver").newInstance();
                       Connection con = (Connection)DriverManager.getConnection("jdbc:Mysql://localhost:3306/web1","root","");
      
                       String str = "Select count(q"+i+") as result from feedback where tid="+tid+" and q"+i+" = "+j+"";
                       
                       Statement stmt = con.createStatement();
      
                       ResultSet rs = stmt.executeQuery(str);
                       
                       while(rs.next())
                       {
                           temp=rs.getInt("result");
                           temp=(temp/total)*100;
                       }
                       
                       
                     %>
                    
                    <div style="padding-left:100px;" > 
                       <div class="w3-light" style="width:500px;opacity:1">
                          <%
                           String color="w3-container w3-red";   
                     
                           switch(j)
                           {
                               case 0:out.println("Excellent : " + temp+"%");
                                      color="w3-container w3-yellow";   
                                      break;
                               case 1: color="w3-container w3-green";   
                                      out.println("Good :" + temp+"%");
                                      break;
                               case 2: color="w3-container w3-orange";   
                                      out.println("Average :" + temp+"%");
                                      break;
                               case 3: color="w3-container w3-red";   
                                      out.println("Poor :" + temp+"%");
                                      break;       
                           }
                     
                          %>
                         <div id="myBar" class="<%=color%>" style="height:24px;width:<%=temp%>%;box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2), 0 6px 20px 0 rgba(0, 0, 0, 0.19);"></div>
                       </div>
                    </div>
                     <%  
                    con.close();
                   }catch(Exception e)
                   {
                       e.printStackTrace();
                   }
               }
             %>
             <hr>
                     <%
           }

           else
            {
              for(int j=4;j<=5;j++)
               {
                   try
                   {
                       Class.forName("com.mysql.jdbc.Driver").newInstance();
                       Connection con = (Connection)DriverManager.getConnection("jdbc:Mysql://localhost:3306/web1","root","");
      
                       String str = "Select count(q"+i+") as result from feedback where tid="+tid+" and q"+i+" = "+j+"";
                       
                       Statement stmt = con.createStatement();
      
                       ResultSet rs = stmt.executeQuery(str);
                       
                       while(rs.next())
                       {
                           temp=rs.getInt("result");
                           temp=(temp/total)*100;
                       }
                       
                       
                     %>
                    
                     <div style="padding-left:100px;"> 
                       <div class="w3-light" style="width:500px;opacity:1">
                          <%
                           String color="w3-container w3-red";   
                     
                           switch(j)
                           {
                               case 4: color="w3-container w3-orange";   
                                      out.println("Yes :" + temp+"%");
                                      break;
                               case 5: color="w3-container w3-red";   
                                      out.println("No :" + temp+"%");
                                      break;       
                           }
                     
                          %>
                         <div id="myBar" class="<%=color%>" style="height:24px;width:<%=temp%>%;box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2), 0 6px 20px 0 rgba(0, 0, 0, 0.19);"></div>
                       </div>
                       <hr>
                    </div>
                     <%  
                       con.close();
                   }catch(Exception e)
                   {
                       e.printStackTrace();
                   }
                
               }
            }
 
}
            // COMMENTS

                 try
                   {

                       
                       Class.forName("com.mysql.jdbc.Driver").newInstance();
                       Connection con = (Connection)DriverManager.getConnection("jdbc:Mysql://localhost:3306/web1","root","");
      
                       String str = "select q12 , q13 , q14 from feedback where tid = "+tid+"";
                       
                       Statement stmt = con.createStatement();
      
                       ResultSet rs = stmt.executeQuery(str);
                       
                       while(rs.next())
                       {
                         if(!rs.getString("q12").equals(" "))
                           {a.add(rs.getString("q12"));
                           
                        if(!rs.getString("q13").equals(" "))  
                          {b.add(rs.getString("q13"));}

                         if(!rs.getString("q14").equals(" "))
                           {c.add(rs.getString("q14"));}  
                       }
                  
                   
                    }
                       con.close();
                   }catch(Exception e)
                   {
                       e.printStackTrace();
                   }


        %> 
        <hr>
         <h4 style="padding-left:20px;text-align: center"> What you like most in the course  <h4> 
       <div class="w3-round" style="position:relative;background-color: teal;color: white;margin-left:10%;margin-right:10%;box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2), 0 6px 20px 0 rgba(0, 0, 0, 0.19);">              
                         <%
                         for(int i=0;i<a.size();i++)    
                         {
                             %>
                             <p style="padding-top:5px;padding-left:5px;"><%=a.get(i)%></p>
                             <hr>
                             <%
                         }
                         %>  
                 </div>   
         <hr>        
         <h4 style="padding-left:20px;text-align: center""> Area of improvement   <h4> 
                        <div style="position:relative;background-color: teal;color: white;margin-left:10%;margin-right:10%;box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2), 0 6px 20px 0 rgba(0, 0, 0, 0.19);">              
                         <%
                         for(int i=0;i<b.size();i++)    
                         {
                             %>
                             <p style="padding-top:5px;padding-left:5px;"><%=b.get(i)%></p>
                             <hr>
                             <%
                         }
                         %>  
                 </div>   

         <hr>        
      <h4 style="padding-left:20px;text-align: center""> Any other comment  <h4> 
                        <div style="position:relative;background-color: teal;color: white;margin-left:10%;margin-right:10%;box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2), 0 6px 20px 0 rgba(0, 0, 0, 0.19);">              
                         <%
                         for(int i=0;i<c.size();i++)    
                         {
                             %>
                             <p style="padding-top:2px;padding-left:5px;"><%=c.get(i)%></p>
                             <hr>
                             <%
                         }
                             a.clear();
                             b.clear();
                             c.clear();
                         %>  
                 </div>   
              
                 <div class="w3-animate-fading" style="align:center " >     
             <a href="index.html" class="w3-button w3-circle w3-teal"> MAIN PAGE</a>
             </div>
 </div>      
      
</body>

 
</html>
