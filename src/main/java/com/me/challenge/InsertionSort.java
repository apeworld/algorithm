package com.me.challenge;

/**
 * @ClassName InsertionSort
 * @Description TODO
 * @Author zhangdongchao
 * @Date 2020/2/27 10:18
 * @Version 1.0
 **/
public class InsertionSort {
    public static void main(String[] args) {
        Integer[] arrays = {5, 2, 4, 6, 1, 3};

        for (int i = 1; i < arrays.length; i++) {
            int v = arrays[i];
            int j = i - 1;
            while (j >= 0 && arrays[j] > v) {
                arrays[j + 1] = arrays[j];
                j--;
            }
            arrays[j + 1] = v;
        }

        System.out.println(arrays);
    }
}
