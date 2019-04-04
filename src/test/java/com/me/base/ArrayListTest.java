package com.me.base;

import com.me.base.ArrayList;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @ClassName TestArrayList
 * @Description TODO
 * @Author zhangdongchao
 * @Date 2019/3/26 11:29
 * @Version 1.0
 **/
public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            arrayList.ListInsert(String.valueOf(i));
        }
        System.out.println(arrayList.LstLength());
        System.out.println(arrayList.getElem(100));
        System.out.println(arrayList.LocateElem("1"));
        arrayList.listEmpty();
        System.out.println("zzzzzzzzzzzzzzz");
    }

    @Test
    public void listEmptyTest1(){
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            arrayList.ListInsert(String.valueOf(i));
        }
        arrayList.listEmpty();
        assertEquals(100, arrayList.LstLength());
    }

    @Test
    public void listEmptyTest2(){
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.listEmpty();
        assertEquals(0, arrayList.LstLength());
    }
}
