import java.util.Scanner;
import java.util.Stack;

public class Maxium_Product_of_Indexes_of_Next_Greater_on_Left_and_Right {
    public static int[] ngel(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int[] left = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] <= arr[i]) {
                stack.pop();
            }
            left[i] = stack.isEmpty() ? 0 : stack.peek() + 1;
            stack.push(i);
        }
        return left;
    }

    public static int[] nger(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int[] right = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[stack.peek()] <= arr[i]) {
                stack.pop();
            }
            right[i] = stack.isEmpty() ? 0 : stack.peek() + 1;
            stack.push(i);
        }
        return right;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        scn.close();
        int[] left = ngel(arr);
        int[] right = nger(arr);

        int maxLRProduct = 0;
        for (int i = 0; i < n; i++) {
            int lrProduct = left[i] * right[i];
            maxLRProduct = Math.max(maxLRProduct, lrProduct);
        }

        System.out.println(maxLRProduct);
    }
}
