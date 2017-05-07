package com.example.Ladder;

import java.io.IOException;
        import java.io.BufferedReader;
        import java.io.InputStreamReader;


public class Ladder {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] inpetDatas = reader.readLine().split(" ");

        int h = Integer.parseInt(inpetDatas[0]);
        int v = Integer.parseInt(inpetDatas[1]);
        double vToRadian = Math.toRadians(v);
        int result = (int) Math.ceil(h/Math.sin(vToRadian));

        System.out.println(result);
    }

}
