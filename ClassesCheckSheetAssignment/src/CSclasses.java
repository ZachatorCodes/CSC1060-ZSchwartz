import java.util.ArrayList;
import java.util.List;

public class CSclasses {

	public static void main(String[] args) {
		List<Course> courses = new ArrayList<Course>();
		
		InPersonCourse inPersonCourse = new InPersonCourse("MATH2410", 24, 32, 5, 223);
		FullRemoteCourse fullRemoteCourse = new FullRemoteCourse("CSC1060", 20, 24, 4, "supercoolteacher@frcc.com");
		RealTimeRemoteCourse realTimeRemoteCourse = new RealTimeRemoteCourse("PHI1013", 28, 32, 3, 226536);
		
		System.out.println(inPersonCourse);
		System.out.println(fullRemoteCourse);
		System.out.println(realTimeRemoteCourse);
	}

}
