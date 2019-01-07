package observer;

public class Exec {
	public static void main(String[] args) {
		// 한 객체의 상태가 바뀌면 그 객체에 의존하는 다른 객체들한테 연락이 가고 자동으로 내용이 갱신되는 방식으로 1:N 의존성을 정의한다.
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
