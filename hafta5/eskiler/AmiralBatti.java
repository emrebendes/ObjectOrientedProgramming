package eskiler;

import java.util.Random;
import java.util.Scanner;

public class AmiralBatti {
    public static void main(String[] args) {
        int puan = 0;
        System.out.print("Tahtya boyutunu belirleyiniz:");
        Scanner sc =new Scanner(System.in);
        int boyut = sc.nextInt();
        int gemiSayisi = (int)(boyut*boyut*0.1);
        int hak = gemiSayisi * 2;
        //oyun tahtasını oluştur
        int[][] oyunTahtasi = new int[boyut][boyut];
        //gemileri oyun tahtasına rastgele yerleştir...
        Random r = new Random();
        int yerlestirilen =0;
        while(yerlestirilen<gemiSayisi){
            int x = r.nextInt(boyut);
            int y = r.nextInt(boyut);
            if (oyunTahtasi[x][y]!=1){
                oyunTahtasi[x][y]=1;
                yerlestirilen++;
            }
        }

        /*for (int i = 0;i<gemiSayisi;i++){            
            int x = r.nextInt(boyut);
            int y = r.nextInt(boyut);
            oyunTahtasi[x][y]=1;
        }*/
        int atis = 0;
        while(atis<hak){
            
            System.out.print(atis+".atış:X koordinatı:");
            int x = sc.nextInt(boyut+1)-1;
            System.out.print(atis+".atış:Y koordinatı:");
            int y = sc.nextInt(boyut+1)-1;
            if (oyunTahtasi[x][y]==2){
                System.out.println("Bu koordinatlara daha önce atış yaptınız. Lütfen bir daha deneyiniz!");
                continue;
            }
            if (oyunTahtasi[x][y]==1){
                puan += 10;
                System.out.println("Tebrikler vurdunuz!");
                oyunTahtasi[x][y] = 2;
            }
            atis++;
        }
        System.out.println("Oyun bitti!");
        int isabet = (int)(puan/10);
        System.out.println(isabet+" isabetli atış ile "+puan+" puan aldınız.");


    }
}
