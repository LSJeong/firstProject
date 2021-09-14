package firstProject;
import java.util.Scanner;
public class ScannerExample3 {
	public static void main(String[] args) {
		// 영어점수입력
		// 수학점수입력
		// 이름입력
		// 홍길동님의 영어, 수학점수의 합은 ?, 평균은 ? 입니다.
		// 합계 점수가 120점 이상 합격
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("영어 점수를 입력하세요..");
		int egnum = scn.nextInt();
		scn.nextLine();
		
		System.out.println("수학 점수를 입력하세요..");
		int mtnum = scn.nextInt();
		scn.nextLine();
		
		System.out.println("이름을 입력하세요..");
		String name = scn.nextLine();
		
		int total = egnum + mtnum;
		int avg = (egnum + mtnum)/2;
		
		System.out.printf("%s의 영어, 수학 점수의 합은 %d, 평균은 %d 입니다.", name, total, avg);
		System.out.println();
		
		if(total >= 120) {
			System.out.println(name + "님은 합격입니다.");
		}else {
			System.out.println(name + "님은 불합격입니다.");
		}
		
	}
}
