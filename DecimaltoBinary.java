public class DecimaltoBinary
{
	public static void main(String[] args) {
	    int num = 8;
	    String binary = "";
	    
	    while(num>0){
	       int rem = num%2;
	       binary = rem + binary;
	       num /= 2;
	    }
		System.out.println(binary);
	}
}
