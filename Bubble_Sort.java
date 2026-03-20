

public class Main
{
	public static void main(String[] args) {
	    int[] arr = {4,6,5,1,3,2};
	    
	    for(int i=0; i<arr.length; i++){
	        for(int j=0; j<arr.length; j++){
	            if(arr[j]>arr[i]){
	                int temp = arr[i];
	                arr[i] = arr[j];
	                arr[j] = temp;
	            }
	        }
	    }
	    
	    for(int i=0; i<arr.length; i++){
	        System.out.print(arr[i]+" ");
	    }
	}
}
