package AB;

import java.util.Scanner;

public class Game {
	Board gameBoard;
	int hak;
	
	public Game() {
		Scanner sc = new Scanner(System.in);
		System.out.print("tahta enini giriniz :");
		int w = sc.nextInt();
		System.out.print("tahta boyunu giriniz :");
		int h = sc.nextInt();
		
		gameBoard = new Board(w,h);
		hak = gameBoard.shipCount*2;		
	}
	
	
	public void start() {
		Scanner sc = new Scanner(System.in);
		int deneme =1;
		int puan=0;
		while(this.hak>0) {
			System.out.print(deneme+ ". atýþ için X koordinatýný giriniz :");
			int x = sc.nextInt();
			System.out.print(deneme+ ". atýþ için Y koordinatýný giriniz :");
			int y = sc.nextInt();
			puan += this.gameBoard.isHit(x, y);
			hak--;
			deneme++;
		}
		System.out.println("toplam "+puan+" kazannarak oyunu tamamladýnýz!");
		
	}

}
