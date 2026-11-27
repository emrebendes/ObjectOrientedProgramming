public class Grades {
    private int v, f;
    private Student student;
    private Lesson lesson;

    public Grades(Student s, Lesson l) {
        this.student = s;
        this.lesson = l;
    }

    public Student getStudent() {
        return student;
    }

    public Lesson getLesson() {
        return lesson;
    }

    public int getV() {
        return v;
    }

    public int getF() {
        return f;
    }

    public void setV(int v) {
        this.v = v;
    }

    public void setF(int f) {
        this.f = f;
    }
}
