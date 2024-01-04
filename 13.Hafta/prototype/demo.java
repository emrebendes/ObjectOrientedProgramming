package prototype;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		deneme dene = new deneme();
//		deneme dene2=dene.clone();
//		System.out.println("sdlkfnglsdf");
//		Grup grup = new Grup(1);
////		System.out.println(grup.kisiler.size());
//		System.out.println(grup.grupId+".grup-"+grup.kisiler.get(1).getAd()+"-"+grup.kisiler.get(1).getSoyad()+"-"+grup.kisiler.get(1).getYas());
//		Grup grup2=grup;
//		grup2.kisiler.set(1, new Kisi("kahtalý","mýçý",40));
//		System.out.println(grup2.grupId+".grup-"+grup2.kisiler.get(1).getAd()+"-"+grup2.kisiler.get(1).getSoyad()+"-"+grup2.kisiler.get(1).getYas());
//		System.out.println(grup.grupId+".grup-"+grup.kisiler.get(1).getAd()+"-"+grup.kisiler.get(1).getSoyad()+"-"+grup.kisiler.get(1).getYas());
//		grup2.grupId=3;
//		System.out.println(grup2.grupId+".grup-"+grup2.kisiler.get(1).getAd()+"-"+grup2.kisiler.get(1).getSoyad()+"-"+grup2.kisiler.get(1).getYas());
//		System.out.println(grup.grupId+".grup-"+grup.kisiler.get(1).getAd()+"-"+grup.kisiler.get(1).getSoyad()+"-"+grup.kisiler.get(1).getYas());		
//		
//		grup2=new Grup(2);
//		System.out.println(grup2.grupId+".grup-"+grup2.kisiler.get(1).getAd()+"-"+grup2.kisiler.get(1).getSoyad()+"-"+grup2.kisiler.get(1).getYas());
//		System.out.println(grup.grupId+".grup-"+grup.kisiler.get(1).getAd()+"-"+grup.kisiler.get(1).getSoyad()+"-"+grup.kisiler.get(1).getYas());
		Grup g1 = new Grup(1);
		Grup g2 =null;
		try {
			g2=(Grup) g1.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(g1==g2);
		System.out.println(g1.kisiler.get(1)==g2.kisiler.get(1));
	}

}
