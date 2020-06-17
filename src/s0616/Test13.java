package s0616;

public class Test13 { 
	static void a (int a, int b) { // a 메소드를 호출할 때 값을 넣어 줘야 된다.
		
	}
	static int num1() {
		return 1;
	} 
	static int num2() {
		return 2;
	}
	static boolean getStr() {
		return true;
	}
	int num  = 3;
	
	int getInt(int num) {
		System.out.println(this.num);
		return 3;
		
	}
	
 public static void main(String[] ares) {
	 a(0,-1);
	 
	 int a = num1();
	 System.out.println(a);
	 System.out.println(num1());
	 
	 int b = 1;
	 System.out.println(b);
//	 int b = 1;
//	 System.out.println(a());
	 
 }
}
