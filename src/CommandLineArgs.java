
public class CommandLineArgs {
	int var; // instance var or non-static var
	static int alpha; // static var or class var

	public static void main(String[] args/* method arguments */) {
		int var1 = 0;// local var
		for (int i = 0; i < args.length; i++) {
			int j = 0;
			System.out.println("Hello " + args[i]);
		}
	}
}