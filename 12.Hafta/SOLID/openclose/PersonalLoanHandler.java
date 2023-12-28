package openclose;

public class PersonalLoanHandler implements LoanHandler {

	Validator validator;
	
	
	
	
	public PersonalLoanHandler(Validator validator) {
	
		this.validator = validator;
	}







	@Override
	public void approveLoan(User user) {
		if (validator.isValid(user)) {
			System.out.println("personal loan is validated");
		}
		else 
			System.out.println("personal loan is NOT validated");
		
	}

}
