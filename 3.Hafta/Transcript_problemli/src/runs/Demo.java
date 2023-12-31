package runs;

import java.util.ArrayList;

import studentAffairs.Lesson;
import studentAffairs.Student;

public class Demo {
	public static void main(String[] args) {
		//test ama�l� dersler olu�tural�m
		ArrayList<Lesson> lessons = new ArrayList<Lesson>();
		lessons.add(new Lesson("oop    ", "C101"));
		lessons.add(new Lesson("bbg    ", "C101"));
		lessons.add(new Lesson("numerik", "c303"));
		lessons.add(new Lesson("t�rk�e", "C102"));
		
		//test ama�l� ��rencileri olu�tural�m
		ArrayList<Student> students = new ArrayList<Student>();
		students.add(new Student("ali", 10));
		students.add(new Student("veli", 20));
		students.add(new Student("orhan gencebay", 30));
		students.add(new Student("kahtal� m���", 40));
		
		//��rencilere ders atamalar� yapal�m 
		//�nemli : ��renciye ders atarken ��rencininde ders listesine eklenmesini sa�lamak laz�m !
		students.get(0).addLesson(lessons.get(0),20,30);
		students.get(0).addLesson(lessons.get(1),100,100);
		students.get(1).addLesson(lessons.get(1),25,85);
		students.get(1).addLesson(lessons.get(2),45,69);
		students.get(2).addLesson(lessons.get(2),50,50);
		students.get(3).addLesson(lessons.get(2),80,80);
		students.get(3).addLesson(lessons.get(1),70,70);
		
		//3. ve 1. ��rencinin deslerini ekrana yazd�ral�m.... 		
		students.get(3).printMeans();
		students.get(1).printMeans();
		
		/*lessons.get(0).printStudents();
		lessons.get(1).printStudents();
		lessons.get(2).printStudents();*/
		
		//t�m deslerin ��renci listesini ekrana yazd�ral�m....
		for(Lesson lesson : lessons)
			lesson.printStudents();
				
	}
}
