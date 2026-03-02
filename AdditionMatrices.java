public class AdditionMatrices
{
	public static void main(String[] args) {
	   
    	   int[][] arr = { {1, 1, 1}, {2, 2, 2}, {3, 3, 3}, {4, 4, 4} };
    	   
    	   int[][] arr2 = { {1, 1, 1}, {2, 2, 2}, {3, 3, 3}, {4, 4, 4} };
                    	   
           int[][] res = new int[4][3];
                    	   
            if(arr.length == arr2.length && arr[0].length == arr2[0].length){
                for(int i=0; i<arr.length; i++){
                    for(int j=0; j<arr[0].length; j++){
                        res[i][j] = arr[i][j]+arr2[i][j];
                    }
                }
            }
	   
	            for(int i=0; i<arr.length; i++){
                    for(int j=0; j<arr[0].length; j++){
                        System.out.print(res[i][j]+" ");
                    }System.out.println();
                }
	}
}
