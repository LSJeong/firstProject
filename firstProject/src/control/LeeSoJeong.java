package control;

import java.util.Scanner;

public class LeeSoJeong {
	public static void main(String[] args) {
		//if, for(while) break, continue
		
		int ran = (int)(Math.random() * 44) + 1;
		int cnt = 0;
		
		System.out.println("====숫자 맞히기====");
		System.out.println("1~45 사이의 숫자를 입력하세요.");
		
		while(true) {
			Scanner scn = new Scanner(System.in);
			cnt++;
			int num2 = scn.nextInt();
			if (num2 == ran) {
				System.out.println("정답입니다!");				
				break;
			}else if(num2 > ran) {
				System.out.println("정답보다 큽니다.");
				System.out.println("더 작은 수를 입력하세요.");
				continue;
			}else if(num2 < ran) {
				System.out.println("정답보다 작습니다.");
				System.out.println("더 큰 수를 입력하세요.");
				continue;
			}			
		}
		System.out.println("정답: " + ran);
		System.out.println(cnt + "번만에 성공하셨습니다. ");
	}
}
