package J0401.p32;

public class HankookTire extends Tire{
	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}

	public boolean roll() {
		++accumulayedRotation;
		if (accumulayedRotation < maxRotation) {
			System.out.println(location + " HankookTire 수명: " + (maxRotation - accumulayedRotation) + "회");
			return true;
		} else {
			System.out.println("*** " + location + " HankookTire 펑크 ***");
			return false;
		}
	}
	

}
