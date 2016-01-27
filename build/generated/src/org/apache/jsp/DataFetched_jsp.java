package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.w3c.dom.NodeList;
import javax.lang.model.element.Element;
import javax.swing.text.Document;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import com.sun.org.apache.xml.internal.utils.Trie;
import java.net.*;
import java.io.*;

public final class DataFetched_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Fetching Data</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Weather Report of your City:</h1>\n");
      out.write("        <hr>\n");
      out.write("    <center>\n");
      out.write("        <table style=\"border:1px solid white ; width:90%; height:555px; background-color:grey;border-radius: 12px; \">\n");

    try
        {    
            URL url=null;
            String country_name=(String)request.getParameter("country");
            String city_name=(String)request.getParameter("city");
            String pin=(String)request.getParameter("pin");
            //out.println("PIN: "+pin+"  country= "+country_name+"  city= "+city_name);
            String urlString="";
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
                    //return;
            }
           url = new URL("http://api.openweathermap.org/data/2.5/weather?q=233226&appid=af534e4ebad9c8fced1b8259cf43712d");
            out.println("<tr style=''><td>URL:</td><td>"+urlString+"</td></tr>");
            
        // Get the input stream through URL Connection
        URLConnection con = url.openConnection();
        InputStream is =con.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        String line = null;
        String data="";
        while ((line = br.readLine()) != null) {
            data+=line;
        }
        HttpSession se= request.getSession();
        se.setAttribute("JSONDATA", data);
        response.sendRedirect("WeatherInfo.jsp");
         //out.print("<br>DATA: "+data);
      // Weather w= new Weather();
       //w.handleParsing(data, response);
       
       
       
       
       
      /* JsonParser jp = Json.createParser(new StringReader(data));
        PrintWriter pw= response.getWriter();
                while(jp.hasNext())
                {
                    switch(jp.next())
                    {
                        case START_OBJECT:
                        {
                          // pw.write("<br>START_OBJECT: ");
                           pw.write("<br>: ");
                           //pw.write("JUHJKGJKHG");
                            
                            break;
                        }
                        case END_OBJECT:
                        {
                            //pw.write("<br>END_OBJECT: ");
                            pw.write("<hr>: ");
                            break;
                        }
                        case START_ARRAY:
                        {
                          // pw.write("<br>START_ARRAY: ");
                           pw.write("<br>: ");
                            break;       
                        }
                        case END_ARRAY:
                        {
                            //pw.write("<br>END_ARRAY: ");
                            pw.write("<br>: ");
                            break;
                        }
                        case KEY_NAME:
                        {
                           //pw.write("<br>KEY_NAME: "+jp.getString());
                           pw.write("<br>: "+jp.getString().toUpperCase());
                            break;
                        }
                        case VALUE_STRING:
                        {
                           // pw.write("<br>VALUE_STRING: "+jp.getString());
                            pw.write("<br>: "+jp.getString().toUpperCase());
                            break;
                        }
                        case VALUE_NUMBER:
                        {
                           //pw.write("<br>VALUE_NUMBER: "+jp.getInt());
                            pw.write("<br>: "+jp.getInt());
                          break;  
                        }
                        default:
                        {
                           //pw.write("<br>Default: ");
                           pw.write("<br>: ");
                            break;
                        }
                    }
                }
       
       */
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
/*
  if(data.contains("weather"))
  {
        String cord=data.split("weather")[0];
        cord=cord.substring(10);
        cord=cord.substring(0,23);
        cord=cord.replaceAll("([^0-9.,:a-zA-Z ])","");
        out.println("<tr><td>CORDINATES :</td><td> "+cord+"</td></tr>");
  }
   if(data.contains("weather"))
  {
        String weather=data.split("weather")[1].split("base")[0];
       
        weather=weather.replaceAll("([^0-9.:a-zA-Z ])"," ");
        
        out.println("<tr><td>WEATHER :</td><td> "+weather+"</td></tr>");
  }
  if(data.contains("Clouds") && data.contains("icon"))
  {
        String clouds=data.split("Clouds")[1].split("icon")[0];
        out.println("<tr><td>CLOUDS : </td><td>"+clouds+"</td></tr>");
  }
        
     if(data.contains("base") && data.contains("main"))
  {   
        String base=data.split("base")[1].split("main")[0];
         base =base.replaceAll("([^A-Za-z ])", "");
        out.println("<tr><td>BASE:  </td><td>"+base+"</td></tr>");
  }
     if(data.contains("wind") && data.contains("clouds"))
  {   
        String wind=data.split("wind")[1].split("clouds")[0];
        wind=wind.substring(3,wind.length()-3);
         out.println("<tr><td>WIND:   </td><td>"+wind+"</td></tr>");
  }
        
       if(data.contains("pressure") && data.contains("humidity"))
  { 
        String pressure=data.split("pressure")[1].split("humidity")[0];
        pressure =pressure.substring(2,pressure.length()-2);
        out.println("<tr><td>PRESSURE:   </td><td>"+pressure+"</td></tr>");
  }
        
     if(data.contains("humidity") && data.contains("temp_min"))
  {   
        String humidity=data.split("humidity")[1].split("temp_min")[0];
        humidity=humidity.replaceAll("[^0-9]", "");
        out.println("<tr><td>Humidity  :  </td><td>"+humidity+"</td></tr>");
  }
    if(data.contains("dt") && data.contains("sys"))
  {    
        String date=data.split("dt")[1].split("sys")[0];
        date=date.replaceAll("([^0-9.])", "");
        out.println("<tr><td>DT  : </td><td> "+date+"</td></tr>");
  }
        
       if(data.contains("sys") && data.contains("country"))
  { 
        String sys=data.split("sys")[1].split("country")[0];
        sys=sys.replaceAll("([^A-Za-z0-9.])"," ");
         out.println("<tr><td>SYS:   </td><td>"+sys+"</td></tr>");
  }
     if(data.contains("country") && data.contains("sunrise"))
  {   
        String country=data.split("country")[1].split("sunrise")[0];
        country=country.replaceAll("[^a-zA-Z ]","");
        out.println("<tr><td>COUNTRY:   </td><td>"+country+"</td></tr>");
  }
     if(data.contains("name") && data.contains("cod"))
  {   
        String City =data.split("name")[1].split("cod")[0];
        City=City.replaceAll("[^a-zA-Z ]","");
        out.println("<tr><td>CITY:    </td><td>"+City+"</td></tr>");
  }
   if(data.contains("sunrise") && data.contains("sunset"))
  {     
        String sunrise=data.split("sunrise")[1].split("sunset")[0];
        sunrise=sunrise.replaceAll("[^0-9]","");
        out.println("<tr><td>SUNRISE:    </td><td>"+sunrise+"</td></tr>");
  }
      if(data.contains("sunset") && data.contains("id"))
  {   
        String sunset=data.split("sunset")[1].split("id")[0];
        sunset=sunset.replaceAll("[^0-9]","");
        out.println("<tr><td>SUNSET:   </td><td> "+sunset+"</td></tr>");
  }
      if(data.contains("temp_min") && data.contains("temp_max"))
  {
        String minTemp=data.split("temp_min")[1].split("temp_max")[0];
        minTemp=minTemp.replaceAll("[^0-9.]","");
        out.println("<tr><td>Minimum Temperature  :  </td><td>"+minTemp+"</td></tr>");
  }
      if(data.contains("temp+max") && data.contains("wind"))
  {
        
        String maxTemp=data.split("temp_max")[1].split("wind")[0];
        maxTemp=maxTemp.replaceAll("[^0-9.]","");
        out.println("<tr><td>Maximum Temperature:    </td><td>"+maxTemp+"</td></tr>");
  }
      if(data.contains("temp") && data.contains("pressure"))
  {
         String CurrentTemp=data.split("temp")[1].split("pressure")[0];
         CurrentTemp=CurrentTemp.replaceAll("[^0-9.]","");
         out.println("<tr><td>Current Temperature  :  </td><td>"+CurrentTemp+"</td></tr>");
  }
         
        

        out.println("</table></center><hr>"+data);

        */
       
        }
catch(Exception e)
        {
        
        }
                     
                
            
      out.write("\n");
      out.write("            \n");
      out.write("    </body>\n");
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
