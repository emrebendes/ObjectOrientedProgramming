package p1;

public class C1 {
	int a =1;// package private 
	private int b=2;
	protected int c=3;
	public int d=4;
	private int e =25;
	
	//iç sýnýf
	class Test{
		int a =6;
		public void doSome() {
			int a=12;
			System.out.println("yerel a:"+a);	
			System.out.println("Test.a:"+this.a);
			System.out.println("c1.a:"+C1.this.a);			
		}		
	}
	//static iç sýnýf
	public static class Test2{
		int a =6;
		public void doSome() {
			int a=12;
			System.out.println("yerel a:"+a);				
		}		
	}
	
	public int doSomething() {
		Test t = new Test();
		t.doSome();
		int e =100;
		b =23;
		int y = 33;// efective final ya da final olmalý
		//yerel sýnýf
		class SomethingClass{
			private int a  = 3;
			int e =200
			public int calculate() {
				int e =300;
				System.out.println("e:"+e);
				System.out.println("this e:"+this.e);
				System.out.println("c1. e:"+C1.this.e);
				System.out.println("gölgeleme olduðunda yerel deðiþkene eriþim þansýnýz kalmýyorr....");
				return a+b+d+e+y;
			}			
		}		
		SomethingClass object1 = new SomethingClass();
		
		return this.a+this.b+this.c+this.d+object1.calculate();		
	}	
	//getter metodu
	public int getB() {
		return b;
	}
	//setter metodu
	protected void setB(int b) {
		if (b>10)
			this.b =b;
	}
	

}
