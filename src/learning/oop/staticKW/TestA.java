package learning.oop.staticKW;

public class TestA {
	private static int numberOfInstances; // Instance variable shared between all instances of this class

	public TestA() {
		this.numberOfInstances++;
	}

	public TestA(int x) {
		this(); // Calls the defult constructor to increment the static variable
		System.out.println("*Parameterized construcotr* : " + this.calculateCube(x));
	}

	public void increment() {
		// Instance method that increments the static member (can not be called without
		// creating an instance)
		numberOfInstances++;
	}

	public static void incrementNoI() {
		// Static method that increments the static member (can be called without
		// creating an instance)
		numberOfInstances++;
	}

	public static void resetNoI() {
		// Static method that resets the static variable (can be called without creating
		// an instance)
		numberOfInstances = 0;
	}

	public static void printNoI() {
		// Static method that print the static variable (can be called without creating
		// an instance)
		System.out.println("Number of instances: " + numberOfInstances);
	}

	public static int calculateCube(int x) {
		return x * x * x;
	}
}
