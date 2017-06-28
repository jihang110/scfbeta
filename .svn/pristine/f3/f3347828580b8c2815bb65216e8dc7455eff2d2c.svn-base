package com.ut.scf.web.converter;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Component;

import java.util.TimeZone;

@Component
public class CustomJsonConverter extends ObjectMapper {

    public CustomJsonConverter() {
        super();
        setDateFormat(new CustomDateFormat());
        setTimeZone(TimeZone.getTimeZone("GMT+8"));
        //configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
        configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    }
}
