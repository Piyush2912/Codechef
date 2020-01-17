package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.math.*;
import java.util.StringTokenizer;

public class UsanBolt {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            float finish = Integer.parseInt(st.nextToken());
            float distancetobolt = Integer.parseInt(st.nextToken());
            float tiger = Integer.parseInt(st.nextToken());
            float boltspeed = Integer.parseInt(st.nextToken());

            System.out.println(Math.sqrt(2*(distancetobolt+finish)/tiger)>(finish/boltspeed)?"Bolt":"Tiger");
        }

    }
}
