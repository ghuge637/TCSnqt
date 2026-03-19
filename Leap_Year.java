public class Leap_Year
{
	public static void main(String[] args) {
	    int num1 = 2028;
	   
	   if(num1%400==0){
	       System.out.print("Yes");
	       return;
	   }
	   
	   if(num1%4==0 && num1%100!=0){
	       System.out.print("Yes");
	   }else{
	       System.out.print("No");
	   }
	    
	}
}
