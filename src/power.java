import java.util.*;
public class power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int pow = 1;
//        for (int i =1;i<=b;i++) {
//            pow = pow*a;
//
//        }
        int z = (int)Math.pow(a,b);
        System.out.println(z);
    }
}
