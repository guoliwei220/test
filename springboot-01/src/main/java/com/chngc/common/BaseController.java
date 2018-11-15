package com.chngc.common;


import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.util.HtmlUtils;

import java.beans.PropertyEditorSupport;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * 控制器支持类
 */
@Slf4j
public abstract class BaseController {
    /**
     * 客户端返回JSON字符串
     */
    protected String buildJson(String code, String message) {
        ResponseResult responseResult = new ResponseResult();
        responseResult.setCode(code);
        responseResult.setMsg(message);
        return JsonUtils.toJsonStr(responseResult);
    }

    /**
     * 客户端返回JSON字符串
     */
    protected String buildJson(String code, String message, Object data) {
        ResponseResult responseResult = new ResponseResult();
        responseResult.setCode(code);
        responseResult.setMsg(message);
        responseResult.setData(data);
        return JsonUtils.toJsonStr(responseResult);
    }

    /**
     * 客户端返回JSON字符串
     */
    protected String buildJson(Object data) {
        ResponseResult responseResult = new ResponseResult();
        responseResult.setCode(Constants.SUCCESS_CODE);
        responseResult.setData(data);
        return JsonUtils.toJsonStr(responseResult);
    }

    /**
     * 客户端返回JSON字符串
     */
    /*protected String buildPageJson(PageInfo pageInfo) {
        ResponseResult responseResult = new ResponseResult();
        responseResult.setCode(Constants.SUCCESS_CODE);
        Map<String, Object> resultMap = new HashMap<>();
        resultMap.put("page", pageInfo);
        responseResult.setData(resultMap);
        return JsonUtils.toJsonStr(responseResult);
    }*/

    /**
     * 初始化数据绑定
     * 1. 将所有传递进来的String进行HTML编码，防止XSS攻击
     * 2. 将字段中Date类型转换为String类型
     */
    @InitBinder
    protected void initBinder(WebDataBinder binder) {
        // String类型转换，将所有传递进来的String进行HTML编码，防止XSS攻击
        binder.registerCustomEditor(String.class, new PropertyEditorSupport() {
            @Override
            public void setAsText(String text) {
                setValue(text == null ? null : HtmlUtils.htmlEscape(text.trim()));
            }

            @Override
            public String getAsText() {
                Object value = getValue();
                return value != null ? value.toString() : "";
            }
        });
       /* // Date 类型转换
        binder.registerCustomEditor(Date.class, new PropertyEditorSupport() {
            @Override
            public void setAsText(String text) {
                setValue(DateUtils.str2Date(text, DateUtils.e));
            }

            @Override
            public String getAsText() {
                Object value = getValue();
                return value != null ? DateUtils.date2Str((Date) value, DateUtils.e) : "";
            }
        });*/
    }
}
