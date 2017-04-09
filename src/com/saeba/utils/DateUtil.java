package com.saeba.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by wiwil on 2017/4/9.
 */
public class DateUtil {

    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String dateStr = sdf.format(date);
        System.out.println(dateStr);
    }

}
