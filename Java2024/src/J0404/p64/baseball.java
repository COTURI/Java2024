package J0404.p64;

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
	

		int[] answer = new int[3];

		while (true) {
			int str = 0;
			int ball = 0;
			for (int i = 0; i < answer.length; i++) {
				answer[i] = sc.nextInt();
			}
			System.out.println("Input number...");
			System.out.println(answer[0] + " " + answer[1] + " " + answer[2]);
			for (int i = 0; i < answer.length; i++) {
				for (int j = 0; j < 3; j++)
					if (answer[i] == bbg[j]) {
						if (i == j) {
							str += 1;
						} else {
							ball += 1;
						}

					}
			}
			System.out.println("strike = " + str + " ball = " + ball);

			if (str == 3) {
				System.out.println("Game Over!!!");
				break;
			}

		}
		sc.close();

	}
}