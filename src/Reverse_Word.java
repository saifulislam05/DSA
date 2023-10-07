import java.util.Scanner;

public class Reverse_Word {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        scn.close();
        String[] strArr = str.trim().split("\\s+");
        String ans = "";
        for (int i = strArr.length - 1; i >= 0; i--) {
            if (i==0) {
                ans += strArr[i];                
            } else {
                ans += strArr[i] + " ";
            }
        }
        System.out.println(ans);
    }
}
