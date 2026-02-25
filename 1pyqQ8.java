import java.util.*;

public class Main
{
	public static void main(String[] args) {
	   
	   String st1 = "ILOVEYOUPIYUUUU";
	   String st2 = "PIYU";
	   
	   StringBuilder res = new StringBuilder(st1);
	   
	   for(int i=0; i<st2.length();i++){
	       char ch = st2.charAt(i);
	       
	       for(int j=res.length()-1; j>0;j--){
	           if(ch == res.charAt(j)){
	               res.deleteCharAt(j); 
	           }
	       }
	   }
	   
	   System.out.print(res);
	   
	}
}
