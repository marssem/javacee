package s0617;

public class Constructor { // 생성자
	
	int a=1;
	Constructor(){
		System.out.println("do");
	}
	
	public static void main(String[] args) {
		Constructor c;
		c = new Constructor(); // 메소드라고 부르지 않는다. return 타입이 없다.
		System.out.println(c);
	}
}
