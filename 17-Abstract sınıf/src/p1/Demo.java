package p1;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		class yerel extends Deneme{

			@Override
			int hesapla(int b) {
				// TODO Auto-generated method stub
				return b*a;
			}
			
		}
		
		
		Deneme d = new Deneme() {			
			@Override
			int hesapla(int b) {
				// TODO Auto-generated method stub
				return b*a;
			}
		};
		
		
		
		System.out.println(d.hesapla(4));
		
		
		Deneme2 d2 = new Deneme2();
		System.out.println(d2.hesapla(6));
		
	}

}
