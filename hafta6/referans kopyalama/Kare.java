public class Kare {
    int en;
    Koordinat koordinat;

    public Kare() {
        en = 1;
        koordinat = new Koordinat();

    }

    public Kare(int en, int x, int y) {
        this.en = en;
        koordinat = new Koordinat(x, y);
    }

    public Kare(int en, Koordinat k) {
        this.en = en;
        this.koordinat = k;
    }

    public Kare kopyala() {
        return new Kare(this.en, this.koordinat.kopyala());
    }

}
