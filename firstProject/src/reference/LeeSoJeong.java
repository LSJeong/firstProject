package reference;

import java.util.Scanner;

public class LeeSoJeong {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		String[] name = null;
		int[] mat = null;
		int[] kok= null;
		
		
		while(true) {
			showMenu();
			int choice = read("��ȣ�� �����ϼ���>>");
			
			if(choice == 1) {
				int size = createStudent();
				name = new String[size];
				mat = new int[size];
				kok = new int[size];
			}else if (choice == 2) {
				inputValue(name,kok,mat);								
			}else if (choice == 3) {
				//showList(scores);				
			}else if (choice == 4) {
				//analysis(scores);				
			}else if (choice == 5) {
				break;				
			}
			
		}
		
		System.out.println("��.");
		

//
//		System.out.println("[�Է��� ����]");
//		//System.out.printf("�̸�:%s\t ��������:%d\t ��������:%d\n", name, konum, mtnum);
//
//		double avg = (double) (konum + mtnum) / 2;
//
//		if (avg > 60) {
//			System.out.printf("��� %f���� �հ��Դϴ�. \n", avg);
//		} else {
//			System.out.printf("��� %f���� Ż���Դϴ�. �� ����ϼ���. \n", avg);
//		}
	}
	
	public static void showMenu() {
		System.out.println("1.�л� �� �Է� 2.�л� ���� �Է� 3.��ü���� 4.��� 5.����");
	}
	
	public static int createStudent() {
		int cnt = read("�л����� �Է��ϼ���.");
		return cnt;
	}
	
	public static void inputValue(String[] ary, int[] ary1, int[] ary2) {
		if(ary == null) {
			System.out.println("�ٽ� �����ϼ���.");
			return;	
		}
		
		
		for(int i=0;i<ary.length;i++) {
			Scanner scn = new Scanner(System.in);
		    System.out.println((i+1) + "��° �л� �̸��� �Է����ּ���. ");
			ary[i] = scn.nextLine();
			ary1[i] = read("�л� ���������� �Է��ϼ���.");
			ary2[i] = read("�л� ���������� �Է��ϼ���.");
		}
	}
	
	public static int read(String a) {
		Scanner scn = new Scanner(System.in);
		System.out.println(a);
		int num = scn.nextInt();
		
		return num;
	}
}
