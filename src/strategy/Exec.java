package strategy;

public class Exec {
	public static void main(String[] args) {
		// 행위를 클래스로 캡슐화해 동적으로 행위를 자유롭게 바꿀 수 있게 해주는 패턴
		Duck mallard = new MallardDuck();
		Duck lover = new LoverDuck();
		
		mallard.display();
		mallard.performFly();
		mallard.performQuack();
		
		lover.display();
		lover.performFly();
		lover.performQuack();
		
		lover.setFlyBehavior(new FlyWithWings());
		lover.setQuackBehavior(new Quack());
		
		System.out.println("change Behavior");
		lover.performFly();
		lover.performQuack();
	}
}
