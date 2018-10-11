<%-- 
    Document   : newjsp2
    Created on : 1 Jul, 2018, 12:27:20 AM
    Author     : Inderdeep
--%>
   <%@ page  import="java.sql.DriverManager;"%>
        <%@ page  import="javax.swing.*"%>
        <%@ page  import=" java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
      
     <form action="">   
   <%! ResultSet rs ;%>    
       
     <%  
      try
      {
       Class.forName("com.mysql.jdbc.Driver");
       Connection con = (Connection)DriverManager.getConnection("jdbc:Mysql://localhost:3306/web1","root","");
       
       String str = "Select * from course";
       Statement stmt = con.createStatement();
      
       rs = stmt.executeQuery(str);
      }     
      catch(Exception e)
       {
          e.printStackTrace();
       }

     %>   
  
       <select  name="course" onchange="this.form.submit()">
          
            <option value="0">COURSE</option>
          <%
             while(rs.next())
              {
          %>
          <option value= <%=rs.getInt("cid") %> 
              <%
                 if(request.getParameter("course")!=null)
                 {
                     if(rs.getInt("cid")==Integer.parseInt(request.getParameter("course")))
                     {
                         out.println("selected");
                     }
                 }
                 else
                 {
                     out.println("course");
                 }
              %>>
       
               <%
                 out.println(rs.getString("cname")) ;
              %>
          </option>   
          
        
          <%
              }
          %>  
          
          
          
        </select>   
        
                 
        <select name="batch">
            
               <%! ResultSet r ;  String str;%>    
       
     <%  
      try
      {
       Class.forName("com.mysql.jdbc.Driver").newInstance();
       Connection con = (Connection)DriverManager.getConnection("jdbc:Mysql://localhost:3306/web1","root","");
       
        str="Select * from batch where cid = ?";
        
        PreparedStatement ps = con.prepareStatement(str);
        ps.setString(1,request.getParameter("course"));
        
        r=ps.executeQuery();
         
      }     
      catch(Exception e)
       {
          e.printStackTrace();
       }

     %>   
  
        <option value="0">batch</option>
          <%
             while(r.next())
              {
          %>
          <option value= <%=r.getInt("bid") %>>
       
               <%
                 out.println(r.getString("bname")) ;
              %>
          </option>   
          <%}%>

        
        </select>
         
         <p>
           <%=
               request.getParameter("batch")
           %>
         </p>
                 <p><%= request.getParameter("course")%></p>
         
     </form>

    </body>
</html>
