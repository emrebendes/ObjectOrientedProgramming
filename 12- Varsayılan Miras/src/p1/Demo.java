package p1;
public class Demo {

	public static void main(String[] args) {
		Insan i1 = new Insan("ali","a",1);
		
		Insan i2 = i1;
		
		Insan i3 = new Insan("ali","a",1); 
	
		
		System.out.println(i1==i3);
		
		System.out.println(i1.equals(i3));
		
		System.out.println(i1);
		
		System.out.println("i1:"+i1.hashCode());
		System.out.println("i2:"+i2.hashCode());
		System.out.println("i3:"+i3.hashCode());
		System.out.println(i3);
		
		System.out.println(i1.getClass().getName());	

		if (i1.getClass().getName().equals("p1.Insan"))
			System.out.println("Merhaba Insan...");
		if (i1 instanceof Insan )
			System.out.println("bir daha  merhaba de");
	}

}
