import java.util.Arrays;
public class FirstUniqueNumber
{
	public static void main(String[] args) {
	    int[] arr = {-1, 2, -1, 3, 0};
	    int index1 = 1;
	    
	    for(int i = 0; i<arr.length; i++){
	        int num = 0;
	        for(int j = 0; j<arr.length; j++){
	            if((arr[i] == arr[j])){
	                num++;
    	        }
	        }
	        
	        if(num == 1){
	            System.out.println(arr[i]);
	            break;
	        }
	    }
	}
}
