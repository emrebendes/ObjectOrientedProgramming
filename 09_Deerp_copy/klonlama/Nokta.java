package klonlama;

public class Nokta implements Cloneable{
	private int x,y;

	public Nokta(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	protected Object clone() {
		return new Nokta(this.x, this.y);
	}
	
}
