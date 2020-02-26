package com.me.pat;

import java.util.*;

/**
 * @ClassName Q1001
 * @Description TODO
 * @Author zhangdongchao
 * @Date 2020/2/17 16:44
 * @Version 1.0
 **/
public class Q1006 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        String strInput = String.valueOf(input);
        int length = strInput.length();
        StringBuilder sb = new StringBuilder();
        switch (length) {
            case 3: sb.append(add(2, strInput.charAt(0))); sb.append(add(1, strInput.charAt(1)));sb.append(add(0, strInput.charAt(2))); break;
            case 2: sb.append(add(1, strInput.charAt(0)));sb.append(add(0, strInput.charAt(1))); break;
            case 1: sb.append(add(0, strInput.charAt(0))); break;
        }
        System.out.println(sb.toString());
    }

    /**
     *
     * @param flag 0：个位、1：十位、2：百位
     * @return
     */
    private static String add(int flag, char count) {
        int intCount = Integer.parseInt(String.valueOf(count));
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < intCount; i++) {
            switch (flag) {
                case 0 : sb.append(i + 1); break;
                case 1 : sb.append("S"); break;
                case 2 : sb.append("B"); break;
                default: break;
            }
        }
        return sb.toString();
    }
}
