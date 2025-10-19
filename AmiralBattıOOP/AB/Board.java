package AB;

import java.util.Random;

public class Board {
	int w,h;
	int[][] field;
	int shipCount ;
	Ship[] ships ;
	
	public Board (int w,int h) {
		this.w = w;
		this.h = h;
		field = new int[h][w];	
		this.shipCount = (int)(w*h*0.1);
		ships = new Ship[shipCount];
		Random r = new Random();	
			
		for (int i=0 ;i<shipCount;i++)
		{
			ships[i] = new Ship(r.nextInt(h),r.nextInt(w));
		}
	}
	
	public int isHit(int x,int y) {
		int puan =0;
		for(Ship ship : ships) {
			if (ship.check(x, y))	
				puan += ship.puan;
		}
		return puan;
		
	}
	
}
