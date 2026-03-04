
public class RemoveCharacters
{
	public static void main(String[] args) {
	    String st = "computer";
	    String str = "cat";
	    String res = " ";

	    for(int i = 0; i<str.length(); i++){
	        for(int j=0; j<st.length();j++){
	            if(st.charAt(j)==str.charAt(i)){
	               continue;
	            }else{
	                 res += st.charAt(j);
	            }
	        }
	        st = res;
	        res = "";
	    }
	    System.out.print(st);
	}
}
