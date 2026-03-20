/**A bank gives 5% interest if balance > 10000, else 3%. Given initial balance, calculate balance after 1 year.**/

public class InterestRate
{
	public static void main(String[] args) {
	    double balance = 15000;
	    
	    if(balance>10000){
	        System.out.println(balance+(balance*(5.0/100.0)));
	    }else{
	        System.out.println(balance+(balance*(3.0/100.0)));
	    }
	}
}
