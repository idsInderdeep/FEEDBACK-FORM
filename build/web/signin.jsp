<%-- 
    Document   : signin
    Created on : 3 Jul, 2018, 2:22:14 AM
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
        <title>NIELIT STATUS</title>
    </head>
    <body>
         <marquee width="100%" direction="right" style="font-family:platino" >
         Developed by - <i>Inderdeep Singh</i>  
        </marquee>
                
        <%
            int tid = Integer.parseInt(request.getParameter("tid")),flag=0;
            String uname,psw,cpsw;
            uname = request.getParameter("name");
            psw = request.getParameter("psw");
            cpsw = request.getParameter("cpsw");
              
              try{
                       Class.forName("com.mysql.jdbc.Driver").newInstance();
                       Connection con = (Connection)DriverManager.getConnection("jdbc:Mysql://localhost:3306/web1","root","");
      
                       String str = "select * from faculty where tid="+tid+"";
                       
                       Statement stmt = con.createStatement();
      
                       ResultSet rs = stmt.executeQuery(str);
                       
                       while(rs.next())
                       {
                         if(rs.getInt("tid")==tid)
                         {
                           flag=1;
                         }
                       }
                      
                   }catch(Exception e)
                   {
                      e.printStackTrace();
                
                   }
              
              if(flag==1)
              {
              
               
                     try{
                       Class.forName("com.mysql.jdbc.Driver").newInstance();
                       Connection con = (Connection)DriverManager.getConnection("jdbc:Mysql://localhost:3306/web1","root","");
      
                       
                       String str = "Insert into login values('"+uname+"','"+psw+"','"+tid+"')";
                       
                       Statement stmt = con.createStatement();
      
                       stmt.executeUpdate(str);
                       
                       con.close();
                        
                       %>
                           <h1>!! USER ID CREATED !!</h1>
                 <p>Now you can check your feedback</p>
                 <a href="index.html">MAIN PAGE</a
             
                       <% 
                   }catch(Exception e)
                   {
                    %>
                    <h1>Ooops !! Account Is Already Created By This ID</h1>
                    <a href="newfile.html">BACK</a>
                    <%
                
                   }
             
              }
              else
              {
                  %>
                    <h1>ERROR: !! TEACHER ID NOT FOUND !!</h1>
                    <a href="newfile.html">GO BACK</a>
                  <%
              }
        %>
        
        
    </body>
</html>
