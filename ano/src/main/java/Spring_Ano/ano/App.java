package Spring_Ano.ano;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
        @SuppressWarnings("resource")
		ApplicationContext ac= new AnnotationConfigApplicationContext(Config.class);
        Sim Air=ac.getBean(Sim.class);
        //Air.display();
        Air.datatypeOfSim();
      
        
    }
}
