package okul;

import java.util.ArrayList;

public class Ogrenci extends Insan{
	ArrayList<String> dersler = new ArrayList<String>();
	public Ogrenci() {
		super();
	}
	
	public Ogrenci(String ad, String soyad, int kn) {
		super(ad,soyad,kn);
		
	}
	
	public void kendiniTanit(String s) {
		System.out.println(s);
	}	

	
	public void derseGir() {
		System.out.println("derse girdim ..... ");
		
	}
}
