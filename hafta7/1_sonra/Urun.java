public class Urun {
    private String ad;
    private double fiyat;
    private String kategori;

    // 1) this() zinciri: tek bir constructor işi yapar, diğerleri ona yönlendirir
    public Urun(String ad) {
        this(ad, 0.0);                 // fiyatı sonra belirlenecek ürün
    }
    public Urun(String ad, double fiyat) {
        this(ad, fiyat, "Genel");
    }
    public Urun(String ad, double fiyat, String kategori) {
        this.ad = ad;
        this.kategori = kategori;
        setFiyat(fiyat);               // kural tek yerde: constructor bile setter'ı kullanır
    }

    // 2) kapsülleme: fiyat dışarıdan doğrudan yazılamaz, kuraldan geçer
    public void setFiyat(double fiyat) {
        if (fiyat < 0) {
            System.out.println("Hata: fiyat negatif olamaz (" + ad + ")");
            return;
        }
        this.fiyat = fiyat;
    }
    public double getFiyat()   { return fiyat; }
    public String getAd()      { return ad; }
    public String getKategori(){ return kategori; }

    public String toString() { return ad + " (" + fiyat + " TL)"; }
}
