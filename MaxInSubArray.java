/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class MaxInSubArray
{
	public static void main(String[] args) {
	    int[] arr = {1,4,2,6,8,2,9,12};
	    int k = 3;
	     
	    
	   for(int i=0; i<arr.length-2;i++){
	       int max = arr[i];
	       for(int j = i; j<i+k; j++){
	           if(arr[j]>max){
	               max = arr[j];
	           }
	       }
	       System.out.print(max + " ");
	       
	   }
		
	}
}
