package p1;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		int a ,b;
		int [] d = {0,1,2};
		Scanner sc = new Scanner(System.in);
		System.out.print("a deðeri :");
		a=sc.nextInt();
		System.out.print("b deðeri :");
		b=sc.nextInt();
		System.out.println("öncekiþ kodlar çalýþtý");
		Deneme deneme = new Deneme();
		try {
			deneme.doSomething(a, b);
		} catch (Exception e) {
			e.printStackTrace();
			
		}	
		
		System.out.println("geri kalan 1000 satýr kod :)");
	}
}

/*
 * int c =0;
		try {
			d[2]=100; 
			c= a/b;
			 
		}catch(ArithmeticException ae) {
			c=10000;
			ae.printStackTrace();
		}
		catch (IndexOutOfBoundsException ie) {
			System.out.println("sýnýr aþma hatasý oldu");
		}
		
			System.out.println("minimum 1 hata oluþtu");
			System.out.println("sonuc="+c);
 * */
