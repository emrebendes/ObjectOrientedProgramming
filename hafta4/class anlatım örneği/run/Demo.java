package run;

import kisiler.Student;

public class Demo {
    public static void main(String[] args) {
        int a = 0;
        Student s1;
        s1 = new Student("ahmet","a",20) ;
        Student s2 = new Student("veli","v",21);
       
   
        s1.getRegistered();
        s2.getRegistered();
    }
}
