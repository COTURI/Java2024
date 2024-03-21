package J0321;

public class OperatorExample10 {
	public static void main(String[] arg) {
		char c1 = 'A' + 1; // 'A' 아스키코드 65 'B' 아스키코드 66
		char c2 = 'A';
		char c3 = (char)(c2+1); // 산출 타입 : int
		
		System.out.println("c1 : " + c1);
		System.out.println("c2 : " + c2);
		System.out.println("c3 : " + c3);
	}
}
