package firstProject;

public class StringExample {
	//byte < short < int < long < float < double
	public static void main(String[] args) {
		int age = 20;
		String name = "ȫ�浿";
		
		long myAge = age; // �ڵ�����ȯ(promotion)
		age = (int) myAge; // ��������ȯ(casting) 
	
//		age = "ȫ�浿";
//		name = 20;
		
		System.out.println(name + "�� ���̴� " + age);
		
		String name1 = "�̼���";
		int age2 = 29;
		
		System.out.println(name1 + "�� ���̴� " + age2 + "�Դϴ�.");
	}
}