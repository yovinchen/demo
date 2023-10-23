package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * ClassName: TestController
 * Package: com.example.demo
 *
 * @author yovinchen
 * @Create 2023/10/23 10:08
 */
@Controller
@RequestMapping("/app")
public class TestController {

    @RequestMapping("/test")
    @ResponseBody
    public String testDemo() {
        return "Hello World!";
    }
}
