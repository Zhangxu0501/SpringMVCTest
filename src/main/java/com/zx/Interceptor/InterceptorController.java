package com.zx.Interceptor;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by zhangxu on 2017/6/23.
 */
@Controller
@RequestMapping("/interceptor")
public class InterceptorController {
    @RequestMapping("/test")
    public String testInterceptor()
    {
        return "/interceptor/index";
    }
}
