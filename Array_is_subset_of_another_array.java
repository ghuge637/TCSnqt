import java.util.Arrays;
public class Array_is_subset_of_another_array
{
	public static void main(String[] args) {
	    int[] arr = {11, 1, 13, 21, 3, 7}, arr2 = {11, 3, 7, 1};
	    int start = 0;
	    int d =0;
	    
	    Arrays.sort(arr);
	    Arrays.sort(arr2);
	   
	   for(int i = 0; i<arr.length; i++){
	       
    	     if( arr[i] == arr2[start]){
    	         d++;
                 if(arr2.length-1 > start){
    	             start++;
    	         }else{
    	             break;
    	         }
    	     }
    	     
	   }
	   
	   if(d == arr2.length){
	       System.out.print("True");
	   }else{
	       System.out.print("False");
	   }
	}
}
