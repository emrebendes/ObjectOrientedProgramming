
public abstract class �ekil implements K�yaslanabilenler{
	
	abstract public double alanHesapla() ;

	@Override
	public int alan�B�y�km�(Alan�Hesaplananlar kb){
		if (alanHesapla()<kb.alanHesapla())
			return -1;
		else if(alanHesapla()>kb.alanHesapla())
			return 1;
		else
			return 0;
	}

}
