import java.util.ArrayList;
import java.util.List;

public class Course {
	// Create static variable to count courses
	private static int courseCount = 0;

	// Create instance variables
	private int courseID;
	private int numStudents;
	private int maxStudents;
	private int credits;
	private String courseNum;
	private List<Student> listOfStudents;

	public Course() {
		courseCount++;
		this.courseID = courseCount;
		this.courseNum = "";
		this.numStudents = 0;
		this.maxStudents = 0;
		this.credits = 0;
		listOfStudents = new ArrayList<Student>();
	}

	public Course(String courseNum, int numStudents, int maxStudents, int credits) {
		courseCount++;
		this.courseID = courseCount;
		this.courseNum = courseNum;
		this.numStudents = numStudents;
		this.maxStudents = maxStudents;
		this.credits = credits;
		listOfStudents = new ArrayList<Student>();
	}

	public void addStudent(Student stu) {
		listOfStudents.add(stu);
		numStudents++;
	}

	public void removeStudent(Student stu) {
		listOfStudents.remove(stu);
		numStudents--;
	}
	
	public void removeStudent(int stuNum) {
		for (Student student : listOfStudents) {
			if (student.getStudentNumber() == stuNum) {
				listOfStudents.remove(student);
				numStudents--;
			}
		}
	}

	public int getNumStudents() {
		return numStudents;
	}

	public void setNumStudents(int numStudents) {
		this.numStudents = numStudents;
	}

	public int getMaxStudents() {
		return maxStudents;
	}

	public void setMaxStudents(int maxStudents) {
		this.maxStudents = maxStudents;
	}

	public int getCredits() {
		return credits;
	}

	public void setCredits(int credits) {
		this.credits = credits;
	}

	public String getCourseNum() {
		return courseNum;
	}

	public void setCourseNum(String courseNum) {
		this.courseNum = courseNum;
	}

	public List<Student> getListOfStudents() {
		return listOfStudents;
	}

	public void setListOfStudents(List<Student> listOfStudents) {
		this.listOfStudents = listOfStudents;
	}

	public int getCourseID() {
		return courseID;
	}

	@Override
	public String toString() {
		return "Course [courseID=" + courseID + ", courseNum=" + courseNum + ", numStudents=" + numStudents
				+ ", maxStudents=" + maxStudents + ", credits=" + credits + "]";
	}
}
