public class First_non_repeating_character {
    public static void main(String[] args) {
        String st = "geeksforgeeks";

        for (int i=0; i<st.length();i++) {
            int count = 0;
           for(int j=0; j<st.length();j++){
               if(st.charAt(i)==st.charAt(j)){
                   count++;
               }
           }
           if(count==1){
               System.out.print(st.charAt(i));
               break;
           }
        }
    }
}
