package J0408.p36;

import java.util.HashSet;
import java.util.Set;

public class HsahSetExampe {
	public static void maun(String[] args) {
		Set<Member> set = new HashSet<Member>();

		set.add(new Member("홍길동", 30));
		set.add(new Member("홍길동", 30));

		System.out.println("총 객체 수 : " + set.size());
	}
}
