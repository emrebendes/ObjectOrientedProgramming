package Shapes;

public class Demo {

	public static void main(String[] args) {

		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle(new Point(0, 0),3,4);
		Circle c1 = new Circle(new Point(0, 0),3);
		System.out.println(r1.isLargerThan(r2));
		System.out.println(c1.isLargerThan(r2));
		Triangle t = new Triangle();
		

	}

}
