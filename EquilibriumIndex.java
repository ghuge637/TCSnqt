
public class EquilibriumIndex
{
	public static void main(String[] args) {
	    int[] arr= {1, 2, 0, 3}; 
	   
	   int total = 0; int sum = 0;
	   
	   
	   for(int i=0; i<arr.length; i++){
	       total += arr[i];
	   }
	   
	    for(int i=0; i<arr.length; i++){
	           sum += arr[i];
	           
	            if((total-sum) == sum){
    	            System.out.print(i+1);
    	            break;
    	        }
	       }
	}
}
