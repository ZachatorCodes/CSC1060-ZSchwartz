import java.util.List;
import java.util.ArrayList;

public class Student {
	// Create static variable to count students
	private static int idCount = 0;
	
	// Create instance variables
	private int studentNumber;
	private String firstName;
	private String lastName;
	private List<Course> listOfCourses;

	public Student() {
		idCount++;
		this.studentNumber = idCount;
		this.firstName = "John";
		this.lastName = "Doe";
		listOfCourses = new ArrayList<Course>();
	}

	public Student(String firstName, String lastName) {
		idCount++;
		studentNumber = idCount;
		this.firstName = firstName;
		this.lastName = lastName;
		listOfCourses = new ArrayList<Course>();
	}

	public void addCourse(Course crs) {
		listOfCourses.add(crs);
	}

	public void removeCourse(Course crs) {
		listOfCourses.remove(crs);
	}

	public void removeCourse(String courseName) {
		for (Course course : listOfCourses) {
			if (course.getCourseNum().equals(courseName)) {
				listOfCourses.remove(course);
			}
		}
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public List<Course> getListOfCourses() {
		return listOfCourses;
	}

	public void setListOfCourses(List<Course> listOfCourses) {
		this.listOfCourses = listOfCourses;
	}

	public int getStudentNumber() {
		return studentNumber;
	}

	@Override
	public String toString() {
		return "Student [studentNumber=" + studentNumber + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
}
