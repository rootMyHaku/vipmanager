package cn.zh.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author chai
 * @version 1.0.0
 * @create 2019/6/14
 */
@Controller
public class HelloController {
    @RequestMapping("/")
    public String hello() {
        return "index";
    }
}
