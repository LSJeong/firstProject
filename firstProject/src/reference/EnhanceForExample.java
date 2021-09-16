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
		System.out.println("====�ٽ�====");
		
		
		// Enhanced for
		for(String name : strAry) {    // �迭 ũ�⸸ŭ
			System.out.println(name);
		}
		
		int[] scores = {50 , 70, 80, 60};
		int sum = 0;
		for(int score : scores) {  // int Ÿ��
			sum += score;
		}
		
		// �л� 3��, 4.2, 3.5, 2.8
		double[] dbscores = {4.2, 3.5, 2.8, 3.7};
		// �հ踦 ��� ���� ����
		// ��� ����ؼ� avg
		// �л����: ���
		double dbsum = 0;
		for(double dbscore : dbscores) {    // �迭 ũ�⸸ŭ
			dbsum += dbscore;
		}
		System.out.println("�л����: " + dbsum/dbscores.length );
	}
}
