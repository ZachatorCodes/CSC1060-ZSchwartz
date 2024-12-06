import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
//		for (Course course: courses) {
//			printCourseDetailsToString(course);
//		}
		
		// Print courses using for loop
//		for (int i = 0; i < courses.size(); i++) {
//			printCourseDetailsToString(courses.get(i));
//		}
		
		writeFile(courses);
		
		readFile("courses.csv");
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
	
	public static void writeFile(List<Course> courseList) {
		File courseFile = new File("courses.csv");
		FileWriter fileWriter = null;
		BufferedWriter bufferedWriter = null;
	
		try {
			if (courseFile.exists()) {
				courseFile.delete();
			}
			
			if (!courseFile.exists()) {
				courseFile.createNewFile();
			}
			
			fileWriter = new FileWriter(courseFile.getName(), false); // true / false value determines whether to add or reset file
			bufferedWriter = new BufferedWriter(fileWriter);
			
			bufferedWriter.write("CourseType,CourseSpecificInfo,CourseNumber,NumStudents,MaxStudents,Credits\n");
			
			for (Course course: courseList) {
				if (course instanceof InPersonCourse) {
					InPersonCourse temp = (InPersonCourse) course;
					bufferedWriter.write(String.format("InPerson,%d,%s,%d,%d,%d\n",
							temp.getRoomNumber(), temp.getCourseNumber(), temp.getNumStudents(), temp.getMaxStudents(), temp.getCredits()));
				}
				if (course instanceof FullRemoteCourse) {
					FullRemoteCourse temp = (FullRemoteCourse) course;
					bufferedWriter.write(String.format("FullRemote,%s,%s,%d,%d,%d\n",
							temp.getEmail(), temp.getCourseNumber(), temp.getNumStudents(), temp.getMaxStudents(), temp.getCredits()));
				}
				if (course instanceof RealTimeRemoteCourse) {
					RealTimeRemoteCourse temp = (RealTimeRemoteCourse) course;
					bufferedWriter.write(String.format("RealTimeRemote,%d,%s,%d,%d,%d\n",
							temp.getZoomRoomCode(), temp.getCourseNumber(), temp.getNumStudents(), temp.getMaxStudents(), temp.getCredits()));
				}
			}
			bufferedWriter.close();
			fileWriter.close();
		}
		catch (IOException e) {
			System.out.println("Error: IO Exception Caught | Line 125");
			System.out.println("Bye Bye :)");
			System.exit(-1);
		}
	}
	
	public static void readFile(String fileName) {
		File courseFile = new File(fileName);
		Scanner fileReader = null;
		
		try {
			fileReader = new Scanner(courseFile);
		}
		catch (FileNotFoundException e) {
			System.out.println("Error: File Not Found | Line 139");
			System.out.println("Bye Bye :)");
			System.exit(-1);
		}
		
		boolean header = true;
		while (fileReader.hasNextLine()) {
			if (header) {
				fileReader.nextLine();
				header = false;
			}
			String line = fileReader.nextLine();
			String[] tokens = line.split(",");
			
			String courseType = tokens[0];
			String courseNumber = tokens[2];
			int numStudents = Integer.parseInt(tokens[3]);
			int maxStudents = Integer.parseInt(tokens[4]);
			int credits = Integer.parseInt(tokens[5]);
			
			if (courseType.equals("InPerson")) {
				int roomNumber = Integer.parseInt(tokens[1]);
				System.out.println(
					"InPersonCourse [\n"
					+ "  roomNumber = " + roomNumber
					+ "\n  courseNumber = " + courseNumber
					+ "\n  numStudents = " + numStudents
					+ "\n  maxStudents = " + maxStudents
					+ "\n  credits = " + credits
					+ "\n]"
				);
			}
			if (courseType.equals("FullRemote")) {
				String email = tokens[1];
				System.out.println(
					"FullRemoteCourse [\n"
					+ "  email = " + email 
					+ "\n  courseNumber = " + courseNumber
					+ "\n  numStudents = " + numStudents
					+ "\n  maxStudents = " + maxStudents
					+ "\n  credits = " + credits
					+ "\n]"
				);
			}
			if (courseType.equals("RealTimeRemote")) {
				int zoomCode = Integer.parseInt(tokens[1]);
				System.out.println(
					"RealTimeRemoteCourse [\n"
					+ "  zoomRoomCode = " + zoomCode
					+ "\n  courseNumber = " + courseNumber
					+ "\n  numStudents = " + numStudents
					+ "\n  maxStudents = " + maxStudents
					+ "\n  credits = " + credits
					+ "\n]"
				);
			}
			
		}
	}
}
