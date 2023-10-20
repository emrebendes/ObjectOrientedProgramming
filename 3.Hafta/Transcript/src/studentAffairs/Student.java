package studentAffairs;

import java.util.ArrayList;

public class Student {
	String name;
	int no;
	//Dersler
	public ArrayList<Lesson> lessons = new ArrayList<Lesson>();
	public Student(String name, int no) {
		super();
		this.name = name;
		this.no = no;

	}
	
	public void addLesson(Lesson l) {
		lessons.add(l);
	}
	
	public void printMeans() {
		for (Lesson lesson : lessons) {
			System.out.print(name+" isimli öðrencinin "+lesson.getName()+" isimli dersinin notu :");
			System.out.println(lesson.getOrt());
		}
	}
}
