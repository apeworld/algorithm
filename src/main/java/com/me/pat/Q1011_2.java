package com.me.pat;

/**
 * Score 20
 * Run Time 142ms
 * @author wowpH
 * @version 1.1
 */

import java.util.Scanner;

public class Q1011_2 {
    private static void output(int x, int count) {
        if (count > 0) {
            System.out.print(x + " ");
        } else {
            System.out.print("N" + " ");
        }
    }

    public static void main(String[] args) {
        // 输入
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] x = new int[N];
        for (int i = 0; i < N; i++) {
            x[i] = sc.nextInt();
        }
        sc.close();

        int A1, A2, A3, A5;
        double A4;
        A1 = A2 = A3 = A5 = 0;
        A4 = 0;

        // 统计A1,A2,A4,A5的值改变的次数
        int a1Count, a2Count, a4Count, a5Count;
        a1Count = a2Count = a4Count = a5Count = 0;

        for (int i = 0; i < N; i++) {
            System.out.println((x[i] % 5));
            switch (x[i] % 5) {
                case 0:	// 余数为0
                    if (0 == (x[i] & 1)) {	// x[i]为偶数
                        A1 += x[i];
                        a1Count++;
                    }
                    break;
                case 1:	// 余数为1
                    if (0 == (a2Count & 1)) {	// a2Count为偶数
                        A2 += x[i];
                    } else {
                        A2 -= x[i];
                    }
                    a2Count++;
                    break;
                case 2:	// 余数为2
                    A3++;	// A3本身就是记录的个数
                    break;
                case 3:	// 余数为3
                    A4 += x[i];		// A4表示余数为3的数的和
                    a4Count++;
                    break;
                case 4:	// 余数为4
                    if (A5 < x[i]) {	// A5表示余数为4的数中最大的数
                        A5 = x[i];
                        a5Count++;
                    }
                    break;
                default:	// 否则什么也不做，没用的一句
            }
        }

        output(A1, a1Count);
        output(A2, a2Count);
        output(A3, A3);	// A3本身就是记录的个数

        if (a4Count > 0) {
            System.out.printf("%.1f ", A4 / a4Count);// 要除以个数
        } else {
            System.out.print("N" + " ");
        }

        if (a5Count > 0) {
            System.out.println(A5);
        } else {
            System.out.println("N");
        }
    }
}

