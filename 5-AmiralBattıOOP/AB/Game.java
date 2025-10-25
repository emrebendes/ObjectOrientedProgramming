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
			System.out.print(deneme+ ". at�� i�in X koordinat�n� giriniz :");
			int x = sc.nextInt();
			System.out.print(deneme+ ". at�� i�in Y koordinat�n� giriniz :");
			int y = sc.nextInt();
			puan += this.gameBoard.isHit(x, y);
			hak--;
			deneme++;
		}
		System.out.println("toplam "+puan+" kazannarak oyunu tamamlad�n�z!");
		
	}

}
