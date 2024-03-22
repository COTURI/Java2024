package J0322;

public class CompareOperatorExample {
	public static void main(String[] arg) {
		int num1 = 10;
		int num2 = 10;
		boolean result1 = (num1 == num2); // 같다
		boolean result2 = (num1 != num2); // 값이 다른지 검사
		boolean result3 = (num1 <= num2); // num1이 작거나 같은지 검사

		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);

		char char1 = 'A'; // 아스키코드 65
		char char2 = 'B'; // 아스키코드 66
		boolean result4 = (char1 < char2);
		System.out.println("result4 : " + result4);

	}
}