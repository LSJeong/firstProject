package reference;

import java.util.Scanner;

public class LeeSoJeong {
	public static void main(String[] args) {
		// 1.�л� �� ����, 2.�л��̸��Է�, 3.��� 4.����
				String[] name = null;
				String menu;
				
				while (true) {
					showMenu();
					menu = choice("��ȣ�� �����ϼ���>>");
					
					if (menu.equals("1")) {
						int size = Integer.parseInt(studentSize());
						name = new String[size];
					} else if (menu.equals("2")) {
						inputName(name);
					} else if (menu.equals("3")) {
						showStudent(name);
					} else if (menu.equals("4")) {
						break;
					}
				}
				System.out.println("==============��.==================");
				
			}
			
			public static void showMenu() {
				System.out.println("==============MENU=================");
				System.out.println("1.�л������� 2.�л��̸��Է� 3.��� 4.����");
			}
			
			public static String choice(String a) {
				System.out.println(a);
				Scanner scn = new Scanner(System.in);
				String num = scn.nextLine();
				
				return num;
			}
			
			public static String studentSize() {
				String size = choice("�л����� �Է��ϼ���>>");
				return size;
			}
			
			public static void inputName(String[] ary) {
				if(ary == null) {
					System.out.println("�л��� ���� �Է����ּ���.");
					return;	
				}
				
				for(int i=0;i<ary.length;i++) {
					//Scanner scn1 = new Scanner(System.in);
					//System.out.println((i+1) + "��° �л� �̸��� �Է����ּ���.");
					//ary[i] = scn1.nextLine();
					ary[i] = choice("�л��̸��� �Է��ϼ���.");
				}		
			}
//			
//			public static String inPut(String msg) {
//				Scanner scn1 = new Scanner(System.in);
//				System.out.println(msg);
//				String msg1 = scn1.nextLine();
//				
//				return msg1;
//			}
			
			public static void showStudent(String[] ary) {
				if(ary == null) {
					System.out.println("���� �л����� �Է��ϼ���.");
					return;	
				}
				for(int i = 0; i < ary.length; i++) {
					System.out.println((i+1) + "��° �л�: " + ary[i]);
				}
			}
		}
