package Run;

public class Demo {

	public static void main(String[] args) {
		Lesson oop =new Lesson("OOP", 1);
		Lesson bbg = new Lesson("bbg", 2);
		Lesson beden = new Lesson("beden",3);
		Lesson matematik = new Lesson("mat",4);
			
		
		Student abuzer ;
		abuzer= new Student("abuzer","nehaber",10,"bilgisayar");
		Student �aziye = new Student("�az,iye", "maziye", 20, "eletronik");
		
		
		Grades ls1 = new Grades(matematik, �aziye, 100, 100);
		Grades ls2 = new Grades(bbg, �aziye, 99, 0);
		Grades ls3 = new Grades(matematik, abuzer, 50, 50);
		Grades ls4 = new Grades(oop, abuzer, 40, 40);
		
		abuzer.printLessonsList();
		�aziye.printLessonsList();
		
		matematik.printStudentList();
		bbg.printStudentList();
		oop.printStudentList();
		beden.printStudentList();
	}

}
