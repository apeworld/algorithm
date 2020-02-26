package com.me.pat;

import java.util.Scanner;

/**
 * @ClassName Q1001
 * @Description TODO
 * @Author zhangdongchao
 * @Date 2020/2/17 16:44
 * @Version 1.0
 **/
public class Q1010 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < count; i++) {
            String input = scanner.nextLine();
            String[] inputArrays = input.split(" ");
            long a = Long.valueOf(inputArrays[0]);
            long b = Long.valueOf(inputArrays[1]);
            long c = Long.valueOf(inputArrays[2]);

            if ((a + b) > c) {
                System.out.println("Case #" + (i + 1) + ": true");
            } else {
                System.out.println("Case #" + (i + 1) + ": false");
            }
        }
    }
}
