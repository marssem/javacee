package s0619.sub;

public class GuGuDan {
public static void main(String[] args) {
		
		for(int i=1;i<=100;i++ ) {
			if(i%2==0) {
				System.out.print("짝");
				}else {
					System.out.print("홀");
				}
			if(i%10==0) {
				System.out.println();
			}else {
				System.out.print(",");
			}
		}
}
}