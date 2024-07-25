package core_concepts;

class RBI{
	
	int NEFT_charges;
	String message;
	public RBI(int charges, String message) {
		this.NEFT_charges = charges;
		this.message = message;
	}
	int ROI = 5;
	public void rateOfInterest() {
		System.out.println("rate of interest is "+this.ROI);
	}
	
}
public class BankTest extends RBI {
	
	int AC_No;
	String AC_holder_name;
	String Email;
	static String BranchName = "GopalaGowdaExtention";
	static String IFSC = "SBIN0001122";

	public BankTest(int number, String name, int NEFT_charges, String message) {
		super(NEFT_charges, message);
		AC_No = number;
		AC_holder_name = name;
		
	}
	public BankTest(int number, String name, String Email, int NEFT_charges, String message) {
		super(NEFT_charges, message);
		AC_No = number;
		AC_holder_name = name;
		this.Email = Email;
	}
	public void displayROI() {
		super.rateOfInterest();
	}
	public void display_ach_info() {
		System.out.println(super.ROI+"\n"+"account number: " + AC_No+"\n"+
							"account holder name: "+AC_holder_name+"\n"+
							"Email: "+this.Email+"\n"+
							"Branch Name: "+BankTest.BranchName+"\n"+
							"IFSC :"+BankTest.IFSC );
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankTest ah1 = new BankTest(1, "pradeep", 1, "instruction");
//		BankTest ach2 = new BankTest(0002, "xyz");
//		BankTest ah3 = new BankTest(0003, "ABC", "abc@gmail.com");
//		ah1.display_ach_info();
//		ach2.display_ach_info();
//		ah3.display_ach_info();
		
		ah1.displayROI();
		

	}

}
