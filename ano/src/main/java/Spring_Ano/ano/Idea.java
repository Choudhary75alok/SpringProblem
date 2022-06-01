package Spring_Ano.ano;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Primary
@Component
public class Idea implements Sim {
	private String datastrength;
	  @Autowired
	Airtel airtel;

	
	public String getDatastrength() {
		return datastrength;
	}

	public void setDatastrength(String datastrength) {
		this.datastrength = datastrength;
	}
	
	public void typeOfSim() {
		// TODO Auto-generated method stub
		System.out.println("this is Idea Sim");
	}

	public void datatypeOfSim() {
		// TODO Auto-generated method stub
		System.out.println("idea has 4G data");
	}

	public void dataStrength() {
		System.out.println(datastrength);
	}
	public void display() {
		airtel.test();
	}

}
