package eskiler;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        int[] a = new int[5];
        a[0] =4;
        a[1] =2;
        a[2] =78;
        a[3] =22;
        int boyut =1;
        boyut -=2;
        System.out.println(--boyut);
        System.out.println(boyut!=-3);

        boolean b = true ;//false

        if (boyut==1||b){
            System.out.println("şart sağlandı");
        }if(boyut==-1){

            System.out.println("başka şartlar :...");
        }else{
            System.out.println("else sağlandı");
        }


        for (int i = 0; i < a.length; i++) {
            System.out.println("a["+i+"]="+a[i]);
        }
        int index =0;
        for (int i : a){
            System.out.println("a["+index+"]="+i);
            index++;
        }
        index =0;
        int sayi =0;
        while (index<10){
            if (index%2==0)
                sayi++;
            index++;
        }
        System.out.println(sayi);
       /* do {


        }while(true);*/
        
        Scanner s = new Scanner(System.in);
        System.out.print("bir sayı giriniz[1-5]");
        int input = s.nextInt(5);

        switch (input) {
            case 0:
                input*=input;//*input;
                System.out.println(input);
                break;
            case 1:
                System.out.println(--input);
                break;
            case 2:
                System.out.println(++input);
                break;
            default:
                System.out.println(input);
        }    

        /*
        int[] a = new int[5];
        a[0] =4;
        a[1] =2;
        a[2] =78;
        a[3] =22;
        int[] b = {1,2,3,4,5};
        String[] adlar = {"ali","veli","ayşe"};
        int[][] c = {{1,2,3},{3,2,1}};
        int[][] d = new int[2][3];
        d[0][0] = 1;
        d[0][1] = 2;
        d[1][2]= 3;
        System.out.println(c.length);
        System.out.println(c[0].length);

        int kalan = a[1] % c[1][1];
        System.out.println(kalan);
        int boyut =1;
        boyut = +a[1];//=1+a[1]
        System.out.println(boyut);
        //boyut =+2;
        //System.out.println(boyut);
        boyut ++;
        System.out.println(boyut);





        System.out.println(a[4]+"-"+a[3]+"-"+a[2]);
        System.out.println(b[4]+"-"+b[3]+"-"+b[2]);
        System.out.println(c[0][2]);
        */
    }    
}
