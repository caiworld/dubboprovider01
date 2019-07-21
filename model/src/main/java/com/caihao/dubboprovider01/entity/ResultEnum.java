package com.caihao.dubboprovider01.entity;

import java.io.UnsupportedEncodingException;

/**
 * TODO
 *
 * @author caihao
 * @date 2019/7/7 17:12
 */
public enum ResultEnum {
  SUCCESS(0, "成功"),
  FAIL(100, "失败");
  private Integer code;
  private String msg;

  ResultEnum(Integer code, String msg) {
    this.code = code;
    try {
      this.msg = new String(msg.getBytes("utf-8"), "utf-8");
    } catch (UnsupportedEncodingException e) {
      e.printStackTrace();
    }
  }

  public Integer getCode() {
    return code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }

  public String getMsg() {
    return msg;
  }

  public void setMsg(String msg) {
    this.msg = msg;
  }
}
