package openclose;

public interface LoanHandler {
//	PersonalLoanValidator personalLoanValidator;
//	MortgageLoanValidator mortgageLoanValidator;
//	
//	public void approvePersonalLoan(User user) {
//		personalLoanValidator = new PersonalLoanValidator();
//		System.out.println(personalLoanValidator.isValidForPersonalLoan(user));
//	}
//	
//	public void approveMortgageLoan(User user) {
//		mortgageLoanValidator = new MortgageLoanValidator();
//		System.out.println(mortgageLoanValidator.isValidForMortgage(user));
//	}
	void approveLoan(User user);
}
