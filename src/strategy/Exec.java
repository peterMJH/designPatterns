package strategy;

public class Exec {
	public static void main(String[] args) {
		// ������ Ŭ������ ĸ��ȭ�� �������� ������ �����Ӱ� �ٲ� �� �ְ� ���ִ� ����
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
