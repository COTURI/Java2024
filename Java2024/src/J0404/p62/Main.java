package J0404.p62;

import java.util.Arrays;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		int[] selectNumber = new int[6];
		Random random = new Random();
		System.out.println("선택 번호 : ");

		for (int i = 0; i < selectNumber.length; i++) {
			selectNumber[i] = random.nextInt(45) + 1;

			for (int j = 0; j < i; j++) {
				if (selectNumber[i] == selectNumber[j]) {
					i--;

				}

			}

		}
		for (int b = 0; b < 6; b++) {
			System.out.print(selectNumber[b] + " ");

		}
		System.out.println();

		int[] winningNumber = new int[6];
		random = new Random(5);
		System.out.println("당첨 번호 : ");
		for (int i = 0; i < 6; i++) {
			winningNumber[i] = random.nextInt(45) + 1;
			System.out.print(winningNumber[i] + " ");
		}
		System.out.println();

		// 당첨 여부
		Arrays.sort(selectNumber);
		Arrays.sort(winningNumber);
		boolean result = Arrays.equals(selectNumber, winningNumber);
		System.out.println("당첨 여부 : ");
		if (result) {
			System.out.println("축하합니다! 당첨 되셨습니다.");

		} else {
			System.out.println("당첨되지 않았습니다.");
		}

	}

}
