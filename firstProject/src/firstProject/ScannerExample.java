package firstProject;
// firstProject.ScannerExample
import java.util.Scanner;
public class ScannerExample {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("이름을 입력하세요...");
		String name = scn.nextLine(); //Enter
		
		System.out.println("나이를 입력하세요...");
		int age = scn.nextInt(); //nexint ->숫자 하고 Enter키 읽을려면 nextLine 해줘야함
		scn.nextLine();		
		
		System.out.println("취미를 입력하세요...");
		String hobby = scn.nextLine(); //Enter
		
		System.out.println("[입력한 값]");
		System.out.printf("이름: %s, 나이: %d, 취미: %s", name, age, hobby);
	}
}
