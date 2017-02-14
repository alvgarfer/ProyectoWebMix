

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class EscuchaInicioYFin
 */
@WebListener
public class EscuchaInicioYFin implements ServletContextListener
{  
	/**Default constructor. */
    public EscuchaInicioYFin()
    {
    	
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent arg0) 
    {
    	System.out.println("PROGRAMA DESTRUIDO");
    	System.out.println("PROGRAMA DESTRUIDO");
    	System.out.println("PROGRAMA DESTRUIDO");
    	System.out.println("PROGRAMA DESTRUIDO");
    }

	/** @see ServletContextListener#contextInitialized(ServletContextEvent)*/
    public void contextInitialized(ServletContextEvent arg0)
    { 
    	System.out.println("PROGRAMA INICIADO");
    	System.out.println("PROGRAMA INICIADO");
    	System.out.println("PROGRAMA INICIADO");
    	System.out.println("PROGRAMA INICIADO");
    	
    }
	
}
