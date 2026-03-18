
public class Prime_Numbers
{
	public static void main(String[] args) {
	    int num = 37 ;
	    
	    if(num < 2){
	         System.out.print(" Prime");
	         return;
	    }
	    
	    for(int i=2; i<Math.sqrt(num); i++){
	        if(num%i==0){
	            System.out.print("Not Prime");
	           return;
	        }
	    }
	    
	    System.out.print(" Prime");
	    
	}
}
