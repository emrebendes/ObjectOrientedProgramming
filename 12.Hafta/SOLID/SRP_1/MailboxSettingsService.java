package SRP_1;

public class MailboxSettingsService {
//	bu s�n�f� de�i�tirmek i�in sadece mail ile alakal� bir durum olmal� 
//	g�venlik ile alakal� de�i�iklik i�in bu s�nn�f� de�i�tirmeye gerek yok 
	private SecurityService securityService = new SecurityService();
	public void changeSecondaryEmail(User user, String newSecondaryEmail) {
		if (securityService.hasAccess(user)) {
			user.setSecondaryEmail(newSecondaryEmail);
		}
	}
	
}
