/*
Base fare = ₹50 for first 5 km. After 5 km, ₹12/km. If ride is at night (10PM–6AM), add 20% surcharge. */

public class Cab_Fare_Calculator
{
	public static void main(String[] args) {
	    
	    double km = 12;
        int hour = 23; // 11 PM
        double fare = 50;
	    
	    if(km>5){
	       fare += (km - 5) * 12;
	    }
	    
	    if(hour<6 || hour>=22){
	        fare += fare*(20.0/100.0);
	    }
	    
	    System.out.println(fare);
	}
}
