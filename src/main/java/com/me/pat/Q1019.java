package com.me.pat;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

/**
 * @ClassName Q1007
 * @Description 测试点5超时
 * @Author zhangdongchao
 * @Date 2020/2/17 16:44
 * @Version 1.0
 **/
public class Q1019 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String asc = asc(input);
        String desc = new StringBuilder(asc).reverse().toString();

        if (Objects.equals(asc, desc)) {
            System.out.println(desc + " - " + asc + " = 0000");
        } else {
            while (Integer.parseInt(desc) - Integer.parseInt(asc) != 6174) {
                int ret = (Integer.parseInt(desc) - Integer.parseInt(asc));
                System.out.println(desc + " - " + asc + " = " + String.format("%04d", ret));
                String other = String.valueOf(Integer.parseInt(desc) - Integer.parseInt(asc));
                asc = asc(other);
                desc = new StringBuilder(asc).reverse().toString();
            }
            System.out.println(desc + " - " + asc + " = " + (Integer.parseInt(desc) - Integer.parseInt(asc)));
        }
    }

    /**
     * 插入排序
     * @param input
     * @return
     */
    private static String asc(String input) {
        char[] inputChars = input.toCharArray();
//        Arrays.sort(inputChars);
        for (int i = 1; i < inputChars.length; i++) {

            for (int j = i - 1; j >= 0; j--) {
                if (inputChars[j] > inputChars[j + 1]) {
                    char temp = inputChars[j + 1];
                    inputChars[j + 1] = inputChars[j];
                    inputChars[j] = temp;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(inputChars);
        String ret = sb.toString();
        int length = 4 - ret.length();
        for (int i = 0; i < length; i++) {
            ret = "0" + ret;
        }
        return ret;
    }
}
