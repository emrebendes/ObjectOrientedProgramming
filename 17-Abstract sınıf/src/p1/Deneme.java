package p1;

public abstract class Deneme {
	protected int a =5;//private  olursa bu özellik alt sınıflarda kullanılamayacağından Demo içerisinde hata veriridi.
	
	public void doSomething() {
		System.out.println("örnek deneme metopdu çalıştı....");
	}
	
	abstract int hesapla(int b);

}
