// ÖNCE: Dizi ile tutuluyor, tek bir ekle var.
// Derste sorulacak: "11. ürün nereye? Çıkarınca boşluk ne olacak? 2 tane çay için ne yazacağız?"
public class Siparis {
    public Urun[] urunler = new Urun[4];   // sabit kapasite
    public int adet = 0;                   // dolu eleman sayısını elle takip ediyoruz
    public String musteri;

    public Siparis(String musteri) { this.musteri = musteri; }

    public void ekle(Urun u) {
        if (adet == urunler.length) {
            System.out.println("Dizi dolu! " + u.ad + " eklenemedi.");
            return;
        }
        urunler[adet] = u;
        adet++;
    }

    public double toplam() {
        double t = 0;
        for (int i = 0; i < adet; i++) t += urunler[i].fiyat;
        return t;
    }

    public void yazdir() {
        System.out.println("--- " + musteri + " (" + adet + " kalem) ---");
        for (int i = 0; i < adet; i++) System.out.println((i + 1) + ". " + urunler[i]);
        System.out.println("Toplam: " + toplam() + " TL");
    }
}
