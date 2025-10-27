package Run;

import java.util.ArrayList;

public class Lesson {
	private String name;
	private int id;
	private ArrayList<Grades> grades = new ArrayList<>();
	
	// 1. Gereksinim: Otomatik artan static ders ID'si
	private static int nextId = 1000;
	
	public Lesson(String name) { // Yapýcý metot güncellendi
		this.name = name;
		this.id = nextId++; // ID otomatik olarak atanýyor
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
	
	// 6. Menü için kullanýlacak
	public void printStudentList() {
		System.out.println(name + " dersini alan öðrencilerin listesi");
		System.out.println("Öðrenci Adý\t\tVize\tFinal");
		System.out.println("--------------------------------------------");
		for (Grades g : grades) {
			g.printStudent(); // Grades sýnýfýndaki ilgili metodu çaðýrýr
		}
	}
}
