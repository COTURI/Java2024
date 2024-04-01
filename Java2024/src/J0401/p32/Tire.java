package J0401.p32;

public class Tire {
	public int maxRotation;
	public int accumulayedRotation;
	public String location;
	
	public Tire(String location,int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	public boolean roll() {
		++accumulayedRotation;
		if(accumulayedRotation<maxRotation) {
			System.out.println(location + " Tire 수명: " + (maxRotation-accumulayedRotation) + "회");
			return true;
		}else {
			System.out.println("*** " + location + "Tire");
			return false;
		}
	}
	
}
