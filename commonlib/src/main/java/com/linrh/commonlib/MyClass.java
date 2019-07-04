package com.linrh.commonlib;

import com.linrh.commonlib.io.IoUtils;



import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class MyClass {


    public static void main(String[] args) {
        //testZip();
        //testUnZip();

//        testNumberUtil();
//
//        testStringUtil();
//
//        testIO();
        

    }



    private static void show(String s){
        System.out.println(s);
    }

    private static void show(Object[] s){
        System.out.println(Arrays.toString(s));
    }

    private static void show(byte[] s){
        System.out.println(StringUtil.hex(s));
    }


    private static void testIO() {
        File file = new File("D:\\SnailBar-master.zip");
        try {
            String md5 = IoUtils.getMd5(new BufferedInputStream(new FileInputStream(file)));
            show(md5);
            show(IoUtils.readAllBytes(new FileInputStream(file)));

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static void testStringUtil() {
        System.out.println(Arrays.toString(StringUtil.split("AA;BB;;",';')));
        System.out.println(Arrays.toString(("AA;BB;;").split(";")));

        System.out.println(StringUtil.encodeUrl("http://ddfs"));

    }


    /**
     * 测试小数位取点
     */
    public static void testNumberUtil()
    {
        double a = 3450.002000d;
        System.out.println(NumberUtil.format(a,4));
        System.out.println(NumberUtil.formatWithZero(a,4));
        System.out.println("" + NumberUtil.formatRound(a,4));
    }




}
