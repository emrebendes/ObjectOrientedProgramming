
public class Dikdörtgen extends Þekil implements AlanýHesaplananlar{
	private int en, boy ;
	private Nokta köþe;
	public Dikdörtgen(int en, int boy, Nokta köþe) {
		super();
		this.en = en;
		this.boy = boy;
		this.köþe = köþe;
	}
	
	@Override
	public double alanHesapla() {
		// TODO Auto-generated method stub
		return en*boy;
	}
	
	
}
