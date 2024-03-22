package J0322;

public class SwitchExample01 {
	public static void main(String[] args) {
		int num = (int)(Math.random()*6)+1; //(int) = 인티저로 타입 캐스팅
		// 0.0<=Math.random()<1.0
		switch(num) {
		case 1:
			System.out.println("1번이 나왔습니다");
			break;
		case 2:
			System.out.println("2번이 나왔습니다");
			break;
		case 3:
			System.out.println("3번이 나왔습니다");
			break;
		case 4:
			System.out.println("4번이 나왔습니다");
			break;
		case 5:
			System.out.println("5번이 나왔습니다");
			break;
		case 6:
			System.out.println("6번이 나왔습니다");
			break;
		}
	}
}
