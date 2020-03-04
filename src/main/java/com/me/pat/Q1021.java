package com.me.pat;

import java.util.Scanner;

/**
 * @ClassName Q1007
 * @Description 测试点5超时
 * @Author zhangdongchao
 * @Date 2020/2/17 16:44
 * @Version 1.0
 **/
public class Q1021 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        char[] inputChars = input.toCharArray();
        Integer[] count = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        for (int i = 0; i < inputChars.length; i++) {
            char temp = inputChars[i];
            switch (temp) {
                case '0': count[0] = count[0] + 1; break;
                case '1': count[1] = count[1] + 1; break;
                case '2': count[2] = count[2] + 1; break;
                case '3': count[3] = count[3] + 1; break;
                case '4': count[4] = count[4] + 1; break;
                case '5': count[5] = count[5] + 1; break;
                case '6': count[6] = count[6] + 1; break;
                case '7': count[7] = count[7] + 1; break;
                case '8': count[8] = count[8] + 1; break;
                case '9': count[9] = count[9] + 1; break;
                default:break;
            }
        }

        for (int i = 0; i < count.length; i++) {
            if (count[i] != 0) {
                System.out.print(i);
                System.out.print(":");
                System.out.print(count[i]);
                System.out.print("\n");
            }
        }

    }
}
