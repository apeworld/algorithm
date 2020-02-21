package com.me.pat;

import java.util.Scanner;

/**
 * @ClassName Q1001
 * @Description TODO
 * @Author zhangdongchao
 * @Date 2020/2/17 16:44
 * @Version 1.0
 **/
public class Q1001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer a = scanner.nextInt();
        int cnt = 0;
        while (a != 1) {
            if (a%2 == 0) {
                a = a / 2;
            } else {
                a = (3 * a + 1) / 2;
            }
            cnt ++;
        }

        System.out.println(cnt);
    }
}
