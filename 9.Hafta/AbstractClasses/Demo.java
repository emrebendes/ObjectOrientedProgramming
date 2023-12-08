package AbstractClasses;

public class Demo {

	public static void main(String[] args) {
		AbstractTest at =new AbstractTest() {
			
			@Override
			public void test() {
				System.out.println("anonim abstract nesnesi içersindeyim.");
				
			}
		};
		
		AbstractTest at2 = new Test();
		at.test();
		at2.test();
		at.test2();
		at2.test2();
	}

}
