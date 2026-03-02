import java.util.Arrays;
public class Mean_and_Median
{
	public static void main(String[] args) {
	    int[] arr = {2, 8, 3, 4};
	    int total = 0;
	    Arrays.sort(arr);
	   
	   for(int i = 0; i<arr.length; i++){
	       total += arr[i];
	   }
	   System.out.println("Mean: "+total/arr.length);
	   
	   if(arr.length%2 == 0){
	       int mid = arr.length/2;
	       System.out.println("Mid: "+(arr[mid]+arr[mid-1])/2);
	   }else{
	        System.out.println("Mid: "+arr[arr.length/2]);
	   }
	   
	}
}
