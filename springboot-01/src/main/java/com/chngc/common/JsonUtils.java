package com.chngc.common;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;

import java.io.IOException;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class JsonUtils {
    private static final Logger log = LoggerFactory.getLogger(JsonUtils.class);
    private static ObjectMapper objectMapper = null;

    public JsonUtils() {
    }

    public static String toJsonStr(Object value) {
        try {
            return objectMapper.writeValueAsString(value);
        } catch (JsonProcessingException var2) {
            log.error("Json转换失败", var2);
            throw new RuntimeException(var2);
        }
    }

    public static void writeJsonStr(OutputStream out, Object value) {
        try {
            objectMapper.writeValue(out, value);
        } catch (Exception var3) {
            log.error("Json转换失败", var3);
            throw new RuntimeException(var3);
        }
    }

    public static <T> T readJson(String jsonString, Class<T> clazz) {
        if(StringUtils.isEmpty(jsonString)) {
            return null;
        } else {
            try {
                return objectMapper.readValue(jsonString, clazz);
            } catch (IOException var3) {
                log.warn("parse json string error:" + jsonString, var3);
                return null;
            }
        }
    }

    public static <T> List<T> readJsonList(String jsondata, Class<T> collectionClass) {
        try {
            ObjectMapper e = new ObjectMapper();
            JavaType javaType = getCollectionType(ArrayList.class, new Class[]{collectionClass});
            List lst = (List)e.readValue(jsondata, javaType);
            return lst;
        } catch (Exception var5) {
            log.warn("parse json string error:" + var5.getMessage(), var5);
            return null;
        }
    }

    private static JavaType getCollectionType(Class<?> collectionClass, Class... elementClasses) {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.getTypeFactory().constructParametricType(collectionClass, elementClasses);
    }

    public static void main(String[] args) {
    }

    static {
        objectMapper = new ObjectMapper();
        objectMapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));
        objectMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        objectMapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
    }
}