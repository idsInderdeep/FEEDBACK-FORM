package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.DriverManager;;
import javax.swing.*;
import java.sql.*;
import java.util.*;

public final class detail_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


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
        
  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"w3.css\">\n");
      out.write("        <title>NIELIT SHOW FEEDBACK</title>\n");
      out.write("        \n");
      out.write("<style>\n");
      out.write(" .header{\n");
      out.write("  color:white;  \n");
      out.write("  overflow:hidden; \n");
      out.write("  text-align: center;\n");
      out.write("  background-color:rgb(60, 179, 113);\n");
      out.write("  padding: 20px 10px;\n");
      out.write("  box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2), 0 6px 20px 0 rgba(0, 0, 0, 0.19);\n");
      out.write("}\n");
      out.write("\n");
      out.write(".card {\n");
      out.write("    /* Add shadows to create the \"card\" effect */\n");
      out.write("    box-shadow: 0 4px 8px 0 rgba(0,0,0,0.2);\n");
      out.write("    transition: 0.3s;\n");
      out.write("    padding:5px;\n");
      out.write("    \n");
      out.write("    position:relative;\n");
      out.write("    top: 30%;\n");
      out.write("    left: 32%;\n");
      out.write("    right: 30%;\n");
      out.write("    width:70%;\n");
      out.write("    height:75%;\n");
      out.write("    margin-top: -5em; \n");
      out.write("    margin-left: -15em; \n");
      out.write("    border: 1px solid #ccc;\n");
      out.write("    background-color: wheat;\n");
      out.write(" \n");
      out.write("}\n");
      out.write("\n");
      out.write("/* On mouse-over, add a deeper shadow */\n");
      out.write(".card:hover {\n");
      out.write("    box-shadow: 0 8px 16px 0 rgba(0,0,0,0.2);\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Add some padding inside the card container */\n");
      out.write(".cont {\n");
      out.write("    padding: 2px 16px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("</style>    \n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("  \n");
      out.write("    <body style=\"background-color: #cc6600;color:black;\">\n");
      out.write("       \n");
      out.write("<marquee width=\"100%\" direction=\"right\" style=\"background-color:black;\">\n");
      out.write("  <p style=\"font-family:platino;color:white;font-size:12px;\">Developed By - Inderdeep Singh</p>  \n");
      out.write("</marquee>\n");
      out.write("\n");
      out.write("        <div class=\"card\" style=\"margin-top:10px;margin-bottom:10px;height:60%;width:70%;padding-top: 5px\"> \n");
      out.write("            \n");
      out.write("        ");
      out.write("\n");
      out.write("        ");

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
                            
      out.write("\n");
      out.write("                            <hr>\n");
      out.write("                            <a href=\"index.html\">CLICK TO GO BACK</a>\n");
      out.write("                            ");

                        }
                     con.close();
                    }catch(Exception e)
                   {
                       e.printStackTrace();
                   }
                 
       
      out.write(" \n");
      out.write("                         <h1 style=\"color:black\"> Teacher Name : ");
out.println(name);
      out.write(" </h1>\n");
      out.write("                         <hr>\n");
      out.write("                          \n");
      out.write("      ");
 
                       

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
                          
        
      out.write(" \n");
      out.write("                         <h3 style=\"color:black\"> Total number of Feedbacks : ");
out.println(n);
      out.write(" </h3>\n");
      out.write("                         <hr>\n");
      out.write("                          \n");
      out.write("        ");
 
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
            
            
      out.write("\n");
      out.write("             <h4 style=\"padding-left:20px;\"> ");
out.println(question.get(i));
      out.write(" <h4>  \n");
      out.write("            ");
           
               
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
                       
                       
                     
      out.write("\n");
      out.write("                    \n");
      out.write("                    <div style=\"padding-left:100px;\" > \n");
      out.write("                       <div class=\"w3-light\" style=\"width:500px;opacity:1\">\n");
      out.write("                          ");

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
                     
                          
      out.write("\n");
      out.write("                         <div id=\"myBar\" class=\"");
      out.print(color);
      out.write("\" style=\"height:24px;width:");
      out.print(temp);
      out.write("%;box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2), 0 6px 20px 0 rgba(0, 0, 0, 0.19);\"></div>\n");
      out.write("                       </div>\n");
      out.write("                    </div>\n");
      out.write("                     ");
  
                    con.close();
                   }catch(Exception e)
                   {
                       e.printStackTrace();
                   }
               }
             
      out.write("\n");
      out.write("             <hr>\n");
      out.write("                     ");

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
                       
                       
                     
      out.write("\n");
      out.write("                    \n");
      out.write("                     <div style=\"padding-left:100px;\"> \n");
      out.write("                       <div class=\"w3-light\" style=\"width:500px;opacity:1\">\n");
      out.write("                          ");

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
                     
                          
      out.write("\n");
      out.write("                         <div id=\"myBar\" class=\"");
      out.print(color);
      out.write("\" style=\"height:24px;width:");
      out.print(temp);
      out.write("%;box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2), 0 6px 20px 0 rgba(0, 0, 0, 0.19);\"></div>\n");
      out.write("                       </div>\n");
      out.write("                       <hr>\n");
      out.write("                    </div>\n");
      out.write("                     ");
  
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


        
      out.write(" \n");
      out.write("        <hr>\n");
      out.write("         <h4 style=\"padding-left:20px;text-align: center\"> What you like most in the course  <h4> \n");
      out.write("       <div class=\"w3-round\" style=\"position:relative;background-color: teal;color: white;margin-left:10%;margin-right:10%;box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2), 0 6px 20px 0 rgba(0, 0, 0, 0.19);\">              \n");
      out.write("                         ");

                         for(int i=0;i<a.size();i++)    
                         {
                             
      out.write("\n");
      out.write("                             <p style=\"padding-top:5px;padding-left:5px;\">");
      out.print(a.get(i));
      out.write("</p>\n");
      out.write("                             <hr>\n");
      out.write("                             ");

                         }
                         
      out.write("  \n");
      out.write("                 </div>   \n");
      out.write("         <hr>        \n");
      out.write("         <h4 style=\"padding-left:20px;text-align: center\"\"> Area of improvement   <h4> \n");
      out.write("                        <div style=\"position:relative;background-color: teal;color: white;margin-left:10%;margin-right:10%;box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2), 0 6px 20px 0 rgba(0, 0, 0, 0.19);\">              \n");
      out.write("                         ");

                         for(int i=0;i<b.size();i++)    
                         {
                             
      out.write("\n");
      out.write("                             <p style=\"padding-top:5px;padding-left:5px;\">");
      out.print(b.get(i));
      out.write("</p>\n");
      out.write("                             <hr>\n");
      out.write("                             ");

                         }
                         
      out.write("  \n");
      out.write("                 </div>   \n");
      out.write("\n");
      out.write("         <hr>        \n");
      out.write("      <h4 style=\"padding-left:20px;text-align: center\"\"> Any other comment  <h4> \n");
      out.write("                        <div style=\"position:relative;background-color: teal;color: white;margin-left:10%;margin-right:10%;box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2), 0 6px 20px 0 rgba(0, 0, 0, 0.19);\">              \n");
      out.write("                         ");

                         for(int i=0;i<c.size();i++)    
                         {
                             
      out.write("\n");
      out.write("                             <p style=\"padding-top:2px;padding-left:5px;\">");
      out.print(c.get(i));
      out.write("</p>\n");
      out.write("                             <hr>\n");
      out.write("                             ");

                         }
                             a.clear();
                             b.clear();
                             c.clear();
                         
      out.write("  \n");
      out.write("                 </div>   \n");
      out.write("              \n");
      out.write("                 <div class=\"w3-animate-fading\" style=\"align:center \" >     \n");
      out.write("             <a href=\"index.html\" class=\"w3-button w3-circle w3-teal\"> MAIN PAGE</a>\n");
      out.write("             </div>\n");
      out.write(" </div>      \n");
      out.write("      \n");
      out.write("</body>\n");
      out.write("\n");
      out.write(" \n");
      out.write("</html>\n");
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
