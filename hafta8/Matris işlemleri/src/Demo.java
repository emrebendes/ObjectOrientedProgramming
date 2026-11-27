
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Matris m1 = new Matris();
		m1.print();
		Matris m2 = new Matris();
		m2.print();
		Matris m3 = null;
		try {
			m3 = m1.topla(m2);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			m3.print();
		}
		try {
			Matris m4 = m1.carp(m2);
			m4.print();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
