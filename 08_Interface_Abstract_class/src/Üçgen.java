
public class ��gen extends �ekil implements Alan�Hesaplananlar{
	private int taban,y�kseklik;
	private Nokta u�;
	
	public ��gen(int taban, int y�kseklik, Nokta u�) {
		super();
		this.taban = taban;
		this.y�kseklik = y�kseklik;
		this.u� = u�;
	}

	@Override
	public double alanHesapla() {
		// TODO Auto-generated method stub
		return taban*y�kseklik*0.5;
	}

}
