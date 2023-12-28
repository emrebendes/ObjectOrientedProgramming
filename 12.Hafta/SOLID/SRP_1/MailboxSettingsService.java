package SRP_1;

public class MailboxSettingsService {
//	bu sýnýfý deðiþtirmek için sadece mail ile alakalý bir durum olmalý 
//	güvenlik ile alakalý deðiþiklik için bu sýnnýfý deðiþtirmeye gerek yok 
	private SecurityService securityService = new SecurityService();
	public void changeSecondaryEmail(User user, String newSecondaryEmail) {
		if (securityService.hasAccess(user)) {
			user.setSecondaryEmail(newSecondaryEmail);
		}
	}
	
}
