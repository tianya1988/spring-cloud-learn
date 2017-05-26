package com.jason.springcloud;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.naming.Name;

/**
 * Created by jason on 17-5-25.
 */

@FeignClient(value = "service-hi", fallback = ScheduleServiceHiHystric.class)
public interface ScheduleServiceHi {

    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);
}

