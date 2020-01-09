package com.company;

import java.util.Scanner;

public class Chef_and_Dynamo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int a = sc.nextInt();
            int s = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            int e = sc.nextInt();

            if (a+b+c+d+e == s) {
                System.out.println("1");
            } else {
                System.out.println("-1");
            }
        }
    }

}