// ÖNCE: Henüz this() zinciri ve kapsülleme yok.
// Derste sorulacak: "Fiyat kuralı değişti (negatif olamaz). Kaç yere if yazacağız?"
public class Urun {
    public String ad;          // public alan: dışarıdan herkes yazabilir
    public double fiyat;
    public String kategori;

    public Urun(String ad) {
        this.ad = ad;
        this.fiyat = 0.0;
        this.kategori = "Genel";
    }
    public Urun(String ad, double fiyat) {
        this.ad = ad;
        this.fiyat = fiyat;
        this.kategori = "Genel";
    }
    public Urun(String ad, double fiyat, String kategori) {
        this.ad = ad;
        this.fiyat = fiyat;
        this.kategori = kategori;
    }

    public String toString() { return ad + " (" + fiyat + " TL)"; }
}
