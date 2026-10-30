import java.util.ArrayList;

public class Siparis {
    private ArrayList<Urun> urunler = new ArrayList<>();   // 4) ArrayList
    private String musteri;

    public Siparis(String musteri) { this.musteri = musteri; }

    // 3) metot overload: aynı isim, farklı parametre listesi
    public void ekle(Urun u) {
        urunler.add(u);
    }
    public void ekle(Urun u, int adet) {
        for (int i = 0; i < adet; i++) ekle(u);           // kendi overload'ını çağırır
    }
    public void ekle(String ad, double fiyat) {
        ekle(new Urun(ad, fiyat));
    }

    public void cikar(int sira)   { urunler.remove(sira); }        // ArrayList.remove(int)
    public void cikar(Urun u)     { urunler.remove(u); }           // ArrayList.remove(Object)

    public double toplam() {
        double t = 0;
        for (Urun u : urunler) t += u.getFiyat();
        return t;
    }
    public double toplam(double indirimYuzde) {                    // overload
        return toplam() * (1 - indirimYuzde / 100);
    }

    public void yazdir() {
        System.out.println("--- " + musteri + " (" + urunler.size() + " kalem) ---");
        for (int i = 0; i < urunler.size(); i++) {
            System.out.println((i + 1) + ". " + urunler.get(i));
        }
        System.out.println("Toplam: " + toplam() + " TL");
    }
}
