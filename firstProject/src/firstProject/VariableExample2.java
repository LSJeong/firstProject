package firstProject;

public class VariableExample2 {

	public static void main(String[] args) {
		// �̸�, ����, ��/����
		int age = 25;
		
		String name = "�̼���";
		int myAge = 29;
		boolean result;
		
		result = age <=  myAge;
		// age < ���� => �̸��� 25�� �̻�.
		if(result) {
			System.out.println(name + "�� "+ age + "�� �̻��Դϴ�.");
		}
		
		result = age >= myAge;
		// age > ���� => �̸��� 25�� ����.
		if(result) {
			System.out.println(name + "�� "+ age + "�� �����Դϴ�.");
		}
		
//		if(result) {
//			System.out.println(name + "�� "+ age + "�� �����Դϴ�.");
//		}
//		else {
//			System.out.println(name + "�� "+ age + "�� �̻��Դϴ�.");
//		}
		
		System.out.println("end of program.");
	}

}
