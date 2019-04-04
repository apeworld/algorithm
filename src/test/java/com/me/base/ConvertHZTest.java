package com.me.base;

import com.me.base.ConverHZ;
import org.junit.Test;

/**
 * @ClassName ConvertHZTest
 * @Description TODO
 * @Author zhangdongchao
 * @Date 2019/3/27 18:26
 * @Version 1.0
 **/

public class ConvertHZTest {

    @Test
    public void convertTest() {
        String testCase = "9+(3-1)*3+10/2";
//        String testCase = "5+4*6/2+3+(4*5)/5";
        ConverHZ.convert(testCase);
    }
}
