package J0408.p38;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> ts = new TreeSet<String>();

		if (ts.add("korea")) {
			System.out.println("첫 번쨰 korea 추가 성공");
		} else {
			System.out.println("첫 번쨰 korea 추가 실패");
		}

		if (ts.add("china")) {
			System.out.println("첫 번쨰 china 추가 성공");
		} else {
			System.out.println("첫 번쨰 china 추가 실패");
		}

		if (ts.add("america")) {
			System.out.println("첫 번쨰 america 추가 성공");
		} else {
			System.out.println("첫 번쨰 america 추가 실패");
		}

		if (ts.add("china")) {
			System.out.println("첫 번쨰 china 추가 성공");
		} else {
			System.out.println("첫 번쨰 china 추가 실패");
		}

		System.out.println("Iterator로 전체 원소 순회 --------------");
		Iterator<String> it = ts.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
