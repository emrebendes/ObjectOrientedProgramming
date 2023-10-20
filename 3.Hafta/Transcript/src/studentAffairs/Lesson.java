package studentAffairs;

public class Lesson {
	private String name;
	private String code;
	private int n1,n2,ort;
	public Lesson(String name, String code, int n1, int n2) {
		
		this.name = name;
		this.code = code;
		this.n1 = n1;
		this.n2 = n2;
		this.ort = (int)(n1*0.4+n2*0.6);
	}
	public int getN1() {
		return n1;
	}
	public void setN1(int n1) {
		this.n1 = n1;
		ort = (int)(n1*0.4+n2*0.6);
	}
	public int getN2() {
		return n2;
	}
	public void setN2(int n2) {
		this.n2 = n2;
		ort = (int)(n1*0.4+n2*0.6);
	}
	public String getName() {
		return name;
	}
	public String getCode() {
		return code;
	}
	public int getOrt() {
		return ort;
	}
	

}
