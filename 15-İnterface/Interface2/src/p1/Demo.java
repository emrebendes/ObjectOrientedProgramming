package p1;

public class Demo {

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(10, 20);
		Square s1 = new Square(25);
		r1.compare(s1);
		
		class Yerel implements Comparable {

			@Override
			public boolean compare(Comparable c) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public int getArea() {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public boolean isLargerThan(Comparable c) {
				// TODO Auto-generated method stub
				return false;
			}
			
		} 		
		Yerel yerel = new Yerel();
		
		
		Comparable c1 = new Comparable() {
			
			@Override
			public boolean isLargerThan(Comparable c) {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public int getArea() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public boolean compare(Comparable c) {
				// TODO Auto-generated method stub
				return false;
			}
		};
		
		c1.compare(r1);
		yerel.compare(s1);

	}

}
