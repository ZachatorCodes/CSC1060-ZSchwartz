
public class Course {
	private String courseNum;
	private int numStudents;
	private int maxStudents;
	private int credits;
	
	public Course() {
		this.courseNum = "";
		this.numStudents = 0;
		this.maxStudents = 0;
		this.credits = 0;
	}

	public Course(String courseNum, int numStudents, int maxStudents, int credits) {
		this.courseNum = courseNum;
		this.numStudents = numStudents;
		this.maxStudents = maxStudents;
		this.credits = credits;
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
		return "Course [\n  courseNum = " + courseNum + ",\n  numStudents = " + numStudents + ",\n  maxStudents = " + maxStudents
				+ ",\n  credits = " + credits + "\n]\n";
	}
}
