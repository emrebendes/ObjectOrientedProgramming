package Run;

public class Demo {

	public static void main(String[] args) {
		
		Lesson matematik = new Lesson("matematik",10,(byte)4);
		Lesson oop = new Lesson("OOP",12,(byte)4);
		Lesson bbg = new Lesson("BBG", 14, (byte)3);
		Lesson programlama = new Lesson("Programlama", 16, (byte)2);
		
		Student cevat = new Student("bilgisayar",10,"cevat","kelle");
		Student abuzer = new Student("elektronik",11,"abuzer","nehaber");
		
		cevat.registerLesson(programlama);
		//programlama.registerStudent(cevat);
		cevat.registerLesson(oop);
		cevat.registerLesson(matematik);
		
		abuzer.registerLesson(programlama);
		abuzer.registerLesson(oop);
		
		cevat.printLessons();
		abuzer.printLessons();
		
		oop.printStudentList();
		bbg.printStudentList();
		matematik.printStudentList();
		programlama.printStudentList();
		
		
		//System.out.println(cevat.name);

	}

}
