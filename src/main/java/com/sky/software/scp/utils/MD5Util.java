package com.sky.software.scp.utils;

import org.apache.log4j.Logger;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * MD5工具类
 */
public class MD5Util {

    private static Logger logger = Logger.getLogger(MD5Util.class);

    /**
     * MD5加密字符串并转换为16进制
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
            logger.error("Not found MD5 encode algorithm ! encode data [" + text + "]", e);
        }
        if (digest == null) {
            logger.error("MessageDigest object is null ! encode data [" + text + "]");
            return "";
        }
        return new BigInteger(1, digest.digest(text.getBytes())).toString(16);
    }
}
