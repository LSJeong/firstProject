package firstProject;

public class StringExample2 {
	public static void main(String[] args) {
		String name = "�̼���";
		int age = 25;
		
		//�̸��� �̼���, ���̴� 25
		System.out.println("�̸��� " +name+", ���̴� "+age);
		System.out.printf("�̸��� %s, ���̴� %d", name, age);
		System.out.println();
		System.out.println();
		
		
		
		byte b1 = -90;
		byte b2 = 10;
		
		//result = b1, b2�� ��
		//100 + 10 = 110 �ܼ� ���
		int result = b1 + b2;
		System.out.println(b1 + " + " + b2 + " = " + result);
		
		//��,���� isLarger .. result > 0 .. 
		boolean isLarger = result > 0;
		
		if(isLarger) {
			System.out.println("0���� Ů�ϴ�.(����Դϴ�)");
		}else {
			System.out.println("0���� �۽��ϴ�.(�����Դϴ�)");
		}
		
		
		// long 2200000000, 120, 16
		// long 2200000000, 78, 8
		// avg�� ��ƶ�
		// 120�� 16���� ���� ���: 7.5
		long num1 = 2200000000L;
		int num2 = 120;
		double num3 = 16;
		
		double avg = num2 / num3;
		double avg1 = (num1+num2+num3) / 3;
		
		System.out.println(num2 + "�� " + num3 + "�� ���� ���: " + avg);
		System.out.println("��� ���: " + avg1);
		
		
		
	}
}
