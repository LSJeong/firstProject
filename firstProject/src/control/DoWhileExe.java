package control;

public class DoWhileExe {
	public static void main(String[] args) {
		boolean run = false;
		
		// 1���� 10���� ���.
		int i = 0;
		do {
			i++;
			System.out.println(i);
			if(i >= 10) {
				break;
			}
		}while(true);		
		System.out.println("��1.");
				
		// ¦���� ���, continue ���
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
		System.out.println("��2.");

		// Ȧ���� �հ�
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
		System.out.println("Ȧ�� �հ�: " + sum);
		System.out.println("��3.\n");
		
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
		
		// ������ ���� 1~10;
		// sum ���� 100���� ũ�ų� �������� �Ǿ�����
		// �׶��� sum ���� ���...��� ������ �߳�
		
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
		System.out.println(cnt + " �� ����Ǿ����ϴ�.");

		System.out.println("��4.\n");
		
		
		
		
		
	}
}
