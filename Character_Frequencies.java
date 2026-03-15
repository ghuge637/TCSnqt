import java.util.*;

public class Character_Frequencies {
    public static void main(String[] args) {
        String st = "geeksforgeeks";
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();

        for (char ch : st.toCharArray()) {
          
            // map.put(ch, map.getOrDefault(ch, 0) + 1); --> it use to write withou using if else below condition
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);  // key exists → increment
            } else {
                map.put(ch, 1);                 // key missing → start at 1
            }
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.print(entry.getKey() + "" + entry.getValue() + " ");
        }
    }
}
