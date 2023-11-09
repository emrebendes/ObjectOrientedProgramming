package test;


public class Rectangle {
	private int x,y,en,boy;
	static public int kalanAlan =800;
	private Rectangle r;
	public Rectangle()
	{
		this(0,0,10,10);
		
	}
	
	public Rectangle(int en,int boy) {
		this(0,0,en,boy);
		
	}
	public Rectangle(int x, int y,int en,int boy) {
		if (kalanAlan>(en*boy)) {
			this.x=x;		
			this.y=y;
			this.en=en;
			this.boy=boy;
			kalanAlan-=alan();
			r =this;
		}else {
			System.out.println("yeterli alan bulunmamakta");
			r=null;
		}
	}
	
	public Rectangle getObject() {
		return r;
	}

	public int alan() {
		return en*boy;
	}
	}