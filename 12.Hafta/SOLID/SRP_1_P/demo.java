package SRP_1_P;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MailboxSettingsService settingsService = new MailboxSettingsService();
		User user = new User();
		
		// responsibility #1 of the MilboxSettingsService - change settings in mailbox
		settingsService.changeSecondaryEmail(user, "newemail@email.com");
		
		// responsibility #2 of the MilboxSettingsService - verify access
		if (settingsService.hasAccess(user)) {
			user.sendMoney(new User(), 1000);
		}
	}

}
