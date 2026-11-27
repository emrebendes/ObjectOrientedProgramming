import java.util.ArrayList;

public class Student {
    private String name, surname;
    private ArrayList<Grades> grades = new ArrayList<>();

    public Student(String n, String s) {
        this.name = n;
        this.surname = s;

    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void addLesson(Lesson l) {
        Grades g = new Grades(this, l);
        grades.add(g);
        l.addGrades(g);
    }

    public void setLessonVize(int id, int note) {
        grades.get(id).setV(note);
    }

    public void setLessonFinal(int id, int note) {
        grades.get(id).setF(note);
    }

    public Lesson getLesson(int id) {
        return grades.get(id).getLesson();
    }

    public void printStudent() {
        System.out.println();
        System.out.println(name + " " + surname + "===================");
        for (Grades grade : grades) {
            System.out.print(grade.getLesson().getName());
            System.out.println("\t" + grade.getV() + "\t" + grade.getF());
        }
    }

}