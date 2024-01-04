package factory;

public class Demo {

	public static void main(String[] args) {
		SekilFactory factory = new SekilFactory();
		
		Sekil sekil1 = factory.sekilOlustur("ucgen");
		Sekil sekil2 = factory.sekilOlustur("dorgen");
		Sekil sekil3 = factory.sekilOlustur("kare");
		Sekil sekil4 = factory.sekilOlustur("daire");
		
		sekil1.ekranaCiz();
		//sekil2.ekranaCiz();
		sekil3.ekranaCiz();
		sekil4.ekranaCiz();
		
		
		SekilFactory2 factory2 = new SekilFactory2();
		Sekil sekil5 = factory2.sekilOlustur("ucgen");
		Sekil sekil6 = factory2.sekilOlustur("KARE");
		Sekil sekil7 = factory2.sekilOlustur("Daire");
		
		sekil5.ekranaCiz();
		sekil6.ekranaCiz();
		sekil7.ekranaCiz();
	}

}
