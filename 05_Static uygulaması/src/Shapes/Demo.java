package Shapes;

public class Demo {

	public static void main(String[] args) {
		try {
			Square s1 = new Square(3);
			System.out.println(Square.freeArea);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("yeterli alan yok uygun boyut giriniz");
		}
		try {
			Square s2 = new Square(2);
			System.out.println(Square.freeArea);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("yeterli alan yok uygun boyut giriniz");
		}
		try {
			Square s3 = new Square(5);
			System.out.println(Square.freeArea);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("yeterli alan yok uygun boyut giriniz");
		}

	}

}
