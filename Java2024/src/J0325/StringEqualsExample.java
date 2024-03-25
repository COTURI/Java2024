package J0325;

public class StringEqualsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String starVar1 = "JBEdu";
		String starVar2 = "JBEdu"; // heap(참조) 영역이 같음

		if (starVar1 == starVar2) {
			System.out.println("참조가 같음");
		} else {
			System.out.println("참조가 다름");
		}

		if (starVar1.equals(starVar2)) { // equals 문자열만 비교
			System.out.println("두 문자열이 같음");
		}

		String starVar3 = new String("JBEdu");
		String starVar4 = new String("JBEdu"); // heap(참조) 영역이 다름

		if (starVar3 == starVar4) {
			System.out.println("참조가 같음");
		} else {
			System.out.println("참조가 다름");
		}
		if (starVar3.equals(starVar4)) {
			System.out.println("두 문자열이 같음");
		}
	}
}
