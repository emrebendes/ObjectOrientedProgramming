package sn;

public class IdGenerator {
	private static IdGenerator ig;
	private int id=100;
	
	private IdGenerator(){}
	
	public static IdGenerator getInstance() {
		if (ig==null)
			ig = new IdGenerator();
		return ig;
	}
	public int generateNumber() {
		return id++;
	}

}
