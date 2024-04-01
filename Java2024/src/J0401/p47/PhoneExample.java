package J0401.p47;

public class PhoneExample {
	public static void main(String[] arg) {
//		Phone phone = new Phone("홍길동"); // abstract (추상)클래스를 불러올수 없다.

		Phone phone2 = new SmartPhone("임꺽정");
		phone2.turnOn();
		phone2.turnOff(); 
//		부모클래스에서는 자식클래스를 호출 할수 없다.
		SmartPhone phone3 = new SmartPhone("홍길동");
		phone3.turnOn();
		phone3.internetSearch();
		phone3.turnOff();
		
	}
}
