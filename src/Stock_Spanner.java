import java.util.Scanner;
import java.util.Stack;

public class Stock_Spanner {
    public static int [] stockSpanner(int [] arr) {
        int[] ans = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        ans[0] = 1;
        st.push(0);
        for (int i = 1; i < arr.length; i++) {
            while (st.size() != 0 && arr[st.peek()] < arr[i]) {
                st.pop();
            }
            if (st.size() == 0) {
                ans[i] = 1;
            }
            else {
                ans[i] = i - st.peek();
            }
            st.push(i);
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        scn.close();

        int[] ans = stockSpanner(arr);
        for (int value : ans) {
            System.out.print(value+" ");
        }
    }
}
