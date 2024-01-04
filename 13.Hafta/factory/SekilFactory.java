package factory;

public class SekilFactory {
	public Sekil sekilOlustur(String tip) {
		if (tip == null) {
			return null;
		}else if (tip.equalsIgnoreCase("ucgen")) {
			return new Ucgen();
		}else if (tip.equalsIgnoreCase("kare")) {
			return new Kare();
		}else if (tip.equalsIgnoreCase("daire")) {
			return new Daire();
		}else 
			return null;
	}

}
