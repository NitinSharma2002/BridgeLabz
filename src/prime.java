import java.util.*;
public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<=1) {
            System.out.println(0);
        }
        boolean [] flag = new boolean[n+1];
        for(int i =2;i<n;i++) {
            flag[i] = true;
        }
        int count = 0;
        for (int i =2;i<n;i++) {
            if(flag[i]) {
                count++;
                System.out.print(i+" ");
            }
            for(int j = i*2;j<n;j = j+i) {
                flag[j] = false;
            }
        }
        System.out.println();
        System.out.println(count);
    }
}
