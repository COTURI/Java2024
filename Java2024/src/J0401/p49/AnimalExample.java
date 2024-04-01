package J0401.p49;

public class AnimalExample {

	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		dog.sound();
		cat.sound();
		System.out.println("1. -----------------------");

		Animal animal = null;
		animal = new Dog();
		animal.sound();
		animal = new Cat();
		animal.sound();
		System.out.println("2. -----------------------");

		animalSound(new Dog()); // static이 붙어있기 때문에 호출 가능함
		animalSound(new Cat());
	}

	public static void animalSound(Animal animal) { // animal = new Dog();
		animal.sound();
	}

}
