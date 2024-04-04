package J0404.p36;

public class Main {

	public static void main(String[] args) {
		String ssn = "870913-1234567";

		String firstNum = ssn.substring(0, 6); // 0~5
		String secondNum = ssn.substring(7); // 7~마지막

		System.out.println("firstNum : " + firstNum);
		System.out.println("secondNum : " + secondNum);

	}

}
