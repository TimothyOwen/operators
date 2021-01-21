package operator;

public class Calculator {
	public static int addition(int Int1, int Int2) {
		int result = Int1 + Int2;
		return result;
	}
	public static int subtraction(int Int1, int Int2) {
		int result = Int1 - Int2;
		return result;
	}
	public static int multiplication(int Int1, int Int2) {
		int result = Int1 * Int2;
		return result;
	}
	public static double division(double Int1, double Int2) {
		double result = Int1 / Int2;
		return result;
	}
	public static void main(String[] args) {
		System.out.println("Addition: "+addition(10,5));
		System.out.println("Subtraction: "+subtraction(10,5));
		System.out.println("Multiplication: "+multiplication(10,5));
		System.out.println("Division: "+division(5,2));
	}
}
