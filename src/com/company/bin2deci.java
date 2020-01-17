package com.company;

import java.util.*;
import java.util.Scanner;

 public class bin2deci{
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int t = sc.nextInt();
         while (t-- > 0){
             int n = sc.nextInt();
             int ans = 0;
             int place = 1;
             while (n > 0){
                 int lastdigit = n % 10;
                 ans = ans + lastdigit*place;
                 place = place*2;
                 n = n / 10;

             }
             System.out.println(ans);
         }
     }
 }