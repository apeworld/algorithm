package com.me.pat;

import java.util.*;

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
        int personNumber = Integer.parseInt(inputArrays[0]);
        int lowPassScore = Integer.parseInt(inputArrays[1]);
        int highPassScore = Integer.parseInt(inputArrays[2]);
        List<Integer[]> type1 = new ArrayList<>();
        List<Integer[]> type2 = new ArrayList<>();
        List<Integer[]> type3 = new ArrayList<>();
        List<Integer[]> type4 = new ArrayList<>();
        for (int i = 0; i < personNumber; i++) {
            String person = scanner.nextLine();
            String[] studentInfoArrays = person.split(" ");
            int id = Integer.parseInt(studentInfoArrays[0]);
            int deScore = Integer.parseInt(studentInfoArrays[1]);
            int caiScore = Integer.parseInt(studentInfoArrays[2]);
            if (deScore < lowPassScore || caiScore < lowPassScore) {
                continue;
            }
            if (deScore >= highPassScore && caiScore >= highPassScore) {
                Integer[] student = new Integer[3];
                student[0] = id;
                student[1] = deScore;
                student[2] = caiScore;
                type1.add(student);
            } else if (deScore >= highPassScore && caiScore < highPassScore) {
                Integer[] student = new Integer[3];
                student[0] = id;
                student[1] = deScore;
                student[2] = caiScore;
                type2.add(student);
            } else if (deScore < highPassScore && caiScore < highPassScore && deScore >= caiScore) {
                Integer[] student = new Integer[3];
                student[0] = id;
                student[1] = deScore;
                student[2] = caiScore;
                type3.add(student);
            }  else {
                Integer[] student = new Integer[3];
                student[0] = id;
                student[1] = deScore;
                student[2] = caiScore;
                type4.add(student);
            }
        }
        List<Integer[]> result = new ArrayList<>();
        result.addAll(sort(type1));
        result.addAll(sort(type2));
        result.addAll(sort(type3));
        result.addAll(sort(type4));

        System.out.println(result.size());
        for (Integer[] r : result) {
            StringBuilder sb = new StringBuilder();
            sb.append(r[0]);
            sb.append(" ");
            sb.append(r[1]);
            sb.append(" ");
            sb.append(r[2]);
            System.out.println(sb.toString());
        }
    }

    static List<Integer[]> sort(List<Integer[]> sortableList) {
        Collections.sort(sortableList, new Comparator<Integer[]>() {
            @Override
            public int compare(Integer[] o1, Integer[] o2) {
                if ((o1[1] + o1[2]) > (o2[1] + o2[2])) {
                    return -1;
                } else if ((o1[1] + o1[2]) == (o2[1] + o2[2]) ) {
                    if (o1[1] > o2[1]) {
                        return -1; // 高到低
                    } else if (o1[1] < o2[1]) {
                        return 1;
                    } else {
                        if (o1[0] > o2[0]) {
                            return 1;
                        } else {
                            return -1;
                        }
                    }
                }
                return 1;
            }
        });
        return sortableList;
    }
}
