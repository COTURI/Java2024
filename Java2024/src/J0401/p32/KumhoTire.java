package J0401.p32;

public class KumhoTire extends Tire {
	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
	}

	public boolean roll() {
		++accumulayedRotation;
		if (accumulayedRotation < maxRotation) {
			System.out.println(location + " KumhoTire 수명: " + (maxRotation - accumulayedRotation) + "회");
			return true;
		} else {
			System.out.println("*** " + location + " KumhoTire 펑크 ***");
			return false;
		}
	}
}