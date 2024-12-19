package klonlama;

public class Demo {

	public static void main(String[] args) {
		Dikdörtgen d1 = new Dikdörtgen(10, 20, new Nokta(0, 0));
		Dikdörtgen d2 = d1;
		Dikdörtgen d3 = new Dikdörtgen
				(d1.getEn()
				, d1.getBoy()
				, new Nokta(d1.getKöþe().getX(), d1.getKöþe().getY()));
		Dikdörtgen d4 = (Dikdörtgen)d1.clone();
		d1.setEn(33);
		d1.getKöþe().setX(150);
		System.out.println("d1 eni :"+d1.getEn());
		System.out.println("d2 eni :"+d2.getEn());
		System.out.println("d3 eni :"+d3.getEn());
		System.out.println("d4 eni :"+d4.getEn());
		System.out.println("d1 x noktasý:"+d1.getKöþe().getX());
		System.out.println("d3 x noktasý:"+d3.getKöþe().getX());
		System.out.println("d4 x noktasý:"+d4.getKöþe().getX());
		System.out.println(d1==d2);
		System.out.println(d1==d4);
	}
}
