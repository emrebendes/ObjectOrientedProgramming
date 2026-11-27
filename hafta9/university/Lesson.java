import java.util.ArrayList;

public class Lesson {
    private int id;
    private String name;

    private ArrayList<Grades> grades = new ArrayList<>();

    public Lesson(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void addGrades(Grades g) {
        grades.add(g);
    }

    public void printLessonList() {
        System.out.println();
        System.out.println(id + " " + name + "===================");
        for (Grades grade : grades) {
            System.out.print(grade.getStudent().getName() + " " + grade.getStudent().getSurname());
            System.out.println("\t" + grade.getV() + "\t" + grade.getF());

        }
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

}
