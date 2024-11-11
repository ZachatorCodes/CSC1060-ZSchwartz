
public class InPersonCourse extends Course {
	private int roomNumber;
	
	public InPersonCourse() {
		super();
		roomNumber = 0000;
	}
	
	public InPersonCourse(String courseNumber, int numStudents, int maxStudents, int credits, int roomNumber) {
		super(courseNumber, numStudents, maxStudents, credits);
		this.roomNumber = roomNumber;
	}

	public int getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}

	@Override
	public String toString() {
		return "Course [\n  courseNumber=" + super.getCourseNumber() + "\n  numStudents=" + super.getNumStudents() + "\n  maxStudents=" + super.getMaxStudents()
				+ "\n  credits=" + super.getCredits() + "\n  roomNumber=" + roomNumber + "\n]";
	}
	
}
