package control;

public class ForExe {
	public static void main(String[] args) {
		// 1~10 출력
		for(int i=1;i<=10;i++) {
			System.out.printf("%d ", i);
		}
		System.out.println("\n끝1.");
		
		// 1~10 중에서 짝수 출력(2,4,6,8,10)
		for(int i=2;i<=10;i+=2) {
			System.out.printf("%d ", i);
		}
		System.out.println("\n끝2.");
		
		// 1~10중에서 홀수(1,3,5,7,9)
		for(int i=1;i<=10;i+=2) {
			System.out.printf("%d ",i);
		}
		System.out.println("\n끝3.");
		
		// 1~10까지 합
		// 끝4.
		int sum = 0;
		for(int i=1;i<=10;i++) {
			sum += i;
		}
		System.out.printf("합계: %d ",sum);
		System.out.println("\n끝4.");
	}
}
