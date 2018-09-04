package Bank;

public class EligibleforCreditcard {

	public static String Firstname;
	public static String Lastname;
	public static int Age;
	public static float AccountBalance;
	public boolean EligibleforCreditcard;

	public static void main(String[] args) {
		AccountHolder();
		Condition();
	}
	public static void AccountHolder(){
		Firstname = "Venkatraman";
		Lastname="Rajaram";
		Age= 45;
		AccountBalance= (float) 350000.00;
	}
	public static void Condition(){
		if((Age>25) && (AccountBalance>=25000.00))  {
			System.out.println(Firstname+" is eligible for credit card");
		} else {System.out.println(Firstname+" is not eligible for credit card");}
	}
}

