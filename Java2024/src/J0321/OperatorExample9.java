package J0321;

public class OperatorExample9 {
	public static void main(String[] arg) {
		int v1 = 5;
		int v2 = 2;

		int result1 = v1 + v2;
		System.out.println("result1 :" + result1);

		int result2 = v1 - v2;
		System.out.println("result2 :" + result2);

		int result3 = v1 * v2;
		System.out.println("result3:" + result3);

		int result4 = v1 / v2;
		System.out.println("result4 :" + result4);

		int result5 = v1 % v2;
		System.out.println("result5 :" + result5);

		double result6 = v1 / v2;
		System.out.println("result6 :" + result6);

		double result7 = (double) v1 / v2; // 명시적 타입 캐스팅 : ()로 바꿔라
		System.out.println("result7 :" + result7);

	}
}
