package com.me.pat;

import java.util.*;

/**
 * @ClassName Q1001
 * @Description TODO
 * @Author zhangdongchao
 * @Date 2020/2/17 16:44
 * @Version 1.0
 **/
public class Q1005 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        scanner.nextLine();
        String input = scanner.nextLine();
        String[] inputArray = input.split(" ");
        List<Integer> keyNumberList = new ArrayList<>();
        List<List<Integer>> beCoveredNumberList = new ArrayList<>();
        for (String strInput : inputArray) {
            int intInput = Integer.parseInt(strInput);
            keyNumberList.add(intInput);
//            StringBuilder beCoveredNumber = new StringBuilder();
            List<Integer> beCoveredNumber = new ArrayList<>();
            while (intInput != 1) {
                if (intInput % 2 == 0) {
                    intInput = intInput / 2;
                } else {
                    intInput = (3 * intInput + 1) / 2;
                }
                beCoveredNumber.add(intInput);
//                beCoveredNumber.append(intInput);
//                beCoveredNumber.append(" ");
            }
            beCoveredNumberList.add(beCoveredNumber);

        }

        Iterator<Integer> iterator = keyNumberList.iterator();
        while (iterator.hasNext()) {
            Integer str = iterator.next();
            for (List beCoveredNumbers : beCoveredNumberList) {
                if (beCoveredNumbers.contains(str)) {
//                if (beCoveredNumbers.indexOf(str) > 0) {
                    iterator.remove();
                    break;
                }
            }

        }
        Collections.sort(keyNumberList, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });
        StringBuilder sb = new StringBuilder();
        for (Integer i : keyNumberList) {
            sb.append(i);
            sb.append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}
