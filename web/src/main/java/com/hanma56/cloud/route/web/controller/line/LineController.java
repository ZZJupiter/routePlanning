package com.hanma56.cloud.route.web.controller.line;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.baomidou.mybatisplus.plugins.Page;
import com.hanma56.cloud.route.model.Line;
import com.hanma56.cloud.route.service.LineService;
import com.hanma56.cloud.route.web.controller.line.request.QueryLineForm;
import com.hanma56.cloud.route.web.result.ResultVO;

/**
 * <p>
 * 运营线路 前端控制器
 * </p>
 *
 * @author 简一带你飞
 * @since 2018-03-20
 */
@Controller
@RequestMapping("/line")
public class LineController {

    @Autowired
    private LineService lineService;

    @RequestMapping(value = "/list.htm")
    public String showLineList(QueryLineForm form, Model model) {
        model.addAttribute("form", form);

        Page<Line> page = lineService.queryOnePageByUserId(form.getUserId(), form.getCurrentPage(),
            form.getPageSize());
        model.addAttribute("page", page);

        return "line/list";
    }

    @ResponseBody
    @RequestMapping(value = "/list")
    public ResultVO<Page<Line>> getLInes(@RequestBody QueryLineForm form) {

        Page<Line> page = lineService.queryOnePageByUserId(form.getUserId(), form.getCurrentPage(),
            form.getPageSize());
        return ResultVO.success(page);
    }

    @ResponseBody
    @RequestMapping(value = "/json")
    public ResultVO<JSONObject> getJson(@RequestBody JSONObject jsonObject){
        return ResultVO.success(jsonObject);
    }

}
