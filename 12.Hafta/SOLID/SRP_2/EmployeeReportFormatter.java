package SRP_2;

public class EmployeeReportFormatter extends ReportFormatter {
	Employee anEmployee;
	FormatType fotmatType;
	
	public EmployeeReportFormatter(Employee employee, FormatType formatType) {
		super(employee, formatType);
		// TODO Auto-generated constructor stub
	}

	public String getFormmattedEmployee() {
		return getFormattedValue();
	}
	
}
