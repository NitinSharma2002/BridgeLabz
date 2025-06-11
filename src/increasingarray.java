import java.util.*;
public class increasingarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans [] = new int [n];
        for(int i =0;i<n;i++) {
            ans[i] = sc.nextInt();
        }
        int count = 0;

        for (int i =1;i<n;i++) {
            if(ans[i-1]>ans[i]) {
                count+=(ans[i-1]-ans[i]);
                ans[i] = ans[i-1];
            }
        }
        System.out.println(count);
    }
}
