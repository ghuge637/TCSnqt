// Input:
// 3 -> Value of N1
// 3 -> Value of N2
// {3,5,2} -> a[], Elements a[0]to a[N1-1], where each input element is separated by new line
// {1,2,3} -> b[], Elements b[0]to b[N2-1), where each input element is separated by new line
// • Output: 2.50
// • Explanation:
// From the inputs given above:
// Number of strong ground positions on road A:3
// Number of strong ground positions on road B:3
// The positions of strong ground from the starting point of road A are at a distance of 3,5,2 The
// positions of strong ground from the starting point of road B are at a distance of 1,2,3
// Combining the strong ground positions of both the roads and sorting them in ascending
// order
// 1,2,3,5
// Middle points are 2 and 3
// 2+3=5
// 5/2=2.5
// So, the middle point from where the bridge should be constructed is 2.5.
// Hence, the output is 2.50
import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    int[] arr1 = {2,3};
	    int[] arr2 = {5,6,4};
	    
	    Arrays.sort(arr1);
	    Arrays.sort(arr2);
	    
	    ArrayList<Integer> arr = new ArrayList<Integer>();
	    
	    int index1=0, index2=0;
	    
	    while(index1!=arr1.length && index2!=arr2.length){
	        if(arr1[index1]==arr2[index2]){
	            arr.add(arr1[index1]);
	            index1++;
	            index2++;
	            
	        }else if(arr1[index1]<arr2[index2]){
	            arr.add(arr1[index1]);
	            index1++;
	        }else{
	            arr.add(arr2[index2]);
	            index2++;
	        }
	    }
	    
	    if(index1 < arr1.length){
	        for(int i=index1; i<arr1.length; i++){
	            arr.add(arr1[index1]);
	            index1++;
	        }
	    }
	    
	    if(index2 < arr2.length){
	        for(int i=index2; i<arr2.length; i++){
	            arr.add(arr2[index2]);
	            index2++;
	        }
	    }
	   
	   if(arr.size()%2 == 0){
	       int num = arr.size()/2;
	       float res = (arr.get(num)+arr.get(num-1));
	       System.out.print(res/2.0);
	       
	   }else{
	       int num = arr.size()/2;
	       System.out.print(arr.get(num));
	   }
	}
}
