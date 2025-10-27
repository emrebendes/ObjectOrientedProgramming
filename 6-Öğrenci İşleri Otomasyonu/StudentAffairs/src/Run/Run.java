package Run;

import java.util.ArrayList;
import java.util.Scanner;

public class Run {

	// Tüm öðrencileri ve dersleri tutmak için static listeler
	static ArrayList<Student> allStudents = new ArrayList<>();
	static ArrayList<Lesson> allLessons = new ArrayList<>();
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		while (true) {
			printMenu();
			int choice = getInputInt("Seçiminiz (1-7): ");
			
			switch (choice) {
				case 1:
					defineLesson();
					break;
				case 2:
					defineStudent();
					break;
				case 3:
					assignLessonToStudent(); // BU METOT GÜNCELLENDÝ
					break;
				case 4:
					enterGrades();
					break;
				case 5:
					listStudentLessons();
					break;
				case 6:
					listLessonStudents();
					break;
				case 7:
					System.out.println("Programdan çýkýlýyor...");
					scanner.close();
					System.exit(0);
					break;
				default:
					System.out.println("Geçersiz seçim! Lütfen 1-7 arasýnda bir sayý girin.");
			}
			System.out.println("\n(Devam etmek için Enter'a basýn...)");
			scanner.nextLine();
		}
	}

	public static void printMenu() {
		System.out.println("\n--- ÖÐRENCÝ KAYIT SÝSTEMÝ ---");
		System.out.println("1. Ders Tanýmla");
		System.out.println("2. Öðrenci Tanýmla");
		System.out.println("3. Öðrenciye Ders Ata");
		System.out.println("4. Öðrenci Dersine Vize ve Final Notu Gir");
		System.out.println("5. Öðrenci Derslerini Listele");
		System.out.println("6. Dersi Alan Öðrencileri Listele");
		System.out.println("7. Çýkýþ");
	}

	// Menü 1: Ders Tanýmla 
	private static void defineLesson() {
		System.out.print("Yeni dersin adýný girin: ");
		String lessonName = scanner.nextLine();
		
		Lesson newLesson = new Lesson(lessonName);
		allLessons.add(newLesson);
		
		System.out.println("BAÞARILI: '" + newLesson.getName() + "' dersi " + newLesson.getId() + " ID'si ile eklendi.");
	}

	// Menü 2: Öðrenci Tanýmla 
	private static void defineStudent() {
		System.out.print("Öðrencinin adýný girin: ");
		String name = scanner.nextLine();
		System.out.print("Öðrencinin soyadýný girin: ");
		String surname = scanner.nextLine();
		
		Student newStudent = new Student(name, surname);
		allStudents.add(newStudent);
		
		System.out.println("BAÞARILI: " + newStudent.getName() + " " + newStudent.getSurname() + ", " + newStudent.getNo() + " numarasý ile eklendi.");
	}

	// Menü 3: Öðrenciye Ders Ata 
	private static void assignLessonToStudent() {
		// 1. Ders kontrolü 
		if (allLessons.isEmpty()) {
			System.out.println("HATA: Henüz hiç ders tanýmlanmamýþ. Önce ders tanýmý yapýn.");
			return;
		}
		
		// 2. Öðrenci seçimi 
		Student selectedStudent = selectStudent();
		if (selectedStudent == null) return; 

		// 3.  Öðrencinin mevcut derslerinin bir listesini al (kontrol için)
		ArrayList<Lesson> takenLessons = new ArrayList<>();
		for (Grades g : selectedStudent.getGrades()) {
			takenLessons.add(g.getLesson());
		}

		// 4.  Özel ders listesi gösterimi
		// Genel selectLesson() metodu yerine, öðrenciye özel liste basýyoruz
		System.out.println("--- Ders Listesi ---");
		System.out.println(selectedStudent.getName() + " öðrencisi için ders seçin:");

		for (int i = 0; i < allLessons.size(); i++) {
			Lesson currentLesson = allLessons.get(i);
			String status = ""; // Durum (boþ = alýnabilir)
			
			// Eðer öðrencinin ders listesi (takenLessons) bu dersi içeriyorsa
			if (takenLessons.contains(currentLesson)) {
				status = " [ALINMIÞ]";
			}
			
			System.out.println((i + 1) + ". " + currentLesson.getName() + status);
		}

		// 5.  Kullanýcýdan seçim al
		int choice = getInputInt("Atamak için ders seçin (1-" + allLessons.size() + "): ");
		if (choice < 1 || choice > allLessons.size()) {
			System.out.println("Geçersiz seçim.");
			return;
		}

		Lesson selectedLesson = allLessons.get(choice - 1); // Seçilen ders

		// 6.  Seçimi doðrula
		// Önceki "sonradan kontrol" yerine "seçim anýnda" kontrol yapýyoruz
		if (takenLessons.contains(selectedLesson)) {
			System.out.println("HATA: Bu ders zaten öðrenci tarafýndan alýnmýþ. Atama yapýlamaz.");
			return;
		}

		// 7. Atama 
		Grades newAssignment = new Grades(selectedLesson, selectedStudent, 0, 0);
		
		System.out.println("BAÞARILI: " + selectedLesson.getName() + " dersi " + selectedStudent.getName() + " öðrencisine atandý.");
	}

	// Menü 4: Vize ve Final Notu Gir 
	private static void enterGrades() {
		Student selectedStudent = selectStudent();
		if (selectedStudent == null) {
			System.out.println("HATA: Önce öðrenci tanýmlayýnýz.");
			return;
		}

		if (selectedStudent.getGrades().isEmpty()) {
			System.out.println("HATA: " + selectedStudent.getName() + " öðrencisine atanmýþ hiç ders yok. Önce ders atamasý yapmalýsýnýz.");
			return;
		}

		System.out.println(selectedStudent.getName() + " öðrencisinin dersleri:");
		ArrayList<Grades> studentGrades = selectedStudent.getGrades();
		for (int i = 0; i < studentGrades.size(); i++) {
			System.out.println((i + 1) + ". " + studentGrades.get(i).getLesson().getName());
		}
		
		int choice = getInputInt("Not girmek için ders seçin (1-" + studentGrades.size() + "): ");
		if (choice < 1 || choice > studentGrades.size()) {
			System.out.println("Geçersiz seçim.");
			return;
		}
		
		Grades selectedGrade = studentGrades.get(choice - 1);
		
		int vize = getInputInt(selectedGrade.getLesson().getName() + " için vize notu: ");
		int f = getInputInt(selectedGrade.getLesson().getName() + " için final notu: ");
		
		selectedGrade.setVize(vize);
		selectedGrade.setF(f);
		
		System.out.println("BAÞARILI: Notlar güncellendi.");
	}

	// Menü 5: Öðrenci Derslerini Listele 
	private static void listStudentLessons() {
		Student selectedStudent = selectStudent();
		if (selectedStudent == null) {
			System.out.println("HATA: Önce öðrenci tanýmlayýnýz.");
			return;
		}
		
		if (selectedStudent.getGrades().isEmpty()) {
			System.out.println(selectedStudent.getName() + " öðrencisinin kayýtlý dersi bulunmamaktadýr.");
			return;
		}
		
		selectedStudent.printLessonsList();
	}

	// Menü 6: Dersi Alan Öðrencileri Listele 
	private static void listLessonStudents() {
		Lesson selectedLesson = selectLesson();
		if (selectedLesson == null) {
			System.out.println("HATA: Önce ders tanýmlayýnýz.");
			return;
		}
		
		if (selectedLesson.getGrades().isEmpty()) {
			System.out.println(selectedLesson.getName() + " dersine kayýtlý öðrenci bulunmamaktadýr.");
			return;
		}
		
		selectedLesson.printStudentList();
	}
	
	
	// --- YARDIMCI METODLAR  ---

	private static int getInputInt(String prompt) {
		int input = -1;
		while (true) {
			try {
				System.out.print(prompt);
				input = Integer.parseInt(scanner.nextLine());
				break;
			} catch (NumberFormatException e) {
				System.out.println("HATA: Lütfen geçerli bir sayý girin.");
			}
		}
		return input;
	}

	private static Student selectStudent() {
		if (allStudents.isEmpty()) {
			return null;
		}
		
		System.out.println("--- Öðrenci Listesi ---");
		for (int i = 0; i < allStudents.size(); i++) {
			System.out.print((i + 1) + ". ");
			allStudents.get(i).printStudent(); 
		}
		
		int choice = getInputInt("Ýþlem yapmak için öðrenci seçin (1-" + allStudents.size() + "): ");
		if (choice < 1 || choice > allStudents.size()) {
			System.out.println("Geçersiz seçim.");
			return null;
		}
		return allStudents.get(choice - 1);
	}

	// selectLesson metodu Menü 6 tarafýndan kullanýlýyor
	private static Lesson selectLesson() {
		if (allLessons.isEmpty()) {
			return null;
		}
		
		System.out.println("--- Ders Listesi ---");
		for (int i = 0; i < allLessons.size(); i++) {
			System.out.println((i + 1) + ". " + allLessons.get(i).getName() + " (ID: " + allLessons.get(i).getId() + ")");
		}
		
		int choice = getInputInt("Ýþlem yapmak için ders seçin (1-" + allLessons.size() + "): ");
		if (choice < 1 || choice > allLessons.size()) {
			System.out.println("Geçersiz seçim.");
			return null;
		}
		return allLessons.get(choice - 1);
	}
}