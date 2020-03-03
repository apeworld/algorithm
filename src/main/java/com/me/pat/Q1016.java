package com.me.pat;

        import java.util.Objects;
        import java.util.Scanner;

/**
 * @ClassName Q1001
 * @Description 2.3.4超时
 * @Author zhangdongchao
 * @Date 2020/2/17 16:44
 * @Version 1.0
 **/
public class Q1016 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] inputArrays = input.split(" ");
        int pa = getTheNumber(inputArrays[0], inputArrays[1]);
        int pb = getTheNumber(inputArrays[2], inputArrays[3]);
        System.out.println(pa + pb);

    }

    private static int getTheNumber(String number, String d) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < number.length(); i++) {
            char n = number.charAt(i);
            if (Objects.equals(d, String.valueOf(n))) {
                sb.append(String.valueOf(n));
            }
        }
        String ret = sb.toString();
        if (Objects.equals(ret, "")) {
            return 0;
        }
        return Integer.parseInt(sb.toString());
    }
}
