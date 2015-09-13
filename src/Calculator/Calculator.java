package Calculator;

public class Calculator {
	public int add(int x, int y) {
		return x + y;
	}

	public double add(int x, int y, double z) {
		return x + y + z;
	}

	public int minus(int x, int y) {
		return x - y;
	}

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		int x = calculator.add(10, 20);
		double y = calculator.add(10, 20, 45.7);
		System.out.println(x);
		System.out.println(y);
	}
}
