import java.util.ArrayList;
import java.util.List;

public class CSclasses {

	public static void main(String[] args) {
		List<Course> courses = new ArrayList<Course>();
		
		Course course = new Course();
		System.out.println(course);
		
		InPersonCourse inPersonCourse = new InPersonCourse("Frcc101", 5, 20, 3, 10);
		System.out.println(inPersonCourse);
	}

}
