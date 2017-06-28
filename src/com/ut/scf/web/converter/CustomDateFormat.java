package com.ut.scf.web.converter;

import java.text.FieldPosition;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class CustomDateFormat extends SimpleDateFormat {
    private static final String DATE_TIME_FORMAT_STR = "yyyy-MM-dd HH:mm:ss";
    private static final String DATE_FORMAT_STR = "yyyy-MM-dd";
    private static final String ZONE_FORMAT_STR = "GMT+8";

    public CustomDateFormat() {
        super();
    }

    @Override
    public StringBuffer format(Date date, StringBuffer toAppendTo, FieldPosition fieldPosition) {
        SimpleDateFormat dateFormat = new SimpleDateFormat(DATE_TIME_FORMAT_STR);
        dateFormat.setTimeZone(TimeZone.getTimeZone(ZONE_FORMAT_STR));
        return dateFormat.format(date, toAppendTo, fieldPosition);
    }

    @Override
    public Date parse(String source, ParsePosition pos) {
        source = source.trim();

        SimpleDateFormat dateFormat;
        if (source.length() > 10) {
            dateFormat = new SimpleDateFormat(DATE_TIME_FORMAT_STR);
        } else {
            dateFormat = new SimpleDateFormat(DATE_FORMAT_STR);
        }
        dateFormat.setTimeZone(TimeZone.getTimeZone(ZONE_FORMAT_STR));
        return dateFormat.parse(source, pos);
    }
}
