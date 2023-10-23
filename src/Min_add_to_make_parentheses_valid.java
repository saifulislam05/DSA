import java.util.Scanner;

public class Min_add_to_make_parentheses_valid {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        scn.close();

        int openP = 0;
        int closeP = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                openP++;
            } else if (openP != 0 && str.charAt(i) == ')') {
                openP--;
            } else {
                closeP++;
            }
        }
        
        int ans = openP + closeP;
        System.out.print(ans);
    }
}