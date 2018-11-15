package com.chngc.common;

public final class Constants {
    public static final String ONLINE_MEMBERID = "online_memberId";
    public static final String TOKEN = "token";
    public static final String TICKET = "ticket";
    public static final String LUA_NICKNAME = "nickname";
    public static final String MEMBER_ID = "memberId";
    public static final String SUCCESS_CODE = "00";
    public static final String FAIL_CODE = "98";
    public static final String NOLOGIN_CODE = "99";
    public static final Integer PAGESIZE = 10;
    public static final Integer MEMBERCENTER_PAGESIZE = 5;
    public static final String AREA_CODE = "002";
    //手机验证码
    public static final String MOBILE_VERIFYCODE = "member:mobileVerifyCode:";
    //图片验证码
    public static final String AUTH_CODE = "member:authCode:";
    //购物车
    public static final String MEMBER_CART = "member:cart:";
    //登录信息
    public static final String LOGIN_INFO = "member:loginInfo:";
    //找回密码
    public static final String FINDPASSWORD = "member:findpassword:";
    //授权验证
    public static final String AUTHENTICATION = "member:authentication:";
    //会话失效时间
    public static final Integer MAX_INACTIVE_INTERVAL_INSECONDS = 60 * 20;

    //实名认证上传图片路径设置
    public static final  String MEMBER_VALIDATE_PIC_STANDARD = "/upload/member_validate/standard/";  //上传原图地址
    public static final String MEMBER_VALIDATE_PIC_COMPRESS = "/upload/member_validate/compress/";  //上传压缩图地址

    //动态认证上传图片路径设置
    public static final String MEMBER_VALIDATE_DYNAMIC_PIC_STANDARD = "/upload/member_validate_dynamic/standard/";  //上传原图地址
    public static final String MEMBER_VALIDATE_DYNAMIC_PIC_COMPRESS = "/upload/member_validate_dynamic/compress/";  //上传压缩图地址

    //申请退货上传图片路径设置
    public static final String MEMBER_RETURNGOODS_PIC_STANDARD = "/upload/member_returngoods/standard/";  //上传原图地址
    public static final String MEMBER_RETURNGOODS_PIC_COMPRESS = "/upload/member_returngoods/compress/";  //上传压缩图地址

    public static final String MEMBER_COMMENT_PIC = "/upload/member_comment/";  //上传原图地址

    //水印图片路径
    public static final String WATER_PATH = "/images/water_mark_img/";
}
