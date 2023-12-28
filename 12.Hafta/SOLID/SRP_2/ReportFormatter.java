package SRP_2;

public class ReportFormatter {
	
	String formattedOutput;
	public ReportFormatter(Object object,FormatType formatType) {
		switch (formatType) {
		case XML: 
			formattedOutput = convertObjectToXML(object);
			break;
		case CSV:			
			formattedOutput = convertObjectToCSV(object);
			break;		
		}
		
	}
	public String convertObjectToXML(Object object) {
		return "XML:<title>"+object.toString()+"</title>";
	}
	public String convertObjectToCSV(Object object) {
		return ",,,"+object.toString()+",,,";
	}
	public String getFormattedValue() {
		return formattedOutput;
	}
}
