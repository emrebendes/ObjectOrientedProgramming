package p1;

import java.util.Random;
import java.util.Scanner;

public class AmiralBattiDersteYazilan {

	public static void main(String[] args) {
		int puan = 0;
		Random r = new Random();
		System.out.print("tahta boyutunu giriniz :");
		Scanner sc = new Scanner(System.in);
		int tahtaBoyutu = sc.nextInt();
		int gemiSayisi = (int)(tahtaBoyutu*tahtaBoyutu*0.1);
		int hak = gemiSayisi * 2 ;
		int[][] oyunTahtasi= new int[tahtaBoyutu][tahtaBoyutu];
		//gemileri olu�tur...
		int yerlestirilen = 0 ; 
		while(yerlestirilen<gemiSayisi)
		{
			int x = r.nextInt(tahtaBoyutu) ;
			int y = r.nextInt(tahtaBoyutu) ;
			if (oyunTahtasi[x][y] !=1 ) {//daha �nce gemi yerle�tirildi ise
				oyunTahtasi[x][y] = 1;
				yerlestirilen++;
			}			
		}
		
		int deneme = 0; 
		while(deneme<hak){
			ekranaBas(oyunTahtasi);
			System.out.print((deneme+1)+". denemeniz i�in x koordinat� : ");
			int x = sc.nextInt();
			System.out.print((deneme+1)+". denemeniz i�in y koordinat� : ");
			int y = sc.nextInt();
			if (oyunTahtasi[x-1][y-1] == -1 || oyunTahtasi[x-1][y-1]==2) {
				System.out.println("Daha �nce denedi�iniz bir koordinat� se�tiniz. L�tfen tekrar deneyin.");
				continue;
			}
			if (x>tahtaBoyutu || y> tahtaBoyutu){
				System.out.println("Tahta boyutundan b�y�k bir say� girdiniz! L�tfen tekrar deneyin.");
				continue;
			}
			if (oyunTahtasi[x-1][y-1] == 1) {
				puan +=10;
				System.out.println("Tebrikler gemiyi vutdunuz! Puan�n�z : "+puan);
				oyunTahtasi[x-1][y-1] = 2;
			}
			else {
				System.out.println("Iskalad�n�z !");
				oyunTahtasi[x-1][y-1] = -1;
			}
			deneme++;
			
		}
		ekranaBas(oyunTahtasi);
		System.out.println(puan+" puan kazanarak oyunu bitirdiniz.");
	}
	
	static void ekranaBas(int[][] oyunTahtasi) {
		
		for (int i = 0 ; i < oyunTahtasi.length ; i ++) {
			for (int j = 0 ; j <oyunTahtasi[0].length ; j++) {
				if (oyunTahtasi[i][j]==0)
					System.out.print("~");
				if (oyunTahtasi[i][j]==1)
					System.out.print("O");
				if (oyunTahtasi[i][j]==-1)
					System.out.print("X");
				if (oyunTahtasi[i][j]==2)
					System.out.print("V");			
				
			}
			System.out.println();
		}
		
	}

}
