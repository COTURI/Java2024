package J0405.p04;

public class ThreadTest01 {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			System.out.println("thread");
			try {
				Thread.sleep(10000);
			} catch (Exception e) {
			}
		}
	}
}
