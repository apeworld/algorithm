package com.me.pat;

import java.util.Objects;
import java.util.Scanner;

/**
 * @ClassName Q1001
 * @Description TODO
 * @Author zhangdongchao
 * @Date 2020/2/17 16:44
 * @Version 1.0
 **/
public class Q1014 {
    public static void main(String[] args) {
        String[] days = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
        Scanner scanner = new Scanner(System.in);
        String firstLine = scanner.nextLine();
        String secondLine = scanner.nextLine();
        String thirdLine = scanner.nextLine();
        String fourthLine = scanner.nextLine();
        StringBuilder sb = new StringBuilder();
        String[] dayArray = getSimiliarString(firstLine, secondLine, "0");
        sb.append(Day.getIndex(dayArray[0]));
        sb.append(" ");
        firstLine = firstLine.substring(Integer.parseInt(dayArray[1]) + 1);
        secondLine = secondLine.substring(Integer.parseInt(dayArray[1]) + 1);
        dayArray = getSimiliarString(firstLine, secondLine, "1");
        sb.append(Hour.getIndex(dayArray[0]));
        sb.append(":");
        dayArray = getSimiliarString(thirdLine, fourthLine, "2");
        String miniut = dayArray[1];
        if (miniut.length() < 2) {
            sb.append("0");
        }
        sb.append(miniut);
        System.out.println(sb.toString().trim());
    }

    // isBigAha， 0：仅大写字母、1：大写+数字、2：大小写
    public static String[] getSimiliarString(String first, String second, String isBigAha) {
        String[] result = new String[2];
        int length = first.length();
        if (length > second.length()) {
            length = second.length();
        }
        for (int i = 0; i < length; i++) {
            char f = first.charAt(i);
            char s = second.charAt(i);
            if (Objects.equals("0", isBigAha)) {
                if ((f >= 'A' && f <= 'G')) {
                    if (Objects.equals(f, s)) {
                        result[0] = String.valueOf(f);
                        result[1] = String.valueOf(i);
                        return result;
                    }
                }
            } else if (Objects.equals("1", isBigAha)){
                if ((f >= 'A' && f <= 'N') || Character.isDigit(f)) {
                    if (Objects.equals(f, s)) {
                        result[0] = String.valueOf(f);
                        result[1] = String.valueOf(i);
                        return result;
                    }
                }
            } else if (Objects.equals("2", isBigAha)) {
                if ((f >= 'A' && f <= 'Z') || (f >= 'a' && f <= 'z')) {
                    if (Objects.equals(f, s)) {
                        result[0] = String.valueOf(f);
                        result[1] = String.valueOf(i);
                        return result;
                    }
                }
            }
        }
        return null;
    }

    public enum Day {
        _MON("A", "MON"),
        _TUE("B", "TUE"),
        _WED("C", "WED"),
        _THU("D", "THU"),
        _FRI("E", "FRI"),
        _SAT("F", "SAT"),
        _SUN("G", "SUN") ;
        // 成员变量
        private String name;
        private String index;
        // 构造方法
        private Day(String name, String index) {
            this.name = name;
            this.index = index;
        }
        // 普通方法
        public static String getIndex(String name) {
            for (Day c : Day.values()) {
                if (Objects.equals(c.getName(), name)) {
                    return c.index;
                }
            }
            return null;
        }
        // get set 方法
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public String getIndex() {
            return index;
        }
        public void setIndex(String index) {
            this.index = index;
        }
    }

    public enum Hour {
        _0("0", "00"),
        _1("1", "01"),
        _2("2", "02"),
        _3("3", "03"),
        _4("4", "04"),
        _5("5", "05"),
        _6("6", "06"),
        _7("7", "07"),
        _8("8", "08"),
        _9("9", "09"),
        _A("A", "10"),
        _B("B", "11"),
        _C("C", "12"),
        _D("D", "13"),
        _E("E", "14"),
        _F("F", "15"),
        _G("G", "16"),
        _H("H", "17"),
        _I("I", "18"),
        _J("J", "19"),
        _K("K", "20"),
        _L("L", "21"),
        _M("M", "22"),
        _N("N", "23") ;
        // 成员变量
        private String name;
        private String index;
        // 构造方法
        private Hour(String name, String index) {
            this.name = name;
            this.index = index;
        }
        // 普通方法
        public static String getIndex(String name) {
            for (Hour c : Hour.values()) {
                if (Objects.equals(c.getName(), name)) {
                    return c.index;
                }
            }
            return null;
        }
        // get set 方法
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public String getIndex() {
            return index;
        }
        public void setIndex(String index) {
            this.index = index;
        }
    }
}
