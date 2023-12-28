package openclose;

public class MortgageLoanHandler implements LoanHandler{

	Validator validator;
	
	
	public MortgageLoanHandler(Validator validator) {
		
		this.validator = validator;
	}


	@Override
	public void approveLoan(User user) {
		if (validator.isValid(user)) {
			System.out.println("mortgage loan is validated");
		}
		else 
			System.out.println("mortgage loan is NOT validated");
		
	}

}
