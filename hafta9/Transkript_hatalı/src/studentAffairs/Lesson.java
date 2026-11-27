package studentAffairs;

import java.util.ArrayList;

public class Lesson {
	private String name;
	private String code;
	private int n1,n2,ort;
	private ArrayList<Student> students = new ArrayList<Student>();
	public Lesson(String name, String code) {		
		this.name = name;
		this.code = code;
	}
	public Lesson(String name, String code, int n1, int n2) { //metot overload olduðuna dikkat edin 		
		this.name = name;
		this.code = code;
		this.n1 = n1;
		this.n2 = n2;
		this.ort = (int)(n1*0.4+n2*0.6);
	}
	public void addStudent(Student s) {
		students.add(s);		
	}
	public int getN1() {
		return n1;
	}
	public void setN1(int n1) {
		this.n1 = n1;
		ort = (int)(n1*0.4+n2*0.6);
	}
	public int getN2() {
		return n2;
	}
	public void setN2(int n2) {
		this.n2 = n2;
		ort = (int)(n1*0.4+n2*0.6);
	}
	public String getName() {
		return name;
	}
	public String getCode() {
		return code;
	}
	public int getOrt() {
		return ort;
	}
	
	public void printStudents() {
		System.out.println( name+ "dersini alan öðrencilerin listesi :.");
		System.out.println( "-------------------------------------------------------------");
		System.out.println( "Öðrenci No \tÖðrenci Adý");
		System.out.println( "-------------------------------------------------------------");
		for (Student student : students)
			System.out.println( student.getNo() +"\t\t"+student.getName());
		System.out.println( "-------------------------------------------------------------"+"\n");
	}

}
