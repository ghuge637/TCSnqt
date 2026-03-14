public class Main {
    public static void main(String[] args) {

        String st = "1abc213";
        int sum = 0;

        for (int i = 0; i < st.length(); i++) {
            if (Character.isDigit(st.charAt(i))) {
                int num = 0;

                // Consume all consecutive digits
                while (i < st.length() && Character.isDigit(st.charAt(i))) {
                    num = num * 10 + (st.charAt(i) - '0');
                    i++;
                }

                sum += num;
                i--; // Step back: outer for-loop will i++ again
            }
        }

        System.out.println(sum); 
    }
}
