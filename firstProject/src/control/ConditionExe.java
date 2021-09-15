package control;

public class ConditionExe {
	public static void main(String[] args) {
		// 두 정수 60, 70
		// 두 수를 합한 결과가 100점 넘어서면 합격, 불합격
		// 끝. 출력

		int score = 60;
		int score2 = 70;
		int total = score + score2;

		if (total > 100) {
			System.out.println("합격입니다.");
		} else {
			System.out.println("불합격입니다.");
		}

		System.out.println("끝.\n");

		// 두수를 곱해서 짝수이면 짝수, 홀수이면 홀수
		// 두번째 끝.
		int total2 = score * score2;

		if (total2 % 2 == 1) {
			System.out.println("홀수입니다.");
		} else {
			System.out.println("짝수입니다.");
		}

		System.out.println("2번째 끝.\n");

		// 새로운변수 4
		// 2의 배수이면 2의 배수, 3의 배수이면 3의 배수
		// 2와 3의 배수입니다.
		int score3 = 12;

		if (score3 % 2 == 0 && score3 % 3 == 0) {
			System.out.println("2와 3의 배수입니다.");
		} else if (score3 % 2 == 0) {
			System.out.println("2의 배수입니다.");
		} else if (score3 % 3 == 0) {
			System.out.println("3의 배수입니다.");
		}

		System.out.println("3번째 끝.\n");

		// ctl+shitf+f : 정렬
		
		// 1~6 사이의 값
		int randomValue = (int) (Math.random() * 6) + 1; 
		System.out.println(randomValue);
		
		//switch 조건문 -> 1이 나왔습니다
		
		switch(randomValue) {
		case 1:
			System.out.println("1이 나왔습니다.");
			break;
		case 2:
			System.out.println("2가 나왔습니다.");
			break;
		case 3:
			System.out.println("3이 나왔습니다.");
			break;
		case 4:
			System.out.println("4가 나왔습니다.");
			break;
		case 5:
			System.out.println("5가 나왔습니다.");
			break;
		case 6:
			System.out.println("6이 나왔습니다.");
			break;
		}
		
		System.out.println("4번쨰 끝. \n");
		
		
		//0~99점사이의 값
		int randomScore = (int)(Math.random()*100);
		System.out.println(randomScore + "점");
		if(randomScore >= 90) {
			System.out.println("A학점입니다.");
		}else if(randomScore >= 80) {
			System.out.println("B학점입니다.");
		}else if(randomScore >= 70) {
			System.out.println("C학점입니다.");
		}else if(randomScore >= 60) {
			System.out.println("D학점입니다.");
		}else{
			System.out.println("F학점입니다.");
		}
		System.out.println("5번째 끝. \n");
		
		
		int randomScore2 = (int)(Math.random()*100);
		System.out.println(randomScore2 + "점");
		randomScore2 /= 10;
		switch(randomScore2) {
		case 9:
			System.out.println("A학점입니다.");
			break;
		case 8:
			System.out.println("B학점입니다.");
			break;
		case 7:
			System.out.println("C학점입니다.");
			break;
		case 6:
			System.out.println("D학점입니다.");
			break;
		default:
			System.out.println("F학점입니다.");
		}
		
	}
}
