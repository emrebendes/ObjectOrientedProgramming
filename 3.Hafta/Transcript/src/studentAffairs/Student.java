package studentAffairs;

import java.util.ArrayList;

public class Student {
	private String name;
	private int no;
	//Dersler
	public ArrayList<Lesson> lessons = new ArrayList<Lesson>();
	public Student(String name, int no) {
		super();
		this.name = name;
		this.no = no;
	}
	
	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void addLesson(Lesson l) {
		l.addStudent(this);
		lessons.add(l);
	}
	public void addLesson(Lesson l, int n1, int n2) {
		l.setN1(n1);
		l.setN2(n2);
		l.addStudent(this);
		lessons.add(l);
	}	
	
	public void printMeans() {
		System.out.println( name+ " öðrencisi ders bilgileri:.");
		System.out.println( "-------------------------------------------------------------");
		System.out.println( "Ders adý \tvize\tfinal\tdönem sonu notu");
		System.out.println( "-------------------------------------------------------------");
		for (Lesson lesson : lessons) {
			System.out.println(lesson.getName()+" \t"+lesson.getN1()+" \t"+lesson.getN2()+" \t"+lesson.getOrt());			
		}
		System.out.println( "-------------------------------------------------------------"+"\n");
	}
}
