import java.util.Scanner;

public class AmiralBatti2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		Rondom random = new Random();
		System.out.print("Oyun Alanı Boyutunu Girin:");
		int size = scanner.nextInt();
		int[][] board = new int[size][size]; // 5x5 oyun tahtası
        
		int nunberOfShips = (int)size*.1;
		
		int[][] ships = new int[nunberOfShips][2];
		for (int i=0;i<nunberOfShips;i++){
			ships[i][0]= random.nextInt(size);
			ships[i][1]= random.nextInt(size);			
		}		
		
        int attempts = 0;
        int hits = 0;

        while (hits < nunberOfShips*2) {
            System.out.print("Satır giriniz (0-4): ");
            int row = scanner.nextInt();
            System.out.print("Sütun giriniz (0-4): ");
            int col = scanner.nextInt();

            attempts++;

            if (board[row][col] == 1) {
                System.out.println("Bu koordinata zaten atış yaptınız!");
            } else {
                board[row][col] = 1;
                boolean hit = false;
                for (int[] ship : ships) {
                    if (ship[0] == row && ship[1] == col) {
                        hit = true;
                        hits++;
                        System.out.println("Vurdunuz!");
                        break;
                    }
                }
                if (!hit) {
                    System.out.println("Iskaladınız!");
                }
            }
        }

        System.out.println( attempts + " denemede "+ hits +"adet gemi vurdunuz.");
		System.out.println("Toplam puanınız" + hits*10);
    }
}