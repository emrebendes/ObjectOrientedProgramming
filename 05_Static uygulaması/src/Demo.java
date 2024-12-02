
public class Demo {
	private int d = 20; 
	
	public static void main(String[] args) {
		System.out.println(StaticTest.a);
		Demo demo1 = new Demo();
		Demo demo2 = new Demo();
		demo1.d = 50;
		System.out.println(demo1.d);
		System.out.println(demo2.d);
		/*StaticTest st1 =new StaticTest();
		StaticTest st2 = new StaticTest();
		st1.a =10;
		
		
		System.out.println(st1.a+" - "+st2.a);*/
	}
}
