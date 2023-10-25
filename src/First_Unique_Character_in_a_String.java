import java.util.HashMap;
import java.util.Scanner;

public class First_Unique_Character_in_a_String {
    public static int firstUniqChar(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
        }
        for (int i = 0; i < s.length(); i++) {
            int val = hm.get(s.charAt(i));
            if (val == 1) {
                return i;
            }
        }
        return -1;
        
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String str = scn.next();
        scn.close();
        int ans = firstUniqChar(str);
        System.out.print(ans);
    }
}
