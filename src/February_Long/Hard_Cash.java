package February_Long;

import java.util.Scanner;

public class Hard_Cash {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            long sum = 0;
            long r = 0;
            for (int i = 0; i < n; i++) {
                sum += a[i];
            }
            r = sum % k;
            System.out.println(r);
        }
    }
}
