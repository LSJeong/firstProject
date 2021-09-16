package reference;

public class EnhanceForExample {
	public static void main(String[] args) {
		String[] strAry = null;
		strAry = new String[5]; // null, null, null, null, null
		strAry = new String[] { "Hong", "Park", "Choi", "Kim", "Hwan" };
		System.out.println(strAry.length);

		strAry[2] = "Hong"; // ==, equlas()

		for (int i = 0; i < strAry.length; i++) {
			if(strAry[i].equals("Hong")) {
				System.out.println(strAry[i]);
			}
		}
		System.out.println("====다시====");
		
		
		// Enhanced for
		for(String name : strAry) {    // 배열 크기만큼
			System.out.println(name);
		}
		
		int[] scores = {50 , 70, 80, 60};
		int sum = 0;
		for(int score : scores) {  // int 타입
			sum += score;
		}
		
		// 학생 3명, 4.2, 3.5, 2.8
		double[] dbscores = {4.2, 3.5, 2.8, 3.7};
		// 합계를 담는 변수 선언
		// 평균 계산해서 avg
		// 학생평균: 출력
		double dbsum = 0;
		for(double dbscore : dbscores) {    // 배열 크기만큼
			dbsum += dbscore;
		}
		System.out.println("학생평균: " + dbsum/dbscores.length );
	}
}
