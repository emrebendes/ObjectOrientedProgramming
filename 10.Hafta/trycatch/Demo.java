package trycatch;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Demo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Test t = new Test();
		int[] a = new int [10];
		
		//ArrayList<String> a = new ArrayList<>();
		/*try {
			//PrintWriter out = new PrintWriter(new FileWriter("OutFile.txt"));
			a[11]=23;
			System.out.println(t.calculate(2, 0));
		}catch (ArithmeticException e) {
			//e.printStackTrace();
			System.out.println(t.calculate(2, 1));
		}catch (ArrayIndexOutOfBoundsException e) {
			a[9]=23;
		}
		finally {
			System.out.println("illiki çalýþacak kodlar .... ");
		}*/
		
		try {
			//PrintWriter out = new PrintWriter(new FileWriter("OutFile.txt"));
			//a[10]=23;
			System.out.println(t.calculate(2, 0));
		}catch (ArithmeticException e) {
			e.printStackTrace();
			
		}
		catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("illiki çalýþacak kodlar .... ");
			
			try {
				System.out.println(t.calculate(2, 0));
			} catch (Exception e2) {
				System.out.println("daha ne hatasý yapýyon !");
			}
			
			
		}
		
		PrintWriter out = new PrintWriter(new FileWriter("OutFile.txt"));
		
		System.out.println("programýn geri kalaný güzel çalýþýyor......");
		
	}

}
