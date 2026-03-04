public class Remove_all_characters_other_than_alphabets
{
	public static void main(String[] args) {
	    String st = "$v*i;s.h.a,l ghug'^e?";
	    String res = " ";

	   
	        for(int j=0; j<st.length();j++){
	            if((st.charAt(j)>=65 && st.charAt(j)<=90) || (st.charAt(j)>=97 && st.charAt(j)<=122)){
	                res += st.charAt(j);
	            }
	        }
	       
	    System.out.print(res);
	}
}
