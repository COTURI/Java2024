package J0325;

public class AdvForExample {

	public static void main(String[] args) {
		int[] scores = { 9, 7, 8, 9, 8, }; //{} index값

		int sum = 0;
		for (int i = 0; i <= 4; i=i+2){
			sum += scores[i];
		}
		System.out.print("sum : " + sum);
	}
}
//int[] scores = {9,7,8,9,8};
//
//int sum  = 0;
//for(int s : scores) {
//	sum +=s;
//}
//System.out.println("sum : " + sum);
