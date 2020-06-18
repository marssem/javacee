package s0618;

public class Son extends Father {
	Son(){
		
		System.out.println("난 나중이지!");
	}

	int money = 1000000000;
	public static void main(String[] atgs) {
		Son s = new Son();
		
		
		
		/*
		s.name = "손흥민";
		System.out.println(s.name+s.money);
		
		Father f = new Son();
		Son s2 = (Son)f;
		System.out.println("아빠가 가진 돈은 "+s2.money);
		*/
		
	}
}
