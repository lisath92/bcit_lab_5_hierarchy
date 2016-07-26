import java.util.HashMap;

/**
 * 
 */

/**
 * @author Lisa Hsu
 *
 */
public class Student extends Profile {
	private HashMap<String, Double> courses;

	/**
	 * Default constructor.
	 */
	public Student() {
	}

	/**
	 * @param firstName
	 *            of the student.
	 * @param lastName
	 *            of the student.
	 * @param email
	 *            of the stdeutn.
	 * @param bcitId
	 *            of the student.
	 */
	public Student(String firstName, String lastName, String email, String bcitId) {
		super(firstName, lastName, email, bcitId);
		courses = new HashMap<String, Double>();
	}

	/**
	 * Add new course and grades to the HashMap.
	 * 
	 * @param course
	 *            is the course of the student.
	 * @param grade
	 *            is the grade of the course of the student.
	 */
	public void addCourse(String course, double grade) {
		if (course != null && course.length() > 0) {
			if (grade > 0 && grade <= 100) {
				courses.put(course, grade);
			} else {
				System.out.println("That is not a valid grade input.");
			}
		} else {
			System.out.println("That is not a valid course name.");
		}
	}
	
	/**
	 * Calculates the average of the student's grade.
	 * @return the average of the student's grade as a double.
	 */
	public double calculateAverage() {
		double total = 0;
		for (String course : courses.keySet()) {
			total += courses.get(course);
		}
		if (!courses.isEmpty()) { 
			return total/courses.size();
		} else {
			return 0.0;
		}
	}
}
