

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class EscuchaInicioYFin
 *
 */
@WebListener
public class EscuchaInicioYFin implements ServletContextListener {

    /**
     * Default constructor. 
     */
    public EscuchaInicioYFin() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent arg0)  { 
         // TODO Auto-generated method stub
    	System.out.println("PROGRMA DESTRUIDO");
    	System.out.println("PROGRMA DESTRUIDO");
    	System.out.println("PROGRMA DESTRUIDO");
    	System.out.println("PROGRMA DESTRUIDO");
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent arg0)  { 
         // TODO Auto-generated method stub
    	System.out.println("PROGRMA INICIADO");
    	System.out.println("PROGRMA INICIADO");
    	System.out.println("PROGRMA INICIADO");
    	System.out.println("PROGRMA INICIADO");
    	
    }
	
}
