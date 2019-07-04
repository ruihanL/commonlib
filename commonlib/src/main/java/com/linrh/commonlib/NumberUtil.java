package com.linrh.commonlib;

import java.text.DecimalFormat;

/**
 * 作者：created by @author{ John } on 2019/6/20 0020上午 10:21
 * 描述：对数字进行格式化
 * 修改备注：
 */

public class NumberUtil {
    /**
     * 使用乘除的方法进行取整等操作
     * @param src  数字
     * @param cnt  保留小数点
     * @return 数字
     */
    public static double formatRound(double src,int cnt){
        int num = (int) Math.pow(10, cnt);
        src = (double) Math.round(src*num)/num;
        return src;
    }

    public static float formatRound(float src,int cnt){
        int num = (int) Math.pow(10, cnt);
        src = (float) Math.round(src*num)/num;
        return src;
    }



    /**
     * 格式化，后面没有0的不补0.
     * @param src
     * @param cnt
     * @return
     */
    public static String format(double src, int cnt){

        String s = "#0";
        if (cnt<0){
            throw new IllegalArgumentException("cnt must >= 0.");
        }

        if (cnt>0){
            s = s + ".";
            for (int i = 0; i < cnt; i++) {
                s = s + "#";
            }
        }

        DecimalFormat format = new DecimalFormat(s);
        String ret = format.format(src);

        return ret;
    }

    /**
     * 格式化，后面补0
     * @param src
     * @param cnt
     * @return
     */
    public static String formatWithZero(double src,int cnt){

        String s = "#0";
        if (cnt<0){
            throw new IllegalArgumentException("cnt must >= 0.");
        }

        if (cnt>0){
            s = s + ".";
            for (int i = 0; i < cnt; i++) {
                s = s + "0";
            }
        }

        DecimalFormat format = new DecimalFormat(s);
        String ret = format.format(src);

        return ret;
    }


    /**
     * 格式化，后面没有0的不补0.
     * @param src
     * @param cnt
     * @return
     */
    public static String format(float src, int cnt){

        String s = "#0";
        if (cnt<0){
            throw new IllegalArgumentException("cnt must >= 0.");
        }

        if (cnt>0){
            s = s + ".";
            for (int i = 0; i < cnt; i++) {
                s = s + "#";
            }
        }

        DecimalFormat format = new DecimalFormat(s);
        String ret = format.format(src);

        return ret;
    }

    /**
     * 格式化，后面补0
     * @param src
     * @param cnt
     * @return
     */
    public static String formatWithZero(float src,int cnt){

        String s = "#0";
        if (cnt<0){
            throw new IllegalArgumentException("cnt must >= 0.");
        }

        if (cnt>0){
            s = s + ".";
            for (int i = 0; i < cnt; i++) {
                s = s + "0";
            }
        }

        DecimalFormat format = new DecimalFormat(s);
        String ret = format.format(src);

        return ret;
    }



}
