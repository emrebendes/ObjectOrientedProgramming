public class Demo {
    public static void main(String[] args) {
        Student s1 = new Student("ali", "a");
        Student s2 = new Student("veli", "v");
        Student s3 = new Student("ayşe", "aaa");

        Lesson l1 = new Lesson(1, "nesne tabanlı");
        Lesson l2 = new Lesson(2, "veri yapıları");
        Lesson l3 = new Lesson(3, "Matematik");

        s1.addLesson(l1);
        s1.addLesson(l3);
        s2.addLesson(l1);
        s2.addLesson(l2);
        s3.addLesson(l3);
        s3.addLesson(l2);
        s3.addLesson(l1);

        s1.getLesson(0).setV(50);
        s1.getLesson(0).setF(70);
        s1.getLesson(1).setV(20);
        s1.getLesson(1).setF(50);

        s2.getLesson(0).setV(30);
        s2.getLesson(0).setF(60);
        s2.getLesson(1).setV(70);
        s2.getLesson(1).setF(90);

        s3.getLesson(0).setV(55);
        s3.getLesson(0).setF(77);
        s3.getLesson(1).setV(88);
        s3.getLesson(1).setF(92);
        s3.getLesson(2).setV(22);
        s3.getLesson(2).setF(33);

        s1.printStudent();
        s2.printStudent();
        s3.printStudent();

    }
}
