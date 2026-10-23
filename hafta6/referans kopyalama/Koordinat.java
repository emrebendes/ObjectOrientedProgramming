public class Koordinat {
    int x, y;

    public Koordinat() {
        x = 0;
        y = 0;
    }

    public Koordinat(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Koordinat kopyala(){
        return new Koordinat(this.x,this.y)
    }
}
