package J0404.p50;

import java.util.Arrays;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		int[] scores = { 99, 68, 36, 29, 88 };

		Arrays.sort(scores);
		for (int i = 0; i < scores.length; i++) {
			System.out.println("scores[" + i + "]=" + scores[i]);
		}

		String[] names = { "홍길동", "박동수", "김민수" };
		Arrays.sort(names);
		for (int i = 0; i < names.length; i++) {
			System.out.println("names[" + i + "]=" + names[i]);
		}
		
		
		String[] names2 = { "홍길동", "박동수", "김민수" };
		Arrays.sort(names2,Collections.reverseOrder());
		for (int i = 0; i < names2.length; i++) {
			System.out.println("names[" + i + "]=" + names2[i]);
		}
	}
}
