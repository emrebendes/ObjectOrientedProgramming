package prototype;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;

public class Grup implements Cloneable {
	ArrayList<Kisi> kisiler = new ArrayList<Kisi>();
	int grupId ;
	public Grup(int id) {
//		kisiler= Arrays.asList(new Kisi(), new Kisi());
		grupId=id;
		Random rand = new Random();
		for (int i =1;i<100;i++) {
			kisiler.add(new Kisi(RandomStringUtils.random(4, true, false),RandomStringUtils.random(6, true, false),rand.nextInt(50)));
		}
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Grup grup = (Grup)super.clone();
		grup.kisiler=this.kisiler;
		return grup;
	}	
	

}
