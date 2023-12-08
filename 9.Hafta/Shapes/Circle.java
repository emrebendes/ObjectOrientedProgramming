package Shapes;

public class Circle implements Relatable{
	private Point center;
	private int r;
	
	
	public Circle(Point center, int r) {
		super();
		this.center = center;
		this.r = r;
	}


	public Point getCenter() {
		return center;
	}


	public int getR() {
		return r;
	}


	@Override
	public boolean isLargerThan(Relatable r) {
		Circle c = (Circle) r ;
		if (Math.PI*Math.pow(this.r, 2)<Math.PI*Math.pow(c.r, 2))
			return false;
		else
			return true;
	}
	
}
