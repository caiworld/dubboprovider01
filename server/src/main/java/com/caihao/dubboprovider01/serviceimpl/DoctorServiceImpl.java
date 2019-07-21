package com.caihao.dubboprovider01.serviceimpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.caihao.dubboprovider01.entity.Doctor;
import com.caihao.dubboprovider01.service.DoctorService;
import java.util.ArrayList;
import java.util.List;

/**
 * TODO
 *
 * @author caihao
 * @date 2019/7/7 10:52
 */
@Service(
    version = "1.0",
    application = "${dubbo.application.id}",
    protocol = "${dubbo.protocol.id}",
    registry = "${dubbo.registry.id}"
)
public class DoctorServiceImpl implements DoctorService {

  @Override
  public List<Doctor> getDoctorList() {
    List<Doctor> list = new ArrayList<>();
    list.add(new Doctor(1,"caihao"));
    return list;
  }
}
