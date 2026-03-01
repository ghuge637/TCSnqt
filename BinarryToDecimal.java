public class BinarryToDecimal
{
	public static void main(String[] args) {
	    int num = 0;
	    String binary = "1010";
	    int p = 0;
	    
	    for(int i = binary.length()-1; i>=0; i--){
	        if(binary.charAt(i) == '1'){
	            num +=(int) Math.pow(2,p);
	            p++;
	        }else{
	            p++;
	        }
	    }
	    
		System.out.println(num);
	}
}
