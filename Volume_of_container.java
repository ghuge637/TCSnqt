/******************************************************************************

Input:
5, 105 -> N = 5, K=105
10 10 40 50 90 -> price of container of each fuel category.
10 20 20 50 150 -> volume of container of each fuel Category.
• Output:
         170
• Explanation:
There are 5 fuel categories and Hani has 105 units of $ money. To have maximum fuel
volume Hari can buy oil at 2nd and 5th position. Total cost= 10 + 90 = 100 and it is less
than 105(money which Hari has). Total volume = 20 + 150 = 170. It’s the max volume
Hari can get; no other combination can get more volume than this.

*******************************************************************************/

public class Volume_of_container
{
    public static int value(int arr[], int k,int arr2[]){
        int total = k;
        int volume = 0;
        
        for(int i=arr.length-1; i>=0; i--){
            if(arr[i] < k){
                k = k-arr[i];
                volume += arr2[i];
            }
        }
        return volume;
    }
    
	public static void main(String[] args) {
	    
	    int[] arr1 = {10, 10, 40, 50, 90};
	    int[] arr2 = {10, 20, 20, 50, 150};
	    int k = 105;
	    
	    int index = value(arr1,k,arr2);
	    
	    System.out.print(index);
	}
}
