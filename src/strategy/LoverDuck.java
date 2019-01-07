package strategy;

public class LoverDuck extends Duck {

	public LoverDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new MuteQuack();
	}
	
	@Override
	void display() {
		System.out.println("I'm LoverDuck");
	}
	
}
