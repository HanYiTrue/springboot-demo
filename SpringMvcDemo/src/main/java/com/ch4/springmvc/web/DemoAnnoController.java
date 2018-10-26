package com.ch4.springmvc.web;

import com.ch4.springmvc.domain.DemoObj;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**

* @Description:    java类作用描述
* @Author:         hanyi
* @CreateDate:     2018/10/25 13:52
* @UpdateUser:     hanyi
* @UpdateDate:     2018/10/25 13:52
* @UpdateRemark:   修改内容
* @Version:        1.0

*/
@Controller
@RequestMapping("/anno")
public class DemoAnnoController {

    @RequestMapping(produces = "text/plain;charset=UTF-8")
    public  @ResponseBody String index(HttpServletRequest request){
        return "url: "+request.getRequestURI()+" can assess";
    }

    @RequestMapping(value = "/pathvar/{str}",produces = "text/plain;charset=UTF-8")
    public @ResponseBody String demoPathVar(@PathVariable String str, HttpServletRequest request){

        return "url: "+ request.getRequestURI()+ " can access,str: "+ str;
    }

    @RequestMapping(value = "/requestParam",produces = "text/plain;charset=UTF-8")
    public @ResponseBody String passRequestParam(Long id, HttpServletRequest request){

        return "url: "+ request.getRequestURI() + "can access,id: "+ id;
    }

    @RequestMapping(value = "/obj", produces = "application/json;charset=UTF-8")
    @ResponseBody
    public String passObj(DemoObj obj,HttpServletRequest request){

        return "url: "+ request.getRequestURI() + " can access , obj id: "
                +obj.getId() + " obj name: "+obj.getName();
    }

    @RequestMapping(value = {"/name1","/name2"},produces = "text/plain;charset=UTF-8")
    public  @ResponseBody String remove(HttpServletRequest request){

        return  "url: "+ request.getRequestURI() + " can access!";
    }
}
