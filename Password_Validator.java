/*
A password is valid only if:

Length >= 8
Contains at least one digit
Contains at least one uppercase letter
*/

public class Password_Validator
{
	public static void main(String[] args) {
	    
	    String pass = "Hello@12";
	    boolean dig = false, up = false;
	    
	    if(pass.length()>= 8){
	        for(int i = 0; i < pass.length(); i++){
	            if(Character.isDigit(pass.charAt(i))) dig = true;
	            if(Character.isUpperCase(pass.charAt(i))) up = true;
	        }
	    }
	    
	    if(dig == true && up == true){
	        System.out.print("Valid");
	    }else{
	        System.out.print("Not Valid");
	    }
	    
	}
}
