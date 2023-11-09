package Nested;

public class OuterClass {
	int test=1 ;
	static int test2=50;
	
	public OuterClass(int test) {		
		//this.test = test;
		System.out.println("Dýþ sýnýf içerisindeyim-------");
		System.out.println("lokal test  = "+test);
		System.out.println("nesnenin test deðiþkeni ="+this.test);
		System.out.println("statik deðiþken = "+test2);
	}
	
	public void display() {
		//System.out.println(test);
		final int a=4;
		class LocalClass{
			int test=33;
			public LocalClass() {
				System.out.println("local class içerisindeyim ------");
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
			System.out.println("iç sýnýf içerisindeyim------");
			System.out.println("lokal test  = "+test);
			System.out.println("nesnenin test deðiþkeni ="+this.test);
			System.out.println("dýþ sýnýfýn test deðiþkeni = "+OuterClass.this.test);
			System.out.println("statik deðiþken ="+test2);
		}
	}
	public static class StaticInnerClass{
		int test=22;

		public StaticInnerClass(int test) {
			//this.test = test;
			System.out.println("statik sýnýf içerisindeyim----");
			System.out.println("lokal test  = "+test);
			System.out.println("nesnenin test deðiþkeni ="+this.test);
		}
	}
}
