package trycatch;

public class Test {
	public int calculate(int x,int y) {
		dosomething();
		return x/y;
	}
	
	public void dosomething() {
		throw new ArrayIndexOutOfBoundsException();
		
	}
}
