package com.saeba.utils;

import org.apache.commons.lang3.time.DateFormatUtils;

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

        String apacheUtilsFormatResult = DateFormatUtils.format(new Date(), "yyyy/MM/dd");
        System.out.println(apacheUtilsFormatResult);

    }

}
