package com.me.pat;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * @ClassName Q1007
 * @Description 容易超时，多试几次
 * @Author zhangdongchao
 * @Date 2020/2/17 16:44
 * @Version 1.0
 **/
public class Q1017 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] inputArrays = input.split(" ");
        BigDecimal a = new BigDecimal(inputArrays[0]);
        BigDecimal b = new BigDecimal(inputArrays[1]);

        BigDecimal[] ret = a.divideAndRemainder(b);
        System.out.println(ret[0] + " " + ret[1]);
    }
}
