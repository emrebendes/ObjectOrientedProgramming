package AB;

import java.util.Random;

public class Ship {
	int x,y;
	int puan;

	public Ship(int x, int y) {		
		this.x = x;
		this.y = y;
		Random r  = new Random();
		puan = r.nextInt(5,10);
	}
	public boolean check(int x,int y) {
		if (x==this.x && y==this.y) {
			System.out.println("tebrikler vurdunuz! "+this.puan+" kazandýnýz.");
			return true;
		}
		else {
			System.out.println("Üzgünüm! vuramadýnýz.");
			return false;
		}
			
		
	}
	
}
