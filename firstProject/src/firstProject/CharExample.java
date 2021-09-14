package firstProject;

public class CharExample {
	public static void main(String[] args) {
		// int, String, boolean, char
		// byte(1byte) < char, short(2byte) < int(4byte) < long(8byte)
		char myFirstCharType = 97;
		
		System.out.println(myFirstCharType);
		
		byte b1 = 10; // 1byte(8bit) || 
		// 0 0 0 0 0 0 0 0 => 1byte
		// 2^1 2^2 ... 2^8 => 256가지(-128 ~ 127)
		
		b1 = 127;
		b1++; // -128
		System.out.println(b1);
		
		short s1 = 0;
		
		// short -32768 ~ 32767
		
		//연산자가 기본 int 타입으로 계산하기 때문에 오류발생, short로 강제 형변환 해줘야함
		short result = (short)(b1 + s1);  // -128 + 0
		
		int result1 = b1 + s1;
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Short.MAX_VALUE);
		
		long fakeLong = 2147483648L; 
		
	}
}
