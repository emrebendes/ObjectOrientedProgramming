package klonlama;

public class Dikd�rtgen implements Cloneable{
	private int en, boy ;
	private Nokta k��e;
	public Dikd�rtgen(int en, int boy, Nokta k��e) {
		super();
		this.en = en;
		this.boy = boy;
		this.k��e = k��e;
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
	public Nokta getK��e() {
		return k��e;
	}
	public void setK��e(Nokta k��e) {
		this.k��e = k��e;
	}
	
	protected Object clone() {
		return new Dikd�rtgen(this.en, this.boy, (Nokta)this.k��e.clone());
	}
	
	
}
