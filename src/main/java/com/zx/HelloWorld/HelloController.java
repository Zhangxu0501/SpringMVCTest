package com.zx.HelloWorld;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * Created by zhangxu on 2017/6/19.
 */
@Controller
//定义一个父节点
@RequestMapping("/HelloWorld")
public class HelloController{
    @RequestMapping(value = "hello" ,method = RequestMethod.GET)
    public String printHello(ModelMap model) {
        model.addAttribute("message", "Hello Spring MVC Framework!");
        return "index";
    }
}
