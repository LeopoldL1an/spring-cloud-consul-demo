package com.butterfly.platform;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * HelloController
 *
 * @author LeopoldL1an 2020/7/18
 */
@RestController
public class HelloController {


    @Autowired
    private RemoteService remoteService;

    @GetMapping("/hello")
    public String home() {
        return remoteService.hello();
    }
}
