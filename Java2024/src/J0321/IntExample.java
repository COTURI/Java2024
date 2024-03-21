package J0321;

public class IntExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int var1 = 10;
		int var2 = 012; // 8진수는 앞에 0붙임
		int var3 = 0xA; // 16진수는 0x 붙임

		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);

		System.out.printf("8진수 : 0%o\n", var2); //var2를 8진수로
		System.out.printf("16진수 : 0x%x\n", var3); //var3를 16진수로
		System.out.printf("10진수 : %d\n", var3); //var3를 10진수로
	}

}
