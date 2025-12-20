package p1;

public class Rectangle extends Shape implements Comparable{
	private int w,h;
	private Rectangle() {
		super(new Point(0,0));
	}	
	
	private Rectangle(Point pinPoint) {
		super(pinPoint);
	}
	
	public Rectangle(Point pinPoint,int w,int h) {
		this(pinPoint);
		this.h = h;
		this.w = w;		
	}
	public Rectangle(int w,int h) {
		this();
		this.h = h;
		this.w = w;		
	}
	
	public int getArea() {
		return w*h;
	}

	@Override
	public boolean compare(Comparable c) {
		if (c.getArea()==this.getArea())
			return true;
		else		
			return false;
	}

	@Override
	public boolean isLargerThan(Comparable c) {
		if (c.getArea()>this.getArea())
			return true;
		else		
			return false;
	}

}
