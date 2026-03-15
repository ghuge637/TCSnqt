
public class Find_Smallest_and_Largest_Word {
    public static void main(String[] args) {
        String st = "This is a test string";
        String[] arr = st.split(" ");
        
        int min = arr[0].length();
        String minst =arr[0];
        int max = arr[0].length();
        String maxst = arr[0];
        
        for (int i=0; i<arr.length;i++) {
            if(min>arr[i].length()){
                min = arr[i].length();
                minst = arr[i];
            }
            if(max<arr[i].length()){
                max = arr[i].length();
                maxst = arr[i];
            }
        }
        
        System.out.println(minst);
        System.out.print(maxst);
    }
}
