package p1;

import java.util.Objects;

public class Insan {
	String ad, soyad;
	int kNo;
	
	public Insan(String ad, String soyad, int kNo) {
		super();
		this.ad = ad;
		this.soyad = soyad;
		this.kNo = kNo;
	}

	
	public int hashCode() {
		return Objects.hash(ad, kNo, soyad);
	}

	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Insan other = (Insan) obj;
		return Objects.equals(ad, other.ad) && kNo == other.kNo && Objects.equals(soyad, other.soyad);
	}

	public String toString() {
		return kNo+":"+ad+" "+soyad;
		
	}
	
	
	

}
