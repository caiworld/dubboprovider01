package com.caihao.dubboprovider01.controller;

import com.caihao.dubboprovider01.entity.Result;
import com.caihao.dubboprovider01.entity.ResultEnum;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO
 *
 * @author caihao
 * @date 2019/7/7 10:55
 */
@RestController
public class TestController {

  @RequestMapping("/test")
  public String test() {
    return "test success";
  }

}
