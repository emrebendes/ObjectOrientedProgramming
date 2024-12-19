package klonlama;

public class Dikdörtgen implements Cloneable{
	private int en, boy ;
	private Nokta köþe;
	public Dikdörtgen(int en, int boy, Nokta köþe) {
		super();
		this.en = en;
		this.boy = boy;
		this.köþe = köþe;
	}
	public int getEn() {
		return en;
	}
	public void setEn(int en) {
		this.en = en;
	}
	public int getBoy() {
		return boy;
	}
	public void setBoy(int boy) {
		this.boy = boy;
	}
	public Nokta getKöþe() {
		return köþe;
	}
	public void setKöþe(Nokta köþe) {
		this.köþe = köþe;
	}
	
	protected Object clone() {
		return new Dikdörtgen(this.en, this.boy, (Nokta)this.köþe.clone());
	}
	
	
}
