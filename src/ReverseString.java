
import java.util.Scanner;
import java.util.*;
public class ReverseString {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        scn.close();
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            st.push(ch);
        }

        String ans = "";
        while (st.size() != 0) {
            ans += st.pop();
        }
        System.out.print(ans);
    }
}
