public class Strong_Number
{
    static int fac(int n){
        int result = 1;
        for(int i=1; i<=n; i++){
            result = result*i;
        }
        return result;
    }
    
	public static void main(String[] args) {
	    int num1 = 534, num2 = num1;
	    int sum=0;
	    
	    
	    while(num1>0){
	        int dig = num1%10;
	        sum += fac(dig);
	        num1 /= 10;
	    }
	    
	    System.out.print(num2 == sum ?"Yes":"No");
		
	}
}
