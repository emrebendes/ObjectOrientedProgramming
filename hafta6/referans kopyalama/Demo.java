public class Demo {
    public static void main(String[] args) {
        int a = 5;
        int b;
        b = a;
        System.out.println("a=" + a + " b=" + b);
        a++;
        System.out.println("a=" + a + " b=" + b);

        Kare k1 = new Kare();
        Kare k2;
        k2 = k1;
        System.out.println("k1 en=" + k1.en + " k2 en=" + k2.en);
        k1.en++;
        System.out.println("k1 en=" + k1.en + " k2 en=" + k2.en);

        karebüyüt(k1, b);

        System.out.println("a=" + a + " b=" + b);
        System.out.println("k1 en=" + k1.en + " k2 en=" + k2.en);

        Kare k3 = k1.kopyala();

        k1.en++;
        System.out.println("k1 en=" + k1.en + " k2 en=" + k2.en + " k3 en=" + k3.en);
    }

    public static void karebüyüt(Kare k, int x) {
        k.en++;
        x++;

    }

}
