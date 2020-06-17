package s0616;

public class Person {
	String name;
	String address;
	int age;

	void run( ) {
		System.out.println(name + "이 달립니다.");
		if(age>30) {
			System.out.println(age + "가 되니까 지치는구나..");
		}else {
			System.out.println("쌩쌩하구만!!");
		}
	}
	
	public static void main(String[] args) {
		
		Person[] people = new Person[5];
	
		people[4] = new Person();
		people[3] = new Person();
		
		
		
		Person p = new Person();  //이 때 초기화 해준다.
		System.out.println(p.age);
		p.name = "투덜";
		p.age = 12;
	
		p.run();
	}
}
