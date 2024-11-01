package Operation;

import java.util.Arrays;
import java.util.Random;

public class Matrix {
	private int[][] data;
	private int m, n;
	public Matrix() {
		data = new int[2][2];
		Random r =new Random();
		for(int i=0;i<2;i++)
			for(int j=0;j<2;j++)
				data[i][j]=r.nextInt(10);
		m =data.length;
		n = data[1].length;
	}
	
	public Matrix(int[][] data) {		
		this.data = data;
		m = data.length;
		n = data[1].length;
		
	}
	
	public int[][] getData() {
		return data;
	}
	
	public int getM() {
		return m;
	}

	public int getN() {
		return n;
	}

	public int getMaxValue() {
        int maxValue = data[0][0];
        for (int j = 0; j < data.length; j++) {
            for (int i = 0; i < data[j].length; i++) {
                if (data[j][i] > maxValue) {
                    maxValue = data[j][i];
                }
            }
        }
        return maxValue;
    } 	
	
	public void display() {
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++) {
				System.out.print(data[i][j]+" ");
			}
			System.out.println();
		}	
		System.out.println();
	}
	
	public Matrix mul(Matrix mx) throws Exception  {		
		if ( n != mx.getM()) {
			//System.out.println("matris boyutlarý uyuþmuyor...!");
			throw new Exception("matris boyutlarý uyuþmuyor...!");
			//return null;
		}
		else {			
			int C[][] = new int[m][mx.getN()];
			
	        for (int i = 0; i < m ; i++) {
	            for (int j = 0; j < mx.getN() ; j++) {
	                for (int k = 0; k < n ; k++)
	                    C[i][j] += data[i][k] * mx.getData()[k][j];
	            }
	        }
	        return new Matrix(C);	
		}			
	}
	
	public Matrix mul(int s) {						
		int C[][] = new int[m][n];		
        for (int i = 0; i < m ; i++) {
            for (int j = 0; j < n ; j++) {
                C[i][j] = data[i][j] * s;
            }
        }
        return new Matrix(C);				
	}
	
	public Matrix add(Matrix mx) {		
		if ( n != mx.getN() || m!=mx.getM() ) {
			throw new NullPointerException("matris boyutlarý uyuþmuyor...!");
			//System.out.println("matris boyutlarý uyuþmuyor...!");
			//return null;
		}
		else {			
			int C[][] = new int[m][n];
			
	        for (int i = 0; i < m ; i++) {
	            for (int j = 0; j < n ; j++) {
	                C[i][j] = data[i][j] + mx.getData()[i][j];
	            }
	        }
	        return new Matrix(C);	
		}			
	}
	
	public Matrix add(int s) {						
		int C[][] = new int[m][n];		
        for (int i = 0; i < m ; i++) {
            for (int j = 0; j < n ; j++) {
                C[i][j] = data[i][j] + s;
            }
        }
        return new Matrix(C);				
	}
		
	public Matrix transpoze() {
		int[][] t = new int[n][m];
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
				t[j][i]=data[i][j];
			System.out.println();
		} 
		return new Matrix(t);
	}
	
	public void expand (int d) {
		if (d==1)
			expand(new int[1][data.length],d);
		else
			expand(new int[data.length][1],d);
	}
	
	public void expand (Matrix m, int d) {
		expand(m.data,d);
	}
	
	private void expand (int [][] x,int d) {
		if (d==1)
		{
			if(x.length==m) {
				int[][] result = new int[x.length + data.length][];
				System.arraycopy(data, 0, result, 0, data.length);
				System.arraycopy(x, 0, result, data.length, x.length);
				data =result;
			}
			else
				System.out.println("matrislerin boylarý(m) ayný olmalý");
		}
		else {
			if(x[0].length==n) {
				Matrix t = transpoze();
				Matrix t2 = new Matrix(x).transpoze();
				int[][] result = new int[x.length + t.data.length][];
				System.arraycopy(data, 0, result, 0, t.data.length);
				System.arraycopy(t2.data, 0, result, t.data.length, t2.data.length);
				Matrix t3 = new Matrix(result).transpoze();
				data =t3.getData();
			}
			else
				System.out.println("matrislerin enleri(n) ayný olmalý");
		}
		m =data.length;
		n = data[1].length;
	}
	
}
