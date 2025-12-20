package p1;

public class Demo {

	public static void main(String[] args) {
		Bulbul b1 = new Bulbul();
		Ucak f16 = new Ucak();
		Kus k1 = new Bulbul();
		Ucabilenler u1 ;// nesne oluşturulamaz= new Ucabilenler();
		Yumurtlayanlar y1;
		u1 = b1;
		ucur(b1);
		ucur(f16);
		ucur(u1);
		//ucur(k1);
		
				
	}
	public static void ucur(Ucabilenler u) {
		u.Uc(0);
	}

}
