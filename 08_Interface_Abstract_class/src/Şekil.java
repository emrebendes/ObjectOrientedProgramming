
public abstract class Şekil implements Kıyaslanabilenler{
	
	abstract public double alanHesapla() ;

	@Override
	public int alanıBüyükmü(AlanıHesaplananlar kb){
		if (alanHesapla()<kb.alanHesapla())
			return -1;
		else if(alanHesapla()>kb.alanHesapla())
			return 1;
		else
			return 0;
	}

}
