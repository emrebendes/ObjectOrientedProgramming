package studentAffairs;

import java.util.ArrayList;

public class Student {
	private String name;
	private int no;
	//Dersler
	public ArrayList<StudentLessons> studentLessons = new ArrayList<>();
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
		StudentLessons sl = new StudentLessons(this, l, 0, 0);
		l.addStudentLesson(sl);
		studentLessons.add(sl);
	}
	public void addLesson(Lesson l, int v, int f) {
		StudentLessons sl = new StudentLessons(this, l, v , f);
		l.addStudentLesson(sl);
		studentLessons.add(sl);
	}
	public void printMeans() {
		System.out.println( name+ " öðrencisi ders bilgileri:");
		System.out.println( "-------------------------------------------------------------");
		System.out.println( "Ders adý \tvize\tfinal\tdönem sonu notu");
		System.out.println( "-------------------------------------------------------------");
		for (StudentLessons lesson : studentLessons) {
			System.out.println(lesson.getLesson().getName()+" \t"+lesson.getMidtermGrade()+" \t"+lesson.getFinalGrade()+" \t"+lesson.getTermGrede());			
		}
		System.out.println( "-------------------------------------------------------------"+"\n");
	}


}
