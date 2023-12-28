package SRP_1_P;

public class MailboxSettingsService {
	public void changeSecondaryEmail(User user, String newSecondaryEmail) {
		if (hasAccess(user)) {
			user.setSecondaryEmail(newSecondaryEmail);
		}
	}
//	kontrol yetkisi bu s�n�fa m� ait olmal� ? 
	public boolean hasAccess(User user) {
		if (user.getRole() == Role.ADMIN) {
			return true;
		} else {
			return false;
		}
		
	}
}
