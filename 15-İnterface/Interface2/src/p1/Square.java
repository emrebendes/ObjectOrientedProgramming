package p1;

public class Square extends Shape implements Comparable{
	private int h;
	private Square() {
		super(new Point(0,0));
	}	
	
	private Square(Point pinPoint) {
		super(pinPoint);
	}
	
	public Square(Point pinPoint,int w,int h) {
		this(pinPoint);
		this.h = h;
	
	}
	public Square(int h) {
		this();
		this.h = h;
		
	}
	@Override
	public boolean compare(Comparable c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getArea() {
		// TODO Auto-generated method stub
		return h*h;
	}

	@Override
	public boolean isLargerThan(Comparable c) {
		// TODO Auto-generated method stub
		return false;
	}

}
