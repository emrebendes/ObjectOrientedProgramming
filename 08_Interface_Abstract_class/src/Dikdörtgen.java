
public class Dikd�rtgen extends �ekil implements Alan�Hesaplananlar{
	private int en, boy ;
	private Nokta k��e;
	public Dikd�rtgen(int en, int boy, Nokta k��e) {
		super();
		this.en = en;
		this.boy = boy;
		this.k��e = k��e;
	}
	
	@Override
	public double alanHesapla() {
		// TODO Auto-generated method stub
		return en*boy;
	}
	
	
}
