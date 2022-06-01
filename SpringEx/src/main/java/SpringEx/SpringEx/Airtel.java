package SpringEx.SpringEx;

public class Airtel implements Sim {
 private String datastrength;
  
	public Airtel(String datastrength) {
	super();
	this.datastrength = datastrength;
}

	public void typeOfSim() {
System.out.println("this is Airtel Sim");		
	}

	public void datatypeOfSim() {
System.out.println("Airtel has 4G data");		
	}
    public void datastrength() {
    	System.out.println(datastrength);
    }

}
