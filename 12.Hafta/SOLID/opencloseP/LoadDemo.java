package opencloseP;

public class LoadDemo {
	public static void main(String[] args) {
		User user = new User();
		LoanHandler handler = new LoanHandler();
		
		handler.approveMortgageLoan(user);
		handler.approvePersonalLoan(user);		
				
	}
}
