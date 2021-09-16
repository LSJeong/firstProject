package reference;

public class MethodExample4 {
	public static void main(String[] args) {
		int[] scores = {88,67,92,73,58};
		
		// 최대값 구하기.
		int maxVal = 0;
		boolean isTrue = false;		
		
		for (int i = 0; i < scores.length; i++) {
			isTrue = maxVal < scores[i];
			if (isTrue) {
				maxVal = scores[i];
			}
		}
		System.out.println("최대값: " + maxVal);
		System.out.println("끝1.");
		
//		isTrue = maxVal < scores[0];
//		if(isTrue) {
//			maxVal = scores[0];
//		}
//		System.out.println(maxVal);
//		
//		isTrue = maxVal < scores[1];
//		if(isTrue) {
//			maxVal = scores[1];
//		}
//		System.out.println(maxVal);
//		
//		isTrue = maxVal < scores[2];
//		if(isTrue) {
//			maxVal = scores[2];
//		}
//		System.out.println(maxVal);
		
		int[] anotherAry = {55, 82, 34, 19, 47, 89};
		maxVal = getMaxValue(anotherAry);
		System.out.println("최대값: " + maxVal);
		System.out.println("끝2.");
	}
	
	public static int getMaxValue(int[] ary) {
		int maxVal = 0;
		boolean isTrue = false;		
		
		for (int i = 0; i < ary.length; i++) {
			isTrue = maxVal < ary[i];
			if (isTrue) {
				maxVal = ary[i];
			}
		}
		return maxVal;
	}
}
