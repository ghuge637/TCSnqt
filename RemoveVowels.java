public class RemoveVowels
{
	public static void main(String[] args) {
	   String st = "welcome to CollAge";

        for(int i=0; i<st.length();i++){
            if(st.charAt(i)=='a' || st.charAt(i)=='e' || st.charAt(i)=='i' || st.charAt(i)=='o' || st.charAt(i)=='u' || st.charAt(i)=='A' || st.charAt(i)=='E' || st.charAt(i)=='I' || st.charAt(i)=='O' || st.charAt(i)=='U'){
                continue;
            }else{
                System.out.print(st.charAt(i));
            }
        }
	}
}
