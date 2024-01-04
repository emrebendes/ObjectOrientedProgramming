package factory;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class SekilFactory2 {
	private HashMap<String, Sekil> sekilMap = new HashMap<String, Sekil>();

	public SekilFactory2() {
		sekilMap.put("ucgen", new Ucgen());
		sekilMap.put("kare", new Kare());
		sekilMap.put("daire", new Daire());
		
	}

	public Sekil sekilOlustur(String tip) {
		tip = tip.toLowerCase();
		return sekilMap.get(tip) == null ? null : 
			sekilMap.get(tip);
	}
}
