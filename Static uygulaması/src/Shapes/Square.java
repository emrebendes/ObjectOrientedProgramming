package Shapes;

public class Square {
	private int length;
	static int freeArea = 15;

	public Square(int length) throws Exception {		
		this.length = length;
		if (this.getField()>freeArea)
			throw new Exception("yeterli alan yok");
		else
			freeArea-=this.getField();
		
	}
	
	public int getField() {
		return length*length;
	}
	
	

}
