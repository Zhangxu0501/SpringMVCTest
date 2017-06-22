package com.zx.json_ajax;

import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by zhangxu on 2017/6/23.
 */
@Controller
@RequestMapping("/json")
public class JsonController {
    @RequestMapping(value = "getPage")
    public String getPage()
    {
        return "/json_ajax/index";
    }
    @RequestMapping(value = "/test",method = RequestMethod.POST)
    public void sontest(HttpServletResponse response)throws IOException
    {
        System.out.println("test success!");
        User u = new User();
        u.setId("1234");
        u.setName("张旭");
        ObjectMapper mapper = new ObjectMapper();
        String json =mapper.writeValueAsString(u);

        response.setContentType("application/json;charset=UTF-8");
        //把json响应回页面
        response.getWriter().print(json);

    }
}
