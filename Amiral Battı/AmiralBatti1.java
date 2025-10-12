import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class AmiralBatti1 {
    private static final char EMPTY = 'O';
    private static final char SHIP = 'S';
    private static final char HIT = 'X';
    private static final char MISS = '-';
    private static int boardSize;
    private static char[][] board;
    private static ArrayList<int[]> ships;
    private static int attempts;
    private static int score;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Tahta boyutunu girin: ");
        boardSize = scanner.nextInt();
        board = new char[boardSize][boardSize];
        ships = new ArrayList<>();
        score = 0;

        initializeBoard();
        placeShips();

        attempts = ships.size() * 2;
        System.out.println(ships.size() + " gemi yerleştirildi. " + attempts + " atış hakkınız var.");

        for (int attempt = 1; attempt <= attempts; attempt++) {
            System.out.println("\n" + attempt + ". deneme");
            printBoard();
            System.out.print("X koordinatını girin: ");
            int x = scanner.nextInt();
            System.out.print("Y koordinatını girin: ");
            int y = scanner.nextInt();

            if (isHit(x, y)) {
                System.out.println("Vurdunuz!");
                board[x][y] = HIT;
                score += 10;
                removeShip(x, y);
            } else {
                System.out.println("Iskalandı.");
                board[x][y] = MISS;
            }

            if (ships.isEmpty()) {
                System.out.println("Tüm gemileri vurdunuz!");
                break;
            }
        }

        System.out.println("Oyun bitti! Toplam puanınız: " + score);
        scanner.close();
    }

    private static void initializeBoard() {
        for (int i = 0; i < boardSize; i++) {
            for (int j = 0; j < boardSize; j++) {
                board[i][j] = EMPTY;
            }
        }
    }

    private static void printBoard() {
        for (int i = 0; i < boardSize; i++) {
            for (int j = 0; j < boardSize; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void placeShips() {
        Random random = new Random();
        int numShips = Math.max(1, boardSize * boardSize / 10);

        while (ships.size() < numShips) {
            int x = random.nextInt(boardSize);
            int y = random.nextInt(boardSize);
            if (board[x][y] == EMPTY) {
                board[x][y] = SHIP;
                ships.add(new int[]{x, y});
            }
        }
    }

    private static boolean isHit(int x, int y) {
        for (int[] ship : ships) {
            if (ship[0] == x && ship[1] == y) {
                return true;
            }
        }
        return false;
    }

    private static void removeShip(int x, int y) {
        ships.removeIf(ship -> ship[0] == x && ship[1] == y);
    }
}
