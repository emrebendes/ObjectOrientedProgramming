import java.util.Random;

public class Matris {
	int [][] data;
	int sat,sut;
	public Matris() {
		this(2,2);
	}
	public Matris(int en,int boy) {
		data = new int[en][boy];
		Random r = new Random();
		for (int i =0;i<data.length;i++)
			for(int j =0 ;j<data[0].length;j++)
				data[i][j]=r.nextInt(10);
		sat = en;
		sut = boy;
	}
	public Matris(int[][] data) {
		this.data=data;
		sat = data.length;
		sut = data[0].length;
	}
	public void print() {
		System.out.println("-----------------------");
		for(int[] satır : data) {			
			for(int sutun :satır)
				System.out.print(sutun+"\t");
			System.out.println();
		}
		System.out.println("-----------------------");
	}
	public Matris topla(Matris m) throws Exception {
		if (this.sat != m.sat || this.sut != m.sut)
			throw new Exception("toplama işleminde satır ve sütun sayıları eşit olmalı...");
		int [][] d = new int[sat][sut];
		for (int i =0 ; i< sat ; i++) {
			for (int j =0 ; j<sut ; j++) {
				d[i][j] = m.data[i][j]+this.data[i][j];
			}
		}		
		return new Matris(d);
	}
	
	public Matris carp(Matris m) throws Exception {
		if (this.sut!=m.sat)
			throw new Exception();
		int [][] d = new int[this.sat][m.sut];
		for (int i =0 ; i<this.sat ;i++) {
			for (int j = 0 ; j<m.sut ; j++) {
				for(int k =0; k<sut ;k++)
					d[i][j]+=this.data[i][k]*m.data[k][j];
			}
		}
		return new Matris(d);
		
	}
}
