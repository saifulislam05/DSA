import java.util.Scanner;
import java.util.Stack;

/**
 * _8_Asteroid_Collision
 */
public class Asteroid_Collision {
    public static int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<Integer>();
        for (int value : asteroids) {
            if (value > 0) {
                st.push(value);
            } else {
                while (st.size() > 0 && st.peek() < Math.abs(value)) {
                    st.pop();
                }
                if (st.size() > 0 && st.peek() == Math.abs(value)) {
                    st.pop();
                } else if (st.size() > 0 && st.peek() > Math.abs(value)) {

                } else {
                    st.push(value);
                }

            }
        }
        int [] ansArr=new int [st.size()];
        for (int i = 0; i < st.size(); i++) {
            ansArr[i]=st.pop();
        }
        return ansArr;
        
    }
     public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int [] asteroids=new int[n];
        for (int i = 0; i < n; i++) {
            asteroids[i] = scn.nextInt();
        }
        scn.close();
        int [] ans=asteroidCollision(asteroids);
        for(int ele:ans){
          System.out.print(ele + " ");
        }
        
    }
}