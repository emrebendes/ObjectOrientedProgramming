package Shapes;

public class Rectangle implements Relatable{
	private Point corner;
	private int widht,height;
	public Rectangle() {
		corner = new Point(0, 0);
		height = 1;
		widht = 1;
	}
	public Rectangle(Point corner, int widht, int height) {
		super();
		this.corner = corner;
		this.widht = widht;
		this.height = height;
	}
	public Point getCorner() {
		return corner;
	}
	public int getWidht() {
		return widht;
	}
	public int getHeight() {
		return height;
	}
	
	public boolean isLargerThan(Relatable r) {
		Rectangle rec = (Rectangle) r;
		if (this.height*this.widht<rec.height*rec.widht)
			return false;
		else 
			return true;
	}
	
	
	
}
