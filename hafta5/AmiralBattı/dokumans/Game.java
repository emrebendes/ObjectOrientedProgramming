package dokumans;

import java.util.Scanner;

public class Game {
    Board board;
    int hak;
    Scanner sc;
    public Game(){
        this.sc = new Scanner(System.in);
        System.out.print("En ve boy giriniz :");
        int x = sc.nextInt();
        System.out.print(" - ");
        int y =sc.nextInt();
        board = new Board(x, y);
        hak = board.shipCount*2;
    }

    public void start(){
        int deneme = 0; 
        int puan = 0;
        while(deneme<this.hak){
            System.out.print("X :");
            int x = this.sc.nextInt();
            System.out.print("Y :");
            int y = this.sc.nextInt();
            puan += this.board.isHit(x, y);
            board.print();
            deneme++;
        }
        System.out.println(puan+" puan kazandınız. Oyun Bitti!");

    }
    
}
