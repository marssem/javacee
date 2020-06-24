package homeWork;
 class Chicken{
	 int weight;
		
		void big() {
			System.out.println("이 나무는"+weight);
		}
 }

public class Chick extends Chicken {
	public void big() {
		weight = 23;
		System.out.println("이 열매는 "+weight);
		
	}
}
