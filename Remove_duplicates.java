public class Remove_duplicates
{
	public static void main(String[] args) {
	   
    	  int[] arr = {2, 2, 2, 2, 2};
    	  
    	  int index1=0, index2 = 1;
    	  
    	  while(index2<arr.length){
    	      
    	      if(arr[index1] != arr[index2]){
    	          arr[index1+1] = arr[index2];
    	          index2++;
    	          index1++;
    	      }else{
    	          index2++;
    	      }
    	  }
    	  
    	  for(int i=0; i<=index1; i++){
    	      System.out.print(arr[i]+" ");
    	  }
	}
}
