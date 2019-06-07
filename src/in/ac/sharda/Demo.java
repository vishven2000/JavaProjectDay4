package in.ac.sharda;

public class Demo {

	public static void main(String[] args) {
		Student s = new Student(1, "Shubham");
		Student s1 = new Student(2, "Rohan", "rohangmail");
		System.out.println(s.equals(s1));
		System.out.println(s.getRollNumber());
		System.out.println(s.getName());
		
		
		System.out.println(s1.getRollNumber());
		System.out.println(s1.getName());
		System.out.println(s1.getEmail());
		

	}

}
