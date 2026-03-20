/*
A shop gives discount based on purchase amount:
> 5000 → 20% off
> 2000 → 10% off
> 1000 → 5% off
else → no discount */

public class Discount
{
	public static void main(String[] args) {
	    double balance = 3000;
	    
	    if(balance>5000){
	        System.out.println(balance-(balance*(20.0/100.0)));
	    }else if(balance>2000){
	        System.out.println(balance-(balance*(10.0/100.0)));
	    } else if(balance>1000){
	        System.out.println(balance-(balance*(5.0/100.0)));
	    } else{
	        System.out.println(balance);
	    }
	}
}
