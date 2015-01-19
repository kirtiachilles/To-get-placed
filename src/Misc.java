
public class Misc {

	public static void main(String[] args) {
		int a = 20;
		test(a, ++a);
		System.out.println("in main "+ a+" "+ ++a);
	}
	private static void test(int a, int i) {
		System.out.println("in test "+ a+" "+ ++i);		
	}
}
