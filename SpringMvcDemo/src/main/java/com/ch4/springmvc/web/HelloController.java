package com.ch4.springmvc.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**

* @Description:    控制器
* @Author:         hanyi
* @CreateDate:     2018/10/25 10:23
* @UpdateUser:     hanyi
* @UpdateDate:     2018/10/25 10:23
* @UpdateRemark:   修改内容
* @Version:        1.0

*/
@Controller
public class HelloController {

    @RequestMapping("/index")
    public String hello(){
        return  "/index";
    }
}
