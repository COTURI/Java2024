package J0325;

import java.util.Scanner;

public class ForSumExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inp = sc.nextInt();
		int sum = 0;
		sc.close();

		for (int i = 1; i <= inp; i++) {
			sum += i;
		}

		System.out.println("sun = " + sum);
	}

}
