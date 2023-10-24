import java.util.Scanner;
import java.util.Stack;

public class Facing_The_Sun {
    public static int noOfBuilding(int [] arr) {
        Stack<Integer> st=new Stack<>();
        st.push(0);
        for(int i=1;i<arr.length;i++){
            if(arr[st.peek()] < arr[i]){
                st.push(i);
            }
        }
        return st.size();
    }
    public static void main(String[] args) {
       Scanner scn=new Scanner(System.in);
        int n= scn.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        scn.close();
        int ans=noOfBuilding(arr);
        System.out.println(ans);

    }
}
