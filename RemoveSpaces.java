public class RemoveSpaces
{
	public static void main(String[] args) {
	   String st = "a bc d";

        for(int i=0; i<st.length();i++){
            if(st.charAt(i)==' '){
                continue;
            }else{
                System.out.print(st.charAt(i));
            }
        }
	}
}
