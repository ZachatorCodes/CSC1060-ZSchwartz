
public class Person {
	private String name;
	private String address;
	private int phoneNumber;
	private String emailAddress;
	
	public Person() {
		super();
		this.name = "Placeholder";
		this.address = "123 Placeholder St, Fort Collins, CO 80524";
		this.phoneNumber = 1234567890;
		this.emailAddress = "placeholder@placeholder.com";
	}
	
	public Person(String name, String address, int phoneNumber, String emailAddress) {
		super();
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.emailAddress = emailAddress;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address + ", phoneNumber=" + phoneNumber + ", emailAddress="
				+ emailAddress + "]";
	}
}
