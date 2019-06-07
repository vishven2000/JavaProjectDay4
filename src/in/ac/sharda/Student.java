package in.ac.sharda;

public class Student implements IResultArrivedListener {
	
	private final int rollNumber;
	private final String name;
	private String email;
	
	public Student(int rn, String n) {
		this.rollNumber = rn;
		this.name = n;
		
	}
	
	public Student(int rn, String n,String email) {
		this.rollNumber = rn;
		this.name = n;
		this.email=email;
	}
		
	public void Attendance() {
		System.out.println("the student is present");
	}
	public int getRollNumber() {
		return rollNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			return ((Student)obj).getRollNumber() == rollNumber;
		}
		
		return false;
	}
	
	@Override
	public void resultArrived() {
		System.out.println("result just arrived !!!"+name);
	}

}
