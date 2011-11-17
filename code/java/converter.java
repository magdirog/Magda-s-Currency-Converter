
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class converter extends HttpServlet
{

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        
    }

 
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        processRequest(request, response);
        
        
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        float aa = 0;
        String str=" ";
        
        try {
            
           String a = request.getParameter("amount");
           String f = request.getParameter("from");
           String t = request.getParameter("to");
           
           String en = "UTF-8";
           
           aa=Float.parseFloat(a);
           
           
           
           String l = "http://www.google.com/ig/calculator?hl=en&q=";
           
           
           URL convertion = new URL(l+ aa + f + "%3D%3F" + t);
           
           BufferedReader input = new BufferedReader(new InputStreamReader(convertion.openStream(),en));
           
           str=input.readLine();
           
           input.close();
      
         
           
           String[] token = str.split("\"");
           
           str=token[1]+" = "+token[3];
           
           
           //str=str.replaceAll("",",");
           
           
           response.sendRedirect("result.jsp?param1="+str);
          
           
           //out.println(str);
           
        } 
        
        finally 
        {            
            out.close();
        }
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        processRequest(request, response);
    }
}
