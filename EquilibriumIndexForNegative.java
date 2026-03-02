
public class EquilibriumIndexForNegative
{
	public static void main(String[] args) {
	    int[] arr= {-7, 1, 5, 2, -4, 3, 0}; 
	   
	   for(int i=1; i<arr.length; i++){
            int sum1=0, sum2=0;
	       for(int j = 0; j<i; j++){
	           sum1 += arr[j];
	       }
	       
	       for(int k=i+1; k<arr.length; k++){
	           sum2 += arr[k];
	       }
	       
	       if(sum1 == sum2){
	            System.out.print(i);
	            break;
	        }
	   }
	   
	}
}
