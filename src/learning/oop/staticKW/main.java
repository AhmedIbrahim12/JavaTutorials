package learning.oop.staticKW;

public class main {

	static {
		// The static block will be executed before the main
		System.out.println("Calling from static block");
	}

	public static void main(String[] args) {
		// Static keyword examples
		TestA.incrementNoI(); // Increments the static variable
		TestA.printNoI(); // Prints the static variable
		TestA a1 = new TestA(); // Creates new instance of the class
		a1.printNoI(); // Calls the static method that prints the static variable
		new TestA(); // Anonymous obj just to increment the variable through the constructor
		a1.increment(); // Increment the static variable through a non-static method
		TestA.printNoI();

		// We can call static methods without creating an instance just to do a one time
		// job
		int cube = TestA.calculateCube(5); // Calculates the cube of 5
		System.out.println("Cube of 5 is " + cube);

		TestA a2 = new TestA(5); // Calling a parameterized constructor that calls the defult constructor
		a2.printNoI(); // The static variable gets incremented
	}

}
