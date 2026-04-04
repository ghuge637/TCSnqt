/******************************************************************************

Input:
10 15 -> N =10, K = 15
5 3 7 14 18 1 18 4 8 3 -> Number of gold coins in each room.
• Output:
1 3

*******************************************************************************/

public class Subsequence_sum
{
	public static void main(String[] args) {
	    int[] arr = {9, 3, 7, 14, 18, 1, 18, 4, 8, 3};
	    
	    int sum = 0;
	    int start = 0;
	    int end = 0;
	    
	    for(int i=start; i<arr.length; i++){
	        
	        if(sum < 15){
	            sum += arr[i];
	            System.out.println("sum: "+sum);
	        }else if(sum > 15){
	            sum = arr[i];
	            start = i;
	            System.out.println(start);
	        }
	        
	        if(sum == 15){
	            end = i;
	            break;
	        }
	        
	        
	    }
		System.out.println((start+1)+" "+(end+1));
	}
}
