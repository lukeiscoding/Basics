
public class ArrayExample {
	public static void main(String[] args) {

		int[] intArray = { 10, 20 };

		intArray = new int[] { 10, 20, 30 };
		System.out.println("Array size = " + intArray.length);

		intArray[0] = 50;
		intArray[1] = 150;

		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}

		double[] doubleArray = new double[5];
		System.out.println((int) 5.9);

		double[] doubleArray1 = getArray();
		printArray(doubleArray1);
	}

	public static void printArray(double[] doubleArray1) {
		for (double d : doubleArray1) {
			System.out.println(d);
		}
	}

	public static double[] getArray() {
		double[] array = { 100, 200, 300 };
		return array;
	}
}
