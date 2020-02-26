package com.me.pat;

import javax.swing.text.rtf.RTFEditorKit;
import java.util.*;

/**
 * @ClassName Q1001
 * @Description TODO
 * @Author zhangdongchao
 * @Date 2020/2/17 16:44
 * @Version 1.0
 **/
public class Q1011 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] arrays = input.split(" ");
        String[] resultArrays = {"N","N","N","N","N"};
        LinkedList<Integer> a2 = new LinkedList<Integer>();
        int a3Count = 0;
        for (int i = 1; i < arrays.length; i++) {
            int temp = Integer.parseInt(arrays[i]);
            switch (temp % 5) {
                case 0:
                    if (temp % 2 == 0) {
                        if (Objects.equals("N", resultArrays[0])) {
                            resultArrays[0] = String.valueOf(temp);
                        } else {
                            resultArrays[0] = String.valueOf(Integer.parseInt(resultArrays[0]) + temp);
                        }
                    }
                    break;
                case 1: a2.add(temp);break;
                case 2:
                    if (Objects.equals("N", resultArrays[2])) {
                        resultArrays[2] = "1";
                    } else {
                        resultArrays[2] = String.valueOf(Integer.parseInt(resultArrays[2]) + 1);
                    }
                    break;
                case 3:
                    if (Objects.equals("N", resultArrays[3])) {
                        resultArrays[3] = String.valueOf(temp);
                    } else {
                        resultArrays[3] = String.valueOf(Integer.parseInt(resultArrays[3]) + temp);
                    }
                    a3Count++;
                    break;
                case 4:
                    if (Objects.equals("N", resultArrays[4])) {
                        resultArrays[4] = String.valueOf(temp);
                    } else {
                        if (temp > Integer.parseInt(resultArrays[4])) {
                            resultArrays[4] = String.valueOf(temp);
                        }
                    }
                    break;
            }
        }

        if (a3Count > 0) {
            resultArrays[3] = String.format("%.1f", Double.valueOf(resultArrays[3]) / a3Count);
        }

        if (a2.size() > 0) {
            int temp = 0;
            for (int i = 0; i < a2.size(); i++) {
                if (i % 2 == 0) {
                    temp += a2.get(i);
                } else {
                    temp -= a2.get(i);
                }
            }
            resultArrays[1] = String.valueOf(temp);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < resultArrays.length; i++) {
            sb.append(resultArrays[i]);
            sb.append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}
