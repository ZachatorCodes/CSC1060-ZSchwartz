import java.util.List;
import java.util.ArrayList;

public class Student {
	private static int idCount = 0;
	private int studentID;
	private String firstName;
	private String lastName;
	private String studentNumber;
	private List<Course> listOfCourses;

	public Student() {
		idCount++;
		studentID = idCount;
		this.firstName = "";
		this.lastName = "";
		this.studentNumber = "S00000000";
		this.listOfCourses = new ArrayList<Course>();
	}

	public Student(String firstName, String lastName, String studentNumber, List<Course> listOfCourses) {
		idCount++;
		studentID = idCount;
		this.firstName = firstName;
		this.lastName = lastName;
		this.studentNumber = studentNumber;
		this.listOfCourses = listOfCourses;
	}
	
	public void addCourse(Course crs) {
		listOfCourses.add(crs);
	}
	
	public void removeCourse(Course crs) {
		listOfCourses.remove(crs);
	}
	
	public void removeCourse(String courseName) {
		for (Course course: listOfCourses) {
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

	public String getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}

	public List<Course> getListOfCourses() {
		return listOfCourses;
	}

	public void setListOfCourses(List<Course> listOfCourses) {
		this.listOfCourses = listOfCourses;
	}

	@Override
	public String toString() {
		return "Student [studentID=" + studentID + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", studentNumber=" + studentNumber + ", listOfCourses=" + listOfCourses + "]";
	}
}
