import java.util.ArrayList;
import java.util.List;

public class CSclasses {

	public static void main(String[] args) {
		// Create ArrayList to hold courses
		List<Course> courses = new ArrayList<Course>();
		
		// Create one of each course and add the course to the ArrayList
		InPersonCourse inPersonCourse = new InPersonCourse("MATH2410", 24, 32, 5, 223);
		courses.add(inPersonCourse);
		
		FullRemoteCourse fullRemoteCourse = new FullRemoteCourse("CSC1060", 20, 24, 4, "supercoolteacher@frcc.com");
		courses.add(fullRemoteCourse);
		
		RealTimeRemoteCourse realTimeRemoteCourse = new RealTimeRemoteCourse("PHI1013", 28, 32, 3, 226536);
		courses.add(realTimeRemoteCourse);
		
		// Print courses using for of loop
		for (Course course: courses) {
			printCourseDetailsToString(course);
		}
		
		// Print courses using for loop
		for (int i = 0; i < courses.size(); i++) {
			printCourseDetailsToString(courses.get(i));
		}
	}
	
	public static void printCourseDetailsToString(Course course) {
		System.out.println(course.toString());
	}
	
	public static void printCourseDetailsManually(Course tempCourse) {
		if (tempCourse instanceof InPersonCourse) {
			InPersonCourse course = (InPersonCourse) tempCourse;
			System.out.println(
				"InPersonCourse [\n"
				+ "  roomNumber = " + course.getRoomNumber()
				+ "\n  courseNumber = " + course.getCourseNumber()
				+ "\n  numStudents = " + course.getNumStudents()
				+ "\n  maxStudents = " + course.getMaxStudents()
				+ "\n  credits = " + course.getCredits()
				+ "\n]"
			);
		}
		if (tempCourse instanceof FullRemoteCourse) {
			FullRemoteCourse course = (FullRemoteCourse) tempCourse;
			System.out.println(
				"FullRemoteCourse [\n"
				+ "  email = " + course.getEmail() 
				+ "\n  courseNumber = " + course.getCourseNumber()
				+ "\n  numStudents = " + course.getNumStudents()
				+ "\n  maxStudents = " + course.getMaxStudents()
				+ "\n  credits = " + course.getCredits()
				+ "\n]"
			);
		}
		if (tempCourse instanceof RealTimeRemoteCourse) {
			RealTimeRemoteCourse course = (RealTimeRemoteCourse) tempCourse;
			System.out.println(
				"RealTimeRemoteCourse [\n"
				+ "  zoomRoomCode = " + course.getZoomRoomCode()
				+ "\n  courseNumber = " + course.getCourseNumber()
				+ "\n  numStudents = " + course.getNumStudents()
				+ "\n  maxStudents = " + course.getMaxStudents()
				+ "\n  credits = " + course.getCredits()
				+ "\n]"
			);
		}
	}
}
