import java.util.HashSet;
import java.util.Scanner;

public class Contains_Duplicate {
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hs=new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (hs.contains(nums[i]))
                return true;
            hs.add(nums[i]);
        }
        return false;

    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        scn.close();
        boolean ans = containsDuplicate(arr);
       System.out.println(ans);
    }
}
