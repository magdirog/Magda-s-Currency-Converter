
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ReportServletListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent event) {
        
        
        ServletContext sc=event.getServletContext();
        String rep=sc.getInitParameter("report");
        
        MyReport r=new MyReport(rep);
        sc.setAttribute("myreport", r);
        
    }

    @Override
    public void contextDestroyed(ServletContextEvent event) {
        throw new UnsupportedOperationException("Not supported yet.");
        
    }
}
