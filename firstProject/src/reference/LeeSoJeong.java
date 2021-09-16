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
			int choice = read("번호를 선택하세요>>");
			
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
		
		System.out.println("끝.");
		

//
//		System.out.println("[입력한 내용]");
//		//System.out.printf("이름:%s\t 국어점수:%d\t 수학점수:%d\n", name, konum, mtnum);
//
//		double avg = (double) (konum + mtnum) / 2;
//
//		if (avg > 60) {
//			System.out.printf("평균 %f으로 합격입니다. \n", avg);
//		} else {
//			System.out.printf("평균 %f으로 탈락입니다. 더 노력하세요. \n", avg);
//		}
	}
	
	public static void showMenu() {
		System.out.println("1.학생 수 입력 2.학생 점수 입력 3.전체보기 4.평균 5.종료");
	}
	
	public static int createStudent() {
		int cnt = read("학생수를 입력하세요.");
		return cnt;
	}
	
	public static void inputValue(String[] ary, int[] ary1, int[] ary2) {
		if(ary == null) {
			System.out.println("다시 선택하세요.");
			return;	
		}
		
		
		for(int i=0;i<ary.length;i++) {
			Scanner scn = new Scanner(System.in);
		    System.out.println((i+1) + "번째 학생 이름을 입력해주세요. ");
			ary[i] = scn.nextLine();
			ary1[i] = read("학생 국어점수를 입력하세요.");
			ary2[i] = read("학생 수학점수를 입력하세요.");
		}
	}
	
	public static int read(String a) {
		Scanner scn = new Scanner(System.in);
		System.out.println(a);
		int num = scn.nextInt();
		
		return num;
	}
}
