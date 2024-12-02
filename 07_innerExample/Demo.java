package innerExample;

//import innerExample.Outher.StaticInner;

public class Demo {
	int deneme =30;
	public static void main(String[] args) {
		Outher o = new Outher();
		o.example();
		
		Outher.Inner inner = o.new Inner(66);
		System.out.println(inner.doSomething(0));
		
		Outher.StaticInner si = new Outher.StaticInner();
		
		
	}
}
