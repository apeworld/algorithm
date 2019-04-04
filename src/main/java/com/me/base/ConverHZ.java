package com.me.base;

import java.util.Stack;

/**
 * @ClassName ConverHZ
 * @Description TODO
 * @Author zhangdongchao
 * @Date 2019/3/27 18:09
 * @Version 1.0
 **/
public class ConverHZ {

    public static void convert(String source) {
        char[] bytes = source.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < bytes.length; i++) {
            switch (bytes[i]) {
                case '0':System.out.print(bytes[i]);break;
                case '1':System.out.print(bytes[i]);break;
                case '2':System.out.print(bytes[i]);break;
                case '3':System.out.print(bytes[i]);break;
                case '4':System.out.print(bytes[i]);break;
                case '5':System.out.print(bytes[i]);break;
                case '6':System.out.print(bytes[i]);break;
                case '7':System.out.print(bytes[i]);break;
                case '8':System.out.print(bytes[i]);break;
                case '9':System.out.print(bytes[i]);break;
                case '+':
                    if (!stack.isEmpty()) {
                        char element = stack.lastElement();
                        switch (element) {
                            case '*':System.out.print(stack.pop());System.out.print(bytes[i]);break;
                            case '/':System.out.print(stack.pop());System.out.print(bytes[i]);break;
                            default:stack.push(bytes[i]);break;
                        };
                    } else {
                        stack.push(bytes[i]);
                    }
                    break;
                case '-':
                    if (!stack.isEmpty()) {
                        char element = stack.lastElement();
                        switch (element) {
                            case '*':System.out.print(stack.pop());System.out.print(bytes[i]);break;
                            case '/':System.out.print(stack.pop());System.out.print(bytes[i]);break;
                            default:stack.push(bytes[i]);break;
                        };
                    } else {
                        stack.push(bytes[i]);
                    }
                    break;
                case '*':stack.push(bytes[i]);break;
                case '/':stack.push(bytes[i]);break;
                case '(':stack.push(bytes[i]);break;
                case ')':
                    do {
                        System.out.print(stack.pop());
                    } while (stack.lastElement() != '(');
                    stack.pop();
                    break;
            }
        }
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
    }
}
