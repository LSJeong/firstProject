package firstProject;

import java.util.Scanner;

public class LeeSoJeong {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("�̸��� �Է��ϼ��� >> ");
		String name = scn.nextLine();
		
		System.out.println("���̸� �Է��ϼ��� >> ");
		String age = scn.nextLine();
		if(age.equals("")) {
			age = "0";
		}
		int ageInt = Integer.parseInt(age); 
				
		System.out.println("���� ������ �Է��ϼ��� >> ");
		int konum = scn.nextInt();
		
		System.out.println("���� ������ �Է��ϼ��� >> ");
		int mtnum = scn.nextInt();
		
		System.out.println("[�Է��� ����]");
		System.out.printf("�̸�:%s\t ����:%d\t ��������:%d\t ��������:%d\n", name, ageInt, konum, mtnum);
		
		double avg = (double)(konum+mtnum)/2;
		
		if(avg > 60) {
			System.out.printf("��� %f���� �հ��Դϴ�. \n", avg );
		}else {
			System.out.printf("��� %f���� Ż���Դϴ�. �� ����ϼ���. \n", avg );
		}
		
		System.out.println("��. ");
		
	}
}
