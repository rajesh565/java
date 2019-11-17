package com.nt.servlet;
import javax.servlet.*;
import java.util.*;
import java.io.*;
public class DateApp extends GenericServlet{
public void service(ServletRequest req,ServletResponse res)throws ServletException,IOException
{
	res.setContentType("text/html");
	PrintWriter pw=res.getWriter();
	Date d=new Date();
        pw.println("<h1><center><b>P</b> & <b>R</b> COMPANY PVT.LTD</p></h1>");
	pw.println("<h1><body bgcolor='#119999'>TODAY date is</h1>"+d);
        pw.println("<br><br><a href='form.html'>click me</a>");
         pw.println("<img src='p.jpg'>");
         pw.println("<img src='r.jpg',align:right><br><br>");
        pw.println("<br><center><u><h3>OFFICE ADDRESS</h3></u></br>Maurya chowk ,</br>Aurangabad</br>Waluj MIDC </br></center>");

        pw.close();
}
}