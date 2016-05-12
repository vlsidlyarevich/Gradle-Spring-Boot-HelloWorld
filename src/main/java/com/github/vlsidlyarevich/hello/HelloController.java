package com.github.vlsidlyarevich.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * Created by vlad on 12.05.16.
 */
@RestController
public class HelloController {

    @RequestMapping("/")
    public String sayHello(){
        return "Hello world!";
    }
}
