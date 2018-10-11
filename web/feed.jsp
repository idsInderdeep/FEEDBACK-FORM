<html>      
        <%@ page  import="java.sql.DriverManager;"%>
        <%@ page  import="javax.swing.*"%>
        <%@ page  import=" java.sql.*"%>
<%
   
    try{
    out.println("URL");
    int tid,q0,q1,q2,q3,q4,q5,q6,q7,q8,q9,q10,q11;
    String q12,q13,q14;
    
    tid=Integer.parseInt(request.getParameter("tid"));
    q0=Integer.parseInt(request.getParameter("q0"));
    q1=Integer.parseInt(request.getParameter("q1"));
    q2=Integer.parseInt(request.getParameter("q2"));
    q3=Integer.parseInt(request.getParameter("q3"));
    q4=Integer.parseInt(request.getParameter("q4"));
    q5=Integer.parseInt(request.getParameter("q5"));
    q6=Integer.parseInt(request.getParameter("q6"));
    q7=Integer.parseInt(request.getParameter("q7"));
    q8=Integer.parseInt(request.getParameter("q8"));
    q9=Integer.parseInt(request.getParameter("q9"));
    q10=Integer.parseInt(request.getParameter("q10"));
    q11=Integer.parseInt(request.getParameter("q11"));
    q12=request.getParameter("q12");
    q13=request.getParameter("q13");
    q14=request.getParameter("q14");
    
     
    
   /*out.println(tid);
   out.println(q0);
   out.println(q1);
   out.println(q2);
   out.println(q3);
   out.println(q4);
   out.println(q5);
   out.println(q6);
   out.println(q7);
   out.println(q8);
   out.println(q9);
   out.println(q10);
   out.println(q11);
   out.println(q12);
   out.println(q13);
   out.println(q14);   
     */
       Class.forName("com.mysql.jdbc.Driver").newInstance();
       Connection co = (Connection)DriverManager.getConnection("jdbc:Mysql://localhost:3306/web1","root","");
       
        String str="Insert into feedback values("+tid+","+q0+","+q1+","+q2+","+q3+","+q4+","+q5+","+q6+","+q7+","+q8+","+q9+","+q10+","+q11+",'"+q12+"','"+q13+"','"+q14+"')";
        
        Statement st = co.createStatement();
                
        st.executeUpdate(str);
        co.close();
        st.close();
      }     
      catch(Exception e)
       {
          e.printStackTrace();
       }
%>
<body onload="A()">
    
    <script>
        function A()
        {
            window.open("http://localhost:8080/FORM/index.html","_self");
        }
    </script>    
</body>
</html> 

