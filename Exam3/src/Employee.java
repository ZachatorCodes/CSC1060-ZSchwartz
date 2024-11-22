
public class Employee extends Person {
	private String office;
	private int salary;
	private String dateHired;
	
	public Employee() {
		super();
		this.office = "FR123";
		this.salary = 75000;
		this.dateHired = "August 1st, 2024";
	}
	
	public Employee(String name, String address, String phoneNumber, String emailAddress, String office, int salary, String dateHired) {
		super(name, address, phoneNumber, emailAddress);
		this.office = office;
		this.salary = salary;
		this.dateHired = dateHired;
	}

	public String getOffice() {
		return office;
	}

	public void setOffice(String office) {
		this.office = office;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getDateHired() {
		return dateHired;
	}

	public void setDateHired(String dateHired) {
		this.dateHired = dateHired;
	}

	@Override
	public String toString() {
		return "Employee [office=" + office + ", salary=" + salary + ", dateHired=" + dateHired + ", getName()="
				+ getName() + ", getAddress()=" + getAddress() + ", getPhoneNumber()=" + getPhoneNumber()
				+ ", getEmailAddress()=" + getEmailAddress() + "]";
	}
}
