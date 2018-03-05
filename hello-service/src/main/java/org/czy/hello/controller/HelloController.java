package org.czy.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello Controller
 *
 * @author 曹子钰, 2018/3/5
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String index() {
        return "Hello!";
    }
}
