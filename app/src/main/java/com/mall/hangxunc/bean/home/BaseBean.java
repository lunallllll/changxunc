package com.mall.hangxunc.bean.home;

import java.io.Serializable;

public class BaseBean implements Serializable {
    private String msg;
    private int code;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

}
