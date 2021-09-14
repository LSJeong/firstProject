package firstProject;

public class VariableExample2 {

	public static void main(String[] args) {
		// 이름, 나이, 참/거짓
		int age = 25;
		
		String name = "이소정";
		int myAge = 29;
		boolean result;
		
		result = age <=  myAge;
		// age < 나이 => 이름은 25세 이상.
		if(result) {
			System.out.println(name + "은 "+ age + "세 이상입니다.");
		}
		
		result = age >= myAge;
		// age > 나이 => 이름은 25세 이하.
		if(result) {
			System.out.println(name + "은 "+ age + "세 이하입니다.");
		}
		
//		if(result) {
//			System.out.println(name + "은 "+ age + "세 이하입니다.");
//		}
//		else {
//			System.out.println(name + "은 "+ age + "세 이상입니다.");
//		}
		
		System.out.println("end of program.");
	}

}
