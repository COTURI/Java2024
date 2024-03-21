package J0321;

public class OperatorExample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 5;
		int y = 8;
		int result1 = ++x + 10;
		int result2 = y++ + 10;

		System.out.println(x); // ++x 가 먼저 실행되어서 6
		System.out.println(y); // y=9
		System.out.println(result1); // 16
		System.out.println(result2); // =8+10

	}

}
