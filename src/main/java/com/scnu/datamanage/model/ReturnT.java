package com.scnu.datamanage.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReturnT<T> implements Serializable {
    // todo 了解这个作用
    public static final long serialVersionUID = 42L;

    public static final int SUCCESS_CODE = 200;
    public static final int FAIL_CODE = 500;

    private int code;
    private String msg;
    private T content;

    public static <T> ReturnT<T> success(T data) {
        ReturnT<T> resultData = new ReturnT<>();
        resultData.setContent(data);
        resultData.setCode(SUCCESS_CODE);
        resultData.setMsg("success");
        return resultData;
    }
    public static <T> ReturnT<T> fail(T data) {
        ReturnT<T> resultData = new ReturnT<>();
        resultData.setContent(data);
        resultData.setCode(FAIL_CODE);
        resultData.setMsg("fail");
        return resultData;
    }

    public ReturnT(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public ReturnT(T content) {
        this.code = SUCCESS_CODE;
        this.content = content;
    }
}
