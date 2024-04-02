package J0402.p72;

public class E {
	void method() {
		class F{
			int filed1;
			// static int field2; // 정적필드(x)
			void method1() {
				System.out.println("class E - method() - class F = method1()");
			}
			//static void method2() // 정적메소드(x)
		}
		F f = new F();
		f.filed1 = 7;
		System.out.println("F.field1 : " + f.filed1);
		f.method1();
	}
}
