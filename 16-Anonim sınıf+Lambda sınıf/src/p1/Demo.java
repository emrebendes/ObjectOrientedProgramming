package p1;

public class Demo {

	public static void main(String[] args) {
		//1 yerel sınıf olarak
		class toplayıcı implements Hesapla{
			@Override
			public double islem(int a, int b) {
				// TODO Auto-generated method stub
				return a+b;
			}			
		}
		
		toplayıcı t = new toplayıcı();
		System.out.println( t.islem(2, 3));
		print(t);
		//2 ananom sınıf ile		
		Hesapla carpıcı = new Hesapla() {
			
			@Override
			public double islem(int a, int b) {
				// TODO Auto-generated method stub
				return a*b;
			}
		};
		System.out.println(carpıcı.islem(2, 3));
		
		
		print(new Hesapla() {
			
			@Override
			public double islem(int a, int b) {
				// TODO Auto-generated method stub
				return a-b/2;
			}
		});
		
		//3 lambda ifadesi ile
		Hesapla bölücü  = (a,b)->a/b;
		
		System.out.println(bölücü.islem(2, 3));
		
		//lambda ifadesi metotları parametre olarak gördermak için sıklıkla kullanılır.
		print((a,b)->{return b*a/2;});

	}
	
	public static void print(Hesapla h) {
		System.out.println(h.islem(2, 3));
	}
	

}
