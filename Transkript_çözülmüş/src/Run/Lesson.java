package Run;

import java.util.ArrayList;

public class Lesson {
	private String name;
	private int id;
		
	
	private ArrayList<Grades> grades = new ArrayList<>();
	
	public Lesson(String name, int id) {
		this.name = name;
		this.id = id;
	}
	
		
	public ArrayList<Grades> getGrades() {
		return grades;
	}



	public void setGrades(ArrayList<Grades> students) {
		this.grades = students;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	
	public void printStudentList() {
		System.out.println(name + " dersini alan öðrencilerin listesi");
		System.out.println("--------------------------------------------");
		for (Grades g : grades) {
			g.printStudent();
		}
	}
	
	
}
