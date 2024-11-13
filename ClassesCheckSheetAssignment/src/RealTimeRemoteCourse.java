
public class RealTimeRemoteCourse extends OnlineCourse {
	private int zoomRoomCode;

	public RealTimeRemoteCourse() {
		super();
		this.zoomRoomCode = 010101;
	}

	public RealTimeRemoteCourse(String courseNumber, int numStudents, int maxStudents, int credits, int zoomRoomCode) {
		super(courseNumber, numStudents, maxStudents, credits);
		this.zoomRoomCode = zoomRoomCode;
	}

	public int getZoomRoomCode() {
		return zoomRoomCode;
	}

	public void setZoomRoomCode(int zoomRoomCode) {
		this.zoomRoomCode = zoomRoomCode;
	}

	@Override
	public String toString() {
		return "RealTimeRemoteCourse [zoomRoomCode=" + zoomRoomCode + ", getCourseNumber()=" + getCourseNumber()
				+ ", getNumStudents()=" + getNumStudents() + ", getMaxStudents()=" + getMaxStudents()
				+ ", getCredits()=" + getCredits() + "]";
	}
	
	
}
