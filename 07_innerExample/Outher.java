package innerExample;

public class Outher {
	private int a=5;
	private int c=90;
	Inner inner = new Inner(20);
	
	public void example() {
		System.out.println(inner.doSomething(50));
		System.out.println(inner.doSomething2(99));
		System.out.println(inner.doSometing3(0));
		int dene =30;
		class Local{
			public void Cafer() {
				System.out.println(dene*a);
			}
		}
		Local l = new Local();
		l.Cafer();
		
	}	
	public class Inner {
		int a,b=8;
		
		public int doSomething(int a) {
			//a de�i�keni yal�n kullan�l�rsa en yak�n tan�mlama elde edilir
			//bu �rnekte parametreden gelen a
			return c*b*a;
		}
		public int doSomething2(int a) {
			//e�er Inner class da tan�mlanan a de�i�keni kullan�lmak istenirse
			return c*b*this.a;
		}
		public int doSometing3(int a) {
			//Outher class da tan�mlanana a de�i�keni kullan�lmak istenirse...
			return c*b*Outher.this.a;			
		}
		
		public Inner(int innerProperty) {
			this.a = innerProperty;
		}		
	}
	StaticInner inner2 = new StaticInner();
	static public class StaticInner{
		private int z =22;
		public void doSomething(int z) {
			System.out.println(z*this.z);
		}		
	}
	
	
}

