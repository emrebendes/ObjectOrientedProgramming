package sn;

public class Student {
	private String name,surmane;
	private int id;
	
	
	public Student(String name, String surmane) {
		super();
		this.name = name;
		this.surmane = surmane;
		this.id = IdGenerator.getInstance().generateNumber();
	}
	public String getName() {
		return name;
	}
	public String getSurmane() {
		return surmane;
	}
	public int getId() {
		return id;
	}
	

}
