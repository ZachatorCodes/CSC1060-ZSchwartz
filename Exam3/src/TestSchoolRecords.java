import java.util.ArrayList;
import java.util.List;

public class TestSchoolRecords {

	public static void main(String[] args) {
		// Create a new ArrayList to hold all people;
		List<Person> peopleList = new ArrayList<Person>();
		
		// Create student 1 and add it to ArrayList
		Student student1 = new Student("Zach Schwartz", "123 Computer Science Ln", "7205551234", "zachemail@student.cccs.edu", "Freshman");
		peopleList.add(student1);
		
		// Create student 2 and add it to ArrayList
		Student student2 = new Student("Holden James", "1020 Battle Bus Dr", "3035553600", "holdenthefort@student.cccs.edu", "Junior");
		peopleList.add(student2);
		
		// Create faculty 1 and add it to ArrayList
		Faculty faculty1 = new Faculty("Richard Sampera", "1722 Calculus Cr", "9705551652", "richardthegoat@frcc.com", "FR223", 82500, "August 1st, 2023", "Tuesday - Thursday 12:00pm - 2:00pm", "Junior");
		peopleList.add(faculty1);

		// Create faculty 2 and add it to ArrayList
		Faculty faculty2 = new Faculty("Sean Conte", "1982 Logic St", "3055552164", "seanthelegend@frcc.com", "FR152", 73400, "August 1st, 2024", "By Appointment Only", "Junior");
		peopleList.add(faculty2);
		
		// Create staff 1 and add it to ArrayList
		Staff staff1 = new Staff("Frankie Billybob", "2245 Swagburger Rd", "2405556769", "fbillybob@frcc.com", "FR570", 67825, "January 26th, 2021", "School Counselor");
		peopleList.add(staff1);
		
		// Create staff 2 and add it to ArrayList
		Staff staff2 = new Staff("Jimmy Neutron", "7521 Scienceman Bvld", "8505552196", "neutronscientist@frcc.com", "FR650", 102589, "October 12th, 2018", "Researcher");
		peopleList.add(staff2);
		
		// Use foreach loop to loop through all people in list
		for (Person person: peopleList) {
			printPersonInfo(person);
			System.out.println();
		}
	}
	
	// Method to print person info without using toString method (using type casting and getters)
	public static void printPersonInfo(Person tempPerson) {
		if (tempPerson instanceof Student) {
			Student person = (Student) tempPerson;
			System.out.println(
				"Student [\n  "
				+ "status = " + person.getStatus()
				+ "\n  name = " + person.getName()
				+ "\n  address = " + person.getAddress()
				+ "\n  phoneNumber = " + person.getPhoneNumber()
				+ "\n  emailAddress = " + person.getEmailAddress()
				+ "\n]"
			);
		}
		if (tempPerson instanceof Faculty) {
			Faculty person = (Faculty) tempPerson;
			System.out.println(
				"Faculty [\n  "
				+ "officeHours = " + person.getOfficeHours()
				+ "\n  rank = " + person.getRank()
				+ "\n  office = " + person.getOffice()
				+ "\n  salary = " + person.getSalary()
				+ "\n  dateHired = " + person.getDateHired()
				+ "\n  name = " + person.getName()
				+ "\n  address = " + person.getAddress()
				+ "\n  phoneNumber = " + person.getPhoneNumber()
				+ "\n  emailAddress = " + person.getEmailAddress()
				+ "\n]"
			);
		}
		if (tempPerson instanceof Staff) {
			Staff person = (Staff) tempPerson;
			System.out.println(
				"Staff [\n  "
				+ "title = " + person.getTitle()
				+ "\n  office = " + person.getOffice()
				+ "\n  salary = " + person.getSalary()
				+ "\n  dateHired = " + person.getDateHired()
				+ "\n  name = " + person.getName()
				+ "\n  address = " + person.getAddress()
				+ "\n  phoneNumber = " + person.getPhoneNumber()
				+ "\n  emailAddress = " + person.getEmailAddress()
				+ "\n]"
			);
		}
	}

}
