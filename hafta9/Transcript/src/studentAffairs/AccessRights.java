package studentAffairs;

public class AccessRights {
	private static boolean right =false;
	static {
		//veritabanýna baðlanýp right deðerini çeksem....
		right =true;
	}

	public static boolean getAccessRights() {
		return right;
	}
	
}
