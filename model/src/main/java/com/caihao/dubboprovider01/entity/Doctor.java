package com.caihao.dubboprovider01.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * TODO
 *
 * @author caihao
 * @date 2019/7/7 10:36
 */
public class Doctor implements Serializable{

  private Integer id;
  private String name;

  public Doctor() {
  }

  public Doctor(Integer id, String name) {
    this.id = id;
    this.name = name;
  }

  @Override
  public String toString() {
    return "Doctor{" +
        "id=" + id +
        ", name='" + name + '\'' +
        '}';
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
