package com.me.pat;

import java.util.Scanner;

/**
 * @ClassName Q1001
 * @Description TODO
 * @Author zhangdongchao
 * @Date 2020/2/17 16:44
 * @Version 1.0
 **/
public class Q1009 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] inputArray = input.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = inputArray.length - 1; i >= 0; i--) {
            sb.append(inputArray[i]);
            sb.append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}
