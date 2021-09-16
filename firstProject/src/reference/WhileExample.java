package reference;

public class WhileExample {
	public static void main(String[] args) {
		// while 반복문.
		int i = 1;
		
		while(i <= 10) {
			System.out.println(i);
			i++;
		}
		System.out.println("끝1.");
		
		boolean run = true;
		i = 1;

		// 1~10 짝수값만 출력
		while(run) {			
			if(i % 2 == 0) {
				System.out.println(i);
			}
			
			if(i == 10) {
				run = false;
			}
			i++;
		}
		
		while(true) {
			if(i == 11) {
				break;
			}
		}
		
		
		
		
	}
}
