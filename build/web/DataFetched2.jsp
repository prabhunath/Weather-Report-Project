<%-- 
    Document   : DataFetched
    Created on : Jan 1, 2016, 3:54:50 PM
    Author     : Prabhunath
--%>
<%@page import="org.w3c.dom.NodeList"%>
<%@page import="javax.lang.model.element.Element"%>
<%@page import="javax.swing.text.Document"%>
<%@page import="javax.xml.parsers.DocumentBuilder"%>
<%@page import="javax.xml.parsers.DocumentBuilderFactory"%>
<%@page import="com.sun.org.apache.xml.internal.utils.Trie"%>
<%@page import="java.net.*"%>
<%@page import="java.io.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    try
        {    
            URL url=null;
            String country_name=(String)request.getParameter("country");
            String city_name=(String)request.getParameter("city");
            String pin=(String)request.getParameter("pin");
            out.println("PIN: "+pin+"  country= "+country_name+"  city= "+city_name);
            String urlString="";
            HttpSession se= request.getSession();
            if(pin!=null)
            {
                urlString="http://api.openweathermap.org/data/2.5/weather?q="+pin+"&appid=af534e4ebad9c8fced1b8259cf43712d";
                url = new URL(urlString);
               
            }
            else if( country_name!=null && city_name!=null)
            {
                urlString="http://api.openweathermap.org/data/2.5/weather?q="+country_name+"?"+city_name+"&appid=af534e4ebad9c8fced1b8259cf43712d";
                url = new URL(urlString);
                
            }
            else
            {
                out.println("Please enter Country name , city name or Pin to get weather information!!");
                   // return;
            }
             //url = new URL("http://api.openweathermap.org/data/2.5/weather?q=233226&appid=af534e4ebad9c8fced1b8259cf43712d");
            out.println("<tr style=''><td>URL:</td><td>"+urlString+"</td></tr>");
          
        // Get the input stream through URL Connection
        if(!urlString.equals("http://api.openweathermap.org/data/2.5/weather?q=?&appid=af534e4ebad9c8fced1b8259cf43712d"))
          {
        URLConnection con = url.openConnection();
        InputStream is =con.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        String line = null;
        String data="";
        while ((line = br.readLine()) != null) {
            data+=line;
        }
        
        se.setAttribute("JSONDATA", data);
        se.setAttribute("link", urlString);
        
        response.sendRedirect("JSONParsing");
        
        }
        else
        {
            out.println("error"+"  ");
        }
        }

catch(Exception e)
        {
        
        }
                     
                
            %>
            
