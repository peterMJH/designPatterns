package observer;

import java.util.List;

public class DataSheetView {
	private ScoreRecord scoreRecord;
	private int viewCount;
	
	public DataSheetView(ScoreRecord scoreRecord, int viewCount) {
		this.scoreRecord = scoreRecord;
		this.viewCount = viewCount;
	}
	
	public void update() {
		List<Integer> records = scoreRecord.getScoreRecord();
		displayScores(records, viewCount);
	}
	
	private void displayScores(List<Integer> records, int viewCount) {
		System.out.println("List of " + viewCount + "entries: ");
		for (Integer record : records) {
			System.out.println(record + " ");
		}
		System.out.println();
	}
}
