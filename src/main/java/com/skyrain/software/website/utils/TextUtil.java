package com.skyrain.software.website.utils;

/**
 * 文本字符串工具类
 */
public class TextUtil {

    /**
     * 判断字符串是否为空
     *
     * @param str 字符串
     * @return 为空则返回true, 不为空则返回false
     */
    public static boolean isEmpty(String str) {
        return str == null || str.length() <= 0;
    }
}
