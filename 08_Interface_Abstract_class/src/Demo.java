
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dikdörtgen d1 = new Dikdörtgen(10, 20, new Nokta(0, 0));
		Üçgen ü1 = new Üçgen(5, 25, new Nokta(25,60));
		Yamuk y = new Yamuk();
		System.out.println( d1.alanýBüyükmü(ü1));
		
		
		Kýyaslanabilenler kb = new Kýyaslanabilenler() {
			
			@Override
			public int alanýBüyükmü(AlanýHesaplananlar kb) {
				// TODO Auto-generated method stub
				return 0;
			}
		};
		
		
		ü1.alanýBüyükmü(new AlanýHesaplananlar() {
			
			@Override
			public double alanHesapla() {
				// TODO Auto-generated method stub
				return 2*3;
			}
		});
		
		ü1.alanýBüyükmü(()->2*3);
		
		

		
		

	}

}

class AbstractDenemesi extends Deneme{

	@Override
	int denemeyiTestEt() {
		return a*10;
		
	}
	
}


