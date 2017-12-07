package com.skyrain.software.website.utils;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * MD5工具类
 */
public class MD5Util {

    /**
     * MD5加密字符串并转换未16进制
     *
     * @param text 需要加密的字符串
     * @return 返回MD5加密后的字符串
     */
    public static String encode(String text) {
        MessageDigest digest = null;
        try {
            digest = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        assert digest != null;
        return new BigInteger(1, digest.digest(text.getBytes())).toString(16);
    }
}
