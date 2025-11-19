package okul;

public class Akademisyen extends Insan{
	String unvan;
		
	
	public Akademisyen(String ad, String soyad, int kimlikNo) {
		super(ad, soyad, kimlikNo);
		
	}




	public void dersVer() {
		System.out.println("ders verdim ... ");
	}
	
	
}
