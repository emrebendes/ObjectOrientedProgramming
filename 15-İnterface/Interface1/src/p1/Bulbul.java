package p1;

public class Bulbul extends Kus implements Gagayayanlar,Yumurtlayanlar{
	
	public void adımat() {
		System.out.println("adım atttım");
	}
	
	@Override
	public int yumurtla() {
		// TODO Auto-generated method stub
		return 1;
	}
	@Override
	public void Uc(int adet) {
		// TODO Auto-generated method stub
		System.out.println("bülbül  uçuyor...");
	}

    @Override
	public void gagala() {
		// TODO Auto-generated method stub
		
	}

}
