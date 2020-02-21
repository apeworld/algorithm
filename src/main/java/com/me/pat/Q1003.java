package com.me.pat;

import java.util.Scanner;

/**
 * @ClassName Q1001
 * @Description TODO
 * @Author zhangdongchao
 * @Date 2020/2/17 16:44
 * @Version 1.0
 **/
public class Q1003 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        for (int i = 0; i < a; i++) {
            String input = scanner.next();
            if (onlyPAT(input) && isaPbTc(input)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    private static boolean onlyPAT(String input) {
        String parten = "[P|A|T]+";
        return input.matches(parten);
    }

    private static boolean isaPbTc(String input) {
        int countA = input.indexOf("P");
        int indexT = input.indexOf("T");
        int countB = indexT - countA - 1;
        int length = input.length();
        int countC= length - indexT - 1;

        if (countB == 0 || countA * countB != countC) {
            return false;
        } else {
            return true;
        }
    }

}
