package reference;

public class MethodExample5 {
	public static void main(String[] args) {
		int[] scores = { 88, 67, 92, 73, 58 };

		// �ּҰ��� ���ϴ� �ڵ�
		int minVal = 100;
		boolean isTrue = false;
		for (int i = 0; i < scores.length; i++) {
			isTrue = minVal > scores[i];
			if (isTrue) {
				minVal = scores[i];
			}
		}
		System.out.println("�ּҰ�: " + minVal);
		System.out.println("��1.");

		minVal = 100;
		int[] anotherAry = { 55, 82, 34, 19, 47, 89 };
		minVal = getMinValue(anotherAry);
		System.out.println("�ּҰ�: " + minVal);
		System.out.println("��2.");

	}

	public static int getMinValue(int[] ary) {
		int minVal = 100;
		boolean isTrue = false;
		for (int i = 0; i < ary.length; i++) {
			isTrue = minVal > ary[i];
			if (isTrue) {
				minVal = ary[i];
			}
		}
		return minVal;
	}
}
