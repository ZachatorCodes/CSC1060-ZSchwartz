import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CSclasses {

	public static void main(String[] args) {
		Scanner scnObj = new Scanner(System.in);
		// Create new array to store 6 courses
		Course[] courseArr = new Course[6];

		// Create new course with default constructor
		// Use setter methods to change data
		courseArr[0] = new Course();
		courseArr[0].setCourseNum("CSC1060");
		courseArr[0].setNumStudents(24);
		courseArr[0].setMaxStudents(32);
		courseArr[0].setCredits(4);

		// Create new course with default constructor
		// Use setter methods to change data
		courseArr[1] = new Course();
		courseArr[1].setCourseNum("MATH2410");
		courseArr[1].setNumStudents(19);
		courseArr[1].setMaxStudents(24);
		courseArr[1].setCredits(5);

		// Create new course with default constructor
		// Use setter methods to change data
		courseArr[2] = new Course();
		courseArr[2].setCourseNum("PHI1013");
		courseArr[2].setNumStudents(22);
		courseArr[2].setMaxStudents(26);
		courseArr[2].setCredits(3);

		// Create new course using constructor
		// Pass all info as parameter
		courseArr[3] = new Course("CSC1061", 23, 32, 4);
		courseArr[4] = new Course("MATH 2420", 17, 24, 5);
		courseArr[5] = new Course("PSY1002", 30, 30, 3);

		// Print all courses
		for (Course course : courseArr) {
			System.out.println(course);
		}

		List<Student> stuList = new ArrayList<Student>();
		
		// Create new Student with default constructor
		Student student1 = new Student();
		student1.setFirstName("Franklin");
		student1.setLastName("Smith");
		student1.setStudentNumber("S10202303");
		student1.getListOfCourses().add(courseArr[0]);

		// Create new Student with other constructor
		Student student2 = new Student("Frank", "Bill", "S23578167", new ArrayList<>(Arrays.asList(courseArr[0], courseArr[1])));
		
		stuList.add(student1);
		stuList.add(student2);
		
		System.out.println(student1);
		System.out.println(student2);
		
		student2.removeCourse(courseArr[1]);
		System.out.println(student2);
	}

}
