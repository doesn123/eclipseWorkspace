
abstract public class GraphicObject {
	int x;
	int y;
	public void moveTo() {
		System.out.println("move x: " + x, "move y: " + y);
	}
	
	abstract void resize();
	abstract void reposition();
}
