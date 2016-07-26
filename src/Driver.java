
public class Driver {

	public static void main(String[] args) {
		Student student_1 = new Student("Ali", "Mohammad", "efrg234@gmail.com", "124359AB");
		Student student_2 = new Student("Bob", "Van", "werit234@live.com", "456234AB");
		Student student_3 = new Student("Student", "Number 1", "num1@hotmail.com", "5467234AB");
		student_1.addCourse("Math", 98.67);
		student_1.addCourse("Science", 56.97);
		student_2.addCourse("Math", 89.56);
		student_2.addCourse("Biology", 99.12);
		student_3.addCourse("Physics", 52.45);
		student_3.addCourse("History", 94.03);
		
		Instructor instructor_1 = new Instructor("Im", "Smart", "32234@yahoo.com", "66534IN", 45.25);
		Instructor instructor_2 = new Instructor("Wylie", "Smith", "ejiowefj@gmail.com", "870546IN", 30.75);
		Instructor instructor_3 = new Instructor("Andy", "Chan", "andy@live.com", "57332IN",30);
		Database records = new Database();
		records.addProfile(student_1);
		records.addProfile(student_2);
		records.addProfile(student_3);
		records.addProfile(instructor_1);
		records.addProfile(instructor_2);
		records.addProfile(instructor_3);
		
		System.out.println("Calculate Student average --------");
		System.out.println("Student 1's average: " + student_1.calculateAverage());
		System.out.println("");
		records.displayDetails();

	}

}
