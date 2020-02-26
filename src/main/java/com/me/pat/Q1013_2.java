package com.me.pat;

import java.util.Scanner;

/**
 * @ClassName Q1001
 * @Description TODO
 * @Author zhangdongchao
 * @Date 2020/2/17 16:44
 * @Version 1.0
 **/
public class Q1013_2 {

    static int[] a = new int[10001];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        int j = 1;
        for (int i = 2; j <= N; ++i) {//数组下标代表第几个素数，数组值代表素数值
            if (isPrime(i)) {
                a[j++] = i;
            }
        }
        int account = 0;
        boolean flag = false;
        for (int i = M; i <= N; ++i) {
            if (flag) System.out.print(" ");
            account++;
            if (account % 10 == 0) {//注意换行后第一个数字之前无需输出空格
                System.out.println(a[i]);
                flag = false;
            } else {
                System.out.print(a[i]);
                flag = true;
            }
        }
    }

    static boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); ++i) {
            if (n % i == 0) return false;
        }
        return true;
    }
}

