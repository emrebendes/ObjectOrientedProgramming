package Shapes;

public class Demo {

	public static void main(String[] args)  {

		Rectangle r1 = new Rectangle();
		System.out.println(r1.getCorner());
		Rectangle r2 ;
		try {
			r2 = (Rectangle) r1.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		r2.getCorner().setX(25);;
		System.out.println(r1.getCorner());
		
		
		
		

	}

}
