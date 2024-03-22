package J0322;

public class SwitchExample02 {
	public static void main(String[] args) {
		int time = (int) (Math.random() * 4) + 8;
		System.out.println("현재시간 : " + time);

		switch (time) {
		case 8:
			System.out.println("출근합니다");
			break;
		case 9:
			System.out.println("회의를 합니다");
			break;
		case 10:
			System.out.println("업무를 봅니다");
			break;
		default: // case 숫자 말고 나머지는 default 값으로 출력된다.
			System.out.println("외근을 나갑니다");
			break;
		}
	}
}
