package s0619;

import s0619.sub.SubTest;

public class AccsessTest extends SubTest {
	public void test() {
		System.out.println(num1);
		System.out.println(num2);//protected 에서 말하는 상속
	}

	public static void main(String[] args) {
		SubTest st =  new  SubTest();
		AccsessTest at = new AccsessTest();
		st.num1 = 10;
		at.num2 = 10; // 내부에서만 사용가능
//		st.num3 = 11; 사용 안됨
//		st.num4 = 12; 사용 안됨
		
	}
}
