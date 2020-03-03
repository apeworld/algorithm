package com.me.challenge;

/**
 * @ClassName InsertionSort
 * @Description TODO
 * @Author zhangdongchao
 * @Date 2020/2/27 10:18
 * @Version 1.0
 **/
public class BubbleSort {
    public static void main(String[] args) {
        Integer[] arrays = {5, 2, 4, 6, 1, 3};
        int sw = 0;
        boolean flag = true;

        for (int i = 0; flag; i++) {
            flag = false;
            for (int j = arrays.length -1; j >= i+1; j--) {
                if (arrays[j] < arrays[j - 1]) {
                    int temp = arrays[j];
                    arrays[j] = arrays[j - 1];
                    arrays[j - 1] = temp;
                    flag = true;
                }
            }
        }

        System.out.println(arrays);
    }
}
