package Run;

import java.util.ArrayList;

public class Student {
	private String bölüm ;
	private int no;
	private String name ,surname;	
	private ArrayList<Lesson> lessons = new ArrayList<>();
	private Boolean izin =false ;

	public Student(String bölüm, int no, String name, String surname) {
		this.bölüm = bölüm;
		this.no = no;
		this.name = name;
		this.surname = surname;
	}
	
	public void printLessons() {
		System.out.println(name+" "+surname+" öðrencisinin dersleri :");
		System.out.println("----------------------------------------------");
		for (Lesson l : this.lessons) {
			l.printLesson();
		}
		
	}
	
	public void registerLesson(Lesson l){
		l.registerStudent(this);
		this.lessons.add(l);
	}
	
	public String getName() {
		if (izin)
			return name;
		else 
			return null;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void printStudent() {
		System.out.println(no+"-"+name+"-"+surname);
	}

	public String getBölüm() {
		return bölüm;
	}

	public void setBölüm(String bölüm) {
		this.bölüm = bölüm;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String insurname) {
		this.surname = surname;
	}
	
	
	
	
}
