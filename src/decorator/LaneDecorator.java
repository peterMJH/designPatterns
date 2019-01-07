package decorator;

public class LaneDecorator extends DisplayDecorator {
	
	public LaneDecorator(Display decoratedDisplay) { 
		super(decoratedDisplay); 
	}
	
	@Override
	public void draw() {
		super.draw();
		drawLane();
	}
	
	private void drawLane() { 
		System.out.println("Draw Lane"); 
	}
}
