public class HCF
{
	public static void main(String[] args) {
	    int num1 = 20, num2 = 28;
	    
	    for(int i = num1-1; i>=2; i--){
	        if(num1%i==0 && num2%i==0){
	            System.out.println(i);
	            break;
	        }
	    }
		
	}
}
