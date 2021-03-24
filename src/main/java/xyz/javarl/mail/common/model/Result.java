package xyz.javarl.mail.common.model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * @Date 2021/3/24 20:52
 * @Created by RyanLoong
 * @Classname Result
 * @Description 用于生成返回结果
 */
public class Result extends HashMap<String, Object> implements Serializable {
    private final long serializableUID = 1L;

    // 直接构造json通知返回0
    public Result() {
        put("code", 0);
    }

    // 错误的通知，没有传message
    public static Result error() {
        return error(500, "未知异常，请联系管理员");
    }

    // 带message的错误方法
    public static Result error(String msg) {
        return error(500, msg);
    }

    // 带特殊返回码的错误方法
    public static Result error(int code, String msg) {
        Result r = new Result();
        r.put("code", code);
        r.put("msg", msg);
        return r;
    }

    // 成功的方法，带有消息
    public static Result ok(Object msg) {
        Result r = new Result();
        r.put("msg", msg);
        return r;
    }

    // 直接传入成功的消息
    public static Result ok(Map<String, Object> map) {
        Result r = new Result();
        r.putAll(map);
        return r;
    }

    public static Result ok() {
        return new Result();
    }

    @Override
    public Result put(String key, Object value) {
        super.put(key, value);
        return this;
    }

}
