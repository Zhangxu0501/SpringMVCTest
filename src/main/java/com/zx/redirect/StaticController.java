package com.zx.redirect;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by zhangxu on 2017/6/20.
 */
@Controller
@RequestMapping(value="/rediret")
public class StaticController {
    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String index()
    {
        return "index";
    }
    @RequestMapping(value = "/staticPage",method = RequestMethod.GET)
    public String getStaticPage()
    {
        return "/redirect/static_page";
    }
    @RequestMapping(value = "/redirettest",method = RequestMethod.GET)
    public String testRed()
    {
        return "redirect:/HelloWorld/hello";
    }

}
