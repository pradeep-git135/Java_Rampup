package core_concepts;


public class BankTest {
	
	int AC_No;
	String AC_holder_name;
	String Email;
	
	static String BranchName = "GopalaGowdaExtention";
	static String IFSC = "SBIN0001122";
	
	public BankTest(int number, String name) {
		AC_No = number;
		AC_holder_name = name;
	}
	
	public BankTest(int number, String name, String Email) {
		AC_No = number;
		AC_holder_name = name;
		this.Email = Email;
	}
	
	public void display_ach_info() {
		System.out.println("account number: " + AC_No+"\n"+
							"account holder name: "+AC_holder_name+"\n"+
							"Email: "+this.Email+"\n"+
							"Branch Name: "+BankTest.BranchName+"\n"+
							"IFSC :"+BankTest.IFSC );
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankTest ah1 = new BankTest(001, "Pradeep");
		BankTest ach2 = new BankTest(0002, "xyz");
		BankTest ah3 = new BankTest(0003, "ABC", "abc@gmail.com");
		ah1.display_ach_info();
		ach2.display_ach_info();
		ah3.display_ach_info();

	}

}
