import java.util.Scanner;
import java.util.Stack;

public class Largest_Rectangle_In_Histogram {
    public static int[] nsel(int[] h) {
        int[] left = new int[h.length];
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < h.length; i++) {
            while (st.size()!=0 && h[st.peek()] >= h[i]) {
                st.pop();
            }
            if (st.size()==0) {
                left[i] = -1;
            } else {
                left[i] = st.peek();
            }
            st.push(i);
        }
        return left;
    }
    public static int[] nser(int[] h) {
        int[] right = new int[h.length];
        
        Stack<Integer> st = new Stack<>();
        
        for (int i = h.length - 1; i >= 0; i--) {
            while (st.size()!=0 && h[st.peek()] >= h[i]) {
                st.pop();
            }
            if (st.size()==0) {
                right[i] = h.length;
            } else {
                right[i] = st.peek();
            }
            st.push(i);
        }
        return right;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] h = new int[n];
        for (int i = 0; i < n; i++) {
            h[i] = scn.nextInt();
        }
        scn.close();
        int[] ngel = nsel(h);
        int[] nger = nser(h);
      
        int max=0;
        for(int i=0;i<n;i++){
            int height=h[i];
            int width=nger[i]-ngel[i]-1;
            int area=height*width;
            max=Math.max(max,area);
        }
        System.out.println(max);
    }
}
