package decorator;

public class Exec {
	public static void main(String[] args) {
		// ��ü�� �������� ����� �������� �����ϰ� Ȯ�� �� �� �ְ� ���ִ� ����
		Display road = new RoadDisplay();
		road.draw();
		System.out.println();
		Display roadWithLane = new LaneDecorator(new RoadDisplay());
		roadWithLane.draw();
		System.out.println();
		Display roadWithTraffic = new LaneDecorator(new TrafficDecorator(new RoadDisplay()));
		roadWithTraffic.draw();
	}
}
