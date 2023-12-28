package SRP_2;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee ahmet = new Employee(1, "ahmet", "bilgi iþlem", true);
		hireNewEmployee(ahmet);
		printEmployeeReport(ahmet);
	}
	public static void hireNewEmployee(Employee employee) {
		EmployeeDAO dao = new EmployeeDAO();
		dao.saveEmployee(employee);
	}
	public static void terminateEmployee(Employee employee) {
		EmployeeDAO dao = new EmployeeDAO();
		dao.deleteEmployee(employee);
	}
	
	public static void printEmployeeReport(Employee employee) {
		EmployeeReportFormatter employeeReportFormatter = new EmployeeReportFormatter(employee, FormatType.XML);
		System.out.println(employeeReportFormatter.getFormattedValue());
	}

}
