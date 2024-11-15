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
		this.lesson.getGrades().add(this);
		this.student.getGrades().add(this);
	}
	public void printLesson() {
		System.out.println(this.lesson.getName()+"\t\t\t\t"+this.vize+"\t"+this.f);
	}
	public void printStudent() {
		System.out.println(this.student.getName()+"\t\t\t\t"+this.vize+"\t"+this.f);
			
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
	
	
	
}
