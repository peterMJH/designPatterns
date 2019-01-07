package observer;

public class Exec {
	public static void main(String[] args) {
		// �� ��ü�� ���°� �ٲ�� �� ��ü�� �����ϴ� �ٸ� ��ü������ ������ ���� �ڵ����� ������ ���ŵǴ� ������� 1:N �������� �����Ѵ�.
		ScoreRecord scoreRecord = new ScoreRecord();
		DataSheetView dataSheetView = new DataSheetView(scoreRecord, 3);
		MinMaxView minMaxView = new MinMaxView(scoreRecord);
		
		scoreRecord.setDataSheetView(dataSheetView);
		scoreRecord.setMinMaxView(minMaxView);
		
		for (int index = 1; index <= 5; index++) {
			int score = index * 10;
			System.out.println("Adding " + score);
			scoreRecord.addScore(score);
		}
	}
}
