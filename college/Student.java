package week3.day1.org.college;

public class Student extends Department{
	public void studentName()
	{
		System.out.println("Student Name is Renny");
	}
	public void studentDepartment()
	{
		System.out.println("Student Department is Electrical");
	}
	public void studentID()
	{
		System.out.println("Student ID is 8323432");
	}

	public static void main(String[] args) {
		Student obj = new Student();
		obj.collegeCode();
		obj.collegeName();
		obj.collegeRank();
		obj.departmentName();
		obj.studentName();
		obj.studentDepartment();
		obj.studentID();

	}

}
