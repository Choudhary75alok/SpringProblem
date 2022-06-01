package SpringEx.SpringEx;

public class Idea implements Sim {

	private String datastrength;
	
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

}
