package com.me.pat;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Scanner;

/**
 * @ClassName Q1001
 * @Description TODO
 * @Author zhangdongchao
 * @Date 2020/2/17 16:44
 * @Version 1.0
 **/
public class Q1012 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] arrays = input.split(" ");
        int low = Integer.parseInt(arrays[0]);
        int high = Integer.parseInt(arrays[1]);
        StringBuilder sb = new StringBuilder();
        for (int i = low; i <= high; i++) {
            if (isShusu(i)) {
                sb.append(i);
                sb.append(" ");
            }
        }
        System.out.println(sb.toString().trim());
    }

    private static boolean isShusu(int input) {
        int low = 2;
        int high = (int)Math.ceil(Math.sqrt(input));
        for (int i = low; i <= high; i++) {
            if (input % i == 0) {
                return false;
            }
        }
        return true;
    }
}
