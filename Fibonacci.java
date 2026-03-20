/*
A scientist observes population doubling in Fibonacci pattern. Print first N values.
*/

public class Fibonacci
{
	public static void main(String[] args) {
	    int n = 8;
	    int f = 0, s=1;
	    int sum = 0;
	    System.out.print(f+" "+s);
	    
	    for(int i=2; i<n; i++){
	        sum = f + s;
	        f = s; s = sum;
	        System.out.print(" "+sum);
	    }
	}
}
