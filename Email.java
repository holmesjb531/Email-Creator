import java.util.Scanner;

public class Email {

	private String firstName;
	private String lastName;
	private String password;
	private String email;
	private String department;
	private String alternateEmail;
	private String companySuffix = "javacompany.com";
	
	//Constructor to receive the first and last name
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = setDepartment();
		this.password = randomPassword(7);
		this.email = email();

	}
	
	//method to determine the department
	private String setDepartment() {
		
		System.out.println("Enter the department\n1: for Sales\n2: for development\n3: for accounting\n0: for none");
		Scanner sc = new Scanner(System.in);
		int departmentChoice = sc.nextInt();
		
		if(departmentChoice == 1) {
			return "sales";
		} else if(departmentChoice == 2) {
			return "development";
		}else if(departmentChoice == 3) {
			return "accounting";
		}else {
			return "Not in a department";
		}
	}
	
	//method to generate random string password
	private String randomPassword(int length) {
		String randomPass = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%^&*";
		char[] password = new char[length];
		
		for(int i = 0; i < length; i++) {
			int random = (int) (Math.random() * randomPass.length());
			password[i] = randomPass.charAt(random);
			
		}
			return new String(password);
	}
	
	private String email() {
		return firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + this.department + companySuffix;
	}
	
	//setters and getters
	
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail = altEmail;
	}
	
	
	public String getAlternateEmail() {
		return alternateEmail;
	}
	
	public String getPassword() {
		return password;
	}
	
	public String showInfo() {
		return "\nDISPLAY NAME: " + firstName + " " + lastName +
				"\nDEPARTMENT: " + department + 
				"\nCOMPANY EMAIL: " + email + 
				"\nPASSWORD: " + password;
	}
	
	
}
