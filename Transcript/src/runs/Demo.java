package runs;

import studentAffairs.Lesson;
import studentAffairs.Student;

public class Demo {
	public static void main(String[] args) {
		Lesson OOP =new Lesson("oop", "C101", 0, 0);
		Lesson numeric = new Lesson("numerik analiz", "c303", 0, 0);
		
		Student ali = new Student("ali", 10);
		ali.addLesson(numeric);
		ali.lessons.get(0).setN1(50);
		ali.lessons.get(0).setN2(100);
		ali.addLesson(new Lesson("türkçe", "C102", 20, 30));
		Student ayse = new Student("ayþe", 11);
		ayse.addLesson(new Lesson("türkçe", "C102", 80, 100));
		
		ali.printMeans();
		ayse.printMeans();
		
		
	}
}
