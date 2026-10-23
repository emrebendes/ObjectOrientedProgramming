package dokumans;
import java.util.Random;

public class Board {
    int w,h;
    char[][] field;
    Ship[] ships;
    int shipCount;
    public Board(int w,int h){
        this.w=w;
        this.h=h;   
        shipCount = (int)(Math.ceil(w*h*0.1));
        ships = new Ship[shipCount];
        field = new char[w][h];
        for (int i=0;i<w;i++)
            for (int j=0;j<h;j++)
                field[i][j]='~';
        Random r = new Random(); 
        for (int i =0 ;i<shipCount;i++)
            ships[i] = new Ship(r.nextInt(w), r.nextInt(h));
    }

    public int isHit(int x, int y){
        for (Ship ship : ships){
            if (ship.check(x, y)){
                System.out.println("tebrikler vurdunuz!");
                field[x][y] = 'V';
                return ship.puan;
            }
            else{
                System.out.println("Vuramadınız !!!");
                field[x][y] = 'X';
            }
        }
        return 0;
    }
    public void print(){
        for (int i=0;i<w;i++){            
            for (int j=0;j<h;j++)
                System.out.print(field[i][j]+' ');
            System.out.println();
        }
    }

}
