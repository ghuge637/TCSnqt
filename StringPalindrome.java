public class StringPalindrome
{
	public static void main(String[] args) {
	   String st = "madam";
	   String res = "";

        for(int i=0; i<st.length();i++){
            char ch = st.charAt(i);
            res += ch;
        }
		System.out.println(res.equals(st)?"palindrome":"Not palindrome");
	}
}
