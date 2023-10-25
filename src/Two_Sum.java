import java.util.HashMap;
import java.util.Scanner;

public class Two_Sum {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        // If no valid pair is found, return an empty array
        return new int[]{};
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        int target = scn.nextInt();
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        scn.close();
        int[] result = twoSum(arr, target);
        if (result.length == 2) {
            System.out.println(result[0] + " " + result[1]);
        } else {
            System.out.println("No valid pair found.");
        }
    }
}
