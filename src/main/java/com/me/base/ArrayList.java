package com.me.base;

import java.util.Objects;

/**
 * @ClassName ArrayList
 * @Description TODO
 * @Author zhangdongchao
 * @Date 2019/3/26 10:56
 * @Version 1.0
 **/
public class ArrayList<E> {
    // 元数据，由于查找元素时，找不到返回0，所以坐标0为哨兵
    private Object[] data;
    private int size = 0;

    public ArrayList() {
        data = new Object[16];
    }

    /**
     * 线性表是否为空
     * @return
     */
    public boolean listEmpty() {
        return size == 0? true : false;
    }

    /**
     * 获取第i个位置元素
     * @param i
     * @return
     * @throws ArrayIndexOutOfBoundsException
     */
    public Object getElem(int i) throws ArrayIndexOutOfBoundsException  {
        if (i > size || i == 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return data[i];
    }

    /**
     * 查找元素e,有则返回坐标，无则返回0
     * @param e
     * @return
     */
    public int LocateElem(Object e) {
        for (int i = 1; i < size; i++) {
            if (e == (E)data[i]) {
                return  i;
            }
        }
        return 0;
    }

    /**
     * 插入元素
     * @param e
     */
    public void ListInsert(Object e) {
        // 扩容
        if (size == data.length - 1) {
            expandData();
        }
        data[++size] = e;
    }

    /**
     * 扩容
     */
    private void expandData() {
        Object[] newData = new Object[data.length * 2];
        for (int i = 1; i < size; i++) {
            newData[i] = data[i];
        }
        data = newData;
    }

    /**
     * 删除位置i的元素
     * @param i
     * @return
     * @throws IndexOutOfBoundsException
     */
    public Object ListDelete(int i) throws IndexOutOfBoundsException {
        if (i > size) {
            throw new IndexOutOfBoundsException();
        }
        size--;
        return data[i];
    }

    public int LstLength(){
        return size;
    }
}
