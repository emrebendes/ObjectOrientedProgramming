package eskiler;

import java.util.Scanner;

public class Methods {    
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.print("A değerini gir:");
        a=sc.nextInt();
        System.out.print("B değerini gir:");
        b=sc.nextInt();
      
        System.out.println("toplam="+ topla(a,b));
    }
    public static int topla(int x,int y){
        return x+y;
    }    
}
