package openclose;

public class LoadDemo {
	public static void main(String[] args) {
		User user = new User();
		LoanHandler handler = new PersonalLoanHandler(new PersonalLoanValidator());
		
		handler.approveLoan(user);
		
		LoanHandler handler2 = new MortgageLoanHandler(new MortgageLoanValidator());		
		handler2.approveLoan(user);
	}
}
