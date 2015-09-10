
public class DefaultValues {
	int i;
	float f;
	String str;

	public static void main(String[] args) {
		int iLocal = +10;
		int iLocal1 = -10;
		String strLocal = "Hello";

		boolean b = false;

		DefaultValues dv = new DefaultValues();
		System.out.println("i = " + dv.i);
		System.out.println("f = " + dv.f);
		System.out.println("str = " + dv.str);

		System.out.println("iLocal = " + iLocal);
		System.out.println("iLocal1 = " + iLocal1);
		System.out.println("strLocal = " + strLocal);
		System.out.println(!b);
		for (int i = 0; i < 10 || iLocal == 10; i = i + 5, iLocal += 3) {
			System.out.println(i);
		}
		int i = 0;
		for (;;) {
			if (i == 2) {
				i++;
				continue;
			}
			if (i > 5) {
				break;
			}
			System.out.println(i);
			i++;
		}
		System.out.println("Outside loop");
	}
}
