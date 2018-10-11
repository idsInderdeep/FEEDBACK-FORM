package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.DriverManager;;
import javax.swing.*;
import java.sql.*;

public final class newjsp_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 ResultSet rs ;String name;
 ResultSet r ;  String str,sdate,edate;int tid=0;
 ResultSet rt ;String tname;
  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/newjsp1.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<!--\n");
      out.write("To change this license header, choose License Headers in Project Properties.\n");
      out.write("To change this template file, choose Tools | Templates\n");
      out.write("and open the template in the editor.\n");
      out.write("-->\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>NIELIT FORM</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("         <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("         <link rel=\"stylesheet\" href=\"https://www.w3schools.com/w3css/4/w3.css\">\n");
      out.write("         <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("         <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("         <link rel=\"stylesheet\" href=\"w3.css\">\n");
      out.write("         \n");
      out.write("         <link rel=\"stylesheet\" href=\"style.css\">\n");
      out.write("         <script src=\"script.js\"></script>\n");
      out.write("         \n");
      out.write("         \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <!-- HEADER -->\n");
      out.write("        <div class=\"header\">\n");
      out.write("            <h4 class=\"display-4\"><b>National Institute of Electronics & Information Technology</b></h4>\n");
      out.write("        </div>\n");
      out.write("            <marquee width=\"100%\" direction=\"right\" style=\"font-family:platino\" >\n");
      out.write("         Developed by - <i>Inderdeep Singh</i>  \n");
      out.write("        </marquee>\n");
      out.write("    \n");
      out.write("        \n");
      out.write("        <!-- CARD-->\n");
      out.write("        <div class=\"card\" style=\"padding-top: 2px\">\n");
      out.write("         \n");
      out.write("          <h4 style=\"color:rgb(255, 62, 27);padding: 1%;\">Student Feedback Form</h4> \n");
      out.write("          \n");
      out.write("         <div class=\"w3-content w3-display-container\">\n");
      out.write("  \n");
      out.write("           <!-- SELECTION -->  \n");
      out.write("             \n");
      out.write("             <div class=\"mySlides1\" style=\"margin: auto;width:100%;position:relative;\">\n");
      out.write("                 ");
      out.write("\n");
      out.write("       \n");
      out.write("<html>\n");
      out.write("      \n");
      out.write("<head>\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("<link rel=\"stylesheet\" href=\"w3.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"style1.css\">\n");
      out.write("</head>     \n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    \n");
      out.write("      \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("\n");
      out.write("        <h6 style=\"text-align: center;font-family:Courier New\">FILL DETAILS</h6>\n");
      out.write("\n");
      out.write("   <form action=\"\" style=\"margin-left: 100px\">        \n");
      out.write("        \n");
      out.write("<div style=\"width:200px;\">\n");
      out.write("\n");
      out.write("    <p>COURSE NAME</p>\n");
      out.write("    \n");
      out.write("   ");
      out.write("    \n");
      out.write("       \n");
      out.write("     ");
  
      try
      {
       Class.forName("com.mysql.jdbc.Driver").newInstance();
       Connection con = (Connection)DriverManager.getConnection("jdbc:Mysql://localhost:3306/web1","root","");
       
       String str = "Select * from course";
       Statement stmt = con.createStatement();
      
       rs = stmt.executeQuery(str);
       
      }     
      catch(Exception e)
       {
          e.printStackTrace();
       }
    
     
      out.write("   \n");
      out.write("  \n");
      out.write("\n");
      out.write("       <select name=\"course\" onchange=\"this.form.submit()\">\n");
      out.write("          \n");
      out.write("            <option value=\"0\">COURSE</option>\n");
      out.write("          ");

             while(rs.next())
              {
          
      out.write("\n");
      out.write("          <option value= ");
      out.print(rs.getInt("cid") );
      out.write(" \n");
      out.write("              ");

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
              
      out.write(">\n");
      out.write("       \n");
      out.write("               ");

                 out.println(rs.getString("cname")) ;
              
      out.write("\n");
      out.write("          </option>   \n");
      out.write("          \n");
      out.write("        \n");
      out.write("          ");

              }
          
      out.write("  \n");
      out.write("          \n");
      out.write("          \n");
      out.write("          \n");
      out.write("        </select>  \n");
      out.write("     \n");
      out.write("</div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("          \n");
      out.write("<div style=\"padding-left:200px;padding-top:0px;width:200px;\">\n");
      out.write("    <p>BATCH NAME</p>\n");
      out.write("  \n");
      out.write("    <select name=\"batch\" onchange=\"this.form.submit()\">\n");
      out.write("            \n");
      out.write("               ");
      out.write("    \n");
      out.write("       \n");
      out.write("     ");
  
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

     
      out.write("   \n");
      out.write("  \n");
      out.write("        <option value=\"0\">BATCH</option>\n");
      out.write("          ");

             while(r.next())
              {
          
      out.write("\n");
      out.write("          <option value= ");
      out.print(r.getInt("bid") );
      out.write("\n");
      out.write("          \n");
      out.write("              ");

                 if(request.getParameter("batch")!=null)
                 {
                     if(r.getInt("bid")==Integer.parseInt(request.getParameter("batch")))
                     {
                         sdate=r.getString("sdate");
                         edate=r.getString("edate");
                         tid=r.getInt("tid");
                         out.println("selected");
                     }
                 }
                 else
                 {
                     out.println("batch");
                 }
              
      out.write("\n");
      out.write("\n");
      out.write("              \n");
      out.write("          >\n");
      out.write("   \n");
      out.write("\n");
      out.write("              ");
 
                 out.println(r.getString("bname")) ;
              
      out.write("\n");
      out.write("          </option>   \n");
      out.write("          ");
}
      out.write("\n");
      out.write("\n");
      out.write("        \n");
      out.write("        </select>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("          \n");
      out.write("          \n");
      out.write("<div style=\"padding-left:400px;padding-top:0px;width:200px;\">\n");
      out.write("    <p>TEACHER NAME</p>\n");
      out.write("  \n");
      out.write("    <select name=\"tid\">\n");
      out.write("          \n");
      out.write("     ");
      out.write("    \n");
      out.write("       \n");
      out.write("     ");
  
      try
      {
       Class.forName("com.mysql.jdbc.Driver").newInstance();
       Connection co = (Connection)DriverManager.getConnection("jdbc:Mysql://localhost:3306/web1","root","");
       
        str="Select * from faculty where TID = "+tid;
        
        Statement st = co.createStatement();
                
        rt=st.executeQuery(str);
         
      }     
      catch(Exception e)
       {
          e.printStackTrace();
       }

     
      out.write("   \n");
      out.write("  \n");
      out.write("          ");

             while(rt.next())
              {
          
      out.write("\n");
      out.write("          <option value=\"");
      out.print(tid);
      out.write('"');
      out.write('>');
out.println(rt.getString("tname"));
      out.write("</optioin>\n");
      out.write("          ");
 
             }
          
           
      out.write("         \n");
      out.write("        </select>\n");
      out.write("    \n");
      out.write("</div>              \n");
      out.write("          <div style=\"padding-left:600px;padding-top:0px;width:200px;\">\n");
      out.write("              <p>START DATE</p>\n");
      out.write("              <select>\n");
      out.write("                  <option>");
      out.print(sdate);
      out.write("</option>\n");
      out.write("              </select>\n");
      out.write("           </div>\n");
      out.write("            \n");
      out.write("          <div style=\"padding-left:600px;padding-top:30px;width:200px;\">    \n");
      out.write("              <p>END DATE</p>\n");
      out.write("               <select>\n");
      out.write("                  <option>");
      out.print(edate);
      out.write("</option>\n");
      out.write("               </select>\n");
      out.write("               \n");
      out.write("          </div>    \n");
      out.write("</form>                   \n");
      out.write("<script type=\"text/javascript\" src=\"script_1.js\"></script>\n");
      out.write("<button class=\"w3-button w3-round w3-green\" style=\"opacity:0.6;margin-left: 400px;\" onclick=\"plusDivs(1, 0)\">DONE</button>\n");
      out.write("<!--&#10095;-->\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write(" \n");
      out.write("                 \n");
      out.write("             </div> \n");
      out.write("       \n");
      out.write("          <!-- QUESTION 1 -->                           \n");
      out.write("          <h1 class=\"mySlides1  w3-animate-zoom\" style=\"width:100%;padding-left:20px;padding-top: 0px;\">\n");
      out.write("                                       \n");
      out.write("            <div style=\"margin:auto;width:80%\">\n");
      out.write("              \n");
      out.write("                <h4 style=\"padding-bottom:10px;\"> 1. COURSE STRUCTURE :</h4> \n");
      out.write("                \n");
      out.write("         <div style=\"padding-left:250px;\">\n");
      out.write("          \n");
      out.write("              <label class=\"container\">Excellent\n");
      out.write("                  <input type=\"radio\" name=\"radio\" value=\"0\" id=\"radio1\">\n");
      out.write("                     <span class=\"checkmark\"></span>\n");
      out.write("                 </label>\n");
      out.write("\n");
      out.write("                 <label class=\"container\">Good\n");
      out.write("                     <input type=\"radio\"  name=\"radio\"  value=\"1\" id=\"radio2\">\n");
      out.write("                   <span class=\"checkmark\"></span>\n");
      out.write("                 </label>\n");
      out.write("\n");
      out.write("                 <label class=\"container\">Average\n");
      out.write("                   <input type=\"radio\"  name=\"radio\" value=\"2\" id=\"radio3\">\n");
      out.write("                   <span class=\"checkmark\"></span>\n");
      out.write("                 </label>\n");
      out.write(" \n");
      out.write("                 <label class=\"container\">Poor\n");
      out.write("                    <input type=\"radio\"  name=\"radio\"  value=\"3\" id=\"radio4\">\n");
      out.write("                    <span class=\"checkmark\"></span>\n");
      out.write("                 </label>\n");
      out.write("           \n");
      out.write("          </div> \n");
      out.write("                \n");
      out.write("                \n");
      out.write("            </div>   \n");
      out.write("   \n");
      out.write("              <p id=\"print\" style=\"display:none\">aaaaaa</p>\n");
      out.write("              <div class=\"w3-light-grey w3-round\" style=\"background-color: blueviolet\">\n");
      out.write("                  <br> \n");
      out.write("                   <label class=\"container\">  \n");
      out.write("                 <button class=\"w3-button w3-round w3-green w3-display-left\" style=\"opacity:0.6;margin-top:10px\" onclick=\"plusDivs(-1, 0);\" >&#10094;  PRE</button>      \n");
      out.write("                 <button class=\"w3-button w3-round w3-green w3-display-right \" style=\"opacity:0.6;margin-top:10px\" onclick=\"check(1,4,0)\">NEXT &#10095;</button>\n");
      out.write("                 <!--&#10095;-->      \n");
      out.write("                 </label> \n");
      out.write("                <br>   \n");
      out.write("                  <div class=\"w3-container w3-blue w3-round\" style=\"width:8.33%\"margin-top:30px><h4>1/12</h4></div>\n");
      out.write("               </div>\n");
      out.write("                 \n");
      out.write("            </h1>\n");
      out.write("         \n");
      out.write("          <!-- QUESTION 2 -->                           \n");
      out.write("          <h1 class=\"mySlides1 \" style=\"width:100%;padding-left:20px;\">\n");
      out.write("                                       \n");
      out.write("            <div style=\"margin:auto;width:80%;\">\n");
      out.write("              \n");
      out.write("                <h4 style=\"padding-bottom:10px;\" class=\"w3-animate-opacity\"> 2. COURSE MATERIAL PROVIDED :</h4> \n");
      out.write("                \n");
      out.write("         <div style=\"padding-left:250px\" class=\"w3-animate-opacity\">\n");
      out.write("          \n");
      out.write("              <label class=\"container\">Excellent\n");
      out.write("                  <input type=\"radio\" name=\"radio\" value=\"0\" id=\"radio5\">\n");
      out.write("                     <span class=\"checkmark\"></span>\n");
      out.write("                 </label>\n");
      out.write("\n");
      out.write("                 <label class=\"container\">Good\n");
      out.write("                     <input type=\"radio\"  name=\"radio\"  value=\"1\" id=\"radio6\">\n");
      out.write("                   <span class=\"checkmark\"></span>\n");
      out.write("                 </label>\n");
      out.write("\n");
      out.write("                 <label class=\"container\">Average\n");
      out.write("                   <input type=\"radio\"  name=\"radio\" value=\"2\" id=\"radio7\">\n");
      out.write("                   <span class=\"checkmark\"></span>\n");
      out.write("                 </label>\n");
      out.write(" \n");
      out.write("                 <label class=\"container\">Poor\n");
      out.write("                    <input type=\"radio\"  name=\"radio\"  value=\"3\" id=\"radio8\">\n");
      out.write("                    <span class=\"checkmark\"></span>\n");
      out.write("                 </label>\n");
      out.write("           \n");
      out.write("          </div> \n");
      out.write("                \n");
      out.write("                \n");
      out.write("            </div>   \n");
      out.write("   \n");
      out.write("               <div class=\"w3-light-grey w3-round\">\n");
      out.write("                  <br> \n");
      out.write("                   <label class=\"container\">      \n");
      out.write("                   <button class=\"w3-button w3-round w3-green w3-display-left\" style=\"opacity:0.6;margin-top:10px\" onclick=\"plusDivs(-1, 0);\" >&#10094;  PRE</button>      \n");
      out.write("                 <button class=\"w3-button w3-round w3-green w3-display-right \" style=\"opacity:0.6;margin-top:10px\" onclick=\"check(5,8,1)\">NEXT &#10095;</button>\n");
      out.write("                 <!--&#10095;-->      \n");
      out.write("                 </label> \n");
      out.write("                <br>   \n");
      out.write("                  <div class=\"w3-container w3-blue w3-round w3-animate-right\" style=\"width:24.99%\"margin-top:30px><h4>2/12</h4></div>\n");
      out.write("               </div>\n");
      out.write("                 \n");
      out.write("            </h1>\n");
      out.write("\n");
      out.write("\n");
      out.write("          <!-- QUESTION 3 -->                           \n");
      out.write("          <h1 class=\"mySlides1\" style=\"width:100%;padding-left:20px;\">\n");
      out.write("                                       \n");
      out.write("            <div style=\"margin:auto;width:80%;\">\n");
      out.write("              \n");
      out.write("                <h4 style=\"padding-bottom:10px;\" class=\"w3-animate-opacity\">3. FACULTY'S COURSE PREPARATION FOR CLASS :</h4> \n");
      out.write("                \n");
      out.write("         <div style=\"padding-left:250px\">\n");
      out.write("          \n");
      out.write("              <label class=\"container\">Excellent\n");
      out.write("                  <input type=\"radio\" name=\"radio\" value=\"0\" id=\"radio9\" checked=\"\">\n");
      out.write("                     <span class=\"checkmark\"></span>\n");
      out.write("                 </label>\n");
      out.write("\n");
      out.write("                 <label class=\"container\">Good\n");
      out.write("                     <input type=\"radio\"  name=\"radio\"  value=\"1\" id=\"radio10\">\n");
      out.write("                   <span class=\"checkmark\"></span>\n");
      out.write("                 </label>\n");
      out.write("\n");
      out.write("                 <label class=\"container\">Average\n");
      out.write("                   <input type=\"radio\"  name=\"radio\" value=\"2\" id=\"radio11\">\n");
      out.write("                   <span class=\"checkmark\"></span>\n");
      out.write("                 </label>\n");
      out.write(" \n");
      out.write("                 <label class=\"container\">Poor\n");
      out.write("                    <input type=\"radio\"  name=\"radio\"  value=\"3\" id=\"radio12\">\n");
      out.write("                    <span class=\"checkmark\"></span>\n");
      out.write("                 </label>\n");
      out.write("           \n");
      out.write("          </div> \n");
      out.write("                \n");
      out.write("                \n");
      out.write("            </div>   \n");
      out.write("   \n");
      out.write("               <div class=\"w3-light-grey w3-round\">\n");
      out.write("                  <br> \n");
      out.write("                   <label class=\"container\"> \n");
      out.write("                   <button class=\"w3-button w3-round w3-green w3-display-left\" style=\"opacity:0.6;margin-top:10px\" onclick=\"plusDivs(-1, 0);\" >&#10094;  PRE</button>      \n");
      out.write("                 <button class=\"w3-button w3-round w3-green w3-display-right \" style=\"opacity:0.6;margin-top:10px\" onclick=\"check(9,12,2)\">NEXT &#10095;</button>\n");
      out.write("                 <!--&#10095;-->      \n");
      out.write("                 </label> \n");
      out.write("                <br>   \n");
      out.write("                  <div class=\"w3-container w3-blue w3-round w3-animate-right\" style=\"width:33.32%\"margin-top:30px><h4>3/12</h4></div>\n");
      out.write("               </div>\n");
      out.write("                 \n");
      out.write("            </h1>          \n");
      out.write("          \n");
      out.write("             \n");
      out.write("             <!-- QUESTION 4 -->\n");
      out.write("             \n");
      out.write("                                \n");
      out.write("          <h1 class=\"mySlides1 \" style=\"width:100%;padding-left:20px;\">\n");
      out.write("                                       \n");
      out.write("            <div style=\"margin:auto;width:80%;\">\n");
      out.write("              \n");
      out.write("                <h4 style=\"padding-bottom:10px;\" class=\"w3-animate-opacity\"> 4. FACULTY'S KNOWLEDGE ABOUT THE COURSE :</h4> \n");
      out.write("                \n");
      out.write("         <div style=\"padding-left:250px\">\n");
      out.write("          \n");
      out.write("              <label class=\"container\">Excellent\n");
      out.write("                  <input type=\"radio\" name=\"radio\" value=\"0\" id=\"radio13\" checked=\"\">\n");
      out.write("                     <span class=\"checkmark\"></span>\n");
      out.write("                 </label>\n");
      out.write("\n");
      out.write("                 <label class=\"container\">Good\n");
      out.write("                     <input type=\"radio\"  name=\"radio\"  value=\"1\" id=\"radio14\">\n");
      out.write("                   <span class=\"checkmark\"></span>\n");
      out.write("                 </label>\n");
      out.write("\n");
      out.write("                 <label class=\"container\">Average\n");
      out.write("                   <input type=\"radio\"  name=\"radio\" value=\"2\" id=\"radio15\">\n");
      out.write("                   <span class=\"checkmark\"></span>\n");
      out.write("                 </label>\n");
      out.write(" \n");
      out.write("                 <label class=\"container\">Poor\n");
      out.write("                    <input type=\"radio\"  name=\"radio\"  value=\"3\" id=\"radio16\">\n");
      out.write("                    <span class=\"checkmark\"></span>\n");
      out.write("                 </label>\n");
      out.write("           \n");
      out.write("          </div> \n");
      out.write("                \n");
      out.write("                \n");
      out.write("            </div>   \n");
      out.write("   \n");
      out.write("               <div class=\"w3-light-grey w3-round\">\n");
      out.write("                  <br> \n");
      out.write("                   <label class=\"container\">\n");
      out.write("                   <button class=\"w3-button w3-round w3-green w3-display-left\" style=\"opacity:0.6;margin-top:10px\" onclick=\"plusDivs(-1, 0);\" >&#10094;  PRE</button>      \n");
      out.write("                 <button class=\"w3-button w3-round w3-green w3-display-right \" style=\"opacity:0.6;margin-top:10px\" onclick=\"check(13,16,3)\">NEXT &#10095;</button>\n");
      out.write("                 <!--&#10095;-->      \n");
      out.write("                 </label> \n");
      out.write("                <br>   \n");
      out.write("                  <div class=\"w3-container w3-blue w3-round w3-animate-right\" style=\"width:41.65%\"margin-top:30px><h4>4/12</h4></div>               </div>\n");
      out.write("                 \n");
      out.write("            </h1> \n");
      out.write("             \n");
      out.write("             <!-- QUESTION 5 -->\n");
      out.write("                           \n");
      out.write("          <h1 class=\"mySlides1\" style=\"width:100%;padding-left:20px;\">\n");
      out.write("                                       \n");
      out.write("            <div style=\"margin:auto;width:80%;\">\n");
      out.write("              \n");
      out.write("                <h4 style=\"padding-bottom:10px;\" class=\"w3-animate-opacity\"> 5. FACULTY'S RESPONSE TO QUESTIONS :</h4> \n");
      out.write("                \n");
      out.write("         <div style=\"padding-left:250px\">\n");
      out.write("          \n");
      out.write("              <label class=\"container\">Excellent\n");
      out.write("                  <input type=\"radio\" name=\"radio\" value=\"0\" id=\"radio17\" checked=\"\">\n");
      out.write("                     <span class=\"checkmark\"></span>\n");
      out.write("                 </label>\n");
      out.write("\n");
      out.write("                 <label class=\"container\">Good\n");
      out.write("                     <input type=\"radio\"  name=\"radio\"  value=\"1\" id=\"radio18\">\n");
      out.write("                   <span class=\"checkmark\"></span>\n");
      out.write("                 </label>\n");
      out.write("\n");
      out.write("                 <label class=\"container\">Average\n");
      out.write("                   <input type=\"radio\"  name=\"radio\" value=\"2\" id=\"radio19\">\n");
      out.write("                   <span class=\"checkmark\"></span>\n");
      out.write("                 </label>\n");
      out.write(" \n");
      out.write("                 <label class=\"container\">Poor\n");
      out.write("                    <input type=\"radio\"  name=\"radio\"  value=\"3\" id=\"radio20\">\n");
      out.write("                    <span class=\"checkmark\"></span>\n");
      out.write("                 </label>\n");
      out.write("           \n");
      out.write("          </div> \n");
      out.write("                \n");
      out.write("                \n");
      out.write("            </div>   \n");
      out.write("   \n");
      out.write("               <div class=\"w3-light-grey w3-round\">\n");
      out.write("                  <br> \n");
      out.write("                   <label class=\"container\">        \n");
      out.write("                   <button class=\"w3-button w3-round w3-green w3-display-left\" style=\"opacity:0.6;margin-top:10px\" onclick=\"plusDivs(-1, 0);\" >&#10094;  PRE</button>      \n");
      out.write("                 <button class=\"w3-button w3-round w3-green w3-display-right \" style=\"opacity:0.6;margin-top:10px\" onclick=\"check(17,20,4)\">NEXT &#10095;</button>\n");
      out.write("                 <!--&#10095;-->      \n");
      out.write("                 </label> \n");
      out.write("                <br>   \n");
      out.write("                  <div class=\"w3-container w3-blue w3-round w3-animate-right\" style=\"width:41.65%\"margin-top:30px><h4>5/12</h4></div>\n");
      out.write("               </div>\n");
      out.write("                 \n");
      out.write("            </h1>             \n");
      out.write("             \n");
      out.write("             <!-- QUESTION 6 -->\n");
      out.write("                  \n");
      out.write("          <h1 class=\"mySlides1 \" style=\"width:100%;padding-left:20px;\">\n");
      out.write("                                       \n");
      out.write("            <div style=\"margin:auto;width:80%;\">\n");
      out.write("              \n");
      out.write("                <h4 style=\"padding-bottom:10px;\" class=\"w3-animate-opacity\"> 6. LAB INFRASTRUCTURE :</h4> \n");
      out.write("                \n");
      out.write("         <div style=\"padding-left:250px\">\n");
      out.write("          \n");
      out.write("              <label class=\"container\">Excellent\n");
      out.write("                  <input type=\"radio\" name=\"radio\" value=\"0\" id=\"radio21\"checked=\"\">\n");
      out.write("                     <span class=\"checkmark\"></span>\n");
      out.write("                 </label>\n");
      out.write("\n");
      out.write("                 <label class=\"container\">Good\n");
      out.write("                     <input type=\"radio\"  name=\"radio\"  value=\"1\" id=\"radio22\">\n");
      out.write("                   <span class=\"checkmark\"></span>\n");
      out.write("                 </label>\n");
      out.write("\n");
      out.write("                 <label class=\"container\">Average\n");
      out.write("                   <input type=\"radio\"  name=\"radio\" value=\"2\" id=\"radio23\">\n");
      out.write("                   <span class=\"checkmark\"></span>\n");
      out.write("                 </label>\n");
      out.write(" \n");
      out.write("                 <label class=\"container\">Poor\n");
      out.write("                    <input type=\"radio\"  name=\"radio\"  value=\"3\" id=\"radio24\">\n");
      out.write("                    <span class=\"checkmark\"></span>\n");
      out.write("                 </label>\n");
      out.write("           \n");
      out.write("          </div> \n");
      out.write("                \n");
      out.write("                \n");
      out.write("            </div>   \n");
      out.write("   \n");
      out.write("               <div class=\"w3-light-grey w3-round\">\n");
      out.write("                  <br> \n");
      out.write("                   <label class=\"container\">  \n");
      out.write("                   <button class=\"w3-button w3-round w3-green w3-display-left\" style=\"opacity:0.6;margin-top:10px\" onclick=\"plusDivs(-1, 0);\" >&#10094;  PRE</button>      \n");
      out.write("                 <button class=\"w3-button w3-round w3-green w3-display-right \" style=\"opacity:0.6;margin-top:10px\" onclick=\"check(21,24,5)\">NEXT &#10095;</button>\n");
      out.write("                 <!--&#10095;-->      \n");
      out.write("                 </label> \n");
      out.write("                <br>   \n");
      out.write("                  <div class=\"w3-container w3-blue w3-round w3-animate-right\" style=\"width:49.98%\"margin-top:30px><h4>6/12</h4></div>\n");
      out.write("               </div>\n");
      out.write("                 \n");
      out.write("            </h1>\n");
      out.write("             \n");
      out.write("             <!-- QUESTION 7 -->\n");
      out.write("                                     \n");
      out.write("          <h1 class=\"mySlides1\" style=\"width:100%;padding-left:20px;\">\n");
      out.write("                                       \n");
      out.write("            <div style=\"margin:auto;width:80%;\">\n");
      out.write("              \n");
      out.write("                <h4 style=\"padding-bottom:10px;\"class=\"w3-animate-opacity\"> 7. REGULARITY IN CLASS :</h4> \n");
      out.write("                \n");
      out.write("         <div style=\"padding-left:250px\">\n");
      out.write("          \n");
      out.write("              <label class=\"container\">Excellent\n");
      out.write("                  <input type=\"radio\" name=\"radio\" value=\"0\" id=\"radio25\" checked=\"\">\n");
      out.write("                     <span class=\"checkmark\"></span>\n");
      out.write("                 </label>\n");
      out.write("\n");
      out.write("                 <label class=\"container\">Good\n");
      out.write("                     <input type=\"radio\"  name=\"radio\"  value=\"1\" id=\"radio26\">\n");
      out.write("                   <span class=\"checkmark\"></span>\n");
      out.write("                 </label>\n");
      out.write("\n");
      out.write("                 <label class=\"container\">Average\n");
      out.write("                   <input type=\"radio\"  name=\"radio\" value=\"2\" id=\"radio27\">\n");
      out.write("                   <span class=\"checkmark\"></span>\n");
      out.write("                 </label>\n");
      out.write(" \n");
      out.write("                 <label class=\"container\">Poor\n");
      out.write("                    <input type=\"radio\"  name=\"radio\"  value=\"3\" id=\"radio28\">\n");
      out.write("                    <span class=\"checkmark\"></span>\n");
      out.write("                 </label>\n");
      out.write("           \n");
      out.write("          </div> \n");
      out.write("                \n");
      out.write("                \n");
      out.write("            </div>   \n");
      out.write("   \n");
      out.write("               <div class=\"w3-light-grey w3-round\">\n");
      out.write("                  <br> \n");
      out.write("                   <label class=\"container\">    \n");
      out.write("                   <button class=\"w3-button w3-round w3-green w3-display-left\" style=\"opacity:0.6;margin-top:10px\" onclick=\"plusDivs(-1, 0);\" >&#10094;  PRE</button>      \n");
      out.write("                 <button class=\"w3-button w3-round w3-green w3-display-right \" style=\"opacity:0.6;margin-top:10px\" onclick=\"check(25,28,6)\">NEXT &#10095;</button>\n");
      out.write("                 <!--&#10095;-->      \n");
      out.write("                 </label> \n");
      out.write("                <br>   \n");
      out.write("                  <div class=\"w3-container w3-blue w3-round w3-animate-right\" style=\"width:58.30%\"margin-top:30px><h4>7/12</h4></div>\n");
      out.write("               </div>\n");
      out.write("                 \n");
      out.write("            </h1>            \n");
      out.write("            \n");
      out.write("        \n");
      out.write("            \n");
      out.write("                 <!-- QUESTION 8 -->\n");
      out.write("                                     \n");
      out.write("          <h1 class=\"mySlides1\" style=\"width:100%;padding-left:20px;\">\n");
      out.write("                                       \n");
      out.write("            <div style=\"margin:auto;width:80%;\">\n");
      out.write("              \n");
      out.write("                <h4 style=\"padding-bottom:10px;\" class=\"w3-animate-opacity\"> 8. CLASS ROOM INFRASTRUCTURE :</h4> \n");
      out.write("                \n");
      out.write("         <div style=\"padding-left:250px\">\n");
      out.write("          \n");
      out.write("              <label class=\"container\">Excellent\n");
      out.write("                  <input type=\"radio\" name=\"radio\" value=\"0\" id=\"radio29\">\n");
      out.write("                     <span class=\"checkmark\"></span>\n");
      out.write("                 </label>\n");
      out.write("\n");
      out.write("                 <label class=\"container\">Good\n");
      out.write("                     <input type=\"radio\"  name=\"radio\"  value=\"1\" id=\"radio30\">\n");
      out.write("                   <span class=\"checkmark\"></span>\n");
      out.write("                 </label>\n");
      out.write("\n");
      out.write("                 <label class=\"container\">Average\n");
      out.write("                   <input type=\"radio\"  name=\"radio\" value=\"2\" id=\"radio31\">\n");
      out.write("                   <span class=\"checkmark\"></span>\n");
      out.write("                 </label>\n");
      out.write(" \n");
      out.write("                 <label class=\"container\">Poor\n");
      out.write("                    <input type=\"radio\"  name=\"radio\"  value=\"3\" id=\"radio32\">\n");
      out.write("                    <span class=\"checkmark\"></span>\n");
      out.write("                 </label>\n");
      out.write("           \n");
      out.write("          </div> \n");
      out.write("                \n");
      out.write("                \n");
      out.write("            </div>   \n");
      out.write("   \n");
      out.write("               <div class=\"w3-light-grey w3-round\">\n");
      out.write("                  <br> \n");
      out.write("                   <label class=\"container\">    \n");
      out.write("                   <button class=\"w3-button w3-round w3-green w3-display-left\" style=\"opacity:0.6;margin-top:10px\" onclick=\"plusDivs(-1, 0);\" >&#10094;  PRE</button>      \n");
      out.write("                 <button class=\"w3-button w3-round w3-green w3-display-right \" style=\"opacity:0.6;margin-top:10px\" onclick=\"check(29,32,7)\">NEXT &#10095;</button>\n");
      out.write("                 <!--&#10095;-->      \n");
      out.write("                 </label> \n");
      out.write("                <br>   \n");
      out.write("                  <div class=\"w3-container w3-blue w3-round w3-animate-right\" style=\"width:66.64%\"margin-top:30px><h4>8/12</h4></div>\n");
      out.write("               </div>\n");
      out.write("                 \n");
      out.write("            </h1>            \n");
      out.write("            \n");
      out.write("                      <!-- QUESTION 9 -->\n");
      out.write("                                     \n");
      out.write("          <h1 class=\"mySlides1\" style=\"width:100%;padding-left:20px;\">\n");
      out.write("                                       \n");
      out.write("            <div style=\"margin:auto;width:80%;\">\n");
      out.write("              \n");
      out.write("                <h4 style=\"padding-bottom:10px;\"> 9. FACULTY'S METHOD OF PRESENTATION OF SUBJECTS :</h4> \n");
      out.write("                \n");
      out.write("         <div style=\"padding-left:250px\" class=\"w3-animate-opacity\">\n");
      out.write("          \n");
      out.write("              <label class=\"container\">Excellent\n");
      out.write("                  <input type=\"radio\" name=\"radio\" value=\"0\" id=\"radio33\">\n");
      out.write("                     <span class=\"checkmark\"></span>\n");
      out.write("                 </label>\n");
      out.write("\n");
      out.write("                 <label class=\"container\">Good\n");
      out.write("                     <input type=\"radio\"  name=\"radio\"  value=\"1\" id=\"radio34\">\n");
      out.write("                   <span class=\"checkmark\"></span>\n");
      out.write("                 </label>\n");
      out.write("\n");
      out.write("                 <label class=\"container\">Average\n");
      out.write("                   <input type=\"radio\"  name=\"radio\" value=\"2\" id=\"radio35\">\n");
      out.write("                   <span class=\"checkmark\"></span>\n");
      out.write("                 </label>\n");
      out.write(" \n");
      out.write("                 <label class=\"container\">Poor\n");
      out.write("                    <input type=\"radio\"  name=\"radio\"  value=\"3\" id=\"radio36\">\n");
      out.write("                    <span class=\"checkmark\"></span>\n");
      out.write("                 </label>\n");
      out.write("           \n");
      out.write("          </div> \n");
      out.write("                \n");
      out.write("                \n");
      out.write("            </div>   \n");
      out.write("   \n");
      out.write("               <div class=\"w3-light-grey w3-round\">\n");
      out.write("                  <br> \n");
      out.write("                   <label class=\"container\">    \n");
      out.write("                   <button class=\"w3-button w3-round w3-green w3-display-left\" style=\"opacity:0.6;margin-top:10px\" onclick=\"plusDivs(-1, 0);\" >&#10094;  PRE</button>      \n");
      out.write("                 <button class=\"w3-button w3-round w3-green w3-display-right \" style=\"opacity:0.6;margin-top:10px\" onclick=\"check(33,36,8)\">NEXT &#10095;</button>\n");
      out.write("                 <!--&#10095;-->      \n");
      out.write("                 </label> \n");
      out.write("                <br>   \n");
      out.write("                  <div class=\"w3-container w3-blue w3-round w3-animate-right\" style=\"width:74.97%\" margin-top:30px><h4>9/12</h4></div>\n");
      out.write("               </div>\n");
      out.write("                 \n");
      out.write("            </h1>            \n");
      out.write("            \n");
      out.write("  \n");
      out.write("        <!-- QUESTION 10 -->\n");
      out.write("                                     \n");
      out.write("          <h1 class=\"mySlides1 \" style=\"width:100%;padding-left:20px;\">\n");
      out.write("                                       \n");
      out.write("            <div style=\"margin:auto;width:80%;\">\n");
      out.write("              \n");
      out.write("                <h4 style=\"padding-bottom:10px;\" class=\"w3-animate-opacity\"> 10. OVERALL IMPRESSION :</h4> \n");
      out.write("                \n");
      out.write("         <div style=\"padding-left:250px\">\n");
      out.write("          \n");
      out.write("              <label class=\"container\">Excellent\n");
      out.write("                  <input type=\"radio\" name=\"radio\" value=\"0\" id=\"radio37\">\n");
      out.write("                     <span class=\"checkmark\"></span>\n");
      out.write("                 </label>\n");
      out.write("\n");
      out.write("                 <label class=\"container\">Good\n");
      out.write("                     <input type=\"radio\"  name=\"radio\"  value=\"1\" id=\"radio38\">\n");
      out.write("                   <span class=\"checkmark\"></span>\n");
      out.write("                 </label>\n");
      out.write("\n");
      out.write("                 <label class=\"container\">Average\n");
      out.write("                   <input type=\"radio\"  name=\"radio\" value=\"2\" id=\"radio39\">\n");
      out.write("                   <span class=\"checkmark\"></span>\n");
      out.write("                 </label>\n");
      out.write(" \n");
      out.write("                 <label class=\"container\">Poor\n");
      out.write("                    <input type=\"radio\"  name=\"radio\"  value=\"3\" id=\"radio40\">\n");
      out.write("                    <span class=\"checkmark\"></span>\n");
      out.write("                 </label>\n");
      out.write("           \n");
      out.write("          </div> \n");
      out.write("                \n");
      out.write("                \n");
      out.write("            </div>   \n");
      out.write("   \n");
      out.write("               <div class=\"w3-light-grey w3-round\">\n");
      out.write("                  <br> \n");
      out.write("                   <label class=\"container\">    \n");
      out.write("                   <button class=\"w3-button w3-round w3-green w3-display-left\" style=\"opacity:0.6;margin-top:10px\" onclick=\"plusDivs(-1, 0);\" >&#10094;  PRE</button>      \n");
      out.write("                 <button class=\"w3-button w3-round w3-green w3-display-right \" style=\"opacity:0.6;margin-top:10px\" onclick=\"check(37,40,9)\">NEXT &#10095;</button>\n");
      out.write("                 <!--&#10095;-->      \n");
      out.write("                 </label> \n");
      out.write("                <br>   \n");
      out.write("                  <div class=\"w3-container w3-blue w3-round w3-animate-right\" style=\"width:83.3%\"margin-top:30px><h4>10/12</h4></div>\n");
      out.write("               </div>\n");
      out.write("                 \n");
      out.write("           </h1>            \n");
      out.write("  \n");
      out.write("                            <!-- QUESTION 11 -->\n");
      out.write("                                     \n");
      out.write("          <h1 class=\"mySlides1\" style=\"width:100%;padding-left:20px;\">\n");
      out.write("                                       \n");
      out.write("            <div style=\"margin:auto;width:80%;\">\n");
      out.write("              \n");
      out.write("                <h4 style=\"padding-bottom:10px;\" class=\"w3-animate-opacity\"> 11. FACULTY'S FOLLOWED THE SYLLABUS :</h4> \n");
      out.write("                \n");
      out.write("         <div style=\"padding-left:250px;\">\n");
      out.write("          \n");
      out.write("              <label class=\"container\">YES\n");
      out.write("                  <input type=\"radio\" name=\"radio\" value=\"4\" id=\"radio41\">\n");
      out.write("                     <span class=\"checkmark\"></span>\n");
      out.write("                 </label>\n");
      out.write("\n");
      out.write("                 <label class=\"container\">NO\n");
      out.write("                     <input type=\"radio\"  name=\"radio\"  value=\"5\" id=\"radio42\">\n");
      out.write("                   <span class=\"checkmark\"></span>\n");
      out.write("                 </label>\n");
      out.write("\n");
      out.write("           \n");
      out.write("          </div> \n");
      out.write("                \n");
      out.write("                \n");
      out.write("            </div>   \n");
      out.write("   \n");
      out.write("               <div class=\"w3-light-grey w3-round\" style=\"margin-top:80px\">\n");
      out.write("                  <br> \n");
      out.write("                   <label class=\"container\">    \n");
      out.write("                   <button class=\"w3-button w3-round w3-green w3-display-left\" style=\"opacity:0.6;margin-top:10px\" onclick=\"plusDivs(-1, 0);\" >&#10094;  PRE</button>      \n");
      out.write("                 <button class=\"w3-button w3-round w3-green w3-display-right \" style=\"opacity:0.6;margin-top:10px\" onclick=\"check(41,42,10)\">NEXT &#10095;</button>\n");
      out.write("                 <!--&#10095;-->      \n");
      out.write("                 </label>\n");
      out.write("                <br>   \n");
      out.write("                  <div class=\"w3-container w3-blue w3-round\" style=\"width:91.63%\"margin-top:30px><h4>11/12</h4></div>\n");
      out.write("               </div>\n");
      out.write("                 \n");
      out.write("            </h1>            \n");
      out.write("            \n");
      out.write("\n");
      out.write("                            <!-- QUESTION 12 -->\n");
      out.write("                                     \n");
      out.write("          <h1 class=\"mySlides1\" style=\"width:100%;padding-left:20px;\">\n");
      out.write("                                       \n");
      out.write("            <div style=\"margin:auto;width:80%;\">\n");
      out.write("              \n");
      out.write("                <h4 style=\"padding-bottom:10px;\" class=\"w3-animate-opacity\"> 12. FACULTY'S FINISHED THE SYLLABUS :</h4> \n");
      out.write("                \n");
      out.write("         <div style=\"padding-left:250px;\">\n");
      out.write("          \n");
      out.write("              <label class=\"container\">YES\n");
      out.write("                  <input type=\"radio\" name=\"radio\" value=\"4\" id=\"radio43\">\n");
      out.write("                     <span class=\"checkmark\"></span>\n");
      out.write("                 </label>\n");
      out.write("\n");
      out.write("                 <label class=\"container\">NO\n");
      out.write("                     <input type=\"radio\"  name=\"radio\"  value=\"5\" id=\"radio44\">\n");
      out.write("                   <span class=\"checkmark\"></span>\n");
      out.write("                 </label>\n");
      out.write("\n");
      out.write("           \n");
      out.write("          </div> \n");
      out.write("                \n");
      out.write("                \n");
      out.write("            </div>   \n");
      out.write("   \n");
      out.write("              <div class=\"w3-light-grey w3-round\" style=\"margin-top:80px;\" >\n");
      out.write("                  <br> \n");
      out.write("                   <label class=\"container\">    \n");
      out.write("                   <button class=\"w3-button w3-round w3-green w3-display-left\" style=\"opacity:0.6;margin-top:10px\" onclick=\"plusDivs(-1, 0);\" >&#10094;  PRE</button>      \n");
      out.write("                 <button class=\"w3-button w3-round w3-green w3-display-right \" style=\"opacity:0.6;margin-top:10px\" onclick=\"check(43,44,11)\">NEXT &#10095;</button>\n");
      out.write("                 <!--&#10095;-->      \n");
      out.write("                 </label> \n");
      out.write("                <br>   \n");
      out.write("                  <div class=\"w3-container w3-blue w3-round w3-animate-right\" style=\"width:99.96%\"margin-top:30px><h4>12/12</h4></div>\n");
      out.write("               </div>\n");
      out.write("                 \n");
      out.write("            </h1>            \n");
      out.write("\n");
      out.write("                            \n");
      out.write("                            <!-- COMMENT -->\n");
      out.write("                                     \n");
      out.write("          <h1 class=\"mySlides1\" style=\"width:100%;padding-left:20px;padding-top: 10px;\">\n");
      out.write("                                       \n");
      out.write("            <div style=\"margin:auto;width:100%;\">\n");
      out.write("              \n");
      out.write("         <div style=\"padding-left:100px;width:100%\">\n");
      out.write("          \n");
      out.write("                  <div class=\"w3-animate-right\">\n");
      out.write("                  <p>What you like most in the course <p>\n");
      out.write("                  <input type=\"text\" value=\" \" style=\"width:600px;font-size:10px;color:black; padding: 8px 16px;margin: 2px 1px;margin-right:0\" id=\"t1\">             \n");
      out.write("                  </div>\n");
      out.write("     \n");
      out.write("                  <div class=\"w3-animate-left\">\n");
      out.write("                  <p>Area of improvement <p>\n");
      out.write("                  <input type=\"text\" value=\" \" style=\"width:600px;font-size:10px;color:black; padding: 8px 16px;margin: 2px 1px;\" id=\"t2\">\n");
      out.write("                  </div>\n");
      out.write("                   \n");
      out.write("                    <div class=\"w3-animate-right\">\n");
      out.write("                    <p>Any other comment <p>\n");
      out.write("                    <input type=\"text\" value=\" \" style=\"width:600px;font-size:10px;color:black; padding: 8px 16px;margin: 2px 1px;\" id=\"t3\">\n");
      out.write("                    </div>\n");
      out.write("                 \n");
      out.write("                 \n");
      out.write("          </div> \n");
      out.write("                \n");
      out.write("                \n");
      out.write("            </div>   \n");
      out.write("   \n");
      out.write("              <div class=\"w3-light-grey w3-round\" style=\"margin-top:70px\">\n");
      out.write("                   <label class=\"container\">    \n");
      out.write("                   <button class=\"w3-button w3-round w3-green w3-display-left\" style=\"opacity:0.6;margin-top:10px\" onclick=\"plusDivs(-1, 0);\" >&#10094;  PRE</button>      \n");
      out.write("                 <button class=\"w3-button w3-round w3-green w3-display-right \" style=\"opacity:0.6;margin-top:10px\" onclick=\"com()\">DONE &#10095;</button>\n");
      out.write("                 <!--&#10095;-->      \n");
      out.write("                 </label> \n");
      out.write("\n");
      out.write("                 \n");
      out.write("            </h1>            \n");
      out.write("                            \n");
      out.write("                            \n");
      out.write("            <!-- THANKS AND SUBMIT -->\n");
      out.write("\n");
      out.write("                                     \n");
      out.write("          <h1 class=\"mySlides1 \" style=\"width:100%;padding-left:2%;padding-top: 1%\">\n");
      out.write("                                       \n");
      out.write("            <div style=\"margin:auto;width:100%;\">\n");
      out.write("              \n");
      out.write("                <h4 style=\"padding-bottom:10px;\"></h4> \n");
      out.write("                \n");
      out.write("         <div style=\"padding-left:90px\">\n");
      out.write("          \n");
      out.write("             <label class=\"container\" style=\"margin:auto;width:70%;padding-top:50px\">\n");
      out.write("                  \n");
      out.write("               <div class=\"w3-animate-fading\"> !! THANKS FOR MAKING US BETTER !!</div>  \n");
      out.write("\n");
      out.write("               <p id=\"p\" style=\"display:none\" >TTTTTTTTTT</p> \n");
      out.write("               <br>   \n");
      out.write("               <a href=\"newfile.html\"></a>\n");
      out.write("<div class=\"w3-animate-bottom\">               \n");
      out.write("<button class=\"w3-button w3-round w3-green\" style=\"opacity:0.6;margin-left:150px;margin-top: 40px;width:auto\" onclick=\"plusDivs(1, 0)\"><a id=\"li\" style=\"text-decoration: none;padding-right:50%; \">submit</a></button>\n");
      out.write("</div>             \n");
      out.write("             \n");
      out.write("             </label>\n");
      out.write("           \n");
      out.write("             \n");
      out.write("          </div> \n");
      out.write("                \n");
      out.write("                \n");
      out.write("            </div>   \n");
      out.write("   \n");
      out.write("                 \n");
      out.write("            </h1>            \n");
      out.write("            \n");
      out.write("         </div>\n");
      out.write("     \n");
      out.write("      </div>\n");
      out.write("  \n");
      out.write("<script>\n");
      out.write("     \n");
      out.write("    var arr = [0,0,0,0,0,0,0,0,0,0,0,0];\n");
      out.write("    var str = [\"\",\"\",\"\"];\n");
      out.write("    var qry=\"feed.jsp?\";\n");
      out.write("    var bid=\"tid=\"+");
out.println(""+tid);
      out.write(";\n");
      out.write("    var a=\"\";\n");
      out.write("    function check(start,end,ques)\n");
      out.write("    { \n");
      out.write("     var i;\n");
      out.write("     for(i=start;i<=end;i++)\n");
      out.write("     {\n");
      out.write("         var x=\"radio\"+i;\n");
      out.write("            if(document.getElementById(x).checked) \n");
      out.write("            {\n");
      out.write("                document.getElementById(\"print\").innerHTML=bid;   \n");
      out.write("                arr[ques]=document.getElementById(x).value;\n");
      out.write("                plusDivs(1, 0);\n");
      out.write("            }   \n");
      out.write("            \n");
      out.write("            \n");
      out.write("     }\n");
      out.write("     \n");
      out.write("   /*if(ques==11)\n");
      out.write("     {\n");
      out.write("         list();\n");
      out.write("     }*/\n");
      out.write("  \n");
      out.write("  }\n");
      out.write("  \n");
      out.write("  function list()\n");
      out.write("  {       \n");
      out.write("    for(i=0;i<arr.length;i++)\n");
      out.write("    {\n");
      out.write("        n=arr[i];\n");
      out.write("     \n");
      out.write("        a=a+\"&\"+\"q\"+i+\"=\";\n");
      out.write("      \n");
      out.write("        a=a+n;\n");
      out.write("    }\n");
      out.write("   \n");
      out.write("        \n");
      out.write("   \n");
      out.write("  }\n");
      out.write("  \n");
      out.write("  function com()\n");
      out.write("  {\n");
      out.write("    var comment;  \n");
      out.write("    str[0]=document.getElementById(\"t1\").value;\n");
      out.write("    //str[0]=comment;\n");
      out.write("    str[1]=document.getElementById(\"t2\").value;\n");
      out.write("    //str[1]=comment;\n");
      out.write("     str[2]=document.getElementById(\"t3\").value;\n");
      out.write("    //str[2]=comment;\n");
      out.write("   \n");
      out.write("        list();\n");
      out.write("        \n");
      out.write("        var i=0,j=12; \n");
      out.write("        for(i=0;i<str.length;i++)\n");
      out.write("    {\n");
      out.write("        n=str[i];\n");
      out.write("     \n");
      out.write("        a=a+\"&\"+\"q\"+j+\"=\";\n");
      out.write("      \n");
      out.write("        a=a+n;       \n");
      out.write("        \n");
      out.write("        j++;\n");
      out.write("    }\n");
      out.write("\n");
      out.write(" document.getElementById(\"p\").innerHTML=a;\n");
      out.write("    document.getElementById(\"li\").href=qry+bid+a;\n");
      out.write("    plusDivs(1, 0);    \n");
      out.write("  }\n");
      out.write("  \n");
      out.write("</script>\n");
      out.write("                 \n");
      out.write(" </body>\n");
      out.write("    \n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
