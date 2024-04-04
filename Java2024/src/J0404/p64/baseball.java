package J0404.p64;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class baseball {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] bbg = new int[3];
		Random random = new Random();

		for (int i = 0; i < bbg.length; i++) {
			bbg[i] = random.nextInt(9) + 1;

			for (int j = 0; j < i; j++) {
				if (bbg[i] == bbg[j]) {
					i--;

				}

			}

		}
		for (int b = 0; b < 6; b++) {
			System.out.print(bbg[b] + " ");
		}

		int[] answer = new int[3];
		int str = 0;
		int ball = 0;
		while (true) {
			for (int i = 0; i < answer.length; i++) {
				answer[i] = sc.nextInt();
			}
			System.out.println("Input number...");
			System.out.println(answer[0] + " " + answer[1] + " " + answer[2]);
			for (int i = 0; i < answer.length; i++) {
				if (answer[i] == bbg[i]) {
					str++;
				}
			}

			if (Arrays.equals(answer, bbg)) {
				System.out.println("strike : 3, ball : 0");
				System.out.println("Game Over!!!");
				break;

			}
		}
	}
}
