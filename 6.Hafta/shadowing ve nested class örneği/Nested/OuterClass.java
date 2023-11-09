package Nested;

public class OuterClass {
	int test=1 ;
	static int test2=50;
	
	public OuterClass(int test) {		
		//this.test = test;
		System.out.println("D�� s�n�f i�erisindeyim-------");
		System.out.println("lokal test  = "+test);
		System.out.println("nesnenin test de�i�keni ="+this.test);
		System.out.println("statik de�i�ken = "+test2);
	}
	
	public void display() {
		//System.out.println(test);
		final int a=4;
		class LocalClass{
			int test=33;
			public LocalClass() {
				System.out.println("local class i�erisindeyim ------");
				System.out.println(a);
				System.out.println(test);
			}			
		}
		LocalClass class1= new LocalClass();
	}
	
	public class InnerClass{
		int test=5;
		public InnerClass(int test) {
			//this.test =test;  
			System.out.println("i� s�n�f i�erisindeyim------");
			System.out.println("lokal test  = "+test);
			System.out.println("nesnenin test de�i�keni ="+this.test);
			System.out.println("d�� s�n�f�n test de�i�keni = "+OuterClass.this.test);
			System.out.println("statik de�i�ken ="+test2);
		}
	}
	public static class StaticInnerClass{
		int test=22;

		public StaticInnerClass(int test) {
			//this.test = test;
			System.out.println("statik s�n�f i�erisindeyim----");
			System.out.println("lokal test  = "+test);
			System.out.println("nesnenin test de�i�keni ="+this.test);
		}
	}
}
