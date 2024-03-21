package J0321;

public class OperatorExample01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 3;
		int y = 4;
		int a = 5, b = 6, c = 7;
		int res1 = 0, res2 = 0;

		a = b = c = 8;
		res1 = 100 * 2 + 7 % 5; // 200 + 2  %는 나머지 값
		res2 = 100 * (2 + 7) % 5; // 100*9%5 900/5 나눈 나머지값은 0

		System.out.println(x);
		System.out.println(y);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(res1);
		System.out.println(res2);
	}

}
