package J0322;

import java.util.Scanner;

public class ScannerExample {
	public static void main(String[] arg) throws Exception {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("x 값 입력: ");
		String strX = scanner.nextLine(); // nextLine 문자열 입력 == next공백 이전까지 
		int x = Integer.parseInt(strX); // 문자열을 정수 변환 
		
		System.out.print("y 값 입력: ");
		String strY = scanner.nextLine();
		int y = Integer.parseInt(strY);
		
		int result = x + y;
		
		System.out.println("x + y: " + result);
		System.out.println();
		
		while(true) {  // 무한반복
			System.out.print("입력 문자열: ");
			String data = scanner.nextLine();
			if(data.equals("q")) {  // 종료 조건
				break;
			}
			System.out.println("출력 문자열: " + data);
			System.out.println();
		}
		System.out.println("종료");
		scanner.close();
		
	}
}
