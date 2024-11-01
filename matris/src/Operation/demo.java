package Operation;

public class demo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		int[][] dd= new int[][]{{2,2},{3,3},{4,4}};
		Matrix m = new Matrix(dd);//(dd);
		m.display();
		//m.expand(new Matrix(new int[][]{{2,2},{3,3}}),1);
		//m.display();	
		System.out.println("----------");
		Matrix m2 = m.transpoze();
		m2.display();		
		System.out.println("----------");
		try {
			m.mul(m2).display();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		System.out.println("----------");
		try {
			m.add(m2).display();
		} catch (Exception e) {
			e.printStackTrace();
		} 
		System.out.println("----------");
				
		m.add(10).display();
		System.out.println("----------");
		m.mul(10).display();
		System.out.println("----------");
		
		Matrix A = new Matrix(new int[][] {{1,2,3},{4,5,6},{7,8,9}});
		Matrix B = new Matrix(new int[][] {{3,2,1},{1,2,3},{2,1,3}});
		
		A.mul(B).add(A).add(2).display();
	}

}
