package firstProject;

import java.util.Scanner;

public class LeeSoJeong {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("이름을 입력하세요 >> ");
		String name = scn.nextLine();
		
		System.out.println("나이를 입력하세요 >> ");
		String age = scn.nextLine();
		if(age.equals("")) {
			age = "0";
		}
		int ageInt = Integer.parseInt(age); 
				
		System.out.println("국어 점수를 입력하세요 >> ");
		int konum = scn.nextInt();
		
		System.out.println("수학 점수를 입력하세요 >> ");
		int mtnum = scn.nextInt();
		
		System.out.println("[입력한 내용]");
		System.out.printf("이름:%s\t 나이:%d\t 국어점수:%d\t 수학점수:%d\n", name, ageInt, konum, mtnum);
		
		double avg = (double)(konum+mtnum)/2;
		
		if(avg > 60) {
			System.out.printf("평균 %f으로 합격입니다. \n", avg );
		}else {
			System.out.printf("평균 %f으로 탈락입니다. 더 노력하세요. \n", avg );
		}
		
		System.out.println("끝. ");
		
	}
}
