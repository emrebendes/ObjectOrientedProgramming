package h9;

public enum Days {
	PAZARTESI("haftanýn ilk günü"),
	SALI("salý günü"),
	ÇARÞAMBA("hafta ortasý"),
	PERSEMBE("perþembe günü""),
	CUMA("son iþ günü"),
	CUMARTESI("hafta sonu"),
	PAZAR("uyku zamaný");
	private final String msj ;
	Days(String msg){
		this.msj = msg;
	}
	public void print() {
		System.out.println(msj);
	}
}
