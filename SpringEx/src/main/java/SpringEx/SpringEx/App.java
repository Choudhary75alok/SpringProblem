package SpringEx.SpringEx;

import java.io.ObjectInputStream.GetField;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
@SuppressWarnings("deprecation")
public class App {
	public static void main(String[] args) {
//    	Resource rs=new PathResource("Spring.xml");
//    	BeanFactory bf=new XmlBeanFactory(rs);
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
		// Airtel airtel=new Airtel();
		Idea sim = ac.getBean(Idea.class);
		sim.datatypeOfSim();
		sim.typeOfSim();
		sim.dataStrength();
		// System.out.println(sim.getDatastrength());
		
		Airtel sim1 = ac.getBean(Airtel.class);
		sim1.datatypeOfSim();
		sim1.typeOfSim();
		sim1.datastrength();
	

	
	
	}
}
