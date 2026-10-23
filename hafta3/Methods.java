package hafta3;

import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ilk sayı :");
        int a =sc. nextInt();
        System.out.print("ikinci sayı :");
        int b =sc. nextInt();
        int c  ;
        System.out.println("toplam = "+topla(a,b));
    }

    public static int topla(int x, int y){
        return x+y;
    }
}
