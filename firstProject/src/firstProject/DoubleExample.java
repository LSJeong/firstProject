package firstProject;

public class DoubleExample {
	public static void main(String[] args) {
		// double(8byte), float(4byte)
		double d1 = 3.1;
		double d2 = 6.9;
		
		float f1 = 3.2f; // �⺻ doubleŸ������ �ν�, f(F) �ٿ������
		
		double r1 = d1 + d2;
		System.out.println(r1);
		
		System.out.println(Double.MAX_VALUE);
		
		d1 = d2 = 2.3;
		
		boolean isSame = d1 == d2;
		System.out.println(isSame);
		
		String s1 = "Hello";
		String s2 = new String("Hello");
		
		isSame = s1.equals(s2); // ���ڿ���  s1 == s2 ��� x , equals �����
		System.out.println(isSame);
	}
}