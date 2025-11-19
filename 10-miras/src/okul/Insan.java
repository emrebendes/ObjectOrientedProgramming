package okul;

public class Insan {
	String ad , soyad;
	int kimlikNo;	
	public Insan() {
		this("elfernando","gordobez",111111);
	}
	
	public Insan(String ad, String soyad, int kimlikNo) {
		
		this.ad = ad;
		this.soyad = soyad;
		this.kimlikNo = kimlikNo;
	}

	 public void elSalla() {
		System.out.println("el sallýyorum");
	}

	public void kendiniTanit() {
		System.out.println(kimlikNo+":"+ad+" "+soyad);
	}

}
