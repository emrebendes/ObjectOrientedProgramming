
import java.util.Random;
import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        System.out.println("merhaba dünya....");
        boolean b = true;//false
        int a=5,c=6;
        b=a==c||b;//a==c&&b;

        byte bb1 = 0b010111, bb2 = 0b100011;
        int bb3 =bb1 &bb2; 
        System.out.println("bb1="+bb1+" bb2="+bb2+" bb1&bb2="+(byte)bb3);
        System.out.println(bb1>>>1);

        a+=2;
        
        System.out.println("a="+ ++a);
        a*=2;
        System.out.println("a="+a);
        a-=3;
        System.out.println("a="+a);
        System.out.println("a="+a%3);


        int[] d = new int[5];
        d[0]=5;
        d[1]=4;
        d[2]=3;
        d[3]=2;
        d[4]=1;
        System.out.println("d[0]="+d[0]+" d[1]="+d[1]+" d[4]="+d[4]);

        int[] d2 = {2,5,9,6,3,5,7};
        String[][] ss = {{"ali","ayşe","mehmet"},{"ddd","ae","dfgthdgj"}};
        int[][] aa={{2,4,5,6},{7,8,3,6},{0,7,8,1} };//new int[2][3];

        System.out.println("d nin boyutu : "+d.length);
        System.out.println("aa nin satır sayısı : "+aa.length);
        System.out.println("aa nin sütun sayısı : "+aa[0].length);
        System.out.println(aa[1][2]);
        System.out.println(ss[0][0]);

        for (int i = 0; i < d2.length; i++) 
            System.out.println("d2["+i+"] = "+d2[i]);
        
        int ind =0;
        for (int ii : d2){
            System.out.println("d2["+ind+"] = "+ii);
            ind++;
        }
        Scanner s = new Scanner(System.in);
        System.out.print("bir sayı giriniz : ");
        int input = s.nextInt(6);
        int index=0;
        while(index<input){
            System.out.println(index);
            index++;

        }
        /*do {

        }while(index<input);*/
        
        if (a==input||b){
            System.out.println("sayılar eşit");
        }else if(b)
            System.out.println("b şartı sağlandı");
        else{
            System.out.println("sayılar farklı");
        }
        System.out.print("bir sayı giriniz : ");
        input = s.nextInt(4);
        switch (input) {
            case 0:
                System.out.println(++input);
                break;
            case 1:
                System.out.println(--input);
                break;

            default:
                System.err.println(input*=input);
        }
        Random r =new Random();
        int random = r.nextInt(5);
        System.out.println(random);


    }
    
}
