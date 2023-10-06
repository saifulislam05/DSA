/**
 * Delete_Consecutive
 */
import java.util.*;
public class Delete_Consecutive {
   
    public static void main(String[] args) {
        // here is demo input 
         Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        scn.nextLine(); // Consume the newline character after N
        
        String sequence = scn.nextLine();
        String[] words = sequence.split(" ");

        Stack<String> stack = new Stack<>();

        for (String word : words) {
            if (!stack.isEmpty() && stack.peek().equals(word)) {
                stack.pop();
            } else {
                stack.push(word);
            }
        }

        System.out.println(stack.size());

        scn.close();
    }
}