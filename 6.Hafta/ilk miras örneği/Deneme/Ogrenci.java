package Deneme;

public class Ogrenci {
	String ad,soyad;
	int no;
	public Ogrenci() {
	
		this("emre","bende�",1);
		System.out.println("parametresiz ��renci yap�c� metodu i�indeyim");
		
	}
	public Ogrenci(String ad, String soyad, int no) {		
		this.ad = ad;
		this.soyad = soyad;
		this.no = no;
		System.out.println("parametreli ��renci yap�c� metodu i�indeyim");
	}
	
	
	
}
