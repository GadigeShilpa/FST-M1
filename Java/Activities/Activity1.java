package activities;

public class Activity1 {
	
	public static void main(String[] args) {
		Car Honda = new Car("Brown", "Manual", 2017);
		System.out.println();
		Honda.displayCharacteristics();
		Honda.accelerate();
		Honda.brake();
	}

}
