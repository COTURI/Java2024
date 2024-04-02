package J0402.p74;

public class Anonymous {
	Person field = new Person() {
		void work() {
			System.out.println("출근합니다.");
		}

		void wake() {
			System.out.println("6시에 일어납니다.");
		}
	};

	void method1() {
		Person localVar = new Person() {
			void walk() { //정의 부분
				System.out.println("산책합니다.");
			}

			void wake() {
				System.out.println("7시에 일어납니다.");
				walk();
			}
		}; // 정의
		localVar.wake();
	}

	void method2(Person person) {
		person.wake();
	}
}
