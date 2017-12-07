package com.skyrain.software.website.utils;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import org.apache.log4j.Logger;

/**
 * JSON工具类
 */
public class Json {

    private static Gson gson = new Gson();
    private static Logger logger = Logger.getLogger(Json.class);

    /**
     * 将JSON字符串反序列化为对象
     *
     * @param json  JSON字符串
     * @param clazz 对应转换的类
     * @return 返回反序列化后的对象
     */
    public static Object toObject(String json, Class<?> clazz) {
        Object object = null;
        try {
            object = gson.fromJson(json, clazz);
        } catch (JsonSyntaxException e) {
            e.printStackTrace();
            logger.error("JSON反序列化错误! \n类型:" + clazz.toString() + "\n数据:" + json, e);
        }
        return object;
    }

    /**
     * 将对象系列化为JSON字符串
     *
     * @param object 对象
     * @return 返回序列化后获得JSON字符串
     */
    public static String toJson(Object object) {
        return gson.toJson(object);
    }

    /**
     * 获取Gson对象实例
     *
     * @return 返回一个Gson对象
     */
    public static Gson getGson() {
        if (gson != null) {
            return gson;
        } else {
            return new Gson();
        }
    }
}
