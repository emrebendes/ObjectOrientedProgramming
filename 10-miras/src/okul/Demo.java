package okul;

import java.util.ArrayList;

public class Demo {

	public static void main(String[] args) {
		/*Ogrenci o1 = new Ogrenci("hilmi","hilti",33333);
		o1.kendiniTanit();
		
		Ogrenci o2 = new Ogrenci();
		o2.kendiniTanit();*/
		
		
		ArrayList<Ogrenci> ogrenciler = new ArrayList<Ogrenci>();
		ogrenciler.add(new Ogrenci("a","b",1));
		ogrenciler.add(new Ogrenci("v","v",1));
		ogrenciler.add(new Ogrenci("s","d",1));
		//öðrenci seviseinde iþlem yapacak olursak !!
		for (Ogrenci o : ogrenciler)
		{				
			o.derseGir();
			
		}
		
		ArrayList<Insan> kisiler = new ArrayList<Insan>();
		kisiler.add(new Ogrenci("cevat","kelle",33333));
		kisiler.add(new Memur("ali", "a", 0000));
		kisiler.add(new Akademisyen("naciye", "naci", 45688));
		//Insan seviyesinde iþlem yapacak olursak: UPCCAST ile, nesnenin ne olduðuna bakmadan iþlem yapabiliriz.
		for (Insan in : kisiler)
		{				
			in.kendiniTanit();
			in.elSalla();
			/*if(in instanceof Ogrenci o)
			{
				//Ogrenci o = (Ogrenci) in;//DOWN CAST - DOWN SAMPLING
				o.derseGir();
			}*/
		}
		
		
		Insan i1 = new Ogrenci("cevat","kelle",33333);//UPCAST, UPSAMPLÝNG
		
		

	}

}

