package dokumans;

public class Ship {
    int x,y;
    boolean isHit = false;
    int puan = 10;
    public Ship(int x,int y){
        this.x=x;
        this.y=y;
    }
    public boolean check(int x,int y){
        if (this.x==x && this.y==y){
            isHit =true;
            return true;
        }else
            return false;

    }
}
