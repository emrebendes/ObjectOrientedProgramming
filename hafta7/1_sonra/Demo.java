public class Demo {
    public static void main(String[] args) {
        Urun cay   = new Urun("Çay", 10);
        Urun tost  = new Urun("Tost", 60, "Yiyecek");
        Urun yeni  = new Urun("Limonata");        // fiyatı henüz yok -> 0.0
        yeni.setFiyat(-5);                        // kural engeller
        yeni.setFiyat(35);

        Siparis s = new Siparis("Ali");
        s.ekle(cay, 2);
        s.ekle(tost);
        s.ekle("Su", 8);
        s.ekle(yeni);
        s.yazdir();

        s.cikar(0);                               // 1. kalemi (Çay) çıkar
        s.cikar(tost);                            // tost nesnesini çıkar
        s.yazdir();
        System.out.println("%10 indirimli: " + s.toplam(10) + " TL");
    }
}
