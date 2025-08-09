package javaconcepts;

public class TernaryOperatorPractice {

	public static void main (String[] args) {
	// Practise 1 Payment approval based on balance
	double accountbalance= 1200;
	double purchaseamount=1000;
	String paymentstatus=(accountbalance>=purchaseamount)? "Payment Aproved":  "Insufficient Balance";
	System.out.println("paymentstatus");
		
     //Discout eligiblity in shopping
	double totalpurchase=1000;
	String discount=(totalpurchase>500)? "Eligblie for 10% discount": "No discount applicable";
    System.out.println("discount");
    
	//Practice 3 banking loan interest rate based on credit score
    int creditscore= 500;
    double interestrate= (creditscore>=700)? 5.5: 7.0;
    System.out.println("Interest Rate"+ interestrate + "%");
	
	}
}