
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dikd�rtgen d1 = new Dikd�rtgen(10, 20, new Nokta(0, 0));
		��gen �1 = new ��gen(5, 25, new Nokta(25,60));
		Yamuk y = new Yamuk();
		System.out.println( d1.alan�B�y�km�(�1));
		
		
		K�yaslanabilenler kb = new K�yaslanabilenler() {
			
			@Override
			public int alan�B�y�km�(Alan�Hesaplananlar kb) {
				// TODO Auto-generated method stub
				return 0;
			}
		};
		
		
		�1.alan�B�y�km�(new Alan�Hesaplananlar() {
			
			@Override
			public double alanHesapla() {
				// TODO Auto-generated method stub
				return 2*3;
			}
		});
		
		�1.alan�B�y�km�(()->2*3);
		
		

		
		

	}

}

class AbstractDenemesi extends Deneme{

	@Override
	int denemeyiTestEt() {
		return a*10;
		
	}
	
}


