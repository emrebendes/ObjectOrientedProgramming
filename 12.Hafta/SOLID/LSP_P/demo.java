package LSP_P;

public class demo {

	public static void main(String[] args) {
		Kus[] kuslar = new Kus[] {new bulbul(),new Devekusu(),new Kanarya()};
		for (Kus kus :kuslar) {
			kus.uc();
		}

	}

}
