package cn.yjq.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class HelloController {

    private static final Logger logger = LoggerFactory.getLogger(HelloController.class);

    @GetMapping("/hello")
    public String hello() {
        logger.info("你好啊，我是logback");
        return "Hello, world!";
    }
}
