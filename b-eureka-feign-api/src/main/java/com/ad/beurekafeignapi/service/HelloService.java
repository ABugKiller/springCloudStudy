package com.ad.beurekafeignapi.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author ZhengYingDeng
 * @email 892467242@qq.com
 * @create 15:16 2018/8/23
 **/
public interface HelloService {
    @GetMapping("/hello")
    String hello(@RequestParam(value = "name")String name);
}
