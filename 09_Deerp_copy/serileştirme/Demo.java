package serile�tirme;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import serile�time.Rectangle;

public class Demo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Dikd�rtgen d1 = new Dikd�rtgen(10, 20, new Nokta(0, 0));
		Dikd�rtgen d2 = d1;
		Dikd�rtgen d3 = new Dikd�rtgen
				(d1.getEn()
				, d1.getBoy()
				, new Nokta(d1.getK��e().getX(), d1.getK��e().getY()));
		//Dikd�rtgen d4 = (Dikd�rtgen)d1.clone();
		ByteArrayOutputStream bao = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(bao);
		oos.writeObject(d1);
		ByteArrayInputStream bis = new ByteArrayInputStream(bao.toByteArray());
		ObjectInputStream ois = new ObjectInputStream(bis);
		Dikd�rtgen d4 = (Dikd�rtgen) ois.readObject();
		
		
		
		d1.setEn(33);
		d1.getK��e().setX(150);
		System.out.println("d1 eni :"+d1.getEn());
		System.out.println("d2 eni :"+d2.getEn());
		System.out.println("d3 eni :"+d3.getEn());
		System.out.println("d4 eni :"+d4.getEn());
		System.out.println("d1 x noktas�:"+d1.getK��e().getX());
		System.out.println("d3 x noktas�:"+d3.getK��e().getX());
		System.out.println("d4 x noktas�:"+d4.getK��e().getX());
		System.out.println(d1==d2);
		System.out.println(d1==d4);
	}
}
