package control;

public class DoWhileExe {
	public static void main(String[] args) {
		boolean run = false;
		
		// 1부터 10까지 출력.
		int i = 0;
		do {
			i++;
			System.out.println(i);
			if(i >= 10) {
				break;
			}
		}while(true);		
		System.out.println("끝1.");
				
		// 짝수만 출력, continue 사용
		i = 0;
		do {
			i++;
			if (i % 2 == 1) {
				continue;
			}
			System.out.println(i);
			if (i >= 10) {
				break;
			}
		} while (true);
		System.out.println("끝2.");

		// 홀수만 합계
		i = 0;
		int sum = 0;
		do {
			i++;
			if (i % 2 == 0) {
				continue;
			}
			if (i >= 10) {
				break;
			}
			sum += i;
		} while (true);
		System.out.println("홀수 합계: " + sum);
		System.out.println("끝3.\n");
		
//		int cnt=0;
//		sum=0;
//		do {
//			if(cnt >= 10) {
//				break;
//			}
//			if(cnt % 2 == 0) {
//				cnt++;
//				continue;
//			}
//			sum += cnt++;
//		}while(true);
		
		// 임의의 값을 1~10;
		// sum 값이 100보다 크거나 같은수가 되었을때
		// 그때의 sum 값을 출력...몇번 실행을 했냐
		
		int cnt = 0;
		i = 0;
		sum = 0;
		do {
			i = (int) (Math.random() * 10) + 1;
			sum += i;
			cnt++;
//			System.out.println("i: " + i);
			if (sum >= 100) {
				break;
			}
		} while (true);

		System.out.println("sum: " + sum);
		System.out.println(cnt + " 번 실행되었습니다.");

		System.out.println("끝4.\n");
		
		
		
		
		
	}
}
