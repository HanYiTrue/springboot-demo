package com.ch4.springmvc.web;

import com.ch4.springmvc.domain.DemoObj;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**

* @Description:    java类作用描述
* @Author:         hanyi
* @CreateDate:     2018/10/25 14:37
* @UpdateUser:     hanyi
* @UpdateDate:     2018/10/25 14:37
* @UpdateRemark:   修改内容
* @Version:        1.0

*/
@RestController
@RequestMapping("/rest")
public class DemoRestController {

    @RequestMapping(value = "/getjson",produces = {"application/json;charset=UTF-8"})
    public DemoObj getJson(DemoObj obj){
        return  new DemoObj(obj.getId(),obj.getName() + "yy");
    }

    @RequestMapping(value = "/getxml",produces = {"application/xml;charset=UTF-8"})
    public DemoObj getXml(DemoObj obj){
        return  new DemoObj(obj.getId(),obj.getName() + "yy");
    }
}
