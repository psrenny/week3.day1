package week3.day1;

public class Students {
	public void getStudentInfo(int id)
	{
		System.out.println("Student ID is : "+id);
	}
	public void getStudentInfo(int id, String name)
	{
		System.out.println("Student ID is : "+id+" , Student Name is : "+name);
	}
	public void getStudentInfo(String email, int phone)
	{
		System.out.println("Student email is : "+email+" , Student Phone Number is : "+phone);
	}

	public static void main(String[] args) {
		Students obj = new Students();
		obj.getStudentInfo(12345);
		obj.getStudentInfo(12345, "Renny");
		obj.getStudentInfo("Testleaf.com", 934834834);

	}

}
