package J0321;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in); //scanner =class
		// new - heap 영역에 instance 생김
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		sc.close();
		
		System.out.println(a);
		System.out.println(b);
	}
}
