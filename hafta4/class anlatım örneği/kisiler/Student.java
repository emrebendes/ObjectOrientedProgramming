package kisiler;

public class Student {
    String name;
    String surname;
    int age;

    public Student() {
        name = "tanımsız";
        surname = "tanımsız";
        age = 18;
    }

    public Student(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.age = 18;
    }

    public Student(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public void getRegistered() {
        /**
         * veritabanına bağlan
         * tabloları güncelle
         * bağlantıyı kopart .....
         */

        System.out.println(this.name + " öğrencisi kayıt oldu..");
    }
}
