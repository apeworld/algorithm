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
public class Q1002_2 {
    static String[] hanzi = {"ling", "yi", "er", "san", "si", "wu", "liu", "qi", "ba", "jiu"};
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        int length = a.length();
        int intResult = 0;
        for (int i = 0; i < length; i++) {
            intResult += Integer.parseInt(String.valueOf(a.charAt(i)));;
        }

        StringBuilder sb = new StringBuilder();
        String strTemp = String.valueOf(intResult);
        for (int i = 0; i < strTemp.length(); i++) {
            int temp = Integer.valueOf(String.valueOf(strTemp.charAt(i)));
            sb.append(hanzi[temp]);
            sb.append(" ");
        }
        String result = sb.toString().trim();
        System.out.println(result);
    }
}
