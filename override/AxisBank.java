package week3.day1.org.override;

public class AxisBank extends BankInfo{
	public void deposit()
	{
		System.out.println("Deposit account -> ChildClass");
	}
	
	public void MyDeposit()
	{
		this.deposit();
		super.deposit();
	}

	public static void main(String[] args) {
		AxisBank AXB = new AxisBank();
		AXB.MyDeposit();
		
		

	}

}
