import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
	public static void printCourses(ArrayList<Course> course) {
		for (Course c : course) {
			System.out.println("Course name is " + c.getCName() + " which takes" + c.getDur() +
					" weeks.\nThe instructor of this course is " +
					c.getIns().getFName() +  " " + c.getIns().getLName() +
					" who is a " + c.getIns().getSta(c.getIns().getExp()) +
					" instructor with " + c.getIns().getExp() +
					" year of experience.\nThe Phone number of the instructor is " + c.getIns().getPNumber());			
		}
	}

	public static String findInstructor(ArrayList<Course> course, String lName) {
		for (Course c : course) {
			if (c.getIns().getLName().equalsIgnoreCase(lName)) {
				return c.getCName();
			}
		}
		return "This instructor does not teach any courses";
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Course> courses = new ArrayList<Course>();
		Instructor instructor1 = new Instructor("eduardo", "Rivadeneira", "111-222-3333", 10);
		Instructor instructor2 = new Instructor("Alex", "Turner", "444-555-6666", 6);
		Instructor instructor3 = new Instructor("Tom", "Holland", "777-888-999", 3);
		Course course1 = new Course("fisic", 10, instructor1);
		Course course2 = new Course("math", 11, instructor2);
		Course course3 = new Course("java", 11, instructor3);
		Course course4 = new Course("Data Base", 9, instructor3);
		courses.add(course1);
		courses.add(course2);
		courses.add(course3);
		courses.add(course4);		
		printCourses(courses);
		System.out.println("");
		System.out.print("Enter a last name of instructor: ");
		String lName = input.next();
		System.out.println(findInstructor(courses, lName));
	}
}
