package Spring_Ano.ano;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
//@Primary
@Component
public class Airtel implements Sim {


	public void typeOfSim() {
System.out.println("this is Airtel Sim");		
	}

	public void datatypeOfSim() {
System.out.println("Airtel has 4G data");		
	}
	public void test() {
		System.out.println("Signal test is done from Airtel!!!");
	}
   
}
