package Run;

import java.util.ArrayList;

public class Lesson {
	private String name ;
	private int id ;
	private byte credit ;
	private ArrayList<Student> students = new ArrayList<>();
	public Lesson(String name, int id, byte credit) {
		this.name = name;
		this.id = id;
		this.credit = credit;
	}
	public void registerStudent(Student s) {
		students.add(s);
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public byte getCredit() {
		return credit;
	}
	public void setCredit(byte credit) {
		this.credit = credit;
	}
	public void printLesson() {
		System.out.println(this.id+"-"+this.name);
	}
	
	public void printStudentList() {
		System.out.println(name+" dersini alan öðreci listesi");
		System.out.println("--------------------------------------");
		for (Student s : this.students) {
			s.printStudent();
		}
	}
	
}
