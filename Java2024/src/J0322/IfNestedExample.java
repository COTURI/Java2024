package J0322;

public class IfNestedExample {
	public static void main(String[] args) {
		int score = 79;
		
		if(score >= 90) {
			System.out.print("A");
			if(score >= 95) {
				System.out.print("+");
			} else {
				System.out.print("-");
			}
		} else if(score >= 80){
			System.out.print("B");
			if(score >= 85) {
				System.out.print("+");
			}else {
				System.out.print("-");
			}
		}
		else if(score >= 70){
			System.out.print("C");
			if(score >= 75) {
				System.out.print("+");
			}else {
				System.out.print("-");
			}
		}
	}
}
