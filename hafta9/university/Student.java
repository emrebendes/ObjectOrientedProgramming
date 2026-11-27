import java.util.ArrayList;

public class Student {
    private String name, surname;
    private ArrayList<Lesson> lessons = new ArrayList<>();

    public Student(String n, String s) {
        this.name = n;
        this.surname = s;

    }

    public void addLesson(Lesson l) {
        lessons.add(l);
    }

    public Lesson getLesson(int id) {
        return lessons.get(id);
    }

    public void printStudent() {
        System.out.println();
        System.out.println(name + " " + surname + "===================");
        for (Lesson lesson : lessons) {
            System.out.print(lesson.getName());
            System.out.println("\t" + lesson.getV() + "\t" + lesson.getF());
        }
    }

}