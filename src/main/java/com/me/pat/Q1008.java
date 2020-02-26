package com.me.pat;

import java.util.Scanner;

/**
 * @ClassName Q1001
 * @Description TODO
 * @Author zhangdongchao
 * @Date 2020/2/17 16:44
 * @Version 1.0
 **/
public class Q1008 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] strArray = input.split(" ");
        int count = Integer.parseInt(strArray[1]);
//        scanner.nextLine();
        String inputArray = scanner.nextLine();
        String[] targetArray = inputArray.split(" ");

        for (int i = targetArray.length - 1; i >= targetArray.length - count; i--) {
            String temp = targetArray[targetArray.length - 1];
            for (int j = targetArray.length - 2; j >= 0; j--) {
                targetArray[j + 1] = targetArray[j];
            }
            targetArray[0] = temp;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < targetArray.length; i++) {
            sb.append(targetArray[i]);
            sb.append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}
