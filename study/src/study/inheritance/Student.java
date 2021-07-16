package study.inheritance;

public class Student extends School {

	@Override
	public void address() {
		System.out.println("Student address");
	}
	public static void main(String[] args) {
		Student obj= new Student();
		obj.address();
		System.out.println(obj.a);
	}
	
	
	
	
}
