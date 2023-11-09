package Deneme;

public class Ogrenci {
	String ad,soyad;
	int no;
	public Ogrenci() {
	
		this("emre","bendeþ",1);
		System.out.println("parametresiz öðrenci yapýcý metodu içindeyim");
		
	}
	public Ogrenci(String ad, String soyad, int no) {		
		this.ad = ad;
		this.soyad = soyad;
		this.no = no;
		System.out.println("parametreli öðrenci yapýcý metodu içindeyim");
	}
	
	
	
}
