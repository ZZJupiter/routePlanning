package com.hanma56.cloud.route.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 张钟
 * @date 2018/3/19
 */
@Controller
public class IndexController {

    @RequestMapping(value = "/")
    public String index() {
        return "redirect:index.htm";
    }

    @RequestMapping(value = "/index.htm")
    public String showIndex() {
        return "layout/index";
    }

}
