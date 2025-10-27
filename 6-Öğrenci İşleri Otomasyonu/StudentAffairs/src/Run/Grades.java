package Run;

public class Grades {
	private Lesson lesson;
	private Student student;
	private int vize,f;
	
	public Grades(Lesson lesson, Student student, int vize, int f) {
		this.lesson = lesson;
		this.student = student;
		this.vize = vize;
		this.f = f;
		
		// Bu nesne (yani not) oluþtuðu an ilgili dersin ve öðrencinin listesine eklenir
		this.lesson.getGrades().add(this);
		this.student.getGrades().add(this);
	}
	
	// 5. Menü için (Öðrencinin derslerini listelerken)
	public void printLesson() {
		System.out.println(this.lesson.getName()+"\t\t\t"+this.vize+"\t"+this.f);
	}
	
	// 6. Menü için (Dersin öðrencilerini listelerken)
	public void printStudent() {
		System.out.println(this.student.getName()+" "+this.student.getSurname()+"\t\t"+this.vize+"\t"+this.f);
	}
	
	public Lesson getLesson() {
		return lesson;
	}
	public void setLesson(Lesson lesson) {
		this.lesson = lesson;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}

	// 4. Menü (Not Gir) için bu set metodlarý GEREKLÝDÝR
	public void setVize(int vize) {
		this.vize = vize;
	}
	public void setF(int f) {
		this.f = f;
	}
}