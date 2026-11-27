package runs;

import java.util.ArrayList;

import studentAffairs.Lesson;
import studentAffairs.Student;

public class Demo {
	public static void main(String[] args) {
		//test amaçlý dersler oluþturalým
		ArrayList<Lesson> lessons = new ArrayList<Lesson>();
		lessons.add(new Lesson("oop    ", "C101"));
		lessons.add(new Lesson("bbg    ", "C101"));
		lessons.add(new Lesson("numerik", "c303"));
		lessons.add(new Lesson("türkçe", "C102"));
		
		//test amaçlý öðrencileri oluþturalým
		ArrayList<Student> students = new ArrayList<Student>();
		students.add(new Student("fernando gordobez", 10));
		students.add(new Student("jennifer lopez", 20));
		students.add(new Student("orhan gencebay", 30));
		students.add(new Student("kahtalý mýçý", 40));
		
		//öðrencilere ders atamalarý yapalým 
		//önemli : öðrenciye ders atarken öðrencininde ders listesine eklenmesini saðlamak lazým !
		students.get(0).addLesson(lessons.get(0),20,30);
		students.get(0).addLesson(lessons.get(1),100,100);
		students.get(1).addLesson(lessons.get(1),25,85);
		students.get(1).addLesson(lessons.get(2),45,69);
		students.get(2).addLesson(lessons.get(2),60,50);
		students.get(3).addLesson(lessons.get(2),80,90);
		students.get(3).addLesson(lessons.get(1),40,70);
		
		//3. ve 1. öðrencinin deslerini ekrana yazdýralým.... 		
		/*students.get(3).printMeans();
		students.get(1).printMeans();*/
		for(Student student: students)
			student.printMeans();
		
		
		/*lessons.get(0).printStudents();
		lessons.get(1).printStudents();
		lessons.get(2).printStudents();*/
		
		//tüm deslerin öðrenci listesini ekrana yazdýralým....
		for(Lesson lesson : lessons)
			lesson.printStudents();
				
	}
}
