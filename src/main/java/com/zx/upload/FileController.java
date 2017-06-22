package com.zx.upload;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;

/**
 * Created by zhangxu on 2017/6/20.
 */
@Controller
@RequestMapping(value = "/upload")
public class FileController {
@RequestMapping(value = "/uploadPage",method = RequestMethod.GET)
    public String getPage()
{
    return "/upload/uploadPage";
}
@RequestMapping(value = "/file",method = RequestMethod.POST)
public String File(@RequestParam("file")MultipartFile file)throws Exception
{
    file.transferTo(new File("/Users/zhangxu/Desktop/"+file.getOriginalFilename()));
    return "index";
}
}