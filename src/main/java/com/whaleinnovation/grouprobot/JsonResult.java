package com.whaleinnovation.grouprobot;

import lombok.Data;

/**
 *返回客户端数据包装类
 */
@SuppressWarnings("ALL")
@Data
public class JsonResult<T> extends Result {

    private static final long serialVersionUID = -7183254406673263485L;

    private T data;

    public JsonResult() {
        super();
    }

    public JsonResult(boolean success, String message) {
        super.setSuccess(success);
        super.setMessage(message);
        System.out.println("init json reslut");
    }

    public JsonResult(T data, String message, boolean success) {
        super.setMessage(message);
        super.setSuccess(success);
        this.data = data;
    }

    /**
     * 默认成功后返回的数据和消息
     * @param data 数据
     * @param message 消息
     */
    public JsonResult(T data, String message) {
        super.setMessage(message);
        super.setSuccess(true);
        this.data = data;
    }

    /**
     * 默认返回成功的数据
     * @param data 数据
     */
    public JsonResult(T data) {
        super.setSuccess(true);
        super.setMessage("");
        this.data = data;
    }
}
