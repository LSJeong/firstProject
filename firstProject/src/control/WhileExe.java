package control;

public class WhileExe {
	public static void main(String[] args) {
		// while������ 1 ~ 10 ���� ���
		int i = 0;
		while(i < 10) {
			i++;
			System.out.printf("%d ", i);
		}
		System.out.println("");
		
		// while ������ 2,4,6,8,10 ���
		i = 0;
//		while(i < 10) {
//			i++;
//			if(i % 2 == 0) {
//				System.out.printf("%d ", i);
//			}
//		}
		
		while (true) {
			i += 2;
			System.out.printf("%d ", i);
			if(i == 10)
				break;
		}
			
		System.out.println("");
		
		// while ������ 1,3,5,7,9 ���
		i = 0;
		while (i < 10) {
			i++;
			if (i % 2 == 1) {
				System.out.printf("%d ", i);
			}
		}
		System.out.println("");
		
		// while ������ 1~ 10 �� ���
		i = 0;
		int sum = 0;
		while (i < 10) {
			i++;
			sum += i;
		}
		System.out.println("��: " + sum);
	}
}
