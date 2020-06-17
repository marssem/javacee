package s0617;

public class MethodTest {
	static int add(int num1, int num2) {
		return num1+num2;
	}
	
	static String add(String str1, String str2) {
		return str1+str2;
	}
	
	public static void main(String[] args) {
		int sum = add(1, 2);
		System.out.println(sum);
		
		add("null", "null");
		System.out.println(add("null", "null"));
		System.out.println(add("", ""));
	}
}

