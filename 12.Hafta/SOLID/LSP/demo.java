package LSP;

public class demo {

	public static void main(String[] args) {
		Ucankuslar[] ucankuslar = new Ucankuslar[] {new bulbul(),new Kanarya()};
		for (Ucankuslar kus :ucankuslar) {
			kus.uc();
		}
		
		Kus[] kuslar = new Kus[] {new bulbul(),new Devekusu(),new Kanarya()};
		for (Kus kus :kuslar) {
			kus.ye();
		}

	}

}
