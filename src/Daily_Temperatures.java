import java.util.Scanner;
import java.util.Stack;

public class Daily_Temperatures {
    public static int[] dailyTemperatures(int[] temperatures) {
        int [] ans=new int[temperatures.length];
        Stack<Integer> st=new Stack<>();
        for(int i=temperatures.length-1;i >=0;i--){
            while(st.size() != 0 && temperatures[st.peek()] <= temperatures[i]){
                st.pop();
            }
            if(st.size() == 0 ){
                ans[i]=0;
            }
            else{
                ans[i]=st.peek()-i;
            }
            st.push(i);
        }
        return ans;
    }
    public static void main(String[] args) {
       Scanner scn=new Scanner(System.in);
        int n= scn.nextInt();
        int [] temperatures=new int[n];
        for(int i=0;i<n;i++){
            temperatures[i]=scn.nextInt();
        }
        scn.close();
        int [] ans=dailyTemperatures(temperatures);
        for(int tem:ans){
          System.out.print(tem+" ");  
        }
        

    }
}
