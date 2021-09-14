package firstProject;
import java.util.Scanner;
public class ScannerExample2 {
	public static void main(String[] args) {
		// 변수: 사용자 입력(10, 20)
		// 10 + 20 = 30 화면 출력
		Scanner scn = new Scanner(System.in);
		
		System.out.println("첫번째 값을 입력하세요..");		
		int num1 = scn.nextInt();
		scn.nextLine();
		
		System.out.println("두번째 값을 입력하세요..");
		int num2 = scn.nextInt();
		scn.nextLine();
		
		System.out.printf("%d + %d = %d",num1,num2,num1+num2);
		
	}
}
