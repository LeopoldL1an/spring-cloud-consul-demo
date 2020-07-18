package com.butterfly.platform;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * RemoteService
 *
 * @author LeopoldL1an 2020/7/18
 */
@FeignClient("platform-provider")
public interface RemoteService {
    @GetMapping("/hello")
    String hello();
}
