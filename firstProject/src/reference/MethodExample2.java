package reference;

public class MethodExample2 {
	public static void main(String[] args) {
		sum(24, 55);  // �޼ҵ� ����.
		int a = 45 , b = 77;
		sum(a,b);
		multi(35,88);
		getArea(3.5);
		
		int res = getMax(a,b);
		System.out.println("ū ����: " + res);
		
		double res2 = divide(5,3);
		System.out.println("���� �����: " + res2);
	}
	
	// �� ������ �Է¹޾Ƽ� �� ���� ���� console�� ���.
	public static void sum(int n1, int n2) {
		int sum = n1 + n2;
		System.out.println("�� ���� ��: " + sum);
	}
	
	// �� ������ �Է¹޾Ƽ� �� ���� ���� console�� ���
	public static void multi(int i1, int i2) {
		int mul = i1 * i2;
		System.out.println("�� ���� ��: " + mul);
	}
	
	// ���簢�� �ʺ� ������ִ� �޼ҵ�.
	public static void getArea(double side) {
		double area = side * side;
		System.out.println("���簢���� �ʺ��: " + area);
	}
	
	// �� ���߿��� ū���� ��ȯ���ִ� �޼ҵ�.
	public static int getMax(int num1, int num2) {
		int result = (num1 >= num2) ? num1 : num2;
		return result;
	}
	
	// �� ������ �Է¹޾Ƽ� ù��° �� / �ι�° �� ��� ��ȯ���ִ� �޼ҵ�.
	public static double divide(int a, int b) {
//		double div = (double) a / b;
//		return div;		
		return (double) a / b;
	}
	
}
