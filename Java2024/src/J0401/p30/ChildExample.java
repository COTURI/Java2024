package J0401.p30;

public class ChildExample {

	public static void main(String[] args) {
		Child child = new Child();
		Parent parent = new Parent();

		parent.method1();
		parent.method2();
//		parent.method3(); // 부모 클래스에 메소드 3은 없다

		child.method1(); // 메소드 오버라이딩
		child.method2();
		child.method3();

		System.out.println("----------------------------");

		parent = child;
		parent.method1();
		parent.method2();

	}

}
