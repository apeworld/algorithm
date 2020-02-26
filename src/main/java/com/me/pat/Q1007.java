package com.me.pat;

import java.util.Scanner;

/**
 * @ClassName Q1001
 * @Description TODO
 * @Author zhangdongchao
 * @Date 2020/2/17 16:44
 * @Version 1.0
 **/
public class Q1007 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int count = 0;
        int highShusu = 0;
        for (int i = input; i > 1; i--) {
            if (isShusu(i)) {
                if (highShusu != 0) {
                    if (highShusu - i == 2) {
                        count++;
                    }
                }
                highShusu = i;
            } else {
                continue;
            }
        }

        System.out.println(count);
    }

    private static boolean isShusu(int input) {
        int low = 2;
        int high = (int)Math.ceil(Math.sqrt(Double.valueOf(input)));
        for (int i = low; i <= high; i++) {
            if (input % i == 0) {
                return false;
            }
        }
        return true;
    }
}
