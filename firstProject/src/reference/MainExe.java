package reference;

import java.util.Scanner;

public class MainExe {
	public static void main(String[] args) {
		// 1.학생 수 지정, 2.학생이름입력, 3.출력 4.종료
		String[] name = null;
		int menu = 0;
		
		while (true) {
			showMenu();
			menu = choice("번호를 선택하세요>>");
			
			if (menu == 1) {
				int size = studentSize();
				name = new String[size];
			} else if (menu == 2) {
				inputName(name);
			} else if (menu == 3) {
				showStudent(name);
			} else if (menu == 4) {
				break;
			}
		}
		System.out.println("==끝.==");
		
	}
	
	public static void showMenu() {
		System.out.println("==============MENU=================");
		System.out.println("1.학생수지정 2.학생이름입력 3.출력 4.종료");
	}
	
	public static int choice(String a) {
		System.out.println(a);
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		
		return num;
	}
	
	public static int studentSize() {
		int size = choice("학생수를 입력하세요>>");
		return size;
	}
	
	public static void inputName(String[] ary) {
		if(ary == null) {
			System.out.println("학생수 먼저 입력해주세요.");
			return;	
		}
		
		for(int i=0;i<ary.length;i++) {
			//Scanner scn1 = new Scanner(System.in);
			//System.out.println((i+1) + "번째 학생 이름을 입력해주세요.");
			//ary[i] = scn1.nextLine();
			ary[i] = inPut("학생이름을 입력하세요.");
		}		
	}
	
	public static String inPut(String msg) {
		Scanner scn1 = new Scanner(System.in);
		System.out.println(msg);
		String msg1 = scn1.nextLine();
		
		return msg1;
	}
	
	public static void showStudent(String[] ary) {
		if(ary == null) {
			System.out.println("먼저 학생수를 입력하세요.");
			return;	
		}
		for(int i = 0; i < ary.length; i++) {
			System.out.println((i+1) + "번째 학생: " + ary[i]);
		}
	}
}
