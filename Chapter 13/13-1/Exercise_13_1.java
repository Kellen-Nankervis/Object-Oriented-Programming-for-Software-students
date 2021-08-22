import java.util.Scanner;

class Exercise_13_1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter the first side of the triangle: ");
		double side1 = input.nextDouble();
		
		System.out.println("Please enter the second side of the triangle: ");
		double side2 = input.nextDouble();
		
		System.out.println("Please enter the third side of the triangle: ");
		double side3 = input.nextDouble();
		
		System.out.println("Please enter a color: ");
		String color = input.next();
		
		System.out.println("Is the triangle filled (true / false)? ");
		boolean filled = input.nextBoolean();
		
		Triangle triangle = new Triangle(side1, side2, side3, color, filled);
		
		System.out.println(triangle);
	}
}