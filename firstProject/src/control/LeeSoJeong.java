package control;

import java.util.Scanner;

public class LeeSoJeong {
	public static void main(String[] args) {
		//if, for(while) break, continue
		
		int ran = (int)(Math.random() * 44) + 1;
		int cnt = 0;
		
		System.out.println("====���� ������====");
		System.out.println("1~45 ������ ���ڸ� �Է��ϼ���.");
		
		while(true) {
			Scanner scn = new Scanner(System.in);
			cnt++;
			int num2 = scn.nextInt();
			if (num2 == ran) {
				System.out.println("�����Դϴ�!");				
				break;
			}else if(num2 > ran) {
				System.out.println("���亸�� Ů�ϴ�.");
				System.out.println("�� ���� ���� �Է��ϼ���.");
				continue;
			}else if(num2 < ran) {
				System.out.println("���亸�� �۽��ϴ�.");
				System.out.println("�� ū ���� �Է��ϼ���.");
				continue;
			}			
		}
		System.out.println("����: " + ran);
		System.out.println(cnt + "������ �����ϼ̽��ϴ�. ");
	}
}
