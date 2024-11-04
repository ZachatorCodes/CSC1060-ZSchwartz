import java.util.ArrayList;
import java.util.List;

public class Course {
	private static int courseCount = 0;
	private int courseID = 0;
	private String courseNum;
	private int numStudents;
	private int maxStudents;
	private int credits;
	private List<Student> listOfStudents;

	public Course() {
		courseCount++;
		this.courseID = courseCount;
		this.courseNum = "";
		this.numStudents = 0;
		this.maxStudents = 0;
		this.credits = 0;
		this.listOfStudents = new ArrayList<Student>();
	}

	public Course(String courseNum, int numStudents, int maxStudents, int credits) {
		courseCount++;
		this.courseID = courseCount;
		this.courseNum = courseNum;
		this.numStudents = numStudents;
		this.maxStudents = maxStudents;
		this.credits = credits;
		this.listOfStudents = new ArrayList<Student>();
	}
	
	public void addStudent(Student stu) {
		
	}

	public String getCourseNum() {
		return courseNum;
	}

	public void setCourseNum(String courseNum) {
		this.courseNum = courseNum;
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

	@Override
	public String toString() {
		return "Course [courseID=" + courseID + ", courseNum=" + courseNum + ", numStudents=" + numStudents
				+ ", maxStudents=" + maxStudents + ", credits=" + credits + "]";
	}
}
