
public class Variables {
	int weight = 10;

	public static void main(String[] args) {
		Variables v = new Variables();
		v.myMethod();
	}

	void myMethod() {
		int weight = 0;
		System.out.println(weight);
		System.out.println(this.weight);
	}
}