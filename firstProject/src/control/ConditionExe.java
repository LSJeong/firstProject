package control;

public class ConditionExe {
	public static void main(String[] args) {
		// �� ���� 60, 70
		// �� ���� ���� ����� 100�� �Ѿ�� �հ�, ���հ�
		// ��. ���

		int score = 60;
		int score2 = 70;
		int total = score + score2;

		if (total > 100) {
			System.out.println("�հ��Դϴ�.");
		} else {
			System.out.println("���հ��Դϴ�.");
		}

		System.out.println("��.\n");

		// �μ��� ���ؼ� ¦���̸� ¦��, Ȧ���̸� Ȧ��
		// �ι�° ��.
		int total2 = score * score2;

		if (total2 % 2 == 1) {
			System.out.println("Ȧ���Դϴ�.");
		} else {
			System.out.println("¦���Դϴ�.");
		}

		System.out.println("2��° ��.\n");

		// ���ο�� 4
		// 2�� ����̸� 2�� ���, 3�� ����̸� 3�� ���
		// 2�� 3�� ����Դϴ�.
		int score3 = 12;

		if (score3 % 2 == 0 && score3 % 3 == 0) {
			System.out.println("2�� 3�� ����Դϴ�.");
		} else if (score3 % 2 == 0) {
			System.out.println("2�� ����Դϴ�.");
		} else if (score3 % 3 == 0) {
			System.out.println("3�� ����Դϴ�.");
		}

		System.out.println("3��° ��.\n");

		// ctl+shitf+f : ����
		
		// 1~6 ������ ��
		int randomValue = (int) (Math.random() * 6) + 1; 
		System.out.println(randomValue);
		
		//switch ���ǹ� -> 1�� ���Խ��ϴ�
		
		switch(randomValue) {
		case 1:
			System.out.println("1�� ���Խ��ϴ�.");
			break;
		case 2:
			System.out.println("2�� ���Խ��ϴ�.");
			break;
		case 3:
			System.out.println("3�� ���Խ��ϴ�.");
			break;
		case 4:
			System.out.println("4�� ���Խ��ϴ�.");
			break;
		case 5:
			System.out.println("5�� ���Խ��ϴ�.");
			break;
		case 6:
			System.out.println("6�� ���Խ��ϴ�.");
			break;
		}
		
		System.out.println("4���� ��. \n");
		
		
		//0~99�������� ��
		int randomScore = (int)(Math.random()*100);
		System.out.println(randomScore + "��");
		if(randomScore >= 90) {
			System.out.println("A�����Դϴ�.");
		}else if(randomScore >= 80) {
			System.out.println("B�����Դϴ�.");
		}else if(randomScore >= 70) {
			System.out.println("C�����Դϴ�.");
		}else if(randomScore >= 60) {
			System.out.println("D�����Դϴ�.");
		}else{
			System.out.println("F�����Դϴ�.");
		}
		System.out.println("5��° ��. \n");
		
		
		int randomScore2 = (int)(Math.random()*100);
		System.out.println(randomScore2 + "��");
		randomScore2 /= 10;
		switch(randomScore2) {
		case 9:
			System.out.println("A�����Դϴ�.");
			break;
		case 8:
			System.out.println("B�����Դϴ�.");
			break;
		case 7:
			System.out.println("C�����Դϴ�.");
			break;
		case 6:
			System.out.println("D�����Դϴ�.");
			break;
		default:
			System.out.println("F�����Դϴ�.");
		}
		
	}
}
