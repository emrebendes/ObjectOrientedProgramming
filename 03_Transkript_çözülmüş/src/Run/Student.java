package Run;

import java.util.ArrayList;

public class Student {
	private String name,surname;
	private int no;
	private String bölüm ;
	private ArrayList<Grades> grades = new ArrayList<>();
	private Boolean izin =false;
	
	public Student(String name, String surname, int no, String bölüm) {
		super();
		this.name = name;
		this.surname = surname;
		this.no = no;
		this.bölüm = bölüm;
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

	public String getBölüm() {
		return bölüm;
	}

	public void setBölüm(String bölüm) {
		this.bölüm = bölüm;
	}

	public void printStudent() {
		System.out.println(no+"-"+name+"-"+surname);
	}
	
	public void printLessonsList() {
		System.out.println(name+" öðrencisinin dersleri:\tvize    final");
		System.out.println("----------------------------");
		for (Grades g : grades) {
			g.printLesson();
		}
		
	}
	
}
