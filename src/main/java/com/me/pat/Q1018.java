package com.me.pat;

import java.util.Objects;
import java.util.Scanner;

/**
 * @ClassName Q1007
 * @Description 测试点5超时
 * @Author zhangdongchao
 * @Date 2020/2/17 16:44
 * @Version 1.0
 **/
public class Q1018 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        scanner.nextLine();
        Integer[] aWinPosture = {0, 0, 0};
        Integer[] bWinPosture = {0, 0, 0};
        Integer[] aWinCount = {0, 0, 0};
        Integer[] bWinCount = {0, 0, 0};
        for (int i = 0; i < length; i++) {
            String input = scanner.nextLine();
            String[] inputArrays = input.split(" ");
            String a = inputArrays[0];
            String b = inputArrays[1];
            if (Objects.equals(a, "B")) {
                if (Objects.equals(b, "C")) {
                    aWinPosture[0] = aWinPosture[0] + 1;
                    aWinCount[0] = aWinCount[0] + 1;
                    bWinCount[2] = bWinCount[2] + 1;
                } else if (Objects.equals(b, "J")) {
                    bWinPosture[2] = bWinPosture[2] + 1;
                    bWinCount[0] = bWinCount[0] + 1;
                    aWinCount[2] = aWinCount[2] + 1;
                } else {
                    bWinCount[1] = bWinCount[1] + 1;
                    aWinCount[1] = aWinCount[1] + 1;
                }
            } else if (Objects.equals(a, "C")) {
                if (Objects.equals(b, "J")) {
                    aWinPosture[1] = aWinPosture[1] + 1;
                    aWinCount[0] = aWinCount[0] + 1;
                    bWinCount[2] = bWinCount[2] + 1;
                } else if (Objects.equals(b, "B")) {
                    bWinPosture[0] = bWinPosture[0] + 1;
                    bWinCount[0] = bWinCount[0] + 1;
                    aWinCount[2] = aWinCount[2] + 1;
                } else {
                    bWinCount[1] = bWinCount[1] + 1;
                    aWinCount[1] = aWinCount[1] + 1;
                }
            } else if (Objects.equals(a, "J")) {
                if (Objects.equals(b, "B")) {
                    aWinPosture[2] = aWinPosture[2] + 1;
                    aWinCount[0] = aWinCount[0] + 1;
                    bWinCount[2] = bWinCount[2] + 1;
                } else if (Objects.equals(b, "C")) {
                    bWinPosture[1] = bWinPosture[1] + 1;
                    bWinCount[0] = bWinCount[0] + 1;
                    aWinCount[2] = aWinCount[2] + 1;
                } else {
                    bWinCount[1] = bWinCount[1] + 1;
                    aWinCount[1] = aWinCount[1] + 1;
                }
            }
        }
        System.out.println(aWinCount[0] + " " + aWinCount[1]+ " " + aWinCount[2]);
        System.out.println(bWinCount[0] + " " + bWinCount[1]+ " " + bWinCount[2]);
        String aWinMaxPosture = maxWinPosture(aWinPosture);
        String bWinMaxPosture = maxWinPosture(bWinPosture);
        System.out.println(aWinMaxPosture + " " + bWinMaxPosture);
    }

    private static String maxWinPosture(Integer[] winPosture) {
        int max = 0;
        int count = 0;
        for (int i = 0; i < winPosture.length; i++) {
            int win = winPosture[i];
            if (win > max) {
                max = win;
                count = i;
            }
        }

        if (count == 0) {
            return "B";
        } else if (count == 1) {
            return "C";
        } else if (count == 2) {
            return "J";
        }
        return null;
    }
}
