package February_Long;

import java.util.Arrays;
import java.util.Scanner;

public class SNUG_FIT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int a[] = new int[n];
            int b[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            for (int i = 0; i < n; i++) {
                b[i] = sc.nextInt();
            }
            // Real shit starts here
            Arrays.sort(a);
            Arrays.sort(b);

            int sum = 0;
            for (int i = 0; i < n; i++) {
                if (a[i] < b[i]){
                    sum = sum + a[i];
                }
                else {
                    sum = sum + b[i];
                    }
            }
            System.out.println(sum);

        }
    }
}