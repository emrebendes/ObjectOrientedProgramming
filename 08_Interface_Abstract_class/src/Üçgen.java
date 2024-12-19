
public class Üçgen extends Şekil implements AlanıHesaplananlar{
	private int taban,yükseklik;
	private Nokta uç;
	
	public Üçgen(int taban, int yükseklik, Nokta uç) {
		super();
		this.taban = taban;
		this.yükseklik = yükseklik;
		this.uç = uç;
	}

	@Override
	public double alanHesapla() {
		// TODO Auto-generated method stub
		return taban*yükseklik*0.5;
	}

}
