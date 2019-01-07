package decorator;

public class Exec {
	public static void main(String[] args) {
		// 객체의 결합으로 기능을 동적으로 유연하게 확장 할 수 있게 해주는 패턴
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
