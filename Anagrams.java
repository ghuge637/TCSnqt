import java.util.Arrays;
public class Anagrams 
{
	public static void main(String[] args) {
	    String s1 = "allergy" ,  s2 = "kseeg";
	    
	    if(s1.length()!=s2.length()){
	        System.out.println(s1.length()==s2.length());
	        System.exit(0);
	    }
	    
	    char[] arr = s1.toCharArray();
	    char[] arr1 = s2.toCharArray();
	    
	    Arrays.sort(arr);
	    Arrays.sort(arr1);

        System.out.println(Arrays.equals(arr,arr1));

	}
}
