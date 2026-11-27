import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {

        Deneme deneme = new Deneme();
        try {
            deneme.doSomething(10, 20);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("X:");
        int x = sc.nextInt();
        System.out.println("Y:");
        int y = sc.nextInt();
        double d = 0;
        int[] a = { 5, 6, 8, 4, 6 };
        try {
            d = x / y;
            System.out.println(a[5]);

        } catch (ArithmeticException e) {
            System.out.print("0 girme hemşerim!");
            y = sc.nextInt();
            d = x / y;
        } catch (ArrayIndexOutOfBoundsException ae) {
            ae.printStackTrace();
        } catch (Exception ee) {

        }
        System.out.println("sonuç = " + d);

        System.out.println("diğer kodlar çalışıyor..");

    }
}