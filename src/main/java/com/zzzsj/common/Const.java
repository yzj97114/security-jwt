package com.zzzsj.common;

/**
 * @author 79282
 */
public class Const {

    /**
     * 五天
     */
    public static final long EXPIRATION_TIME = 432_000_000;
    /**
     * jwt密码
     */
    public static final String SECRET = "CodeSheepSecret";
    /**
     * token前缀
     */
    public static final String TOKEN_PREFIX = "Bearer";
    /**
     * 存放token的Header
     */
    public static final String HEADER_STRING = "Authorization";
}
