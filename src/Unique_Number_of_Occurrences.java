import java.util.HashMap;
import java.util.Scanner;

public class Unique_Number_of_Occurrences {
    public static boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            freq.put(arr[i], freq.getOrDefault(arr[i], 0) + 1);
        }
        HashMap<Integer, Boolean> Uniquefreq = new HashMap<>();
        for (int key : freq.keySet()) {
            int val = freq.get(key);
            if (Uniquefreq.containsKey(val)) {
                return false;
            } else {
                Uniquefreq.put(val, true);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scn.nextInt();
        }
        scn.close();
        boolean ans = uniqueOccurrences(nums);
        System.out.println(ans);
    }
}
