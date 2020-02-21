package com.me.pat;

import java.util.Scanner;
import java.util.Stack;

/**
 * @ClassName Q1001
 * @Description TODO
 * @Author zhangdongchao
 * @Date 2020/2/17 16:44
 * @Version 1.0
 **/
public class Q1002 {
    static String[] hanzi = {"ling", "yi", "er", "san", "si", "wu", "liu", "qi", "ba", "jiu"};
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        byte[] arr = a.getBytes();
        int constant = 48;
        int cal = 0;
        for (byte b : arr) {
            cal = cal + (b - constant);
        }

        Stack<String> stack = new Stack<>();
        String strResult = String.valueOf(cal);
        byte[] strArray = strResult.getBytes();
        for (byte b : strArray) {
            String str = hanzi[(b - constant)];
            stack.push(str);
            stack.push(" ");
        }

        StringBuilder sb = new StringBuilder();
        if (!stack.isEmpty()) {
            stack.pop();
            for (String str : stack) {
                sb.append(str);
            }
        }

        System.out.println(sb.toString());
    }
}
