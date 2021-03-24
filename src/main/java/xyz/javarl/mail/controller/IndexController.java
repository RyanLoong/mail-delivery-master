package xyz.javarl.mail.controller;

import io.swagger.annotations.Api;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Date 2021/3/24 12:10
 * @Created by RyanLoong
 * @Classname IndexController
 * @Description 主控制器
 */
@Controller
@Api(tags ="邮件管理")
public class IndexController {

    @RequestMapping(path = "{url}.shtml", method = RequestMethod.GET)
    public String page(@PathVariable("url") String url) {
        return url;
    }

    // 用于下拉模块的路径
    @RequestMapping(path = "{module}/{url}.shtml", method = RequestMethod.GET)
    public String page(@PathVariable("module") String module,@PathVariable("url") String url) {
        return module + "/" + url;
    }
}
