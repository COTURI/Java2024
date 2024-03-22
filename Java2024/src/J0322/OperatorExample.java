package J0322;

public class OperatorExample {
	public static void main(String[] args) {
		int x = 1000000;
		int y = 1000000;

		int iz = x * y;
		long lz1 = (long) x * (long) y; // long으로 타입 캐스팅(변환)
		long lz2 = (long) (x * y); // x*y 먼저 수행

		System.out.println(iz);
		System.out.println(lz1);
		System.out.println(lz2);
	}
}
