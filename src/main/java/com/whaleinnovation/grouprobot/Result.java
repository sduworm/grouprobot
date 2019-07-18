package com.whaleinnovation.grouprobot;

import lombok.Data;

import java.io.Serializable;

/**
 *返回客户端基类
 */
@SuppressWarnings("ALL")
@Data
public class Result implements Serializable {

    private static final long serialVersionUID = 7108642139378144124L;

    private String message;

    private int statusCode;

    private boolean success;
}
