package Run;

import java.util.ArrayList;

public class Student {
	private String name,surname;
	private int no;
	private String b�l�m ;
	private ArrayList<Grades> grades = new ArrayList<>();
	private Boolean izin =false;
	
	public Student(String name, String surname, int no, String b�l�m) {
		super();
		this.name = name;
		this.surname = surname;
		this.no = no;
		this.b�l�m = b�l�m;
	}		
	public String getName() {
		
			return name;
		
	}
		
	public ArrayList<Grades> getGrades() {
		return grades;
	}

	public void setName(String name) {
		this.name =name;
	}
		
	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getB�l�m() {
		return b�l�m;
	}

	public void setB�l�m(String b�l�m) {
		this.b�l�m = b�l�m;
	}

	public void printStudent() {
		System.out.println(no+"-"+name+"-"+surname);
	}
	
	public void printLessonsList() {
		System.out.println(name+" ��rencisinin dersleri:\tvize    final");
		System.out.println("----------------------------");
		for (Grades g : grades) {
			g.printLesson();
		}
		
	}
	
}
