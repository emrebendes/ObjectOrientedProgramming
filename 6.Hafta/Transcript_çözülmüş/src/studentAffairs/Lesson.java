package studentAffairs;

import java.util.ArrayList;

public class Lesson {
	private String name;
	private String code;

	private ArrayList<StudentLessons> studentLessons = new ArrayList<>();
	public Lesson(String name, String code) {		
		this.name = name;
		this.code = code;
	}

	public void addStudentLesson(StudentLessons s) {
		studentLessons.add(s);		
	}

	public String getName() {
		return name;
	}
	
	public String getCode() {
		return code;
	}
		
	public void printStudents() {
		System.out.println( name+ " dersini alan öðrencilerin listesi :");
		System.out.println( "-------------------------------------------------------------");
		System.out.println( "Öðrenci No \tÖðrenci Adý\tDönem Sonu Notu");
		System.out.println( "-------------------------------------------------------------");
		for (StudentLessons studentLesson : studentLessons)
			System.out.println( studentLesson.getStudent().getNo() +"\t\t"+studentLesson.getStudent().getName()+"\t\t"+studentLesson.getTermGrede());
		System.out.println( "-------------------------------------------------------------"+"\n");
	}

}
