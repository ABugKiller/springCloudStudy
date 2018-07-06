package com.didispace.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author ZhengYingDeng
 * @email 892467242@qq.com
 * @create 15:39 2018/7/6
 **/
@FeignClient("compute-service")
public interface ComputeClient {
    @RequestMapping(method = RequestMethod.GET, value = "/add")
    Integer add(@RequestParam(value = "a")Integer a, @RequestParam(value = "b")Integer b);
}
