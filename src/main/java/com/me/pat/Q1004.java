package com.me.pat;

import java.util.Scanner;

/**
 * @ClassName Q1001
 * @Description TODO
 * @Author zhangdongchao
 * @Date 2020/2/17 16:44
 * @Version 1.0
 **/
public class Q1004 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int highScore = 0;
        int lowScore = 0;
        String highStudent = "";
        String lowStudent = "";
        scanner.nextLine();
        for (int i = 0; i < a; i++) {
            String input = scanner.nextLine();
            String[] array = input.split(" ");
            int score = Integer.parseInt(array[2]);
            if (score <= lowScore || i == 0) {
                lowStudent = array[0] + " " + array[1];
                lowScore = score;
            }

            if (score >= highScore || i == 0) {
                highStudent = array[0] + " " + array[1];
                highScore = score;
            }
        }
        System.out.println(highStudent);
        System.out.println(lowStudent);
    }
}
