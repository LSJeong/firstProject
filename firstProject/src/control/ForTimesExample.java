package control;

public class ForTimesExample {
	public static void main(String[] args) {

		for (int j = 2; j <= 9; j++) {
			int row = j;
			System.out.println("====="+row+"´Ü=====");
			for (int i = 1; i <= 9; i++) {				
				System.out.printf(" %d * %d = %d \n", row, i, (row * i));				
			}
		}
		System.out.println("");

		for (int i = 1; i <= 9; i++) {
			for (int j = 2; j <= 9; j++) {
				System.out.printf(" %d * %d = %d \t", j, i, i * j);
				
				if(j==9) {
					System.out.println();
				}
			}
		}
		
		
	}
}
