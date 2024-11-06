import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CSclasses {
	private static Course[] courseArray = new Course[6];
	private static List<Student> studentList = new ArrayList<Student>();

	public static void main(String[] args) {
		// Create Scanner Object
		Scanner scnObj = new Scanner(System.in);

		// Create 6 classes with Course constructor
		courseArray[0] = new Course("CSC1060", 24, 32, 4);
		courseArray[1] = new Course("MATH2410", 19, 24, 5);
		courseArray[2] = new Course("PHI1013", 22, 26, 3);
		courseArray[3] = new Course("CSC1061", 23, 32, 4);
		courseArray[4] = new Course("MATH 2420", 17, 24, 5);
		courseArray[5] = new Course("PSY1002", 30, 30, 3);

		// Create students and add them to the list
		studentList.add(new Student("Zach", "Schwartz"));
		studentList.add(new Student("Holden", "James"));
		studentList.add(new Student("Babka", "Cat"));

		addStudentToCourse(studentList.get(0), courseArray[0]);
		
		System.out.print("Please enter a student ID: ");
		int stuId = scnObj.nextInt();
		System.out.print("Please enter a course ID: ");
		int courseID = scnObj.nextInt();
		
		addStudentToCourse(findStudent(stuId), findCourse(courseID));
	}
	
	public static void addStudentToCourse(Student student, Course course) {
		student.addCourse(course);
		course.addStudent(student);
	}
	
	public static Course findCourse(int id) {
		for (Course course : courseArray) {
			if (course.getCourseID() == id) {
				return course;
			}
		}
		return null;
	}
	
	public static Student findStudent(int id) {
		for (Student student : studentList) {
			if (student.getStudentNumber() == id) {
				return student;
			}
		}
		return null;
	}

}
