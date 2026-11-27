public class Demo {
    public static void main(String[] args) {
        Student s1 = new Student("ali", "a");
        Student s2 = new Student("veli", "v");
        Student s3 = new Student("ayşe", "aaa");

        Lesson l1 = new Lesson(1, "nesne tabanlı");
        Lesson l2 = new Lesson(2, "veri yapıları");
        Lesson l3 = new Lesson(1, "Matematik");

        s1.addLesson(l1);
        s1.addLesson(l3);
        s2.addLesson(l1);
        s2.addLesson(l2);
        s3.addLesson(l3);
        s3.addLesson(l2);
        s3.addLesson(l1);

        s1.setLessonVize(0, 70);
        s1.setLessonFinal(0, 70);
        s1.setLessonVize(1, 20);
        s1.setLessonFinal(1, 50);

        s2.setLessonVize(0, 30);
        s2.setLessonFinal(0, 60);
        s2.setLessonVize(1, 70);
        s2.setLessonFinal(1, 90);

        s3.setLessonVize(0, 55);
        s3.setLessonFinal(0, 77);
        s3.setLessonVize(1, 88);
        s3.setLessonFinal(1, 92);
        s3.setLessonVize(2, 22);
        s3.setLessonFinal(2, 33);

        s1.printStudent();
        s2.printStudent();
        s3.printStudent();

        l1.printLessonList();
        l2.printLessonList();
        l3.printLessonList();

    }
}
