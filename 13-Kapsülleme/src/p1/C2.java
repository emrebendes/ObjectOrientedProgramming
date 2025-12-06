package p1;

public class C2 {
	
	public int c2Method() {
		C1 c1 =new C1();
		c1.setB(30);
		return c1.a+c1.c+c1.d +c1.getB(); //c1.b ye  erişemedim		
	}
}
