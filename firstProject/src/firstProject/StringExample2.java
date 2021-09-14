package firstProject;

public class StringExample2 {
	public static void main(String[] args) {
		String name = "이소정";
		int age = 25;
		
		//이름은 이소정, 나이는 25
		System.out.println("이름은 " +name+", 나이는 "+age);
		System.out.printf("이름은 %s, 나이는 %d", name, age);
		System.out.println();
		System.out.println();
		
		
		
		byte b1 = -90;
		byte b2 = 10;
		
		//result = b1, b2의 합
		//100 + 10 = 110 콘솔 출력
		int result = b1 + b2;
		System.out.println(b1 + " + " + b2 + " = " + result);
		
		//참,거짓 isLarger .. result > 0 .. 
		boolean isLarger = result > 0;
		
		if(isLarger) {
			System.out.println("0보다 큽니다.(양수입니다)");
		}else {
			System.out.println("0보다 작습니다.(음수입니다)");
		}
		
		
		// long 2200000000, 120, 16
		// long 2200000000, 78, 8
		// avg에 담아라
		// 120을 16으로 나눈 결과: 7.5
		long num1 = 2200000000L;
		int num2 = 120;
		double num3 = 16;
		
		double avg = num2 / num3;
		double avg1 = (num1+num2+num3) / 3;
		
		System.out.println(num2 + "을 " + num3 + "로 나눈 결과: " + avg);
		System.out.println("평균 결과: " + avg1);
		
		
		
	}
}
