package week3.day1.org.interfac;

public class Automation extends MultipleLanguage{
	public void Python()
	{
		System.out.println("Python");
	}
	public void Ruby()
	{
		System.out.println("Ruby");
	}
	public void Selenium()
	{
		System.out.println("Selenium");
	}
	public void Java()
	{
		System.out.println("Java");
	}

	public static void main(String[] args) {
		Automation obj = new Automation();
		obj.Python();
		obj.Ruby();
		obj.Selenium();
		obj.Java();

	}

}
