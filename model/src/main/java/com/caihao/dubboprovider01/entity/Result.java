package com.caihao.dubboprovider01.entity;

import java.io.Serializable;
import java.util.Objects;

/**
 * 返回结果
 *
 * @author caihao
 * @date 2019/7/7 17:09
 */
public class Result<T> implements Serializable {

  private Integer code;
  private String msg;
  private T data;

  public Result() {
  }

  public Result(ResultEnum resultEnum, T data) {
    if (Objects.nonNull(resultEnum)) {
      this.code = resultEnum.getCode();
      this.msg = resultEnum.getMsg();
    }
    this.data = data;
  }

  public Result(Integer code, String msg, T data) {
    this.code = code;
    this.msg = msg;
    this.data = data;
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

  public T getData() {
    return data;
  }

  public void setData(T data) {
    this.data = data;
  }
}
