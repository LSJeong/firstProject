package control;

public class ForExe {
	public static void main(String[] args) {
		// 1~10 ���
		for(int i=1;i<=10;i++) {
			System.out.printf("%d ", i);
		}
		System.out.println("\n��1.");
		
		// 1~10 �߿��� ¦�� ���(2,4,6,8,10)
		for(int i=2;i<=10;i+=2) {
			System.out.printf("%d ", i);
		}
		System.out.println("\n��2.");
		
		// 1~10�߿��� Ȧ��(1,3,5,7,9)
		for(int i=1;i<=10;i+=2) {
			System.out.printf("%d ",i);
		}
		System.out.println("\n��3.");
		
		// 1~10���� ��
		// ��4.
		int sum = 0;
		for(int i=1;i<=10;i++) {
			sum += i;
		}
		System.out.printf("�հ�: %d ",sum);
		System.out.println("\n��4.");
	}
}
