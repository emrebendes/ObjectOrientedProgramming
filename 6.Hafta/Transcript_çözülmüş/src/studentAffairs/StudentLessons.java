package studentAffairs;

public class StudentLessons {
	private Student student;
	private Lesson lesson;
	private int midtermGrade;
	private int finalGrade;
	private int termGrede;
	public StudentLessons(Student student, Lesson lesson, int midtermGrade, int finalGrade) {
		super();
		this.student = student;
		this.lesson = lesson;
		this.midtermGrade = midtermGrade;
		this.finalGrade = finalGrade;		
		updateTermGrade();
	}
	private void updateTermGrade() {
		termGrede = (int) Math.round( midtermGrade*0.4+finalGrade*0.6 );
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public Lesson getLesson() {
		return lesson;
	}
	public void setLesson(Lesson lesson) {
		this.lesson = lesson;
	}
	public int getMidtermGrade() {
		return midtermGrade;
	}
	public void setMidtermGrade(int midtermGrade) {
		this.midtermGrade = midtermGrade;
		updateTermGrade();
	}
	public int getFinalGrade() {
		return finalGrade;
	}
	public void setFinalGrade(int finalGrade) {
		this.finalGrade = finalGrade;
		updateTermGrade();
	}
	public int getTermGrede() {
		return termGrede;
	}

	
	
}
