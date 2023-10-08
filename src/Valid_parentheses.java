import java.util.Scanner;
import java.util.*;

public class Valid_parentheses {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        scn.close();
        System.out.println(isValid(str));
    }

    public static boolean isValid(String str) {
        Stack<Character> st = new Stack<>();
        for (char c : str.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                st.push(c);
            } else if (c == ')' && !st.isEmpty() && st.peek() == '(') {
                st.pop();
            } else if (c == ']' && !st.isEmpty() && st.peek() == '[') {
                st.pop();
            } else if (c == '}' && !st.isEmpty() && st.peek() == '{') {
                st.pop();
            } else {
                return false;
            }
        }
        return st.isEmpty();
    }
}