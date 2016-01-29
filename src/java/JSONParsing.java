/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import static java.lang.System.out;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.json.Json;
import javax.json.stream.JsonParser;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Prabhunath
 */
public class JSONParsing extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
 /*   protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
           //TODO output your page here. You may use following sample code. 
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet JSONParsing</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet JSONParsing at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
            
            
        }
    }*/

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
        HttpSession se= request.getSession();
        String JSONDATA=(String)se.getAttribute("JSONDATA");
        response.setContentType("text/html");
        PrintWriter pw= response.getWriter();
        request.getRequestDispatcher("index.jsp").include(request, response);
        pw.write("<html>");
        pw.write("<head><title>::Parsing JSON to Format::</title>");
        pw.write("</head>");
        pw.write("<body><table style='width:100%;'><tr class='tr_style'><td class='td_style'>");
        String jdata=request.getParameter("JsonData");
        handleParsing(JSONDATA, response);
        String url=(String)se.getAttribute("link");
        pw.write("<p style='background-color:white;'>"+url+"</p>");
        //pw.write("</html>");
        
    }
    private void handleParsing(String JsonData,HttpServletResponse response) throws IOException ,ServletException
    {
        JsonParser jp = Json.createParser(new StringReader(JsonData));
        PrintWriter pw= response.getWriter();
        int temp=0;
        SimpleDateFormat df = new SimpleDateFormat("hh:mm:ss a",Locale.ENGLISH);
        System.out.println(df.format(new Date()));
        boolean flag=false,rise_flag=false,sunset_flag=false;
                while(jp.hasNext())
                {
                    switch(jp.next())
                    {
                        case START_OBJECT:
                        {
                          // pw.write("<br>START_OBJECT: ");
                          // pw.write("<br>: ");
                           //pw.write("JUHJKGJKHG");
                            
                            break;
                        }
                        case END_OBJECT:
                        {
                            //pw.write("<br>END_OBJECT: ");
                            pw.write("</td><td class='td_style'> ");
                            break;
                        }
                        case START_ARRAY:
                        {
                          // pw.write("<br>START_ARRAY: ");
                          // pw.write("<br>: ");
                            break;       
                        }
                        case END_ARRAY:
                        {
                            //pw.write("<br>END_ARRAY: ");
                            //pw.write("<br>: ");
                            break;
                        }
                        case KEY_NAME:
                        {
                           //pw.write("<br>KEY_NAME: "+jp.getString());
                           pw.write("<br>: @"+jp.getString().toUpperCase());
                           if(jp.getString().toUpperCase().equals("TEMP_MIN"))
                           {
                               flag=true;
                           }
                           if(jp.getString().toUpperCase().equals("SUNRISE"))
                           {
                               rise_flag=true;
                           }
                           if(jp.getString().toUpperCase().equals("SUNSET"))
                           {
                               sunset_flag=true;
                           }
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
                           /* if(flag)
                            {
                                temp=jp.getInt();
                                flag=false;
                            }
                            else if(rise_flag)
                            {
                                //temp=jp.getInt();
                                int seconds1 = jp.getInt();
                                Date date1 = new Date(seconds1 * 1000);
                                SimpleDateFormat sdf1 = new SimpleDateFormat("EEEE,MMMM d,yyyy h:mm,a");
                                pw.write("<br>"+sdf1.format(date1));
                                rise_flag=false;
                            }
                            else if(sunset_flag)
                            {
                                //temp=jp.getInt();
                                int seconds1 = jp.getInt();
                                Date date1 = new Date(seconds1 * 1000);
                                SimpleDateFormat sdf1 = new SimpleDateFormat("EEEE,MMMM d,yyyy h:mm,a");
                                pw.write("<br>"+sdf1.format(date1));
                                rise_flag=false;
                                sunset_flag=false;
                            }
                            else
                            {
                                 pw.write("<br>: "+jp.getInt());
                            }*/
                           
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
                pw.write("Enjoy your Day :)</td></tr></table></body></html>");
                //pw.print("TEMPERATURE: "+temp);     
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
     //   processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
