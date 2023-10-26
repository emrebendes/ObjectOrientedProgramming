package runs;

import java.util.ArrayList;

import studentAffairs.Lesson;
import studentAffairs.Student;

public class Demo {
	public static void main(String[] args) {
		
		ArrayList<Lesson> lessons = new ArrayList<Lesson>();
		lessons.add(new Lesson("oop    ", "C101"));
		lessons.add(new Lesson("oop    ", "C101"));
		lessons.add(new Lesson("numerik", "c303"));
		lessons.add(new Lesson("türkçe", "C102"));
		lessons.add(new Lesson("matematik", "C103"));
		
		ArrayList<Student> students = new ArrayList<Student>();
		students.add(new Student("ali", 10));
		students.add(new Student("veli", 20));
		students.add(new Student("orhan gencebay", 30));
		students.add(new Student("kahtalı mıçı", 40));
		
		
		students.get(0).addLesson(lessons.get(0),20,30);
		students.get(0).addLesson(lessons.get(1),100,100);
		students.get(1).addLesson(lessons.get(1),25,85);
		students.get(1).addLesson(lessons.get(2),45,69);
		students.get(2).addLesson(lessons.get(2),50,50);
		students.get(3).addLesson(lessons.get(2),80,80);
		students.get(3).addLesson(lessons.get(1),70,70);
		
				
		students.get(3).printMeans();
		students.get(1).printMeans();
		
		lessons.get(0).printStudents();
		lessons.get(1).printStudents();
		lessons.get(2).printStudents();
		
		
	}
}
