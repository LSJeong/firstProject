package firstProject;
import java.util.Scanner;
public class ScannerExample3 {
	public static void main(String[] args) {
		// ���������Է�
		// ���������Է�
		// �̸��Է�
		// ȫ�浿���� ����, ���������� ���� ?, ����� ? �Դϴ�.
		// �հ� ������ 120�� �̻� �հ�
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("���� ������ �Է��ϼ���..");
		int egnum = scn.nextInt();
		scn.nextLine();
		
		System.out.println("���� ������ �Է��ϼ���..");
		int mtnum = scn.nextInt();
		scn.nextLine();
		
		System.out.println("�̸��� �Է��ϼ���..");
		String name = scn.nextLine();
		
		int total = egnum + mtnum;
		int avg = (egnum + mtnum)/2;
		
		System.out.printf("%s�� ����, ���� ������ ���� %d, ����� %d �Դϴ�.", name, total, avg);
		System.out.println();
		
		if(total >= 120) {
			System.out.println(name + "���� �հ��Դϴ�.");
		}else {
			System.out.println(name + "���� ���հ��Դϴ�.");
		}
		
	}
}
