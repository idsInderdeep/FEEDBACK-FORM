<%-- 
    Document   : batch
    Created on : 29 Jun, 2018, 2:20:00 PM
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
    </head>
  
    <body style="background-color: #cc6600;color:black;">
       
        <%!
            ResultSet rs;
            int tid;
            int flag=0;
            String psw,name;
           
        %>
        <%
                /*psw="singh";
                name="inder";
               
                try
                   {
                       Class.forName("com.mysql.jdbc.Driver").newInstance();
                       Connection con = (Connection)DriverManager.getConnection("jdbc:Mysql://localhost:3306/web1","root","");
      
                       String str = "select * from login ";
                       Statement stmt = con.createStatement();
      
                        rs = stmt.executeQuery(str);
                        
                        while(rs.next())
                        {
                            if(rs.getString("uname").equals(name)&&rs.getString("psw").equalsIgnoreCase(psw))
                            {
                                tid=rs.getInt("tid");
                                flag=1;
                            }
                        }
                        
                        if(flag==1)
                        {
                          out.println(tid);
                        } 
                        else
                        {
                            out.println("SORRY LOGIN ID NOT FOUND");
                        }
                    }catch(Exception e)
                   {
                       e.printStackTrace();
                   }*/
                 
                ArrayList<String> a= new ArrayList<String>();
                
                 try
                   {

                       
                       Class.forName("com.mysql.jdbc.Driver").newInstance();
                       Connection con = (Connection)DriverManager.getConnection("jdbc:Mysql://localhost:3306/web1","root","");
      
                       String str = "select q12 , q13 , q14 from feedback";
                       
                       Statement stmt = con.createStatement();
      
                       ResultSet rs = stmt.executeQuery(str);
                       
                       while(rs.next())
                       {
                           a.add(rs.getString("q12"));
                             
                       }
                        
                      out.println(a.size()); 

                   }catch(Exception e)
                   {
                       e.printStackTrace();
                   }

    %>   
    <h2><%= a.get(0)%></h2>
    </body>
    </html>
    