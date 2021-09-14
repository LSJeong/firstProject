package firstProject;

public class DoubleExample {
	public static void main(String[] args) {
		// double(8byte), float(4byte)
		double d1 = 3.1;
		double d2 = 6.9;
		
		float f1 = 3.2f; // 기본 double타입으로 인식, f(F) 붙여줘야함
		
		double r1 = d1 + d2;
		System.out.println(r1);
		
		System.out.println(Double.MAX_VALUE);
		
		d1 = d2 = 2.3;
		
		boolean isSame = d1 == d2;
		System.out.println(isSame);
		
		String s1 = "Hello";
		String s2 = new String("Hello");
		
		isSame = s1.equals(s2); // 문자열은  s1 == s2 사용 x , equals 써야함
		System.out.println(isSame);
	}
}