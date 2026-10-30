public class Demo {
    public static void main(String[] args) {
        Urun cay  = new Urun("Çay", 10);
        Urun tost = new Urun("Tost", 60, "Yiyecek");

        Siparis s = new Siparis("Ali");
        s.ekle(cay);
        s.ekle(cay);              // 2 çay için iki satır; ekle(cay, 2) olsa?
        s.ekle(tost);
        s.ekle(new Urun("Su", 8));
        s.ekle(new Urun("Limonata", 35));   // 5. ürün: dizi dolu!
        s.yazdir();

        // KAPSÜLLEME ACISI: dışarıdan kuralsız müdahale
        cay.fiyat = -10;
        s.yazdir();               // toplam saçmalar; Urun bunu engelleyemiyor
    }
}
