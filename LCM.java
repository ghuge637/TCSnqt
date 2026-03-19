public class LCM 
{
	public static void main(String[] args) {
	    int num1 = 10, num2 = 5;
	    int i;
	    
	    if(num1>num2){
	        i=num1;
	    }else{
	        i=num2;
	    }
	    
	    
	    while(true){
	        if(i%num1==0 && i%num2==0){
	            System.out.println(i);
	            break;
	        }
	         i++;
	    }
		
	}
}
