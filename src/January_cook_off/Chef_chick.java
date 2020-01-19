package January_cook_off;

import java.util.Scanner;

public class Chef_chick {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int size = sc.nextInt();
            int ar[] = new int[size + 1];
            ar[0] = 0;
            for (int i = 1; i < size + 1; i++) {
                ar[i] = sc.nextInt();
            }
           // imput ended here

           // to find range value where the loop needs to be stoped
            int range_value = 0;
            for (int i = 1; i < size; i++) {
                range_value = findlcm(ar[i],ar[i+1]);
            }

            //creating the required array a with all possible values till range
            int a[] = new int[100000];
            for (int i = 0; i < size + 1; i++) {
                a[i] = ar[i];
            }

            int i = size+1;
            int j = 1;
            int pos=0;
            while (a[i] != range_value){

                a[i]=a[j]*(j+1);
                i++;
                j++;
             pos = i;
            }
            for (i=0;i<pos;i++){
                System.out.println(a[i]);
            }

            // trying to retrive maximum no diffrence between values of array
            int ans =0;
            for ( i =0; i<pos; i++){
                j = i+2;
               int next = a[i+1];
                int prev = a[i];
                int next2 = a[j];
                int prev2 = a[j-1];
                if ((next-prev) >(next2-prev2) ){
                     ans = next - prev;
                }
                j++;
            }
            System.out.println(ans);


            }

        }

    private static int findlcm(int n1, int n2) {
       int lcm = (n1 > n2) ? n1 : n2;
       while (true){
           if( lcm % n1 == 0 && lcm % n2 == 0 ) {
               return lcm;
           }
           ++lcm;
       }
    }
}

